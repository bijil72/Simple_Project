public class Singleton {

    private Singleton(){

    }

    private static Singleton instance; //stores only 1 instance here, also helps to check

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton(); // create only 1 obj , can contains muiltple objetcs ref same varible,
        }
        return instance ;
    }

}

class Test{
    public static void main(String[] args) {
        Singleton myObj = Singleton.getInstance(); // create one
    }
}
