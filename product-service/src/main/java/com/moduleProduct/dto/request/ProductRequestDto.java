package com.moduleProduct.dto.request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class ProductRequestDto {

    private long id;

    private String name;

    private String price;

    private String description;

    private int stock;

}
