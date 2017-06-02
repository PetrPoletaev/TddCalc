/**
 * Created by Petr on 14.05.2017.
 */
public class Equation {

    public static void showMatrix( double[][] M ) {
        int n = M[ 0 ].length;
        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n; j++ ) {
                System.out.print( M[ i ][ j ] + "  " );
            }
            System.out.println();
        }
    }

}
