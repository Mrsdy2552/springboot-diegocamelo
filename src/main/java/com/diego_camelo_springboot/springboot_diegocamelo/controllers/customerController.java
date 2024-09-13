package com.diego_camelo_springboot.springboot_diegocamelo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diego_camelo_springboot.springboot_diegocamelo.models.customer_data;
import com.diego_camelo_springboot.springboot_diegocamelo.services.customerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*")
public class customerController {

    private Logger logger = LoggerFactory.getLogger(customerController.class);
    //  private static final Logger logger = LoggerFactory.getLogger(customerController.class);
    private customerService service = new customerService();

    @GetMapping("/list")
    public List<customer_data> getlistCustomer() {
        logger.info("Search for all clients");
        return service.findAll();
    }

    // Buscar cliente por ID
    @GetMapping("/getCustomerId")
    public ResponseEntity<?> getCustomerId(@RequestParam Long id, @RequestParam String type) {
        logger.info("Search for customers by ID");
        try {
            customer_data customer = service.findId(id, type);
            logger.info("Customer found: {}", customer);
            return ResponseEntity.ok(customer);
        } catch (IllegalArgumentException e) {
            // Mensaje de error personalizado
            String errorMessage = String.format("No se pudo encontrar el cliente con el documento: %d y tipo de documento: %s", id, type);

            return ResponseEntity.badRequest().body(errorMessage);

        }

    }

}
