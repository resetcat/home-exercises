package io.codelex.enums.practice;

public enum CardinalDirections {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private String mapPosition;

    public String getMapPosition() {
        return mapPosition;
    }

    CardinalDirections(String mapPosition) {
        this.mapPosition = mapPosition;
    }

    public void printDirections() {
        System.out.println("Direction\tText");
        for (CardinalDirections position : CardinalDirections.values()) {
            String s = capitalizeFirstLetter(position);
            System.out.println(s + "\t\t" + position.getMapPosition());
        }
    }

    public void printWithKeys() {
        for (CardinalDirections position : CardinalDirections.values()) {
            String s = capitalizeFirstLetter(position);
            System.out.println(s + ":" + position.getMapPosition() + ":" + position.ordinal());
        }
    }

    private String capitalizeFirstLetter(CardinalDirections position) {
        return position.toString().charAt(0) + position.toString().toLowerCase().substring(1);
    }
}
