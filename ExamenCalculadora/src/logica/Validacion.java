
package logica;
    import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validacion {
    public Validacion(){
    
    }
        public boolean validarLetras(String valor){
            //Pattern pat = Pattern.Compile("[a-zA-Z]{5,10}") minimo 5 letras y maximo 10 
            //toma todas las letras desde a a z y A a Z en mayuscula y minuscula, con el * toma todo el rango
            Pattern pat = Pattern.compile("[a-zA-Z]*");
            Matcher mat = pat.matcher(valor);
            return mat.matches();
            //true o false si no esta dentro de ese valor o corchetes cuadrados
            //Siempre retorna true o false
        }
        public boolean validarNumeros(String valor){
            Pattern pat = Pattern.compile( "[0-9]*");
            Matcher mat = pat.matcher(valor);
            return mat.matches();
        }
        public boolean validarNumerosDecimales(String valor){
            Pattern pat = Pattern.compile("[0-9.0-9]");
            Matcher mat = pat.matcher(valor);
            return mat.matches();
        }
        public boolean validarAlfanumericos(String valor){
            //∧ inicie en $ finalice en 
             Pattern pat = Pattern.compile("^[a-zA-Z0-9]*$");
            Matcher mat = pat.matcher(valor);
            return mat.matches();
        
        }
    }

