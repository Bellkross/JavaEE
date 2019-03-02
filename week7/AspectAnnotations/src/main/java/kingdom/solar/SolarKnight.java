package kingdom.solar;

import kingdom.Kingdom;
import kingdom.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SolarKnight implements Knight {
    private String name;
    private Kingdom kingdom;

    @Autowired
    public SolarKnight(final Kingdom kingdom) {
        this("Arthur", kingdom);
    }

    public SolarKnight(final String name, final Kingdom kingdom) {
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
