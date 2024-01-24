package com.ecommerce.demo.service;

import com.ecommerce.demo.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
