class Returnmaxnum {
    public static void main(String[] args) {
        int result = maxnumber(31, 30);
        System.out.println("Max number: " + result);
        System.out.println("Summation: " + summation(30, 50));
    }

    static int maxnumber(int num1,int num2) {
        if (num1 > num2) {
            return num1;
        }else{
            return num2;
        }

    }
    static int summation(int num3,int num4) {
        int total = num3 + num4;
        return total;
    }
}
