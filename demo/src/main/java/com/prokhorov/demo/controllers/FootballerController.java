package com.prokhorov.demo.controllers;

import com.prokhorov.demo.entities.Footballer;
import com.prokhorov.demo.repositories.FootballerRepository;
import com.prokhorov.demo.services_test.CustomRequestUtil;
import com.prokhorov.demo.services.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FootballerController {
    @Autowired
    private FootballerRepository footballerRepository;

    //возвращает всех игроков
    @GetMapping(value = "/footballer")
    public ResponseEntity<Object> getAll() {
        List<Footballer> footballers = footballerRepository.findAll();
        return CustomRequestUtil.getResponseEntity(footballers);
    }

    //возвращает только игроков с M позицией
    @GetMapping(value = "/footballer/{position}")
    public ResponseEntity<Object> getPosition(@PathVariable(name = "position") String position) {
        List<Footballer> footballers = footballerRepository.findAll().stream()
                .filter(x -> x.getPosition().equals(position))
                .collect(Collectors.toList());
        return CustomRequestUtil.getResponseEntity(footballers);
    }

    //возвращает N игроков для M позиции от лучшего до худшего (не обязательно с соответствующей позицией)
    @GetMapping(value = "/footballer/{position}/top{count}")
    public ResponseEntity<Object> getTopPosition(@PathVariable String position, @PathVariable String count) {
        List<Footballer> footballers;
        if (count.equals("")) return CustomRequestUtil.getResponseEntity(new ArrayList<>());

        int countNum = Integer.parseInt(count);
        footballers = new FootballerService(footballerRepository).getTopFootballers(countNum, position);

        return CustomRequestUtil.getResponseEntity(footballers);
    }
}
