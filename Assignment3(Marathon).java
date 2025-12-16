public class Marathon {
    public static void main(String[] args) {
        int[] Grade = {7, 4, 3, 5, 9, 2, 8, 10, 6};
        int Maxvalue = Grade[0];
        int Maxvalue2 = Grade[1];

        if (Grade[1] > Grade[0]){
            Maxvalue = Grade[1];
            Maxvalue2 = Grade[0];
        }

        for (int i = 2 ; i < Grade.length ; i++){
            if (Grade[i] > Maxvalue){
                Maxvalue2 = Maxvalue;
                Maxvalue = Grade[i];
            }
            else if (Grade[i] > Maxvalue2){
                Maxvalue2 = Grade[i];
            }
        }
        System.out.println("Maxvalue = " + Maxvalue + " , Maxvalue2 = " + Maxvalue2);
    }
}