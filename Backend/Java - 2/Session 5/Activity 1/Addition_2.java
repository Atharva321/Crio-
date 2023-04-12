class ComplexAddition {
    int add(int a, int b){
        System.out.println("Method of a: int, b: int is called.");
        return a+b;
    }

    double add(double a, double b){
        System.out.println("Method of a: double, b: double is called.");
        return a+b;
    }

    int add(double a, int b){
        System.out.println("Method of a: double, b: int is called.");
        return (int)a+b;
    }

    int add(int a, double b){
        System.out.println("Method of a: int, b: double is called.");
        return a+(int)b;
    }

    int add(int a, int b, int c){
        System.out.println("Method of a: int, b: int, c: int is called.");
        return a+b+c;
    }


}

public class Addition_2 {
    public static void main(String[] args){
        ComplexAddition obj = new ComplexAddition();
        System.out.println(obj.add(18 ,27));
        System.out.println(obj.add(18.0 ,27));
        System.out.println(obj.add(18 ,27.0));
        System.out.println(obj.add(18.0 ,27.0));
        System.out.println(obj.add(9 ,18, 18));
        System.out.println("Code is Working....");
    }
}
