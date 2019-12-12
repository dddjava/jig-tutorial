package jig.tutorial.application.service;

import jig.tutorial.application.repository.SampleRepository;
import jig.tutorial.domain.model.product.Product;
import org.springframework.stereotype.Service;

/**
 * サンプルサービス
 */
@Service
public class SampleService {

    SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    /**
     * 商品を取得
     */
    public Product getProduct() {
        return sampleRepository.getProduct();
    }
}
