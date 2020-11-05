package com.moduleProduct.service.impl;

import com.moduleProduct.dto.request.ProductRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    ProductRequestDto get(long id);

    ProductRequestDto addUser(ProductRequestDto productRequestDto);

    void deleteUserRequest(long id);

    ProductRequestDto updaterequest(long id,ProductRequestDto productRequestDto);




}
