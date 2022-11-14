package hr.algebra.quoridor.model;

import java.io.Serializable;

public class SerializableButton implements Serializable {
    private int positionX;
    private int positionY;
    private String string;

    public SerializableButton(int positionX, int positionY, String string) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.string = string;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
