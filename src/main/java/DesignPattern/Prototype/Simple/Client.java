package DesignPattern.Prototype.Simple;

/**
 * Created by peis 2019/5/26
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(ConcreatePrototypeA concreatePrototypeA){
         return concreatePrototypeA.clone();
    }
}
