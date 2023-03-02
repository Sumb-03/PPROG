public class Pessoa {

    // Atributos
    private String name;
    private int age;

    //Construtores
    public Pessoa() {

    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Métodos de Instância
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString() {
        return String.format("%s tem %d anos", name, age);
    }
}
