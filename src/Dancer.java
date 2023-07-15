public class Dancer extends Person{

    public Dancer(String name, String designation, String name1, String designation1) {
        super(name, designation);
        this.name = name1;
        this.designation = designation1;
    }

    public String name;
    public String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
