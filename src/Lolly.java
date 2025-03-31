public class Lolly {
    private String name;
    private String gender;

    public Lolly(String name, String gender) {
        this.name = name;
        switch(gender) {
            case "M":
                this.gender = "male"; break;
            case "F":
                this.gender = "female"; break;
            default: this.gender = "unknown";
        }
    }

    public void introduce() {
        System.out.println("Name: " + name + " Gender: " + gender);
    }
}