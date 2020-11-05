package com.moduleUser.mapper;

import com.moduleUser.dto.request.UserRequestDto;
import com.moduleUser.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User toUser(UserRequestDto userRequestDto);
    UserRequestDto toUserRequestDto(User user);

}
