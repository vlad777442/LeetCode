package main.common;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard"),
    UNDEFINED("Undefined");

    String name;

    Difficulty(String name)
    {
        this.name = name;
    }
}
