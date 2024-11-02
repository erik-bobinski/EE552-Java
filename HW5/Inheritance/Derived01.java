
public class Derived01 extends Base01 {

	private int y;

    public Derived01() { //default constructor
        y = 0;
        System.out.println("Derived default constructor");
    }

    public Derived01(int i) { //non default constructor
        y = i;
        System.out.println("Derived non-default constructor");
    }

    protected void finalize() {
        System.out.println(x + ":" + y + " derived object is dying");
    }

}
/* destructor in Java?
No, Java does not have destructors in the same way C++ does. 
In Java, objects are managed by a garbage collector, and developers do not explicitly write destructors.


In Java, the garbage collector automatically reclaims memory occupied by objects that are no longer 
reachable. When an object is no longer referenced, it becomes a candidate for garbage collection. 
The finalize method was introduced in Java, but it's not used in the same way as a destructor in C++.
The finalize method is called by the garbage collector before an object is reclaimed, 
but it's not guaranteed to be called promptly or at all.


*/