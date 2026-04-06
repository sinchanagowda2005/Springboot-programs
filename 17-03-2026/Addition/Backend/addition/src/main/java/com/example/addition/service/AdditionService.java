package com.example.addition.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.addition.dto.request.AdditionRequest;
import com.example.addition.dto.response.AdditionResponse;
import com.example.addition.entity.AdditionEntity;
import com.example.addition.repository.AdditionRepository;


@Service
public class AdditionService {

    private final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }

    public AdditionResponse calculate(AdditionRequest request) {
        Integer a = request.getA();
        Integer b = request.getB();
        Integer c = a + b;

        AdditionEntity entity = new AdditionEntity();
        entity.setA(a);
        entity.setB(b);
        entity.setC(c);

        AdditionEntity saved = additionRepository.save(entity);

        AdditionResponse res = new AdditionResponse();
        res.setA(saved.getA());
        res.setB(saved.getB());
        res.setC(saved.getC());

        return res;
    }

 
    public List<AdditionResponse> getEveryAddition() {
        List<AdditionEntity> entities = additionRepository.findAll();

        return entities.stream().map(entity -> {
            AdditionResponse res = new AdditionResponse();
            res.setA(entity.getA());
            res.setB(entity.getB());
            res.setC(entity.getC());
            return res;
        }).collect(Collectors.toList());
    }
}