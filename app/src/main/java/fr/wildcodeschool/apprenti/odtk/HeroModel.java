package fr.wildcodeschool.apprenti.odtk;

import java.io.Serializable;

/**
 * Created by apprenti on 15/12/16.
 */

public class HeroModel implements Serializable {

    private boolean cut=false;
    private boolean gun=false;
    private boolean bomb=false;
    private int wommenLife=10;

    public HeroModel() {
    }

    public boolean isCut() {
        return cut;
    }

    public void setCut(boolean cut) {
        this.cut = cut;
    }

    public boolean isGun() {
        return gun;
    }

    public void setGun(boolean gun) {
        this.gun = gun;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public int getWommenLife() {
        return wommenLife;
    }

    public void setWommenLife(int wommenLife) {
        this.wommenLife = wommenLife;
    }
}
