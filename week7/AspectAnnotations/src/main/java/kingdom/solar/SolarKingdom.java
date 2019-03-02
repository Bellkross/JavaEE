package kingdom.solar;

import kingdom.Kingdom;
import kingdom.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SolarKingdom implements Kingdom {

    private ArrayList<Planet> mPlanets;

    @Autowired
    public SolarKingdom(ArrayList<Planet> planets) {
        this.mPlanets = planets;
    }

    public ArrayList<Planet> getPlanets() {
        return mPlanets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        mPlanets = planets;
    }

    public void showPlanetNames() {
        mPlanets.forEach(planet -> System.out.println(planet.getName()));
    }
}
