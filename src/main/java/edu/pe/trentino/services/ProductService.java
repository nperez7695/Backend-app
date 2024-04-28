package edu.pe.trentino.services;

import edu.pe.trentino.dto.ProductDto;
import edu.pe.trentino.entidad.Product;

import java.util.List;

public interface ProductService {
    // TODO Agregar un product
    void addProduct(ProductDto productDto);
    //TODO Listar todos los productos
    List<Product> finAllProducts();
    //TODO actualizar un producto
    void updateProduct(Long id, ProductDto productDto);
    //TODO Eliminar un producto
    void deleteProduct(Long id);
    //TODO Obtener un producto
    List<ProductDto> findOneProduct(Long id);
}
