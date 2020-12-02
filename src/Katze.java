import java.io.Serializable;

public class Katze implements Serializable {

    // Fields
    public String stammbaum;
    public int alter;
    public String name;


    //Constructor
    public Katze(String name, int alter, String stammbaum){
        this.name = name;
        this.alter = alter;
        this.stammbaum = stammbaum;

    }

    @Override
    public String toString(){
        return "My name is " + name +
                ". I'am " + alter + "years old." +
                "Pedigree: " + stammbaum;
    }












}
