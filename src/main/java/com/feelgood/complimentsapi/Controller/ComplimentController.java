package com.feelgood.complimentsapi.Controller;

import com.feelgood.complimentsapi.Model.Compliment;
import com.feelgood.complimentsapi.Repository.ComplimentRepository;
import com.feelgood.complimentsapi.Service.ComplimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ComplimentController {

    @Autowired
    private ComplimentRepository complimentRepository;
    @Autowired
    private ComplimentService complimentService;

    @GetMapping("/random")
    public Compliment randomCompliment(){
        return complimentService.randomCompliment();
    }
}
