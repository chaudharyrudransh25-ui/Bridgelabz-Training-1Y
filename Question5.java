package WrapperClass;

import java.util.ArrayList;
public class Question5 {

    public static void main(String[] args){
        double sum=0;
        double[] prices = {10.5,20.0,35.75,5.5};

        ArrayList<Double> priceList = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            priceList.add(prices[i]);
        }
        for(int i=0;i<prices.length;i++){
            sum+=priceList.get(i);
        }
        double avg=sum/prices.length;
        System.out.println("Average prices : " +avg);
        System.out.println("Highest prices : " +priceList.get(2));
    }
}
