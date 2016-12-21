package fr.wildcodeschool.apprenti.odtk;

/**
 * Created by apprenti on 15/12/16.
 */

public class SceneModel {

    //private int id;
    private String name;
    private String lieux;
    private String description;
    private HeroModel hero;
    private ChoiceModel[] choices;
    private DialogueModel[] dialogues;
    private String[] backround;

    public SceneModel(){}

    public SceneModel(String name, String lieux, String description, HeroModel hero, ChoiceModel[] choices, DialogueModel[] dialogues, String[] backround) {
        //this.id = id;
        this.name = name;
        this.lieux = lieux;
        this.description = description;
        this.hero = hero;
        this.choices = choices;
        this.dialogues = dialogues;
        this.backround = backround;
    }
    public String[] getBackround() {
        return backround;
    }

    public void setBackround(String[] backround) {
        this.backround = backround;
    }

    /*public int getId() {
        return id;
    }*/

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLieux() {
        return lieux;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HeroModel getHero() {
        return hero;
    }

    public void setHero(HeroModel hero) {
        this.hero = hero;
    }

    public ChoiceModel[] getChoices() {
        return choices;
    }

    public void setChoices(ChoiceModel[] choices) {
        this.choices = choices;
    }

    public DialogueModel[] getDialogues() {
        return dialogues;
    }

    public void setDialogues(DialogueModel[] dialogues) {
        this.dialogues = dialogues;
    }

}
