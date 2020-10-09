package compiladores;

import java.util.Stack;

public class Compiladores {
   public void convercion(String frase){
        String valor = "";
        
        for(int i = 0; i<frase.length(); i++){
            switch(frase.charAt(i)){
                case 'i':
                    valor+="w";
                    break;
                case 'e':
                    valor+="w";
                    break;
            }
            valor+=frase.charAt(i);
        }
        valor+=" owo";
        System.out.println(valor);
   }
    public void Contador(String palabra){
        int contador = 0;
        palabra = palabra.toLowerCase();
        for(int i = 0;i<palabra.length();i++){
            if((palabra.charAt(i)=='a')|| (palabra.charAt(i)== 'e')|| (palabra.charAt(i)== 'i')|| (palabra.charAt(i)== 'o')|| 
                    (palabra.charAt(i)== 'u')){
                contador++;
            }
        }
        System.out.println("La palabra "+ palabra + " contiene: "+ contador+ " vocales");
    }
    public void letras(String palabra){
        boolean letra = false;
        Stack pila = new Stack();
         for(int i = 0; i<palabra.length(); i++){
            pila.add(palabra.charAt(i));
            if(pila.contains(palabra.charAt(i)))
                letra = true;
        }
         System.out.println("¿La palabra: "+ "'" + palabra + "'" + " tiene letras repetidas?");
         System.out.println(letra);
    }
    public void remover(String palabra){
        String remover ="";
        palabra = palabra.toLowerCase();
        for(int i = 0; i<palabra.length(); i++){
            if(palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                // nada
            }else{
             remover += palabra.charAt(i);   
            }
            
        }
        System.out.println("La siguiente frase no tiene vocales: "+ remover);
    }
    public static void main(String[] args) {
        Compiladores obj = new Compiladores();
        obj.convercion("No se si esta bien esto");
        obj.Contador("Mandarina");
        obj.letras("llevar");
        obj.remover("Esta frase no tendra vocales");
    }
}
