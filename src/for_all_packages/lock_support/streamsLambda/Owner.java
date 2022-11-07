package for_all_packages.lock_support.streamsLambda;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public List<Animal> getPets() {
        return pets;
    }
}
