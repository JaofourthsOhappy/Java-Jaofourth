package JavaOOP;
abstract class Naruto {
    private String name;
    private String team;
    private String job;

    public void setname(String name) {
        this.name = name;
    }
    public void setteam(String team) {
        this.team = team;
    }
    public void displayNaruto(){
        System.out.println("Name: " + name + "\nTeam: " + team);
    }
    public abstract  void skills(String skills); 
}
