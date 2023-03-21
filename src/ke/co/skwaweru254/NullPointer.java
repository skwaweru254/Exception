package ke.co.skwaweru254;

public class NullPointer {

    public static void main(String[] args) {

        try {
            String bae = null;
            System.out.println(bae.charAt(0));

        } catch (NullPointerException e) {
            System.out.println("NullPointerException is the exception found");
        }
    }
}
