package ke.co.skwaweru254;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int[] bae = new int[4];
            bae[5]  = 5;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound is the exception caught");

        }

        //output all the runtime exception after compiling
        throw new RuntimeException();

        //throw new Exception(); for all checked before compiling


    }
}
