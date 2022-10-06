package io.codelex.enums.practice;

public enum ScissorPaperStone {
    SCISSOR("s"),
    PAPER("p"),
    STONE("t");

    private String shortcut;

    ScissorPaperStone(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getShortcut() {
        return shortcut;
    }

    static final ScissorPaperStone[] allChoices = ScissorPaperStone.values();

    public static ScissorPaperStone getSPSbyInt(int value) {
        for (ScissorPaperStone choice : allChoices) {
            if (choice.ordinal() == value) {
                return choice;
            }
        }
        return null;
    }

    public static ScissorPaperStone getChoiceFromShortcut(String shortcut) {
        for (ScissorPaperStone choice : allChoices) {
            if (choice.getShortcut().equals(shortcut)) {
                return choice;
            }
        }
        return null;
    }

}
