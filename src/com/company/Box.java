package com.company;

import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {

    Cell cell;

    public Box(int x, int y){
        super();
        cell = new Cell();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }

    public void initCells(int x, int y){

    }

}
