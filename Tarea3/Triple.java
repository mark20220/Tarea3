
/**
 * CLase Triple para devolver el mayor, medio y menor de tres numeros.
 * 
 * Mark
 * 20/04/2021
 */
public class Triple
{
    int Mayor;
    int Medio;
    int Menor;
    public Triple(int Mayor, int Medio, int Menor){
        this.Mayor=Mayor;
        this.Medio=Medio;
        this.Menor=Menor;
    }
    
    int getMayor(){
        return Mayor;
    }
    
    int getMedio(){
        return Medio;
    }
    
    int getMenor(){
        return Menor;
    }
}
