package com.example.demo.repositories;

import com.example.demo.models.Kompis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-16
 * Time: 13:34
 * Project:demolivebackend
 * Copyright: MIT
 */
@Repository
public interface KompisRepository extends CrudRepository<Kompis,Long> {

    List<Kompis> findByName(String name);
    List<Kompis> findByAddress(String address);
    List<Kompis> findByTelefonNumber(String telefonNumber);

}
