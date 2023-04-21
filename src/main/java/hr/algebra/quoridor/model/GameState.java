package hr.algebra.quoridor.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameState implements Serializable {
    private List<SerializableButton> serializableButtonList;

    public GameState() {
        serializableButtonList = new ArrayList<>();
    }

    public List<SerializableButton> getSerializableButtonList() {
        return serializableButtonList;
    }

    public void setSerializableButtonList(List<SerializableButton> serializableButtonList) {
        this.serializableButtonList = serializableButtonList;
    }
}
