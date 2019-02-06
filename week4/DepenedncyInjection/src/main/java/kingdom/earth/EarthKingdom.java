package kingdom.earth;

import kingdom.Kingdom;
import kingdom.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class EarthKingdom implements Kingdom {

    private Planet mPlanet;

    @Autowired
    public EarthKingdom(Earth planet) {
        this.mPlanet = planet;
    }

    public void showPlanetNames() {
        System.out.println(mPlanet.getName());
    }

}
