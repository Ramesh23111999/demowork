class sereies {
    public static void main(String args[]) {
        int n = 11, i = 0, sum = 0, x = 2;
        while (i < n) {
            sum += Math.pow(x, i);
            i++;

        }
        System.out.println("x=" + x + "sum of series 1+x+x^2+....=" + sum);

    }
}