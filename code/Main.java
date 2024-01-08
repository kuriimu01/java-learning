    public static void main(String[] args) {
        int[] arr = {11, 2, 32, 1, 23, 44, 6};
        boolean unsorted = true;
        int temp;
        while (unsorted){
            unsorted=false;
            for (int i = 0; i<arr.length-1;i++) {
                if (arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    unsorted=true;
                }
            }
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
