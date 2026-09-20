import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    void addBuddy(BuddyInfo buddyInfo) {
        buddyInfos.add(buddyInfo);
    }

    void removeBuddy(BuddyInfo buddyInfo) {
        buddyInfos.remove(buddyInfo);
    }

    static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Michelle", "Carleton", "12346534");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        System.out.println("Address Book");
    }
}

