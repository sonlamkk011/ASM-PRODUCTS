package com.example.asmproduct.model;

import com.example.asmproduct.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MysqlProductTest {
    private ProductModel productModel;

    @BeforeEach
    void setUp() {

        productModel = new MysqlProduct();
    }

    @Test
    void save() {

        Product product = new Product("lamson", "description", "detail", 10000, "src/image/product.png", "lam@gmail.com", "0123456789");
        assertEquals(true,productModel.save(product)
);
    }

    @Test
    void testSave() {
    }
}
