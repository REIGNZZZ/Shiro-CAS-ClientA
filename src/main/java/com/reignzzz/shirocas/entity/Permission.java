package com.reignzzz.shirocas.entity;

import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = -8861953457330540434L;
    private Long id;
    private String name;
    private String code;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
