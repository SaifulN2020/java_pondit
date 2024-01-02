package arefin_bai_solve;

public class ClassMethod {

    public static void main(String[] args) {
        System.out.println(greet("Saiful"));
        System.out.println(sum(20,50));
    }
    public static String greet(String name){
        return "Hello " + name;
    }
    public static int sum(int a ,int b){
        return  a+b;

    }
}
