public class drawBox {
    public static void main(String[] args) {
        drawBox(5, 10);
    }

    public static int drawBox(int height, int width) {
        //draw top of box
        writeChars('*', width);
        System.out.println();

        // drav middle of box
        for (int i = 1; i <= height - 2; i++) {
            System.out.println("*");
            writeChars(' ', width);
            System.out.println("*");
        }
        // draw bottom of box
        writeChars('*', width);
        System.out.println();
    }
}