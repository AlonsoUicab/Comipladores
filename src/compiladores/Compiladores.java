package compiladores;
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
    
    public static void main(String[] args) {
        Compiladores obj = new Compiladores();
        obj.convercion("No se si esta bien esto");
        obj.Contador("Mandarina");
        
    }
}
