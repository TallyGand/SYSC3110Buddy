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
        System.out.println("Address Book");
    }
}

