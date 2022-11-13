package hr.algebra.quoridor.model;

import javafx.scene.image.ImageView;
import java.io.Serializable;

public class SerializableButton implements Serializable {
    private int positionX;
    private int positionY;
    private ImageView imageView;

    public SerializableButton(int positionX, int positionY, ImageView imageView) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.imageView = imageView;
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

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
