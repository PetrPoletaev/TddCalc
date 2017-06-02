public class Matrix {
    public  double[][] mul( double[][] A, double[][] B ) {
        int n = A[0].length;
        double eps = 0.00001;
        double[][] C = new double[ n ][ n ];

        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n; j++ ) {
                for( int k = 0; k < n; k++ ) {
                    C[ i ][ j ] += A[ i ][ k ] * B[ k ][ j ];
                    if( Math.abs(  0 - C[ i ][ j ] ) < eps ) {
                        C[ i ][ j ] = 0;
                    }
                }
            }
        }
        return C;
    }
}
