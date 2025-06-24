package app.repositories;

import app.domain.Product;

import java.util.List;

public interface CustomerRepository {

    Product save(Product product);

    List<Product> getAll();

    List<Product> getById(Long id);
    //TODO
}
