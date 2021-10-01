package com.sandvoxel.rocketsim.phyics;

import com.sandvoxel.rocketsim.math.Vector3;

import java.math.BigInteger;

public class BasicRocket{
    private Vector3 velocity = Vector3.ZERO.copy();
    private Vector3 acceleration = Vector3.ZERO.copy();
    private Vector3 position = Vector3.ZERO.copy();

    private float weight = 1;
    private float thrust = 10;
    private float burnTime = 4;

    public void simulate(){


        position.setY(0.1f);
        System.out.println("LiftOff");

        float apogee = 0;

        long last_time = System.nanoTime();
        long t= System.currentTimeMillis();
        long endBurn = t + (long) (burnTime*100);

        while (position.getY() > 0) {
            long time = System.nanoTime();
            float delta_time =  ((float) (time - last_time) / 1000000);
            last_time = time;

            if(System.currentTimeMillis() < endBurn) {
                acceleration.setY((thrust / weight) - Vector3.GRAVITY.getY());
            }else {
                acceleration.setY(-Vector3.GRAVITY.getY());
            }
            velocity.add(new Vector3(0,acceleration.getY()*delta_time,0));
            position.add(new Vector3(0,velocity.getY()*delta_time,0));
            if(position.getY() > apogee)
                apogee = position.getY();

/*            System.out.println(acceleration.getY()*delta_time);
            System.out.println(delta_time);*/



        }
        System.out.println("Rocket Has Landed. Apogee: " + apogee);
    }
}
