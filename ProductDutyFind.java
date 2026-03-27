import java.util.Scanner;

public class ProductDutyFind {
    public static int findProductDuty(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price =scanner.nextInt();
        System.out.print("Введите вес товара (в кг): ");
        int weight = scanner.nextInt();
        int amount = price/100 + (weight*100);
        System.out.print("Размер пошлины (в руб.) составит: " );
        return  amount;
    }
}
