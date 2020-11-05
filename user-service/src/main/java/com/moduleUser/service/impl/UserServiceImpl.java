package com.moduleUser.service.impl;

import com.moduleUser.dto.request.UserRequestDto;
import com.moduleUser.dto.response.UserRoleResponseDto;
import com.moduleUser.mapper.UserMapper;
import com.moduleUser.repository.entity.Rolee;
import com.moduleUser.repository.entity.User;
import com.moduleUser.repository.entity.UserRole;
import com.moduleUser.repository.repo.RoleeRepository;
import com.moduleUser.repository.repo.UserRepository;
import com.moduleUser.repository.repo.UserRoleeRepository;
import com.moduleUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRoleeRepository  userRoleeRepository;

    @Autowired
    RoleeRepository roleeRepository;









    @Override
    public UserRequestDto get(long id) {

        User user=userRepository.findById(id).orElseThrow(()->new IllegalArgumentException());

        UserRequestDto userRequestDto=userMapper.toUserRequestDto(user);
        return userRequestDto;


    }

    @Override
    public UserRequestDto addUser(UserRequestDto userRequestDto) {

        User user=userMapper.toUser(userRequestDto);
         user=userRepository.save(user);
       userRequestDto.setId(user.getId());
       return userRequestDto;

    }

    @Override
    public void deleteUserRequest(long id) {
        User user=userRepository.findById(id).orElseThrow(()->new IllegalArgumentException());

        userRepository.delete(user);


    }

    @Override
    public UserRequestDto updaterequest(long id, UserRequestDto userRequestDto) {

        User user=userRepository.findById(id).orElseThrow(()->new IllegalArgumentException());
           user=userMapper.toUser(userRequestDto);


        return    userRequestDto=userMapper.toUserRequestDto(userRepository.save(user));



    }

    @Override
    public void addUserRole(List<Long> roleList, long userid) {

        User user=userRepository.findById(userid).orElseThrow(()-> new IllegalArgumentException());
        for (Long item:roleList)
        {
             userRoleeRepository.save(UserRole.builder().roleid(item).userid(userid).build());

        }

    }

    public UserRoleResponseDto getRoleOfUser(long userid){

        List<Rolee> roleeList=new ArrayList<>();

        for (UserRole item:userRoleeRepository.findByUserid(userid))
        {

            roleeList.add(roleeRepository.findById(item.getId()).get());

        }
        return UserRoleResponseDto.builder().roleeList(roleeList).user(userRepository.findById(userid).get()).build();


    }


}
