class Bank {
    int getRateOfInterest(){
        return 5;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        System.out.println("SBI Interest: 8%");
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        System.out.println("SBI Interest: 7%");
        return 7;
    }
}


public class Test {
    public static void main(String[] args){
        SBI sbi = new SBI();
        System.out.println(sbi.getRateOfInterest());
        ICICI icici = new ICICI();
        System.out.println(icici.getRateOfInterest());
        System.out.println("Code is Working....");
    }
}
