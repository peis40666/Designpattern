package DesignPattern.Prototype.Deep;

import java.io.*;
import java.util.Date;

/**
 * Created by peis 2019/5/27
 */
public class Qitiandashen extends Monkey implements Cloneable, Serializable {

    private Jingubang jingubang;


    public Qitiandashen() {

        this.jingubang = new Jingubang();
        this.setBirthday(new Date());
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Qitiandashen copy = (Qitiandashen) ois.readObject();
            copy.setBirthday(new Date());
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Jingubang getJingubang() {
        return jingubang;
    }

    public void setJingubang(Jingubang jingubang) {
        this.jingubang = jingubang;
    }
}
