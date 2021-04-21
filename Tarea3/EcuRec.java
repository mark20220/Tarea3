
/**
 * Clase Ecucaion de la Recta "EcuRec" para mostrar los valores de
 * A, B y C de una recta Ax+By+C.
 * 
 * Mark
 * 20/04/2021
 */
public class EcuRec
{
    int Ax;
    int By;
    int C;
    
    public EcuRec(int Ax, int By, int C){
        this.Ax=Ax;
        this.By=By;
        this.C=C;
    }
    
    public double getAx(){
        return Ax;
    }
    
    public double getBy(){
        return By;
    }
    
    public double getC(){
        return C;
    }
}
