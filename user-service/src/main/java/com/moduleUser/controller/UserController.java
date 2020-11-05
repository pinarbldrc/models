package com.moduleUser.controller;

import com.moduleUser.dto.request.UserRequestDto;
import com.moduleUser.dto.response.UserRoleResponseDto;
import com.moduleUser.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;



    @PostMapping("/add")
    public ResponseEntity<UserRequestDto> addUser(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok(userService.addUser(userRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRequestDto> update (@PathVariable long id,@RequestBody UserRequestDto userRequestDto)
    {

        return ResponseEntity.ok(userService.updaterequest(id,userRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){

        userService.deleteUserRequest(id);
      return   ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRequestDto> getUser(@PathVariable long id){

       return ResponseEntity.ok(userService.get(id));
    }

    @PostMapping("/adduserrolee/{id}")
    public ResponseEntity<Void> addUserRolee(@PathVariable long id,@RequestBody List<Long> roleeList){

        userService.addUserRole(roleeList,id);

       return ResponseEntity.ok().build();

    }

    @GetMapping("getroless/{id}")
    public ResponseEntity<UserRoleResponseDto> gettall(@PathVariable long id){

        return ResponseEntity.ok(userService.getRoleOfUser(id));
    }


}
