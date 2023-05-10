package com.desenvolvedorkennedy.dslist.dto;

import com.desenvolvedorkennedy.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;


    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return this.id;
    } 

    public String getName() {
        return this.name;
    } 
}
