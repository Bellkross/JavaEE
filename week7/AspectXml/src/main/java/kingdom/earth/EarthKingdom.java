package kingdom.earth;

import kingdom.Kingdom;
import kingdom.Planet;

class EarthKingdom implements Kingdom {

    private Planet mPlanet;

    public EarthKingdom(Earth planet) {
        this.mPlanet = planet;
    }

    public void showPlanetNames() {
        System.out.println(mPlanet.getName());
    }

}
