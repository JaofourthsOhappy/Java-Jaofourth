class Summation {
    public static void main(String[] args) {
        summation(20,54,657,87,353,32,4,2);
    }
    public static void summation(int ... number){
        int sum = 0;
        for (int i = 0; i < number.length;i++){
            sum+=number[i];
        }
        System.out.println(sum);
    }
}

