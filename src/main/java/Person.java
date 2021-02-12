import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Person {
    private String Name;
    private LinkedList<String> phone = new LinkedList<>();

    public Person(String name) {
        Name = name;
    }

    public void addPhone(String phone){
        this.phone.add(phone);
    }

    public String getName(){
        return Name;
    }

    public void printPerson(){
        System.out.print("Name: "+ Name +" Phone: ");
        Iterator<String> iterator = phone.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
    }

    public boolean equalsPhone(String phone) {
        Iterator<String> iterator = this.phone.iterator();
        while (iterator.hasNext()){
            if(iterator.next()==phone){
                return true;
            }
        }
    return false;
    }

}
