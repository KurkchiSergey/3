package ru.netology.service;
public class CustomsService {
    public static final int CUSTOMS_RATE = 100;// ставка пошлины
    public static int calculateCustoms(int price,int weight){
        return price/100 + (weight*CUSTOMS_RATE);
    }

}
