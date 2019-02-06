package kingdom.mars;

import kingdom.Planet;

class Mars implements Planet {

    private String name;

    public Mars() {
    }

    public Mars(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String planetName) {
        this.name = planetName;
    }
}