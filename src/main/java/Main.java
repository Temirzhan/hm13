import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words =new ArrayList<>();
        words.add("apple");
        words.add("green");
        words.add("green");
        words.add("people");
        words.add("t-shert");
        words.add("t-shert");

        for (String s:words) {
            int i=0;
            for (String d:words) {
                if(s.equals(d)){
                    i++;
                }
            }
            if(i==1){
                System.out.println(s);
            }
        }
      Guide guide = new Guide();
        guide.addPerson("Adam","7984");
        guide.addPerson("Adam","7484");
        guide.addPerson("Rita","55555" );
        guide.addPerson("Lita","55554" );

        guide.printAll();

        guide.serchNumber("Adam");
        guide.serchPerson("55555");
    }


}
