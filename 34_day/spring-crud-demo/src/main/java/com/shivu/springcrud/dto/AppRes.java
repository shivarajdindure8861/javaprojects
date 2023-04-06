package com.shivu.springcrud.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class AppRes {
    private String sts;
    private String msg;
}
