public class CompanyInfo {
    private static CompanyInfo instance;

    private String companyName;
    private String address;
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static CompanyInfo getInstance() {
        return instance;
    }

    public static void setInstance(CompanyInfo instance) {
        CompanyInfo.instance = instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String email;

    public CompanyInfo(String companyName, String address, String email, String phoneNumber, String owner) {
        this.companyName = companyName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    private String owner;

    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);
    }
}
