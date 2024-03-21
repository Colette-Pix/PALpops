public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int years = 0;
        while(tuition < 20000){
            tuition=1.07*tuition;
            years++;
        }
        System.out.println(years + " years");
    }

}
