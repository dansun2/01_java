package p0415;

public class Application01 {
    public static void main(String[] args){
        float d = 8888884.5f;
        int a = 1;
        byte b = (byte) 1000;

        System.out.println(b);


        System.out.println(d);
        System.out.println( (double)d );
        System.out.println( (int)d );
        System.out.println( a + (int)d );
        System.out.println( (float)a );
        System.out.println( (double)a );
    }
}
