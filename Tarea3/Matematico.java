
/**
 * Dados tres números: El matemático sabe indicar cual es el numero mayor, cual el menor y
 * cual del medio.
 * Dados la base y altura de un cuadrado: El sabe indicar el área de dicha figura.
 * Dados las coordenadas de dos puntos: Sabe calcular distancia entre estos puntos.
 * Dado las coordenadas de un punto: Es capaz de indicar en que cuadrante se encuentra dicho
 * punto.
 * Dados los valores de a, b y c de una ecuación de segundo grado. Devolver los dos valores
 * que podría tener X.
 * Dados las coordenadas de dos puntos. Es capaz de encontrar la ecuación de la recta de
 * dichos puntos.
 * Dados la hipotenusa y el cateto de un triangulo rectángulo. Indicar cual es el valor del cateto
 * faltante.
 * 
 * Mark
 * 20/04/2021
 */
public class Matematico
{
    private Calculadora Calc;
    public Matematico(Calculadora Calc){
        this.Calc=Calc;
    }
    
    public int DarArea(int Base, int Altura){
        int Res;
        Res=Base*Altura;
        return Res;
    }
    
    public Triple DarMayMedMen(int Num1, int Num2, int Num3){
        Triple Res;
        int Mayor;
        int Medio;
        int Menor;
        int Aux1;
        int Aux2;
        Aux1=Math.max(Num1, Num2);
        Mayor=Math.max(Aux1, Num3);
        Aux2=Math.min(Num1, Num2);
        Menor=Math.min(Aux2, Num3);
        if(Menor==Num1){
            if(Mayor==Num3){
                Medio=Num2;
            }else{
                Medio=Num3;
            }
        }else{
            if(Mayor==Num1){
                if(Menor==Num3){
                    Medio=Num2;
                }else{
                    Medio=Num3;
                }
            }else{
                Medio=Num1;
            }
        }
        Res=new Triple(Mayor, Medio, Menor);
        return Res;
    }
    
    double DarDistancia(Punto P1, Punto P2){
        double Res;
        Res=Math.sqrt(Math.pow(P2.getX()-P1.getX(),2)+Math.pow(P2.getY()-P1.getY(),2));
        return Res;
    }
    
    String DarCuadrante(Punto P){
        String Res;
        if(P.getX()>0 && P.getY()>0){
            Res="Cuadrante I";
        }else{
            if(P.getX()<0 && P.getY()>0){
                Res="Cuadrante II";
            }else{
                if(P.getX()<0 && P.getY()<0){
                    Res="Cuadrante III";
                }else{
                    if(P.getX()>0 && P.getY()<0){
                        Res="Cuadrante IV";
                    }else{
                        Res="0.0";
                    }
                }
            }
        }
        return Res;
    }
    
    public Doble getDarValoresDeX(int A, int B, int C){
        return Calc.DarValoresX(A, B, C);
    }
    
    public EcuRec getDarEcuacionRecta(Punto P1, Punto P2){
        return Calc.DarEcuacionRecta(P1, P2);
    }
    
    public double getCatetoFaltante(double Hip, double Cat){
        return Calc.CatetoFaltante(Hip, Cat);
    }
}
