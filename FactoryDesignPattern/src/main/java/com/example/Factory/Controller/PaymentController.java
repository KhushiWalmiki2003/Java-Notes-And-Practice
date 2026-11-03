package com.example.Factory.Controller;

import com.example.Factory.Service.PaymentService;
import com.example.Factory.factory.Factory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PaymentController {

    @GetMapping("/{type}")
    public String Print(@PathVariable String type){
        PaymentService pp= Factory.createObject(type);
        pp.ReadDataFromInDB();
        pp.Process();
        return pp.Print();

    }
}
