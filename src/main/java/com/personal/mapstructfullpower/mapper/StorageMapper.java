package com.personal.mapstructfullpower.mapper;

import com.personal.mapstructfullpower.dto.ShelveDto;
import com.personal.mapstructfullpower.dto.ShelveDto2;
import com.personal.mapstructfullpower.entity.ShelveEntity;
import com.personal.mapstructfullpower.mapannotation.ToEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class StorageMapper {

    @ToEntity
    @Mapping(target = "weighLimit",source = "maxWeight")
    public abstract ShelveEntity map(ShelveDto dto);
    @Mapping(target = "weighLimit",source = "dto.maxWeight")
    @Mapping(target = "name",source = "dto2.groupName")
    public abstract ShelveEntity map2Dto(ShelveDto dto, ShelveDto2 dto2);


}