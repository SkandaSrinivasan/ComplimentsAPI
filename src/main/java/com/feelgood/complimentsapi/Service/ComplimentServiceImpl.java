package com.feelgood.complimentsapi.Service;

import com.feelgood.complimentsapi.Model.Compliment;
import com.feelgood.complimentsapi.Repository.ComplimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class ComplimentServiceImpl implements ComplimentService {
    @Autowired
    private ComplimentRepository complimentRepository;

    @Override
    public Compliment randomCompliment() {
        long leftLimit = 1L;
        long rightLimit = complimentRepository.count();
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        return complimentRepository.getById(generatedLong);
    }
}
