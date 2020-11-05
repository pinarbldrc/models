package com.moduleUser.dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class RoleeRequestDto {

    private long id;

    private String name;

}
