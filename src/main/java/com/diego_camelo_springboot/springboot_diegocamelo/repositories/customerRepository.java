package com.diego_camelo_springboot.springboot_diegocamelo.repositories;

import java.util.Arrays;
import java.util.List;

import com.diego_camelo_springboot.springboot_diegocamelo.models.customer_data;

public class customerRepository implements customRepositoryImpl {

    private List<customer_data> data;

    public customerRepository() {
        this.data = Arrays.asList(
                new customer_data(
                        23445322L,
                        "CC",
                        3002837056L,
                        "Calle 123456",
                        "soacha",
                        "Diego",
                        "Camelo",
                        "alexander",
                        "Camelo"),
                new customer_data(
                        23445322L,
                        "pasaporte",
                        3002837056L,
                        "Calle 125 b este ",
                        "soacha",
                        "Prueba",
                        "",
                        "sin traer",
                        "test"),
                new customer_data(
                        456789657L,
                        "pasaporte",
                        3002837056L,
                        "Calle 125 b este ",
                        "soacha",
                        "Prueba2",
                        "prueba  numero 2",
                        "sin traer",
                        "test2")
        );
    }

    public List<customer_data> findAll() {
        return data;
    }

    public customer_data findId(Long id, String type) {
        return data.stream()
                .filter(p -> p.getId().equals(id) && p.getDocumentType().equals(type))
                .findFirst()
                .orElse(null);
    }

}
