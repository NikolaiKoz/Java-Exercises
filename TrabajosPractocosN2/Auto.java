package TrabajosPractocosN2;

public class Auto {

    //Atributos

    private String marca;
    private String modelo;
    private int caballaje;
    private int puertas;
    private String matricula;

    //Constructor

    public Auto(String marca, String modelo, int caballaje, int puertas, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.caballaje = caballaje;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    //Getters and Setters

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getCaballaje(){
        return caballaje;
    }

    public void setCaballaje(int caballaje){
        this.caballaje = caballaje;
    }

    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    //Métodos

    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Caballaje: " + caballaje);
        System.out.println("Puertas: " + puertas);
        System.out.println("Matricula: " + matricula);
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Ford", "Fiesta", 120, 5, "ABC123");
        auto1.mostrarDatos();
    }

}
