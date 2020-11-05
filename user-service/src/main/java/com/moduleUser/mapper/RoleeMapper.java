package com.moduleUser.mapper;

import com.moduleUser.dto.request.RoleeRequestDto;
import com.moduleUser.repository.entity.Rolee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleeMapper {
    Rolee toRolee(RoleeRequestDto roleeRequestDto);
    RoleeRequestDto toRoleeRequestDto(Rolee rolee);
}
