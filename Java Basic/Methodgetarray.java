class Methodgetarray {
    public static void main(String[] args) {
        int [] numberA = {10,20,30,40,50};
        displayarray(numberA);
        int [] numberB = {-90,-5,33,88};
        displayarray(numberB);
    }

    static void displayarray(int [] array){
        for (int i = 0; i < array.length; i++){
             System.out.println(array[i]);
        }
    }
}
