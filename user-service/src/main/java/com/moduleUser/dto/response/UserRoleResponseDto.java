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
public class UserRoleResponseDto {

    User user;

    List<Rolee> roleeList;





}
