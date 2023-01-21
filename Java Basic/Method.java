
class Method {
    public static void main(String[] args) {
        // call the method
        display();
        plus();
        call_Fourth("Fourth");
        fullname("Sittanat","Palakawong Na Ayudthaya"); 
    }
    // create a new method
    static void display(){
        System.out.println("Method display");
    }
    static void plus(){
        int a = 2;
        int b = 5;
        int c =  a+b;
        System.out.println(c);
    }

    static void call_Fourth(String message) {
        System.out.println("Hello " + message);
    }

    static void fullname(String name,String lastname) {
        System.out.println(name + " " + lastname);
    }
}
