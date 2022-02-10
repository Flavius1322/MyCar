
public class Client {
    private String Name;
    private String First_name;


    public Client(String Name, String First_name) {
        this.Name = Name;
        this.First_name = First_name;
    }

    public Client() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }


    @Override
    public String toString() {
        return "Client{" +
                "nume='" + Name + '\'' +
                ", prenume='" + First_name + '\'' +
                '}';
    }
}
