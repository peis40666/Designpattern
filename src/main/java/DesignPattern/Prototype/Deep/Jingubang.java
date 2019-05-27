package DesignPattern.Prototype.Deep;

import java.io.Serializable;

/**
 * Created by peis 2019/5/27
 */
public class Jingubang implements Serializable {
    public float h = 100;
    public float d = 100;

    public void big(){
        this.h *= 2;
        this.d *= 2;
    }
    public void small(){
        this.h /= 2;
        this.d /= 2;
    }
}
