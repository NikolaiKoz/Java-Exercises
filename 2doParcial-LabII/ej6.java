class ej6{
    String name;
    ej6(String n) { name = n; }

}

class Asianj6 extends ej6 {

public boolean equals (Object o) {
Asianj6 n = (Asianj6)o;
if (name.equals(n.name)) return true;
return false;
}

public int hashcode() {return name.length(); }

Asianj6(String s) { super(s); }
}
class Soba extends Asianj6 {
public static void main(String[] args) {
ej6 n1 = new ej6 ("bob"); ej6 n2 = new ej6 ("bob");
Asianj6 a1 = new Asianj6 ("fred");
Asianj6 a2 = new Asianj6 ("fred");
Soba s1 = new Soba("jil1"); Soba s2 = new Soba("j111");
System.out.print(n1.equals(n2) + " "+ (n1 == n2) + " | ");
System.out.print(a1.equals (a2) + " "+ (a1 == a2) + "| ");
System.out.println(s1.equals(s2) +  " "+ (s1 == s2) + " | ");
}
Soba(String s) { super(s); }
}
