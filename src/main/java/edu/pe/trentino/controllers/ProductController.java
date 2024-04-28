package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.ProductDto;
import edu.pe.trentino.entidad.Product;
import edu.pe.trentino.services.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductServiceImpl productService;

    @PostMapping("/create-product")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto) {
        productService.addProduct(productDto);
        return ResponseEntity.ok(Collections.singletonMap("message", "Product add"));
    }

    @GetMapping("/all-product")
    public ResponseEntity<?> findAllProducts() {
        List<Product> products = productService.finAllProducts();
        return ResponseEntity.ok(products);
    }
}
