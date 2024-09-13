package com.diego_camelo_springboot.springboot_diegocamelo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.diego_camelo_springboot.springboot_diegocamelo.models.customer_data;
import com.diego_camelo_springboot.springboot_diegocamelo.repositories.customerRepository;

public class customerService implements customerServiceImpl {

    private Logger logger = LoggerFactory.getLogger(customerService.class);
    private customerRepository repository = new customerRepository();

    public List<customer_data> findAll() {
        return repository.findAll();
    }

    public customer_data findId(Long id, String type) {
        logger.info("Start of service");

        logger.info("Document type validation");
        if (!type.equalsIgnoreCase("CC") && !type.equalsIgnoreCase("pasaporte")) {
            logger.info("type of document not accepted: ", type);
            throw new IllegalArgumentException("Tipo de documento no aceptado.");
        }

        // Buscar cliente por ID
        customer_data customer = repository.findId(id, type);

        // Validar si el cliente existe
        if (customer == null) {
            logger.error("We can't find the user. with ID ", id, " and type ", type);
            throw new IllegalArgumentException("Lo sentimos, no encontramos el usuario.");
        }

        logger.info("debvolviendo usuairo ");
        return customer;
    }

}
