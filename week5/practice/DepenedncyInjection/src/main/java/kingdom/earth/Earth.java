package kingdom.earth;

import kingdom.Planet;

class Earth implements Planet {

    private String name;

    Earth(String planetName) {
        this.name = planetName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
