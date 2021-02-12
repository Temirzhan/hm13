import java.util.Iterator;
import java.util.LinkedList;

public class Guide {
   private LinkedList<Person> person = new LinkedList<>();

    public void addPerson(String name, String phone){
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()){
            Person Item = iterator.next();
            if(Item.getName().equals(name)){
                Item.addPhone(phone);
                return;
            }
        }
       addNewPerson(name,phone);
    }

    public void serchNumber(String name){
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()){
            Person Item = iterator.next();
            if(Item.getName().equals(name)){
                Item.printPerson();
                return;
            }
        }
    }

    public void serchPerson(String phone){
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()){
            Person Item = iterator.next();
            if(Item.equalsPhone(phone)){
                Item.printPerson();
                return;
            }
        }
    }

    private void addNewPerson(String name, String phone){
        Person newPerson = new Person(name);
        newPerson.addPhone(phone);
        person.add(newPerson);
    };

   public void printAll(){
       Iterator<Person> iterator = person.iterator();

       while (iterator.hasNext()){
          iterator.next().printPerson();
       }
   }


}
