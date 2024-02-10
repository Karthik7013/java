public class P30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {

                System.out.print("* ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            System.out.println();
        }
        System.out.println("pending...");



        // [
        //     ["",true,12,],
        //     ["",true,55],
        //     ["",true,56]
        // ]
    }

}
