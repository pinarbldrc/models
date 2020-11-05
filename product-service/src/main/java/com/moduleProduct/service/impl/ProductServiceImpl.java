package com.moduleProduct.service.impl;

import com.moduleProduct.dto.request.ProductRequestDto;
import com.moduleProduct.mapper.ProductMapper;
import com.moduleProduct.repository.entity.Product;
import com.moduleProduct.repository.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public ProductRequestDto get(long id) {
        Product product=productRepository.findById(id).get();

        return productMapper.toProductRequestDto(product);

    }

    @Override
    public ProductRequestDto addUser(ProductRequestDto productRequestDto) {

        Product product=productMapper.toProduct(productRequestDto);

        product=productRepository.save(product);
        productRequestDto.setId(product.getId());

        return productRequestDto;
    }

    @Override
    public void deleteUserRequest(long id) {

        Product product=productRepository.findById(id).get();

        productRepository.delete(product);


    }

    @Override
    public ProductRequestDto updaterequest(long id, ProductRequestDto productRequestDto) {

        Product product=productRepository.findById(id).get();

        product=productMapper.toProduct(productRequestDto);

        return productRequestDto=productMapper.toProductRequestDto(productRepository.save(product));


    }
}
