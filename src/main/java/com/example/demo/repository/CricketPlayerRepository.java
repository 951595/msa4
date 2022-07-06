package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CricketPlayer;
@Repository
public interface CricketPlayerRepository extends JpaRepository<CricketPlayer, Integer> {

	CricketPlayer findByName(String name);

}
