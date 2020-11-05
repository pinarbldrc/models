package com.moduleUser.dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserRequestDto {

    private long id;

    private String name;

    private String lastName;

    private String email;

    private String password;


}
