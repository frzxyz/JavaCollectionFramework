import java.util.Set;
import java.util.TreeSet;

public class Family {
    private final Set<Niece> nieces;
    private final Set<Uncle> uncles;
    Family () {
        this.nieces = new TreeSet<>();
        this.uncles = new TreeSet<>();
    }

    public boolean addNiece (String name, int day, int month) {
        Niece newNiece = new Niece(name, day, month);
        for (Uncle un : uncles) {
            un.addPresent(newNiece, "");
            newNiece.addPresents(un, "");
        }
        return nieces.add(newNiece);
    }

    public boolean addUncle (String name) {
        Uncle newUncle = new Uncle(name);
        for (Niece nc : nieces) {
            newUncle.addPresent(nc, "");
            nc.addPresents(newUncle, "");
        }
        return uncles.add(newUncle);
    }

    public Niece findNiece (String name) {
        for (Niece nc : nieces) {
            if (name.equals(nc.getName()))
                return nc;
        }
        return null;
    }

    public Uncle findUncle (String name) {
        for (Uncle un : uncles) {
            if (name.equals(un.getName()))
                return un;
        }
        return null;
    }

    public void listNieces () {
        System.out.println(this.nieces);
    }

    public void listUncles () {
        System.out.println(this.uncles);
    }
}
