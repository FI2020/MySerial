import java.io.Serializable;

public class Katze implements Serializable {
    private static final long serialVersionUID = 1L;
    // Fields
    public String stammbaum;
    public int alter;
    private String name;
    public String nachname;


    //Constructor
        public Katze(String name, int alter, String stammbaum, String nachname){
        this.name = name;
        this.alter = alter;
        this.stammbaum = stammbaum;
        this.nachname = nachname;

    }

     public String getname(){
        return name;
     }

     public void setname(String name){
        this.name = name;
     }

    @Override
    public String toString(){
        return "My name is " + name +
                ". I'am " + alter + "years old." +
                "Pedigree: " + stammbaum;
    }












}
