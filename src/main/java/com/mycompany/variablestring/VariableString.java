

package com.mycompany.variablestring;


public class VariableString {

    public static void main(String[] args) {
          // Actualizar variables de tipo String:
      String employeeName = "Anahí ";
      employeeName = employeeName + "Salgado ";
      System.out.println(employeeName); // Anahí Salgado, "ojo" el error era que la variable que 
                                        // se iba a imprimir era el salario y no la variable en la 
                                        // cual tenemos almacenado el nombre
      
      employeeName += "Díaz de la Vega";
      System.out.println(employeeName); // Anahí Salgado Díaz de la Vega
      
      employeeName = "Irene " + employeeName;
      System.out.println(employeeName); //Irene Anahí Salgado Díaz de la Vega
    }
}    
    