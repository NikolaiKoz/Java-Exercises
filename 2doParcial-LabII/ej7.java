/*

 */

public class ej7 {

    private String name;
    private int age;

    // Constructor
    public ej7(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // constructor
    public ej7() {
        this.name = "John Doe";
        this.age = 0;
    }

    // getter
    public String getName() {
        return name;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "ej7{" + "name=" + name + ", age=" + age + '}';
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ej7 other = (ej7) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + this.age;
        return hash;
    }

}
