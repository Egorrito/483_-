package l_3;

public class z_2 {

public static Integer fac(int n){

int result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}
System.out.println(result);
return(result);
}
public static void main (String[] args) {
fac(5);
}
}