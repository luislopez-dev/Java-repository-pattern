package com.example.myapp.controller;

import com.example.myapp.entity.Client;
import com.example.myapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAll(){
        return clientService.findAll();
    }
    @GetMapping("{id}")
    public Client findById(@PathVariable int id){
        return clientService.findById(id);
    }
    @PostMapping()
    public Client save(@RequestBody Client client){
        clientService.saveOrUpdate(client);
        return client;
    }
    @PutMapping
    public Client update(@RequestBody Client client){
        clientService.saveOrUpdate(client);
        return client;
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        clientService.delete(id);
        return "Item deleted";
    }
}
