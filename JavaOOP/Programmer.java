package JavaOOP;
abstract class Programmer extends Employee{
    // public Programmer(){
    //     System.out.println("Hello am Programmer!");
    // }


    // overloading methods
    public void skill(){
        System.out.println("No skill!");
    }
    public void skill(String language){
        System.out.println("Skill: " + language);
    }
    public void skill(String...language){
        for(int i = 0; i < language.length;i++){
            System.out.println(language[i]);
    }
    }

    // overriding methods
    public void bonus(){
        
    }
}
