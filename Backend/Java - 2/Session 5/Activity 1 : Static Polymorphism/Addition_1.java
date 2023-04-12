// Polymorphism by changing number of arguments.

class SimpleAddition {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Addition {
    public static void main(String[] args){
        SimpleAddition obj = new SimpleAddition();
        System.out.println(obj.add(18 ,27));
        System.out.println(obj.add(9 ,18, 18));
        System.out.println("Code is Working....");
    }
}
