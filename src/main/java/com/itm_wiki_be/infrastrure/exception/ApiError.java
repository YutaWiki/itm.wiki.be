package com.itm_wiki_be.infrastrure.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ApiError {

    private String message;

}