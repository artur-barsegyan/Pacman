package ru.pacman.controller;

import ru.pacman.model.GameModel;
import ru.pacman.model.Point2D;
import ru.pacman.model.gamelevel.GameLevel;
import ru.pacman.ui.PacmanGameView;

public interface PacmanGameController {
    GameLevel getLevelState();
    void addView(PacmanGameView view);
    void gameStart();
    void getScore();
    Point2D<Integer> getCharacterCoords(String characterName);
    GameModel.Orientation getPacmanOrientation();
}