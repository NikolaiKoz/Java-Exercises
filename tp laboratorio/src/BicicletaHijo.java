public class BicicletaHijo extends BicicletaPadre{

    private String identificador;// agrego un atributo unico de cada bici.

    public String getIdentificador(){
        return identificador;
    }
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    
    
     // metodo sin importacia.
    public void lavar(){    
        System.out.println("Ahora se lava de otra forma \n" + 
        "esto es una sobre escritura 'OverRiding'") ;
    }
    
    // sobre escribo el metodo hashCode. omito el atributo 'identificador' por que es unico en cada una.
    public int hashCode() {
        int result = 1;
        int b ;
        Integer cambios = getCambios();     
        b = getTipo().hashCode() + getMarca().hashCode() + getRodado().hashCode() + 
        getCuadro().hashCode() + cambios.hashCode();  
        result = CONSTANTE * result + b ;
        return result;
    }

    // sobre escribo el metodo equals. omito el atributo 'identificador' por que es unico.
    public boolean equals(BicicletaHijo obj) {
        if(this.getTipo() == obj.getTipo()){
            if (this.getMarca().equals(obj.getMarca())){
                if(this.getRodado().equals(obj.getRodado())){
                    if(this.getCuadro() == obj.getCuadro()){
                        if(this.getCambios() == obj.getCambios())
                            return true;
                    }
                }
            }
        }
        return false;
    }  
    
    
    // sobre escribo el metodo toString.
    public String toString(){
        String cadena;
        cadena = "Tipo: " + getTipo() + "   Marca: " + getMarca() + "   Rodado: " + getRodado() 
        + "''  Cuadro: " + getCuadro() + " Cambios: " + getCambios() + "   identificador: " + getIdentificador();
        return cadena;
    }

    // constructor sobre cargado de la clase.
    public BicicletaHijo(Tipo tipo, String marca, String rodado, Cuadro cuadro ,
    Integer cambios , String identificador){
        setTipo(tipo);
        setMarca(marca);
        setRodado(rodado);
        setCuadro(cuadro);
        setCambios(cambios);
        setIdentificador(identificador);

    }

    //constructor vacio de la clase.
    public BicicletaHijo(){ 

    }
}
