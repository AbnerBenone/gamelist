package com.javaprojeto.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojeto.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
