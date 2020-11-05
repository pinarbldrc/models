package com.moduleUser.dto.response;

import com.moduleUser.repository.entity.Rolee;
import com.moduleUser.repository.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleUserResponseDto {

    Rolee rolee;

    List<User> userList;

}
