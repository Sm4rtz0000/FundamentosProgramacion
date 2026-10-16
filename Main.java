public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        // comando para crear una variable tipo string y booleana
        String Variable1 = "mitexto";
        boolean activo = false;
        // y si quiero concatenar textos: 
        System.out.println("concatenar textos " + Variable1);
        
        
        /* guia condicional

        Condicional simple con una instruccion
        if(condicion) { 
        instrucciones 
        } 

        Condicional con else
            
        if(condicion) {
        instrucciones
        } else{
            if(condicion){
                instruccion
            }
        }

        */ 
        if(activo == false){
            System.out.println("Bloqueado");
        
        } else {
            System.out.println("Activo");
        }
        int edad = 18;
        if(edad>=18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
