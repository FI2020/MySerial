import java.io.*;
public class MySerial {


    public static void main(String[] args) throws Exception {

        Katze Brunhilde = new Katze("Brunhilde", 15, "Perser-Katze", "von heiße Katze");
        Katze Petty = new Katze("Petty", 15, "Perser-Katze", "Princess from Teheran");
        Katze Nora = new Katze("Nora", 15, "Perser-Katze", "alter Landadel");
        Katze Tanja = new Katze("Tanja", 15, "Perser-Katze", "von Spitz wie Kerze");
        Katze Petra = new Katze("Petra", 15, "Perser-Katze", "von Mutters Gnaden");


        Katze[] katzenKaefig = {Brunhilde, Petty, Nora, Tanja, Petra};


        File katzen = new File("src/katzen.dat");

       //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(katzen));
      // oos.writeObject(katzenKaefig);


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(katzen));

        Katze[] katzenKlo = (Katze[]) ois.readObject();

        for(int i = 0; i < katzenKlo.length; i++){

            System.out.println(katzenKlo[i]);

        }






    }










}
