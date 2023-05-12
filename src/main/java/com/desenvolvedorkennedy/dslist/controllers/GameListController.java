package com.desenvolvedorkennedy.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.desenvolvedorkennedy.dslist.dto.GameListDTO;
import com.desenvolvedorkennedy.dslist.dto.GameMinDTO;
import com.desenvolvedorkennedy.dslist.dto.ReplacementDTO;
import com.desenvolvedorkennedy.dslist.services.GameListService;
import com.desenvolvedorkennedy.dslist.services.GameService; 

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{lisId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long lisId){
        return gameService.findByList(lisId);
    }

    @PostMapping(value = "/{lisId}/replacement")
    public void findByList(@PathVariable Long lisId, @RequestBody ReplacementDTO body){
        gameListService.move(lisId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
