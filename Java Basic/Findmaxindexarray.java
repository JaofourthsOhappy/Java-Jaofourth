class Findmaxindexarray {
    public static void main(String[] args) {
        int [] numberB = {-90,-5,33,88};
        System.out.println("Max in array at point: " + findpoint(numberB));
    }

    static int findpoint (int[] array){
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] >= array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}