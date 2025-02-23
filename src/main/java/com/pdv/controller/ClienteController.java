package com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdv.model.Cliente;
import com.pdv.repository.ClienteRepository;

@Controller
@RequestMapping(path = "cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping()
    public @ResponseBody Cliente post(@RequestBody Cliente cliente){
        return cliente;
    }
}
