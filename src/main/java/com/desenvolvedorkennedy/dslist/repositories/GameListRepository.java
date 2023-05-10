package com.desenvolvedorkennedy.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desenvolvedorkennedy.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
