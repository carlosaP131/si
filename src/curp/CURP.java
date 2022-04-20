package curp;

import java.util.Scanner;

public class CURP {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

	

		System.out.println("Nombre(s): ");

		String nombre = scanner.nextLine();

 

		System.out.println("Primer Apellido: ");

		String ape1 = scanner.nextLine();

 

		System.out.println("Segundo Apellido: ");

		String ape2 = scanner.nextLine();

 

		System.out.println("Dia de nacimiento (en dos caracteres): ");

		String dia = scanner.nextLine();

 

		System.out.println("Mes de nacimiento (en dos caracteres): ");

 		String mes = scanner.nextLine();

 

 		System.out.println("Anio de nacimiento (en cuatro caracteres): ");

		String anio = scanner.nextLine();

 

		System.out.println("Sexo (Mujer/Hombre): ");

		String sexo = scanner.nextLine();

 

		System.out.println("Estado de la Republica Mexicana en que nacio (sin espacios): ");

		String entidad = scanner.nextLine();

 

		System.out.println("\nTu nombre es: "+nombre);

		System.out.println("Tu Primer apellido es: "+ape1);

		System.out.println("Tu Segundo apellido es: "+ape2);

		System.out.println("Tu Dia de nacimiento es: "+dia);

		System.out.println("Tu Mes de nacimiento es: "+mes);

		System.out.println("Tu Anio de nacimiento es: "+anio);

		System.out.println("Tu Sexo es: "+sexo);

		System.out.println("Tu Entidad de nacimiento es: "+entidad);

 

		

		char c1 = ape1.charAt(0);
		char c2 = ape1.charAt(0);
		char c3 = ape2.charAt(1);

        char c4 = nombre. charAt(1);

        String c5Y6 = anio.substring(3,4);

        String c7Y8 = mes;

        String c9Y10 = dia;

        char c11 = sexo.charAt(1);

        char c14 = ape1.charAt(3);

        char c15 = ape2.charAt(3);

        char c16 = nombre.charAt(3);

        String c12Y13;

        if (entidad=="Aguascalientes"){

        	c12Y13 = "AS";

        }

        

         else if (entidad=="BajaCalifornia"){

        	c12Y13 = "BC";

        }

        else if (entidad=="BajaCaliforniaSur"){

        	c12Y13 = "BS";

        }

        else if (entidad=="Campeche"){

        	c12Y13 = "CC";

        }

         else if (entidad=="Coahuila"){

        	c12Y13 = "CL";

        }

         else if (entidad=="Colima"){

        	c12Y13 = "CM";

        }

         else if (entidad=="Chiapas"){

        	c12Y13 = "CS";

        }

         else if (entidad=="Chihuahua"){

        	c12Y13 = "CH";

        }

         else if (entidad=="DistritoFederal"){

        	c12Y13 = "DF";

        }

         else if (entidad=="Durango"){

        	c12Y13 = "DG";

        }

         else if (entidad=="Guanajuato"){

        	c12Y13 = "GT";

        }

        else if (entidad=="Guerrero"){

        	c12Y13 = "GR";

        }

         else  if (entidad=="Hidalgo"){

        	c12Y13 = "HG";

        }

         else if (entidad=="Jalisco"){

        	c12Y13 = "JC";

        }

         else if (entidad=="Mexico"){

        	c12Y13 = "MC";

        }

         else if (entidad=="Michoacan"){

        	c12Y13 = "MN";

        }

         else if (entidad=="Morelos") {

        	c12Y13 = "MS";

        }

         else if (entidad=="Nayarit"){

        	c12Y13 = "NT";

        }

         else if (entidad=="NuevoLeon"){

        	c12Y13 = "NL";

        }

         else  if (entidad=="Oaxaca"){

        	c12Y13 = "OC";

        }

         else if (entidad=="Puebla"){

        	c12Y13 = "PL";

        }

         else if (entidad=="Queretaro"){

        	c12Y13 = "QT";

        }

         else if (entidad=="QuintanaRoo"){

        	c12Y13 = "QR";

        }

         else if (entidad=="SanLuisPotosi"){

        	c12Y13 = "SP";

        }

         else if (entidad=="Sinaloa"){

        	c12Y13 = "SL";

        }

         else if (entidad=="Sonora"){

        	c12Y13 = "SR";

        }

        else if (entidad=="Tabasco"){

        	c12Y13 = "TC";

        }

         else if (entidad=="Tamaulipas"){

        	c12Y13 = "TS";

        }

         else if (entidad=="Tlaxcala"){

        	c12Y13 = "TL";

        }

         else if (entidad=="Veracruz"){

        	c12Y13 = "VZ";

        }

         else if (entidad=="Yucatan"){

        	c12Y13 = "YN";

        }

         else if (entidad=="Zacatecas"){

        	c12Y13 = "ZS";

        }

         else if(entidad=="NacidoEnElExtranjero"){

            c12Y13 = "NE";

        }

        

         

         else{

             c12Y13 = "NE";
            
             }

        System.out.println("Tu CURP es: "+c1+c2+c3+c4+c5Y6+c7Y8+c9Y10+c11+c12Y13+c14+c15+c16);    

	}
}
    
        

