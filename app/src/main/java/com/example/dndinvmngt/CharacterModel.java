package com.example.dndinvmngt;

import java.io.Serializable;
import java.util.ArrayList;

public class CharacterModel implements Serializable {

    private String characterName;
    private String characterRace;
    private String characterClass;

    private int characterLevel;
    private String characterIconLocation;

    public ArrayList<InventoryModel> characterInventories;

    public CharacterModel(String characterName, String characterRace, String characterClass, int characterLevel) {
        this.characterName = characterName;
        this.characterRace = characterRace;
        this.characterClass = characterClass;
        this.characterLevel = characterLevel;
        characterInventories = new ArrayList<InventoryModel>();
        characterIconLocation = "";
    }


    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterIconLocation() {
        return characterIconLocation;
    }
    public void setCharacterIconLocation(String characterIconLocation) {
        this.characterIconLocation = characterIconLocation;
    }
}
