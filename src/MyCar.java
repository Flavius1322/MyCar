public class MyCar {
    private String name;
    private Model models;

    public MyCar(String name, Model models) {
        this.name = name;
        this.models = models;
    }

    public MyCar(String mercedes) {
    }

    public String getName() {
        return name;
    }

    public Model getModels() {
        return models;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModels() {
        this.models = models;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }
}