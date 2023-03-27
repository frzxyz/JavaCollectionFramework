import java.util.HashMap;
import java.util.Map;

public class Niece implements Comparable<Niece> {
    private final String name;
    private final int day;
    private final int month;
    private final Map<Uncle, String> presents;

    Niece (String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<Uncle, String> getPresents() {
        return presents;
    }

    public boolean addPresents (Uncle giver, String description) {
        if (giver != null) {
            presents.put(giver, description);
            return true;
        }
        return false;
    }

    public int clearPresents () {
        int count = 0;
        for (Map.Entry<Uncle, String> set : presents.entrySet()) {
            if (!set.getValue().equals("")) {
                set.setValue("");
                set.getKey().addPresent(this, "");
                count += 1;
            }
        }
        return count;
    }

    public void listPresents () {
        System.out.println(presents);
    }

    @Override
    public int compareTo (Niece other) {
        if (this.month == other.month)
            return Integer.compare(this.day, other.day);
        else
            return Integer.compare(this.month, other.month);
    }

    @Override
    public String toString () {
        return name;
    }
}
