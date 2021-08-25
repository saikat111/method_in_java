public class MTh {
    public static void main(String args[]) {
        /*int x ;
        x = sum1() + sum2();*/
       /* System.out.println(sum1() + sum2());*/
/*
        System.out.println(sum1() + " " + sum2());
*/
        System.out.println(sum1() /*+ " " + sum2()*/);
        System.out.println(sum2());
    }
    static String sum1(){
        String name = "saikat";
        int num1 = 50;
        int num2 = 100;
        int result;
        result = num1 + num2;
        System.out.println(result + " ");
        return name;
    }
    static int sum2(){
        int num1 = 50;
        int num2 = 100;
        int result;
        result = num1 + num2;
        return result;
    }
}
