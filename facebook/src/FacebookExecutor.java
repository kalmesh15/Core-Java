import com.facebook.facebookapp.facebook.Facebook;
import com.facebook.facebookapp.useraccount.UserAccount;

public class FacebookExecutor {
    public static void main(String[] args) {
        System.out.println("main started");
        Facebook facebook =new Facebook();
        UserAccount userOne = new UserAccount();
        userOne.setUniqueId(1);
        userOne.setFirstName("Praveen");
        userOne.setLastName("Navi");
        userOne.setGender("Male");
        userOne.setEmail("praveen123@gmail.com");
        userOne.setMobileNumber(7895642563L);
        userOne.setPassword("Praveen@123");

        facebook.saveAccount(userOne);
        UserAccount userTwo = new UserAccount();
        userTwo.setUniqueId(2);
        userTwo.setFirstName("Prajwal");
        userTwo.setLastName("Shettar");
        userTwo.setGender("Male");
        userTwo.setEmail("prajwal123@gmail.com");
        userTwo.setMobileNumber(9978456256L);
        userTwo.setPassword("Prajwal@123");

        facebook.saveAccount(userTwo);
        UserAccount userThree = new UserAccount();
        userThree.setUniqueId(3);
        userThree.setFirstName("Varsha");
        userThree.setLastName("Mengani");
        userThree.setGender("Female");
        userThree.setEmail("varsha123@gmail.com");
        userThree.setMobileNumber(9985628456L);
        userThree.setPassword("Varsha@123");

        facebook.saveAccount(userThree);
        UserAccount userFour = new UserAccount();
        userFour.setUniqueId(4);
        userFour.setFirstName("Kalmesh");
        userFour.setLastName("Dyamannavar");
        userFour.setGender("Male");
        userFour.setEmail("kalmesh1234@gmail.com");
        userFour.setMobileNumber(7019136540L);
        userFour.setPassword("KalmeshD@123");

        facebook.saveAccount(userFour);
        UserAccount userFive = new UserAccount();
        userFive.setUniqueId(5);
        userFive.setFirstName("MeghaShree");
        userFive.setLastName("S");
        userFive.setGender("Female");
        userFive.setEmail("meghas@gmail.com");
        userFive.setMobileNumber(8586848283L);
        userFive.setPassword("MeghashreeS@123");

        facebook.saveAccount(userFive);
        facebook.getAccountsDetails();
        facebook.updateEmailByUniqueId("useraccount@gmail.com",3);
        facebook.updateMobileNumberByFirstName(7026136540L,"Kalmesh");
        System.out.println(facebook.updatePasswordByEmail("Prajju@2004", "prajwal123@gmail.com"));
        facebook.getAllAccountsEmail();
        facebook.getAccountsDetails();
        System.out.println("main ended");
    }
}
