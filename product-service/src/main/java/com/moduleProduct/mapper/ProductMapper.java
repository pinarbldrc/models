package com.moduleProduct.mapper;

import com.moduleProduct.dto.request.ProductRequestDto;
import com.moduleProduct.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    Product toProduct(ProductRequestDto productRequestDto);

    ProductRequestDto toProductRequestDto(Product product);

}
