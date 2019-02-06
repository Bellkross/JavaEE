package kingdom.mars;

import kingdom.Kingdom;
import kingdom.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MarsKingdom implements Kingdom {

    private Planet mPlanet;

    MarsKingdom() {
    }

    Planet getPlanet() {
        return mPlanet;
    }

    @Autowired
    void setPlanet(Mars planet) {
        mPlanet = planet;
    }

    public void showPlanetNames() {
        System.out.println(mPlanet.getName());
    }

}
