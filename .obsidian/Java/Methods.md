### Method overloading
```Java
int max(int x,int y){
///....
}
float max(int x,int y){
///....
}
max(10,15) - int method
max(10.f,5.4f) - float method
```
### Multiple arguments

```Java
static void show(int ...A)
{
	for (int x:A){
		System.out.println(x);
	}
}
show(1, 3, 10) -> 1 3 10
// Also you can parse here an array 
show(new int[] {1,2,3,4}); -> 1 2 3 4

```

### Recursive methods

Method which calls itself.
