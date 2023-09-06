
public class MatrizDemo {

	public static void main(String[] args) {
		int[][] matriz= { //el primer corchete es la fila y el segundo la columna, es decir, el primero es el array y el segundo es el elemento de dicho array
				{1,	2,	3,	4,	5},
				{6,	7,	8,	9,	10},
				{11,12,	13,	14}
				}; //matriz 3x5 (array de arrays)
//		System.out.println(matriz[1][3]); //del array 1, mostrar el elemento 3
//		System.out.println(matriz[2].length); //imprime el número de elementos del array 2, el tercer array
		
		//el siguiente for imprime la matriz recorriéndola:
		for (int fila=0; fila<matriz.length; fila++) {  //recorre cada fila
			for (int columna = 0; columna < matriz[fila].length; columna++) { //recorre cada columna de la fila en la que se encuentra iterando
				System.out.print(matriz[fila][columna]+", "); //muestra el número seleccionado junto con una separador coma y espacio
			}
			System.out.println();
		}
	}

}
