import java.util.HashMap;
import java.util.Map;

public class Uncle implements Comparable<Uncle> {
    private final String name;
    private final Map<Niece, String> presents;

    Uncle (String name) {
        this.name = name;
        presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent (Niece recipient, String description) {
        if (recipient != null && (!presents.containsValue(description) ||
                description.equals("")) && !recipient.getPresents().containsValue(description) || description.equals("")) {
            presents.put(recipient, description);
            recipient.addPresents(this, description);
            return true;
        }
        return false;
    }

    public void listPresents () {
        System.out.println(presents);
    }

    @Override
    public int compareTo(Uncle other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString () {
        return name;
    }
}
