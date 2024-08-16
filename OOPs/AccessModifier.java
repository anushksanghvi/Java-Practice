public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "anushksanghvi";
        System.out.println(myAcc.username);   
        
        myAcc.pass = "anushk123";    //Bcoz our Pass is private and it can be call within the class and not outside the class
        myAcc.setPassword("qwerty");     // We can only set a new password
        System.out.println(myAcc.pass);      // And cannot print the password
    }
}

class BankAccount{
    public String username;
    private String pass;

    public void setPassword(String pwd){
        pass = pwd;
    }
}

