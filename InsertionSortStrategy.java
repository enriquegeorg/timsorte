package timsorte;
/**
 * Ordena usando o método da inserção
 * @author udesc
 */
public class InsertionSortStrategy{
	/**
	 * Implementa a ordenação pelo método da inserção
	 */
//    public InsertionSortStrategy(int[] elementos) {
//    	super();
//    }
	public void insertionSort(int[] elementos, int left, int right) {
        int k;
        int valor;
        for (int i = left + 1; i <= right; i++) {
        	valor = elementos[i];
        	k = i - 1;
			while(k >= left && elementos[k] > valor) {
				elementos[k+1] = elementos[k];
				k--;
			}
			elementos[k+1] = valor;
		}
        System.out.print("testeeeeeeeeee");
	}
}
