package com.feelgood.complimentsapi;

import com.feelgood.complimentsapi.Controller.ComplimentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ComplimentsApiApplicationTests {

    @Autowired
    ComplimentController complimentController;
    @Test
    void contextLoads() {
        assertThat(complimentController).isNotNull();
    }

}
