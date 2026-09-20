public class BuddyInfo {
    private String name;
    private String address;
    private String phone;

    public BuddyInfo(){
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    static void main(String[] args) {
        System.out.println("Hello World!");

        BuddyInfo buddyInfo = new BuddyInfo("Homer", "Odyssey", "12345632");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
