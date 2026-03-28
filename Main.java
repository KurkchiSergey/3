import ru.netology.service.CustomsService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите цену товара (в руб.): ");
         int price = scanner.nextInt();// получаем цену товара и кладем в price
         System.out.print("Введите вес товара (в кг): ");
         int weight = scanner.nextInt(); //получаем массу товара и кладем в weight
         System.out.println("Размер пошлины (в руб.) составит: " + CustomsService.calculateCustoms(price,weight));

    }
}