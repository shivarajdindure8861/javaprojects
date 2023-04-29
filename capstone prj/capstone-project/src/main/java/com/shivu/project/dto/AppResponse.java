package com.shivu.project.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AppResponse<T> {
    private String sts;
    private String msg;
    private T bd;
}
