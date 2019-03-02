package kingdom.solar;

import kingdom.Kingdom;
import kingdom.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class SolarKingdom implements Kingdom {

    private String name;
    private ArrayList<Planet> mPlanets;

    @Autowired
    public SolarKingdom(final String name, final ArrayList<Planet> mPlanets) {
        this.name = name;
        this.mPlanets = mPlanets;
    }

    @Override
    public List<String> getPlanetNames() {
        return mPlanets.stream().map(Planet::getName).collect(Collectors.toList());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }
}
