package curp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;


public class CURP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*Declaracion de variables*/
        String nombre;
        String aPaterno;
        String aMaterno;
        Date fechaNac;
        String lugarNacimiento;
        String sexo;
        String curp = new String();
       
        /*Ingreso de datos del usuario*/
        System.out.println("Escribe el nombre:");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
       
        System.out.println("Escribe el apellido paterno:");
        aPaterno = sc.nextLine();

        System.out.println("Escribe el apellido materno:");
        aMaterno = sc.nextLine();
       
        System.out.println("Escribe fecha de nacimiento (Formato AAAA/MM/DD):");
        try {
            fechaNac = new SimpleDateFormat("yyyy/MM/dd").parse(sc.nextLine()); //Convierte la fecha de tipo String a tipo Date con el formato indicado
            LocalDate fechaTemporal = fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Convierte fecha Date a LocalDate para poder obtener dia, mes, año por separado
            int anio = fechaTemporal.getYear(); //Obtiene el año como numero entero
            int mes = fechaTemporal.getMonthValue(); //Obtiene el mes como numero entero
            int dia = fechaTemporal.getDayOfMonth(); //Obtiene el dia como numero entero
           
            System.out.println("Escribe lugar de nacimiento:");
            lugarNacimiento = sc.nextLine();

            System.out.println("Escribe el sexo:");
            sexo = sc.nextLine();

            /* Comienza genereacion de CURP*/
            curp += aPaterno.charAt(0);

            for(int i=1; i <= aPaterno.length()-1; i++){ //Recorre cada caracter del apellido paterno
                /*System.out.println("El caracter " + aPaterno.charAt(i) + " es vocal?" + esVocal(aPaterno.toLowerCase().charAt(i)));*/
                if(esVocal(aPaterno.charAt(i))){ //Si el caracter es vocal
                    curp+=aPaterno.charAt(i);    //Concatena el valor a curp
                    break;                       //Sale del ciclo
                }
            }

            curp += aMaterno.charAt(0);
            curp += nombre.charAt(0);
            curp += String.valueOf(anio).substring(2);// La función substring regresa los caracteres del string a partir de la posición indicada como paŕametro
            curp += mes <10? "0"+String.valueOf(mes):String.valueOf(mes); //Operador ternario: variable = condición ? valor1 : valor2;
                                                                         //El simbolo "?" funciona como if y ":" (dospuntos) funciona como else
                                                                         //Si el valor de mes es menor a 9, agrega un cero a la izquierda, si no, solo usa el valor del mes
            curp += String.valueOf(dia);
 
           
            System.out.println("CURP = " + curp);
       
            } catch (ParseException ex) { //Cuando ocurre una excepcion ParseException,
            System.out.println("Ocurio un error al convertir la fecha: " + ex.getMessage());
        }
       
    }
   
    public static boolean esVocal(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c =='u'){
            return true;
        }else{
            return false;
        }
    }
   
   
   
}