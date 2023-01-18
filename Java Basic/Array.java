class Array {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(number[2]);
        String [] zoo = {"Ant","Bird","Dog"};

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        
    }

        for (String data : zoo) {
            System.out.println(data);
    }

        int sum = 0;
        for (int item : number) {
            sum+=item;
    }
    System.out.println(sum);
}
} 