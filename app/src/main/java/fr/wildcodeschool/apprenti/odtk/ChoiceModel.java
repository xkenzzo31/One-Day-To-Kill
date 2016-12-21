package fr.wildcodeschool.apprenti.odtk;

/**
 * Created by apprenti on 15/12/16.
 */

public class ChoiceModel {

    private int id;
    private String text;
    private int nextScene;

    public ChoiceModel(int id, String text,int nextScene) {
        this.nextScene = nextScene;
        this.id = id;
        this.text = text;
    }

    public int getNextScene() {
        return nextScene;
    }

    public void setNextScene(int nextScene) {
        this.nextScene = nextScene;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
