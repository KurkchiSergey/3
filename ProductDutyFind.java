import java.util.Scanner;

public class ProductDutyFind {
    public static int findProductDuty(int price,int weigth){
        int amount = price/100 + (weigth*100);
        return  amount;
    }
}
