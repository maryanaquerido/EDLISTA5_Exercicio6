package view;
import java.util.Arrays;

import controller.ControllerOrdenacao;
public class PrincipalOrdenacao {
	public static void main (String[]args) {
		
		ControllerOrdenacao oCont = new ControllerOrdenacao();
		
		int[] vetBS = new int [1500];
		int inicio = 1499;
		for (int i = 0; i<1500; i++) {
			vetBS[i] = inicio;
			inicio--;		
		}
		
		int[] vetMS = vetBS;
		int[] vetQS = vetBS;
		
		long tInicialBS = System.nanoTime();
		vetBS = oCont.OrdenacaoBubbleSort(vetBS);
		long tFinalBS = System.nanoTime();
		System.out.println("VETOR ORDENADO: " + Arrays.toString(vetBS));
		System.out.println("TEMPO DE ORDENAÇÃO BUBBLE SORT: " + oCont.TempoTotal(tInicialBS, tFinalBS));
		
		long tInicialMS = System.nanoTime();
		vetMS = oCont.OrdenacaoMergeSort(vetMS, 0, vetMS.length-1);
		long tFinalMS = System.nanoTime();
		System.out.println("\nVETOR ORDENADO: " + Arrays.toString(vetMS));
		System.out.println("TEMPO DE ORDENAÇÃO BUBBLE SORT: " + oCont.TempoTotal(tInicialMS, tFinalMS));
		
		long tInicialQS = System.nanoTime();
		vetQS = oCont.OrdenacaoQuickSort(vetQS, 0, vetQS.length-1);
		long tFinalQS = System.nanoTime();
		System.out.println("\nVETOR ORDENADO: " + Arrays.toString(vetQS));
		System.out.println("TEMPO DE ORDENAÇÃO BUBBLE SORT: " + oCont.TempoTotal(tInicialQS, tFinalQS));
		
	}

}
