package com.sandvoxel.rocketsim;

import com.sandvoxel.rocketsim.phyics.BasicRocket;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RocketSim {

    public static void main(String[] args) {
        BasicRocket rocket = new BasicRocket();

        rocket.simulate();

    }
}