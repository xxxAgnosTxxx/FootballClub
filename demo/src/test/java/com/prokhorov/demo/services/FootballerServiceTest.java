package com.prokhorov.demo.services;


import com.prokhorov.demo.entities.Footballer;
import com.prokhorov.demo.repositories.FootballerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.*;

class FootballerServiceTest {
    @Autowired
    private FootballerRepository repository;
    private FootballerService service;

    public FootballerServiceTest() {
        this.service = new FootballerService(repository);
        service = mock(FootballerService.class);
    }

    @Test
    public void getTopFootballers_isInvokeTest() {
        List<Footballer> list = service.getTopFootballers(5, "forward");
        verify(service).getTopFootballers(5, "forward");
    }

    @Test
    public void getTopFootballers_invokeOnceTest() {
        service.getTopFootballers(3, "forward");
        verify(service, only()).getTopFootballers(3, "forward");
    }
}