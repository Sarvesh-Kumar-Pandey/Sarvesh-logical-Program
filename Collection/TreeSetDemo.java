import java.util.*;
class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(5);
		t.add(3);
        t.add(2);
		ArrayList al=new ArrayList(t);
		Collections.reverse(al);
		System.out.println(al);
	}
}
