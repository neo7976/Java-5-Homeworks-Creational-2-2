public class BinOps {
    public String sum(String a, String b) {
        /**
         * Переведите числа из двоичной записи в
         строках в int, сложите и переведите
         обратно в двоичную запись
         */
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public String mult(String a, String b) {
        /**Переведите числа из двоичной записи в
         строках в int, перемножьте и переведите
         обратно в двоичную запись
         */
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }
}

