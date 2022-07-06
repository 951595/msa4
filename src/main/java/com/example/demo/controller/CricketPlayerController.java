package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CricketPlayer;
import com.example.demo.service.CricketPlayerService;

@RestController
public class CricketPlayerController {
	@Autowired
	private CricketPlayerService service ;
	@PostMapping("/addCricket")
	public CricketPlayer addCricketplayer(@RequestBody CricketPlayer cricketPlayer) {
		return service.saveCricketPlayer(cricketPlayer);
	}
	@PostMapping("/addCrickets")
	public List<CricketPlayer> addCricketPlayers(@RequestBody List<CricketPlayer>cps){
		return service.saveCricketPlayers(cps);
	}
	@GetMapping("/crickets")
	public List<CricketPlayer> findAllCricketPlayers(){
		return service.getCricketPlayers();
	}
	@GetMapping("/crickets/{id}")
	public CricketPlayer findCricketPlayerById(@PathVariable int id) {
		return service.getCricketPlayerById(id);
	}
	@GetMapping("/crickets/{name}")
	public CricketPlayer findCricketPlayerByName(@PathVariable String name) {
		return service.getCricketPlayerByName(name);
	}
	@PutMapping("/update")
	public CricketPlayer updateCricketPlayer(@RequestBody CricketPlayer cp) {
		return service.updateCricketPlayer(cp);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCricketPlayer(@PathVariable int id) {
		return service.deleteCricketPlayer(id);
	}

}
