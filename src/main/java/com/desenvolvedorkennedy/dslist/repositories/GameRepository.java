package com.desenvolvedorkennedy.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenvolvedorkennedy.dslist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    
}