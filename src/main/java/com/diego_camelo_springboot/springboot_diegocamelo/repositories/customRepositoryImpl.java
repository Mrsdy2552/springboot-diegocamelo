package com.diego_camelo_springboot.springboot_diegocamelo.repositories;

import java.util.List;

import com.diego_camelo_springboot.springboot_diegocamelo.models.customer_data;

public interface customRepositoryImpl {

    List<customer_data> findAll();

    customer_data findId(Long id, String type);

}
