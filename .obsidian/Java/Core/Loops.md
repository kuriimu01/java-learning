## for 

```Java
for(initialization; condition; updation\iteration)

for(i=0;i<=10;i++)

```

```Java
//Infinite loop
i=0;
for(;;){
	System.out.println(i);
	i++
}
```

**You can update multiple variables in the same for loop**

```Java
//Product table of k
	Scanner s = new Scanner(System.in);  
	int k = s.nextInt();  
	for (int i=0, j=1; i<=10; i++, j=j*k)  
	{  
	    System.out.println(i+" "+j);  
	}
```
## do while

Firstly it will do body code, the will check conditions

```Java
int i = 10
do {
	System.out.println(i);
}while(i<10)
```

```Output
10
```
## for each 

```Java
String[] words = {"hello", "my", "dear", "human"};  
for (String word: words){  
    System.out.print(word.toUpperCase() + ' ');  
}
```

## Nested loops


```Java
for (int i = 1; i<=9; i++){  
    for (int j = 1; j<=9; j++){  
        System.out.println(i +"*"+j+"= " + (i*j));  
    }  
    System.out.print("\n");  
}
```
