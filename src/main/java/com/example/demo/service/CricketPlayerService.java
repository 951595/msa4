package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CricketPlayer;
import com.example.demo.repository.CricketPlayerRepository;

@Service
public class CricketPlayerService {
	@Autowired
	private CricketPlayerRepository cricketPlayerRepository;
	
	public CricketPlayer saveCricketPlayer(CricketPlayer cp){
		return cricketPlayerRepository.save(cp);
		
	}
	public List<CricketPlayer> saveCricketPlayers(List<CricketPlayer>cricketPlayers){
		return cricketPlayerRepository.saveAll(cricketPlayers);
		
	}
	public  List<CricketPlayer>getCricketPlayers(){
		return cricketPlayerRepository.findAll();
	}
	public CricketPlayer getCricketPlayerById(int id) {
		return cricketPlayerRepository.findById(id).orElse(null);
	}
	public CricketPlayer getCricketPlayerByName(String name) {
		return cricketPlayerRepository.findByName(name);
	}
	public String deleteCricketPlayer(int id) {
		cricketPlayerRepository.deleteById(id);
		return "player is removed"+id;
	}
	public CricketPlayer updateCricketPlayer(CricketPlayer cpl) {
		CricketPlayer ep=cricketPlayerRepository.findById(cpl.getId()).orElse(null);
		ep.setName(cpl.getName());
		ep.setPlayertype(cpl.getPlayertype());
		ep.setRunscored(cpl.getRunscored());
		
		return cricketPlayerRepository.save(ep);
	}

}
