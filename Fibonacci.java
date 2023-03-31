public class Fibonacci {
    public static void main(String[] args){
        int a=0,b=1, nexterm, n=15;
        System.out.print(a+","+b+",");
        for(int i=2;i<15;i++){
            nexterm=a+b;
            a=b;
            b=nexterm;
            System.out.print(nexterm+",");
        }
    }
}
