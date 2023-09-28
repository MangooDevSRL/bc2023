package com.mangoodev.bootcamp2023.service.dto;

import com.mangoodev.bootcamp2023.domain.Product;
import java.time.ZonedDateTime;
import java.util.Set;

public class TransactionWithProductsDTO {

    private Long id;
    private ZonedDateTime date;
    private Set<Product> products;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
