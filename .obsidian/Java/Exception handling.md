
```Java
try {
	meth1();
}
catch(NumberFormatException | NullPointerException e){
	System.out.println("Exception");
	System.out.println("Error: " + e);
}
```

### Custom exceptions 
### Checked/Unchecked exceptions