package jig.tutorial.presentation.controller;

import jig.tutorial.application.service.SampleService;
import jig.tutorial.domain.model.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * サンプルコントローラー
 */
@Controller
@RequestMapping("sample")
public class SampleController {

    SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping
    String getProduct(Model model) {
        model.addAttribute("product", sampleService.getProduct());
        return "sample";
    }
}
