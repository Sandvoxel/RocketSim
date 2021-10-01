package com.sandvoxel.rocketsim.math;

public class Vector3 {
    private float x, y, z;

    public static final Vector3 ZERO = new Vector3(0,0,0);
    public static final Vector3 GRAVITY = new Vector3(0,9.81f,0);


    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float dot(Vector3 vector3){
        float i = x * vector3.getX();
        float j = y * vector3.getY();
        float k = z * vector3.getZ();

        return i + j + k;
    }

    //Gets length of vector
    public float length(){
        return (float) Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }

    public void add(Vector3 vector3){
        x += vector3.getX();
        y += vector3.getY();
        z += vector3.getZ();
    }
    public void sub(Vector3 vector3){
        x -= vector3.getX();
        y -= vector3.getY();
        z -= vector3.getZ();
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector3 copy(){
        return new Vector3(x,y,z);
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
