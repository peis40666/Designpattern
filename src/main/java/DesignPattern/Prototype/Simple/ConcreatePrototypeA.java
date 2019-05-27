package DesignPattern.Prototype.Simple;

import java.util.List;

/**
 * Created by peis 2019/5/26
 */
public class ConcreatePrototypeA implements Prototype{
    private int age;

    private String name;

    private List hobbies;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcreatePrototypeA clone() {
        ConcreatePrototypeA concreatePrototypeA = new ConcreatePrototypeA();
        concreatePrototypeA.setAge(this.age);
        concreatePrototypeA.setName(this.name);
        concreatePrototypeA.setHobbies(this.hobbies);
        return concreatePrototypeA;
    }
}
