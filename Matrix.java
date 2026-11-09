package fourth;

public class Matrix {
    final int n;
    final int m;
    private double[][] arr;

    Matrix(int n, int m) {
        if (n <= 0 || m <= 0)
            throw new IllegalArgumentException("Размеры должны быть > 0");
        this.n = n;
        this.m = m;
        this.arr = new double[n][m];
    }

    public void insertDouble(double el, int row, int col) {
        if (row < 0 || col < 0 || row >= n || col >= m)
            throw new IllegalArgumentException("неправильный индекс");
        arr[row][col] = el;
    }

    public void addToEl(double el, int row, int col) {
        if (row < 0 || col < 0 || row >= n || col >= m)
            throw new IllegalArgumentException("неправильный индекс");
        arr[row][col] += el;
    }

    public void multiplyToEl(double el, int row, int col) {
        if (row < 0 || col < 0 || row >= n || col >= m)
            throw new IllegalArgumentException("неправильный индекс");
        arr[row][col] *= el;
    }

    public double getSum() {
        double s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s += arr[i][j];
            }
        }
        return s;
    }
    public int getLength() {
        return n*m;

    }

    public void multiplyElMatrix(double el){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] *= el;
            }
        }
    }

    public void addElMatrix(double el){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] += el;
            }
        }
    }

}


