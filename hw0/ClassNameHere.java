public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int s=m[0];
        int i=1;
        while(i<m.length){
            if(s<m[i]){
                s=m[i];
            }
            i++;
        }
        System.out.println(s);
        return 0;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);

    }
}
