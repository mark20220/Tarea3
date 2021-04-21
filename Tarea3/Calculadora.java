
/**
 * Clase Calculadora para relizar las operacion que nuestro matematico
 * no puede realizar.
 * Dados los valores de a, b y c de una ecuación de segundo grado. Devolver los dos valores
 * que podría tener X.
 * Dados las coordenadas de dos puntos. Es capaz de encontrar la ecuación de la recta de
 * dichos puntos.
 * Dados la hipotenusa y el cateto de un triangulo rectángulo. Indicar cual es el valor del cateto
 * faltante.
 * Mark
 * 20/04/2021
 */
public class Calculadora
{
    public Doble DarValoresX(int A, int B, int C){
        Doble Res;
        double x1;
        double x2;
        x1=((B*-1)+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        x2=((B*-1)-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        Res=new Doble(x1, x2);
        return Res;
    }
    
    public EcuRec DarEcuacionRecta(Punto P1, Punto P2){
        int X=1;
        int Y=1;
        int mY;
        int mX;
        int ResA;
        int ResB;
        int ResC;
        EcuRec Res;
        mY=P1.getY()-P2.getY();
        mX=P1.getX()-P2.getX();
        ResA=mY*X;
        ResB=mX*Y;
        ResC=(mX*P1.getY())-(mY*P1.getX());
        if(ResA<0){
            ResA=ResA*-1;
            ResB=ResB*-1;
            ResC=ResC*-1;
        }
        Res=new EcuRec(ResA, ResB, ResC);
        return Res;
    }
    
    public double CatetoFaltante(double Hip, double Cat){
        double ResCat;
        ResCat=Math.sqrt(Math.pow(Hip,2)-Math.pow(Cat,2));
        return ResCat;
    }
}
