package jig.tutorial.infrastructure.datasource;

import jig.tutorial.application.repository.SampleRepository;
import jig.tutorial.domain.model.product.Product;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDataSource implements SampleRepository {

    @Override
    public Product getProduct() {
        return null;
    }
}
