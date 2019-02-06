package kingdom.solar;

import kingdom.Planet;

public class Neptune implements Planet {

    private String name;

    public Neptune(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
