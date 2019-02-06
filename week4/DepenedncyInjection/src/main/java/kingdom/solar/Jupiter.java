package kingdom.solar;

import kingdom.Planet;

public class Jupiter implements Planet {

    private String name;

    public Jupiter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
