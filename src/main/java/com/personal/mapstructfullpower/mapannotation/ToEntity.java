package com.personal.mapstructfullpower.mapannotation;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "id",ignore = true)
@Mapping(target = "createdDate",expression = "java(new java.util.Date())")
@Mapping(target = "name",source = "groupName")
public @interface ToEntity {
}
