package com.keyin.Sprint1Semester4_Api.model;

public class Airport {
    private Long id;
    private String name;
    private String code;
    private Long cityId;

    public Airport() {}

    public Airport(Long id, String name, String code, Long cityId) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.cityId = cityId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public Long getCityId() { return cityId; }
    public void setCityId(Long cityId) { this.cityId = cityId; }
}