public class Main {
    public static void main(String[] args) {
        Family Skywalker = new Family();

        Skywalker.addNiece("Samantha", 5, 2);
        Skywalker.addNiece("Paimon", 10, 8);
        Skywalker.addNiece("Leia", 12, 2);
        Skywalker.addNiece("Luke", 1, 4);
        Skywalker.addNiece("Carloss", 30, 3);

        Skywalker.addUncle("Roger");
        Skywalker.addUncle("Vader");
        Skywalker.addUncle("Matt");

        Skywalker.findUncle("Roger").addPresent(Skywalker.findNiece("Paimon"), "Pink Car");
        Skywalker.findUncle("Vader").addPresent(Skywalker.findNiece("Paimon"), "Blue Car");
        Skywalker.findUncle("Matt").addPresent(Skywalker.findNiece("Paimon"), "Pink Car");
        Skywalker.findUncle("Vader").listPresents();
        Skywalker.findUncle("Roger").listPresents();
        Skywalker.findNiece("Paimon").listPresents();

        Skywalker.findNiece("Paimon").clearPresents();

        Skywalker.findUncle("Vader").listPresents();
        Skywalker.findUncle("Roger").listPresents();
        Skywalker.findNiece("Paimon").listPresents();
    }
}