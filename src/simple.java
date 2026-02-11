public class simple {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        System.out.println(a + " " + b);
        swap(a,b);
        System.out.println(a + " "+ b);
        System.out.println(a);
//


    }
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
//        System.out.println(a +" "+ b);
    }
}
