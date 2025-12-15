public class FooCorporation{
    public static void Basepay(double base,int hours){
        if(base < 8.00){
            System.out.println("This is illegal,the minimum pay is $8.00 !");
        } else if (hours > 60) {
            System.out.println("This is illegal,the maximum hour is 60 !");
        }else {
            double pay = 0.0;
            if (hours < 40){
                pay = base * hours;
            }else {
                pay = 40 * base + (hours - 40) * 1.5 * base;
            }
            System.out.println("Pay = $"+ pay);
        }
    }
    public static void main(String[] args){
        Basepay(10,50);
        Basepay(7.2,40);
        Basepay(12,65);
    }
}