```Java
int A[] = new int[5]; //Creating integer array with capacity 5 
```

```Java
int A[] = {0,1,2,3,4,5}; //Creating integer array with auto capacity 
```

```Java
int[] arr = {0,1,2,3,4,5,6,7,8,9};  
for (int i: arr){  
    System.out.println(i);  
} //Printing an array
```
## Array Rotating
   **Left rotation**
```Java
int[] arr = {0,1,2,3,4,5,6,7,8,9};  
int temp = arr[0];  
for (int i=1;i < arr.length;i++){  
    arr[i-1]=arr[i];  
}  
arr[arr.length-1]=temp;
```
   **Right rotation**
```Java
int[] arr = {0,1,2,3,4,5,6,7,8,9};  
int temp = arr[arr.length-1];  
for (int i=arr.length-1;i > 0;i--){  
    arr[i]=arr[i-1];  
}  
arr[0]=temp;
```
## Deleting an element 
```Java
//delete arr[2]  
int[] arr = {0,1,2,3,4,5,6,7,8,9};  
for (int i = 3;i< arr.length;i++){  
    arr[i-1]=arr[i];  
}  
arr[arr.length-1]=0;
//Out: 0 1 3 4 5 6 7 8 9 0 
```

## Array size control

To increase arr size, you need to copy this arr in new with increased size
Manual variant:
```Java
int[] arr = {0,1,2,3,4};  
int[] arr2 = new int[10];  
for (int i=0;i< arr.length;i++){  
    arr2[i]=arr[i];  
}
//0 1 2 3 4 0 0 0 0 0
```

Using system:
```Java
int[] arr = {0,1,2,3,4};  
int[] arr2 = new int[10];  
System.arraycopy(arr, 0, arr2, 0, arr.length);
```

## 2D Array
Print 2D array:
```Java
String[][] cars = {  
        {"Camaro", "Corvette", "Silverado"},  
        {"Mustang", "Ranger", "F-150"},  
        {"Ferrari", "Lambo", "Tesla"}  
};  
for (String[] car : cars) {  
    System.out.println();  
    for (String s : car) {  
        System.out.print(s + " ");  
    }  
}
```

Another method:
```Java
String[][] cars =   new String[3][3];  
  
    cars[0][0] = "Camaro";  
    cars[0][1] = "Corvette";  
    cars[0][2] = "Silverado";  
    cars[1][0] = "Mustang";  
    cars[1][1] = "Ranger";  
    cars[1][2] = "F-150";  
    cars[2][0] = "Ferrari";  
    cars[2][1] = "Lambo";  
    cars[2][2] = "Tesla";  
  
    for(int i=0; i<cars.length; i++) {  
        System.out.println();  
        for(int j=0; j<cars[i].length; j++) {  
            System.out.print(cars[i][j]+" ");  
        }  
}
```

