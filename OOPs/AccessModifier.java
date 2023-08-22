public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "anushksanghvi";
        System.out.println(myAcc.username);   
        
        myAcc.Pass = "anushk123";    //Bcoz our Pass is private and it can be call within the class and not outside the class
        myAcc.setPassword("anushk123");
    }
}

class BankAccount{
    public String username;
    private String Pass;

    public void setPassword(String newPass){
        Pass = newPass;
    }
}

