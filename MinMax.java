
/**
 * Problema del máximo y el mínimo por Divide y Vencerás
 * 
 * Enunciado:
 * 
 * El problema consiste dado un vector de elementos, por
 * ejemplo de tipo entero, determinar el máximo y el mínimo
 * de dichos valores.
 * 
 * Análisis de la complejidad:
 * -Subproblemas: 2
 * -Tamaño de subproblema: n/2
 * -f(n): constante (Se recombinan las soluciones parciales en tiempo constante)
 * 
 * Por lo tanto, por el Teorema Maestro, se concluye que la complejidad del 
 * algoritmo propuesto es lineal O(n).
 * 
 * @author Daniel Alejandro Castro García
 */
public class MinMax{
    private int[] vector;

    /**
     * Constructor
     */
    public MinMax(int[] v){
        vector = v;
    }

    public int[] calcularMinMax(int[] v, int inf, int sup){
        int[] minmax=new int[2];
        
        int posicionMedia1 = (inf+sup)/2;
        int posicionMedia2 = ((inf+sup)/2) + 1;
		
		if(sup-inf<1){
			minmax[0]=v[inf];
			minmax[1]=v[inf];
		}else{
			int[]primeraMitad=calcularMinMax(v,inf,posicionMedia1);			
			int[]segundaMitad=calcularMinMax(v,posicionMedia2,sup);
			
			if(primeraMitad[0]<segundaMitad[0]){
				minmax[0]=primeraMitad[0];
			}else{
				minmax[0]=segundaMitad[0];
			}
			
			if(primeraMitad[1]>segundaMitad[1]){
				minmax[1]=primeraMitad[1];
			}else{
				minmax[1]=segundaMitad[1];
			}
		}
						
		return minmax;	
    }
    
    public int[] getVector(){
        return this.vector;
    }
}