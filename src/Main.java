public class Main {
    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.add("Ivan", "89824569782");
        phones.add("Fedor", "89826547832");
        phones.add("Ivan", "89823654782");
        phones.add("John", "89824578231");
        System.out.println(phones.find("Ivan"));
        System.out.println(phones.getPhoneBook());
        phones.update("Fedor", "85476982147");
        phones.add("Fedor", "89542654723");
        phones.update("Ivan", "87452369874");
        System.out.println(phones.getPhoneBook());
        phones.delete("Ivan");
        System.out.println(phones.getPhoneBook());
    }
}