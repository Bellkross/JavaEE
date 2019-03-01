package kingdom.earth;

import kingdom.Kingdom;
import kingdom.Planet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EarthKingdom implements Kingdom {

    private String name;
    private Planet mPlanet;

    public EarthKingdom(final String name, final Planet mPlanet) {
        this.name = name;
        this.mPlanet = mPlanet;
    }

    public List<String> getPlanetNames() {
        return new ArrayList<>(Collections.singleton(mPlanet.getName()));
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
