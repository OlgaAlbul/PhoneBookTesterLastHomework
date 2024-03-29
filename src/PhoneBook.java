import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PhoneBook {
    private static LinkedHashMap<String, ArrayList<String>> phoneBook = new LinkedHashMap<>();

    public void add(String name, String phoneNum) {
        ArrayList<String> itemsList;
        if (phoneBook.containsKey(name)) {
            itemsList = phoneBook.get(name);
        } else {
            itemsList = new ArrayList<>();
        }
        itemsList.add(phoneNum);
        phoneBook.put(name, itemsList);
    }


    public void update(String name, String phoneNum) {
        ArrayList<String> itemsList;
        if (phoneBook.containsKey(name)) {
            itemsList = phoneBook.get(name);
            if (itemsList.size() <= 1) {
                itemsList.clear();
            }
            itemsList.add(phoneNum);
            phoneBook.put(name, itemsList);
        }
        else{
            System.out.println("There is no such name");
        }
    }

    public void delete(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        }
        else{
            System.out.println("There is no such name");
        }
    }

    public ArrayList<String> find(String name) {
        ArrayList<String> itemsList;
        if (phoneBook.containsKey(name)) {
            itemsList = phoneBook.get(name);
        } else {
            itemsList = new ArrayList<String>();
        }
        return itemsList;
    }

    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }
}

