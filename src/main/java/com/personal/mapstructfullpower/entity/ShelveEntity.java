package com.personal.mapstructfullpower.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ShelveEntity {
    String id;
    String weighLimit;
    Date createdDate;
    String name;
}
