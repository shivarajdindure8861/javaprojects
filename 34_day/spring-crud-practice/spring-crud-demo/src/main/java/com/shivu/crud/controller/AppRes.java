package com.shivu.crud.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class AppRes {
    private String sts;
    private String msg;
}
