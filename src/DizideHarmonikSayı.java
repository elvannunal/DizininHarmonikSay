import java.util.Arrays;
public class DizideHarmonikSayı {
    public static void main(String[] args) {
        double[] arr={1,2,3,4,5,6,7,8,9,10};
        double sum=0;
        for(double i=1; i< arr.length; i++){
            sum+=1/i;
        }
        double average=arr.length/sum;
        System.out.println("HARMONİK ORTALAMA: "+average);

    }
}
