package kingdom.earth;

import kingdom.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
