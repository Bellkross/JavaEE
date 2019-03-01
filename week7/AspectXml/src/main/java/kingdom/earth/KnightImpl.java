package kingdom.earth;

import kingdom.Kingdom;
import kingdom.Knight;

public class KnightImpl implements Knight {

    private String name;
    private Kingdom kingdom;

    public KnightImpl(final String name, final Kingdom kingdom) {
        this.name = name;
        this.kingdom = kingdom;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getKingdomName() {
        return kingdom.getName();
    }

    @Override
    public void saveKingdom() {
        System.out.println(String.format("I'm %s and I will save %s!", name, kingdom.getName()));
    }

}
