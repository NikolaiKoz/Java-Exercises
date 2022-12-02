import java.io.Serializable ; 

enum Tipo { MTB , RUTA , CITY , UTILITARIA }// posibles tipos de bicicleta
enum Cuadro{ XS, S , M , L , XL} // posibles cuadros de bicicletas.

public abstract class BicicletaPadre implements Serializable , Interfaz{

    // declaro todos los atributos como privados.
    private Tipo tipo;
    private String marca;
    private String rodado;
    private Cuadro cuadro;
    private int cambios;


    // declaro todos los metodos como publicos.
    public Tipo getTipo(){    // accedo al atributo tipo.
        return tipo ;
    } 
    public void setTipo(Tipo tipo){// asigno el atributo tipo.  
        this.tipo = tipo;
    }
    public String getMarca(){   // accedo al atributo marca.
        return marca ;
    } 
    public void setMarca(String marca){     // asigno el atributo marca.
        this.marca = marca;
    }
    public String getRodado(){   // accedo al atributo rodado.
        return rodado ;
    } 
    public void setRodado(String rodado){        // asigno el atributo rodado.
        this.rodado = rodado;
    }
    public Cuadro getCuadro(){      // accedo al atributo cuadro.
        return cuadro ;
    } 
    public void setCuadro(Cuadro cuadro){       // asigno el atributo cuadro.
        this.cuadro = cuadro;
    }
    public int getCambios(){        // accedo al atributo cambios.
        return cambios ;
    } 
    public void setCambios(int cambios){    // asigno el atributo cambios.
        this.cambios = cambios;
    }


    public void usar(){ // metodo para usar la bicicleta.
        System.out.println("La bicicleta esta siendo usada") ;
    }
    public void lavar(){        // metodo para lavar la bicicleta.
        System.out.println("La bicicleta esta siendo lavada") ;
    }
    public void pintar(){       // metodo para pintar la bicicleta.
        System.out.println("La bicicleta esta siendo pintada");
    }
    public void mantenimineto(){    // metodo para darle mantenimento a la bicicleta.
        System.out.println("La bicicleta esta en mantenimiento") ;
    }
    
    public BicicletaPadre(){
       // constructor vacio de la clase.
    }
    
}
