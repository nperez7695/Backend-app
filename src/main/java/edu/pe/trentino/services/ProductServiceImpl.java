package edu.pe.trentino.services;

import edu.pe.trentino.dto.ProductDto;
import edu.pe.trentino.entidad.Product;
import edu.pe.trentino.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    // Injectar el repository
    private final ProductRepository productRepository;

    @Override
    public void addProduct(ProductDto productDto) {
        //Instanciar el objeto de la entidad product
        var addProduct = new Product();
        addProduct.setName(productDto.getName());
        addProduct.setDescription(productDto.getDescription());
        addProduct.setStock(productDto.getStock());
        addProduct.setPrice(productDto.getPrice());
        productRepository.save(addProduct);
    }

    @Override
    public List<Product> finAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void updateProduct(Long id, ProductDto productDto) {

    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<ProductDto> findOneProduct(Long id) {
        return List.of();
    }
}
