package ru.pacman.ui;

import ru.pacman.controller.LevelData;
import ru.pacman.controller.PacmanGameController;
import ru.pacman.model.gamelevel.GameLevel;
import javax.swing.*;
import java.awt.event.KeyListener;

/* Pacman GUI consists of game field, score table and special game bar */
public class GraphicUI extends JFrame implements PacmanGameView {
    private PacmanGameController controller;
    private PacmanField gameField;
    //private PacmanScore gameScore;
    //private PacmanGameBar gameBar;

    /* TODO: Turning on double buffering */
    public GraphicUI(PacmanGameController _controller) {
        super("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /* TODO: Read about this bug (Why I should adding useless object on every dimension?) */
        setSize((GameLevel.objectsOnXAxis + 1) * PacmanField.objectSize, (GameLevel.objectsOnYAxis + 1  ) * PacmanField.objectSize);
        controller = _controller;
        LevelData level = controller.getLevelData();
        /* TODO: Read about this bug (Why I should adding useless object on every dimension?) */
        windowSizeX = (level.width + 1) * PacmanField.objectSize;
        windowSizeY = (level.height + 1) * PacmanField.objectSize;

        gameField = new PacmanField(controller);
        add(gameField);

        /* TODO: Frame also need special area for score and game context */
        // ??? Frame creating doesn't finished
        setVisible(true);
    }

    public void getKeyListener(KeyListener handler) {
        addKeyListener(handler);
    }

    public void updateCoords() {
        gameField.updateCoords();
    }

    public void updateGhostsPosition() {
        gameField.updateGhostsPosition();
    }

    public void gameOver() {
        System.out.println("Game Over");
    }

    void drawScore(/**/) {

    }
}
