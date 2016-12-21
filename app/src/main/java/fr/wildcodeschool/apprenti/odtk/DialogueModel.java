package fr.wildcodeschool.apprenti.odtk;

/**
 * Created by apprenti on 15/12/16.
 */

public class DialogueModel {

    private String personnageName;
    private String text;

    public DialogueModel(String personnageName, String text) {
        this.personnageName = personnageName;
        this.text = text;
    }

    public String getPersonnageName() {
        return personnageName;
    }

    public void setPersonnageName(String personnageName) {
        this.personnageName = personnageName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
