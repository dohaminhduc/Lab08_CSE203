public class SingletonPattern {
    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();

        companyInfo.displayInfo();

        companyInfo.setCompanyName("EIU-Dai hoc Quoc te Mien Dong");
        companyInfo.setAddress("M38+6F3, Nam Ky Khoi Nghia, Dinh Hoa, Thu Dau Mot, Binh Duong");
        companyInfo.setPhoneNumber("(+84) 0274 222 0372");

        companyInfo.displayInfo();
    }
}
