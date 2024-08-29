package controller;
import br.edu.fateczl.*;
import br.edu.fateczl.bubble.OrdenaBubble;
import br.edu.fateczl.merge.OrdenaMerge;
import br.edu.fateczl.quick.OrdenaQuick;
public class ControllerOrdenacao {
	public ControllerOrdenacao() {
		super();
	}
	
	public int[] OrdenacaoBubbleSort (int[] vet) {
		OrdenaBubble bbsort = new OrdenaBubble();
		return bbsort.BubbleSort(vet);
			
	}
		
	public int[] OrdenacaoMergeSort (int[] vet, int inicio, int fim) {
		OrdenaMerge mgsort = new OrdenaMerge();
		return mgsort.MergeSort(vet, 0, vet.length - 1);
			
		}
	
	public int[] OrdenacaoQuickSort (int[]vet, int inicio, int fim) {
		OrdenaQuick qksort = new OrdenaQuick();
		return qksort.QuickSort(vet, 0, vet.length-1);
	}
	
	public double TempoTotal (long Inicial, long Final) {
		return (Final - Inicial)/Math.pow(10, 9);
	}
}



