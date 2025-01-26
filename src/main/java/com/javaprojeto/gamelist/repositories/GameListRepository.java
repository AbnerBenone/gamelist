package com.javaprojeto.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojeto.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
