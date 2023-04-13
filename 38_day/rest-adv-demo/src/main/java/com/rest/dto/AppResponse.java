package com.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AppResponse<T> {
    private String sts;
    private String msg;
    private T bd;
}
