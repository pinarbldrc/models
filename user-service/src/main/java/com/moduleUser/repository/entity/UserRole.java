package com.moduleUser.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity(name = "tbl_userrole")
public class UserRole {

    @SequenceGenerator(name = "seq_userrole",allocationSize =1)
    @GeneratedValue(generator = "seq_userrole",strategy = GenerationType.SEQUENCE)
    @Id
    private long id;


    private Long roleid;
    private Long userid;

}
