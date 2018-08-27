package programa7_metodos_06102015;

public class ClaseOption {
    
    public static float area3(int base, int altura, float area){
        area=(base*altura)/2;
        return area;
    } 
    public static float peri3(int l2, int l1,int l3, float perimetro){
        perimetro = l2+l3+l1;
        return perimetro;
    }
    public static float area2(int base,int altura,float area){
        area=base*altura;
        return area;
    }
    public static float peri2(int base,int altura, float perimetro){
        perimetro = (base*2)+(altura*2);
        return perimetro;
    }
    public static float area(int base,float  area){
        area=base*base;
        return area;
    }
    public static float per(int base,float perimetro){
        perimetro=base*4;
        return perimetro;
    }
    public static float per0(int radio, float circu){
        circu=(float)(3.11416*(radio*2));
        return circu;
    }
    public static float area0(int radio,float area){
        area=(float)(3.1416*(radio*radio));
        return area;
    }
}
