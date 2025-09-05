package project;

public class GenericEx1 {
public static void main(String[] args) {
Genericc1<Integer> obj = new Genericc1<>();
obj.value=10;
obj.show();
}
}
class Genericc1<T>
{
T value;
void show(){
System.out.println(value);
}
}
