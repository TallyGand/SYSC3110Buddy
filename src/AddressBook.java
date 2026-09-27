import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    void addBuddy(BuddyInfo buddyInfo) {
        if (buddyInfos != null) {
            buddyInfos.add(buddyInfo);
        }
    }

    BuddyInfo removeBuddy(int Index) {
        if (Index >=0 && Index < buddyInfos.size()) {
            return buddyInfos.remove(Index);
        }
        return null;
    }

    static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Michelle", "Carleton", "12346534");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(0);
        System.out.println("Removed Buddy");
    }
}

