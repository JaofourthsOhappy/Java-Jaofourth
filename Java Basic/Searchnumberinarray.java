class Searchnumberinarray {
    public static void main(String[] args) {
        int [] numberB = {-90,-5,33,88};
        System.out.println("The number ... at point  " +  searchnumber(numberB, -5));

        String [] name = {"Amm","Fourth","Pig","Cat"};
        System.out.println("The String ... at point  " +  searchstring(name,"ooo"));
        System.out.println("The String ... at point  " +  searchstring(name,"Pig"));
    }

    static int searchnumber(int [] array,int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }
    static int searchstring(String [] array,String name){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

}
