class Findmaxinarray {
    public static void main(String[] args) {
        int [] numberB = {-90,-5,33,88};
        System.out.println("Max in array is: " +  findmax(numberB));
    }

    static void displayarray(int [] array){
        System.out.println("}");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if (i < array.length-1) System.out.println(",");
        }
        System.out.println("}");
    }
    static int findmax(int [] array){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
