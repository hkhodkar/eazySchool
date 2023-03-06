package com.eazybytes.eazyschool.model;

import lombok.Data;

@Data
public class Holiday {
    private  final String day;
    private  final String reason;
    private  final HolidayType holidayType;



    public enum HolidayType {
        FESTIVAL, FEDERAL
    }
}


