package timsorte;
/**
 * Ordena usando o método da inserção
 * @author udesc
 */

public class TimSortStrategy {

	/**
	 * Implementa a ordenação por timsort
        * @param array
	 */
	public void timSort(int[] array) {
		/*
		 * implementa minimo de repeticoes, se der menos que 128 vai full inserion
		 */
		int r = 0;
		int tamanho = array.length;
		while(tamanho >= 64) {
			r += tamanho & 1;
			tamanho >>= 1; //sintaxe de manipulacao de bit
		}
		int minrun = tamanho + r;
		
		InsertionSortStrategy teste = new InsertionSortStrategy();
		MergeSortStrategy teste2 = new MergeSortStrategy();
		
		for(int i = 0; i < tamanho; i+= minrun) {
			teste.insertionSort(array, i, Math.min((i+127), (tamanho-1)));
		}
		
		for (int size = minrun; size < tamanho; size = 2*size)
	    {

	        for (int left = 0; left < tamanho; left += 2*size)
	        {

	            int mid = left + size - 1;
	            int right = Math.min((left + 2*size - 1), (tamanho-1));
	            
	            teste2.mergeSort(array, left, mid, right);
	        }
	    }
	}
}