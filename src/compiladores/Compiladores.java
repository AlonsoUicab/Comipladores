package compiladores;
public class Compiladores {
    public static void main(String[] args) {
        String frase = "I'm gonna ride 'til I can't no more";
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
    
}
