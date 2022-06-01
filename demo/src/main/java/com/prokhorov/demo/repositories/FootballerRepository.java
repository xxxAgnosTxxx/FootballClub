package com.prokhorov.demo.repositories;

import com.prokhorov.demo.entities.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballerRepository extends JpaRepository<Footballer, Integer> {

}
