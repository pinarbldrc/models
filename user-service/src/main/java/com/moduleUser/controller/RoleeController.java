package com.moduleUser.controller;


import com.moduleUser.dto.request.RoleeRequestDto;
import com.moduleUser.dto.request.UserRequestDto;
import com.moduleUser.dto.response.RoleUserResponseDto;
import com.moduleUser.dto.response.UserRoleResponseDto;
import com.moduleUser.service.impl.RoleeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rolee")
public class RoleeController {

    @Autowired
    RoleeServiceImpl roleeService;


    @PostMapping("/add")
    public ResponseEntity<RoleeRequestDto> addUser(@RequestBody RoleeRequestDto roleeRequestDto){
        return ResponseEntity.ok(roleeService.addRole(roleeRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleeRequestDto> update (@PathVariable long id,@RequestBody RoleeRequestDto roleeRequestDto)
    {

        return ResponseEntity.ok(roleeService.updaterequest(id,roleeRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){

        roleeService.deleteRoleeRequest(id);
        return   ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleeRequestDto> getUser(@PathVariable long id){

        return ResponseEntity.ok(roleeService.get(id));
    }

    @GetMapping("getusers/{id}")
    public ResponseEntity<RoleUserResponseDto> gettall(@PathVariable long id){

        return ResponseEntity.ok(roleeService.getuserss(id));
    }



}
