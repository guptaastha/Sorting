package org.sample.sort;

public class App 
{
    public static void main( String[] args )
    {
        int [] arr = {10,4,15,2,50,90};
        
        SelectionSort selection = new SelectionSort();
        System.out.println("Before Array ");
        selection.print(arr);
        selection.sort(arr);
        
        int [] barr = {10,4,15,2,50,90};
        BubbleSort bubble = new BubbleSort();
        System.out.println("Before Array ");
        bubble.print(barr);
        bubble.sort(barr);
        
        int [] iarr = {10,4,15,2,50,90};
        InsertionSort insertion = new InsertionSort();
        System.out.println("Before Array ");
        insertion.print(iarr);
        insertion.sort(iarr);
    }
}
