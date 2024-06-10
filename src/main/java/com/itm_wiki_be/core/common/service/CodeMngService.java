package com.itm_wiki_be.core.common.service;

import com.itm_wiki_be.core.common.service.dto.CodeMngDTO;
import com.itm_wiki_be.repository.CodeMngRepository;
import com.itm_wiki_be.util.LanguageCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CodeMngService {

    @Autowired
    private CodeMngRepository codeMngRepository;

    @Autowired
    private LanguageCommon languageCommon;

    /**
     * 코드 검색
     *
     * @param upCdId
     * @return
     */
    public List<CodeMngDTO> getByUpId(String upCdId) {
//        List<CodeMngEntity> listResult = codeMngRepository.selectByUpCdId(upCdId);
//        List<CodeMngDTO> listCode = listResult.stream().map(item -> modelMapper.map(item, CodeMngDTO.class))
//                .collect(Collectors.toList());

        return null;
    }

    public List<CodeMngDTO> getListCode(List<String> listUpCdId) {
        List<CodeMngRepository.CodeMngResponse> listResult = codeMngRepository.findByUpCdIdIn(listUpCdId);
        return listResult.stream().map(code -> {
            CodeMngDTO codeMngDTO = new CodeMngDTO();
            codeMngDTO.setValue(code.getCdId());
            codeMngDTO.setType(code.getType());
            codeMngDTO.setLabel(languageCommon.getMessageProperties(code.getCdKey()) == "" ?
                    code.getCdName() : languageCommon.getMessageProperties(code.getCdKey()));
            return codeMngDTO;
        }).collect(Collectors.toList());
    }
}
