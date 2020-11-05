package com.moduleUser.service.impl;

import com.moduleUser.dto.request.RoleeRequestDto;
import com.moduleUser.dto.response.RoleUserResponseDto;
import com.moduleUser.dto.response.UserRoleResponseDto;
import com.moduleUser.mapper.RoleeMapper;
import com.moduleUser.repository.entity.Rolee;
import com.moduleUser.repository.entity.User;
import com.moduleUser.repository.entity.UserRole;
import com.moduleUser.repository.repo.RoleeRepository;
import com.moduleUser.repository.repo.UserRepository;
import com.moduleUser.repository.repo.UserRoleeRepository;
import com.moduleUser.service.RoleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleeServiceImpl implements RoleeService {


    @Autowired
    RoleeRepository roleeRepository;

    @Autowired
    RoleeMapper roleeMapper;

    @Autowired
    UserRoleeRepository userRoleeRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public RoleeRequestDto get(long id) {

        Rolee rolee=roleeRepository.findById(id).get();

        RoleeRequestDto roleeRequestDto=roleeMapper.toRoleeRequestDto(rolee);
        return roleeRequestDto;

    }

    @Override
    public RoleeRequestDto addRole(RoleeRequestDto roleRequestDto) {

        Rolee rolee=roleeMapper.toRolee(roleRequestDto);

        rolee=roleeRepository.save(rolee);
        roleRequestDto.setId(rolee.getId());
        return roleRequestDto;



    }

    @Override
    public void deleteRoleeRequest(long id) {

        Rolee rolee=roleeRepository.findById(id).orElseThrow(()->new IllegalArgumentException());
        roleeRepository.delete(rolee);

    }

    @Override
    public RoleeRequestDto updaterequest(long id, RoleeRequestDto roleRequestDto) {

        Rolee rolee=roleeRepository.findById(id).orElseThrow(()->new IllegalArgumentException());
        rolee=roleeMapper.toRolee(roleRequestDto);


        return    roleRequestDto=roleeMapper.toRoleeRequestDto(roleeRepository.save(rolee));
    }

    public RoleUserResponseDto getuserss(long roleid){

        List<User>userList=new ArrayList<>();

        for (UserRole item: userRoleeRepository.findByRoleid(roleid))
        {
            userList.add(userRepository.findById(item.getUserid()).get());

        }
        return RoleUserResponseDto.builder().userList(userList).rolee(roleeRepository.findById(roleid).get()).build();
    }
}
