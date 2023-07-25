package com.personal.mapstructfullpower.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ShelveDto2 {
    String maxWeight;
    String groupName;
}
