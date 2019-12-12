package jig.tutorial.domain.model.product;

/**
 * 商品
 */
public class Product {
    Name name;
    Price price;

    public ProductStock productStock() {
        return ProductStock.在庫あり;
    }
}