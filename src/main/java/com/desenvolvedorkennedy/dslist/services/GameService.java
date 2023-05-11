package com.desenvolvedorkennedy.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desenvolvedorkennedy.dslist.dto.GameDTO;
import com.desenvolvedorkennedy.dslist.dto.GameMinDTO;
import com.desenvolvedorkennedy.dslist.projections.GameMinProjection;
import com.desenvolvedorkennedy.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        return new GameDTO(gameRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        return gameRepository.searchByList(listId).stream().map(x -> new GameMinDTO(x)).toList();
    }
}
