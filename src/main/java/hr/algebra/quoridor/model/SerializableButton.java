package hr.algebra.quoridor.model;

import java.io.Serializable;

public record SerializableButton(int positionX, int positionY, String string) implements Serializable { }
