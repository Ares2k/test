package ie.tudublin;

//change
public class Main {

    public static void main(string[] args) {

        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

        for(String s:args) {
            System.out.println(s);
        }
    }
}