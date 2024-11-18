import java.util.Scanner;

public class PANmatchNationalCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your National Card Number");

        String cardNumber = sc.nextLine();
        NationalServices nationalServices = new NationalServices();
        PANServices panServices = new PANServices();

        NationalCard nationalCard = nationalServices.getNationalCardNumber(cardNumber);
        PAN panCard = panServices.getPANbyNationalNumber(cardNumber);
        if(nationalCard!=null && panCard!=null){
            System.out.println("National Card Details: "+nationalCard);
            System.out.println("PAN Card Details:"+panCard);
        }
        else{
            System.out.println("No Match Found");
        }
    }
}
