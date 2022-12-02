// importo las librerias necesarias. 
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NegocioBicicletas {
    public static void main(String[] args) throws Exception{

        // lista donde se van a guardar todas las bicicletas. 
        ArrayList <BicicletaHijo> listaBicicletas = new ArrayList <BicicletaHijo>();


        File archivo = new File("Bicicletas.txt");// archivo donde se leen y escriben las bicis.
        archivo.createNewFile();//metodo para crear el archivo en caso de que no exista.

        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));

        try {         
            //entrada = new ObjectInputStream(new FileInputStream(archivo));
            // voy leyendo de a un objeto y lo casteo a BicicletaHijo.
            BicicletaHijo bici = (BicicletaHijo) entrada.readObject(); 
            while(true){
                listaBicicletas.add(bici); // agrego la bicicleta a la coleccion.
                bici = (BicicletaHijo) entrada.readObject();// leo otra bicicleta.
                /* este while se ejecuta hasta que ya no hay mas objetos en el archivo
                 y lanza un error. No encontre como poner en la condicion para evitar llegar a ese error.*/     
            }     

        }catch(Exception e){
        boolean seguir = true; 
        int opcion = 0;
        do{
            opcion = mostrarOpciones();
            // menu de opciones.   
            switch(opcion){
            case 1:
                agregarBici(listaBicicletas);
                break;
            case 2:
                buscarBici(listaBicicletas);
                break;
            case 3:
                verColeccion(listaBicicletas);
                break;
            case 4:
                eliminarBici(listaBicicletas);
                break;
            default:
                seguir = false;
                break;
            }
        }while(seguir);

        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));

        // recorro con un for adaptado las bicicletas de la coleccion y las escribo en el archivo.
        for(BicicletaHijo bici : listaBicicletas){
            salida.writeObject(bici);
        }
        entrada.close();
        salida.close();
        }
    }


    public static String validarRodado(){//metodo para validar uno de los rodados posibles.
        String rodado = "";
        do{
            rodado = leerDatos("Ingrese el rodado de la bici: 26, 27.5 o 29: ");
        }while(!rodado.equals("26") && !rodado.equals("27.5") && !rodado.equals("29"));
        return rodado;
    }

    // metodo para buscar una bicicleta en la coleccion.
    public static void buscarBici(ArrayList <BicicletaHijo> lista){ 
        System.out.println("\nBuscar por los atributos: 1");
        System.out.println("Buscar por el identificador: 2");
        int numero = 0;
        do{
            numero = validarCaracterNumerico("Ingrese 1 o 2: ");
        }while(numero != 2 && numero !=1);

        if(numero == 1){
            Tipo t = validarTipo();
            String m = leerDatos("Ingrese la marca de la bici: ");  
            String r = validarRodado();
            Cuadro cu = validarCuadro();
            int ca = validarCaracterNumerico("Ingrese la cantidad de cambios: ");

            BicicletaHijo bici2 = new BicicletaHijo(t ,m ,r , cu , ca, "x");
            boolean encontrado = false;
            for(Object biciAux : lista ) { 
                BicicletaHijo bici = (BicicletaHijo) biciAux;
                if(bici.hashCode() == bici2.hashCode()){
                    if(bici.equals(bici2)){
                        System.out.println("Bici encontarada: " + bici );
                        encontrado = true;
                    }         
                } 
            }
            if(!encontrado)
                System.out.println("\nNo existe ninguna bici con esos atributos.");
        }else{
            String identificador = leerDatos("\nIngrese el identificador: ");
            boolean encontrado = false;
            int indice = 0;
            while( indice < lista.size() && !(encontrado) ) { 
                BicicletaHijo bici = (BicicletaHijo)lista.get(indice);
                if(bici.getIdentificador().equals(identificador)){
                    System.out.println("Bici encontarada: " + bici );
                    encontrado = true;
                } 
                indice ++;
            }
            if(!encontrado)
                System.out.println("\nNo existe ninguna bici con ese identificador.");
        }
    }
    
    // metodo para mostrar por pantalla el menu de opciones.
    public static int mostrarOpciones(){
        int opcion = 0 ;
        boolean iterar = false ;
        do{
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("Agregar bicis a la coleccion: 1");
            System.out.println("Buscar una bici: 2");
            System.out.println("ver bicis disponibles: 3");
            System.out.println("eliminar bicis: 4");
            System.out.println("salir: 5");
            opcion = validarCaracterNumerico("");
            
            iterar = false ;

            if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 ){
                System.out.println("\nLa opcion ingresada no es correcta");
                iterar = true;
            }
        }while(iterar);
        return opcion;
    }

    // metodo para agregar una bicicleta a la coleccion.
    public static void agregarBici(ArrayList <BicicletaHijo> lista){
        Tipo t = validarTipo();
        String m = leerDatos("Ingrese la marca de la bici: ");  
        String r = validarRodado();
        Cuadro cu = validarCuadro();
        int ca = validarCaracterNumerico("Ingrese la cantidad de cambios: ");
        String iden = validarIdentificador(lista);     
        lista.add(new BicicletaHijo( t, m, r, cu, ca , iden));
    }


    //metodo para eliminar una bicicleta de la coleccion. 
    public static void eliminarBici(ArrayList <BicicletaHijo> lista){
        String iden = leerDatos("\nIngrese el identificador: ");
        boolean eliminado = false;
        int indice = 0;
        while( indice < lista.size() && !(eliminado) ) { 
            BicicletaHijo bici = (BicicletaHijo)lista.get(indice);
            if(bici.getIdentificador().equals(iden)){
                lista.remove(bici);
                System.out.println("\nLa bici ha sido eliminada.");
                eliminado = true;
            } 
            indice ++;
        }
        if(!eliminado)
            System.out.println("\nNo existe ninguna bici con ese identificador.");
    }
    
    // metodo para mostrar por pantalla las bicicletas en la coleccion.
    public static void verColeccion(ArrayList <BicicletaHijo> lista){
        if(lista.size() == 0)
            System.out.println("\nLa lista se encuentra vacia.");
        else{
        for( BicicletaHijo bici : lista) { 
            System.out.println(bici); 
        }
        }
    }

    //metodo para verificar que el identificador sea unico y no corresponda a otras bicicletas.
    public static String validarIdentificador(ArrayList <BicicletaHijo> lista){
        boolean valido = true;
        String iden;
        do{
            int indice = 0;
            valido = true;
            iden = leerDatos("\nIngrese un identificador: ");
            while(indice < lista.size() && valido){
            BicicletaHijo bici = (BicicletaHijo)lista.get(indice);
            if(bici.getIdentificador().equals(iden))
                valido = false;
            indice ++;
            }
            if(!valido)
                System.out.println("\nEl identificador ya esta siendo usado.");
        }while(!valido) ;
        return iden;
    }


    // metodo para verificar que el tipo de bicicleta este entre los posibles.
    public static Tipo validarTipo(){
        Tipo tipo = Tipo.MTB; 
        Boolean bandera; 
        do{
            String dato = leerDatos("\nIngrese el tipo de bici:  mtb, ruta, city o utillitaria: ");
            bandera = false ;
            switch(dato){
                case "MTB":
                    tipo = Tipo.MTB ;
                    break ;
                case "RUTA":
                    tipo = Tipo.RUTA;
                    break;
                case "CITY":
                    tipo = Tipo.CITY;
                    break;
                case "UTILITARIA":
                    tipo = Tipo.UTILITARIA;
                    break;
                default:
                    bandera = true;
                    break;
            }
        }while(bandera);
        return tipo;
    }

    //metodo para verificar que el cuadro de la bicicleta este entre los posibles.
    public static Cuadro validarCuadro(){
        Cuadro cuadro = Cuadro.XL; 
        Boolean bandera; 
        do{
            String dato = leerDatos("Ingrese el cuadro de la bici: xs, s, m, l o xl: ");
            bandera = false ;
            switch(dato){
                case "XS":
                    cuadro = Cuadro.XS ;
                    break ;
                case "S":
                    cuadro = Cuadro.S;
                    break;
                case "M":
                    cuadro = Cuadro.M;
                    break;
                case "L":
                    cuadro = Cuadro.L;
                    break;
                case "XL":
                    cuadro = Cuadro.XL; 
                    break;
                default:
                    bandera = true;
                    break;
            }
        }while(bandera);
        return cuadro;
    }
    
    //metodo para leer los datos por teclado y retornarlos en forma de String.
    public static String leerDatos(String mensaje){
        System.out.print(mensaje);
        Scanner reader = new Scanner(System.in);
        return reader.next().toUpperCase().trim();
    }

    // metodo para validar que el dato sea numerico y de tipo entero.
    public static int validarCaracterNumerico(String mensaje){
        boolean bandera ;
        int numero = 0;
        do{
            bandera = false;
            try{
                numero = Integer.parseInt(leerDatos(mensaje));   
            }
            catch(NumberFormatException e){
                System.out.println("\nEl caracter ingresado debe ser numerico.");
                bandera = true;
            }
        }while(bandera);
        return numero;
    } 
}
