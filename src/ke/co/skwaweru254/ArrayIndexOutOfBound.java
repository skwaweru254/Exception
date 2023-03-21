package ke.co.skwaweru254;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        try {
            int[] bae = new int[4];
            bae[5]  = 5;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound is the exception caught");

        }
    }
}
