package DesignPattern.Prototype.Simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peis 2019/5/26
 */
public class SimpleTest {
    public static void main(String[] args) {
        ConcreatePrototypeA c = new ConcreatePrototypeA();
        c.setAge(18);
        c.setName("prototype");
        List<String> hobbies = new ArrayList<>();
        c.setHobbies(hobbies);
        Client client = new Client(c);
        ConcreatePrototypeA cClone = (ConcreatePrototypeA) client.startClone(c);
        System.out.println(c);
        System.out.println(cClone);
    }
}
