public class common {
    public static void main(String[] args) {
        Kidcat kidcat = new Kidcat("KidCat", "M");
        Lolly lolly = new Lolly("Lolly", "F");
        Rosie rosie = new Rosie("Rosie", "F");
        Tangy tangy = new Tangy("Tangy", "F");

        kidcat.introduce();
        lolly.introduce();
        rosie.introduce();
        tangy.introduce();
    }
}