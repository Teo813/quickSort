package com.company;
//unfinished btw
public class Main {

    public static void main(String[] args) {
	int[] arr = {10,80,30,90,40,50,70,20,60};
    int low = 0;
    int high = arr.length-1;
	int part = partition(arr,low,high);

    System.out.println(part);
    for (int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j<high; j++ ){
            if (arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i+1;
    }
    public static int sort(int[] arr, int pi, int low){
        int pivot = arr[pi];
        int i = low-1;
        for (int j = low; j<pi; j++ ){
            if (arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return 0;
    }
}
