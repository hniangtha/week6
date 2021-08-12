public class simpleJava {
    public static void main (String[]arg){
        int [] number = new int[2];
        //o(n^3)
        for ( int i = 0; i< number.length; i++)// o(n)
            for ( int j = 0; j<number.length; j++)// o(n)
                for (int k = 0; k<number.length; k++)// o(n)
                    System.out.println( i + ", " + j + ", " + k);

    }
}
