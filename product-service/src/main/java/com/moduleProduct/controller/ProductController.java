package com.moduleProduct.controller;


import com.moduleProduct.dto.request.ProductRequestDto;
import com.moduleProduct.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/add")
    public ResponseEntity<ProductRequestDto> addUser(@RequestBody ProductRequestDto productRequestDto){
        return ResponseEntity.ok(productService.addUser(productRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductRequestDto> update (@PathVariable long id,@RequestBody ProductRequestDto productRequestDto)
    {

        return ResponseEntity.ok(productService.updaterequest(id,productRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){

        productService.deleteUserRequest(id);
        return   ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductRequestDto> getUser(@PathVariable long id){

        return ResponseEntity.ok(productService.get(id));
    }

}
