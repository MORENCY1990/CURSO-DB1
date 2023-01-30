package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int  fibonacci = 0;
        int num = 10;
        for(int i = 0; i <=10; i++) {
            if(i <=2 ) {
                fibonacci = 1;
                System.out.println(fibonacci);
            }else {
                fibonacci = (i -1) + (i-2);
                System.out.println(fibonacci);
            }
        }
        
        
    }

}
