package com.moduleUser.service;


import com.moduleUser.dto.request.UserRequestDto;
import com.moduleUser.dto.response.UserRoleResponseDto;
import com.moduleUser.repository.entity.Rolee;

import java.util.List;

public interface UserService {

    UserRequestDto get(long id);

    UserRequestDto addUser(UserRequestDto userRequestDto);

    void deleteUserRequest(long id);

    UserRequestDto updaterequest(long id,UserRequestDto userRequestDto);

    void addUserRole(List<Long> roleList, long userid);




}
