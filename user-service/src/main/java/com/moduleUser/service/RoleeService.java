package com.moduleUser.service;


import com.moduleUser.dto.request.RoleeRequestDto;

public interface RoleeService {

    RoleeRequestDto get(long id);

    RoleeRequestDto addRole(RoleeRequestDto roleRequestDto);

    void deleteRoleeRequest(long id);

    RoleeRequestDto updaterequest(long id,RoleeRequestDto roleRequestDto);
}
