package com.personal.mapstructfullpower.mapper;

import com.personal.mapstructfullpower.dto.ShelveDto;
import com.personal.mapstructfullpower.entity.ShelveEntity;
import com.personal.mapstructfullpower.mapannotation.ToEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class StorageMapper {

    @ToEntity
    @Mapping(target = "weighLimit",source = "maxWeight")
    public abstract ShelveEntity map(ShelveDto dto);

}