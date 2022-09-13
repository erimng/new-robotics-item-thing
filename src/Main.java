import java.util.Scanner;
//import java.util.HashMap;

public class Main {
    /*private static HashMap<String, Character> op;
    private static void operators(){
        op = new HashMap<>();
        op.put("+");
    }*/
    public static Object calculator(double x, String operator, double y){
        if (operator.equals("+")){
            return (x + y);
        }
        else if (operator.equals("-")){
            return (x - y);
        }
        else if (operator.equals("*")){
            return (x * y);
        }
        else if (operator.equals("/")){
            if (x != 0){
                return (x / y);
            }
            else{
                return ("invalid input");
            }
        }
        else{
            return ("I do not understand.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            double x = sc.nextDouble();
            String operator = sc.next();
            double y = sc.nextDouble();

            System.out.println(calculator(x, operator, y));
        }

    }
}