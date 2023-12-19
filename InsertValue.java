public class InsertValue{
    static int count = 0;
    public static void main(String[] args){
        // create an integer array
        int[] a = new int[6];
        for(int i = 0; i < a.length; i++){
            insert(a, (i + 1));
        }
        insertAtStart(a, 46);
        printValues(a);
    }

    public static void insertAtStart(int[] a, int value){
        for(int i = (a.length)-1; i > 0; i--){
            a[i] = a[i-1];
        }

        a[0] = value;
    }
    public static void insert(int[] a, int value){
        a[count] = value;
        count++;
    }

    public static void printValues(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println("Value at index: " + i + " Is: " + a[i]);
        }
    }
}