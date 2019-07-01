package ranjith;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;

public class Javabasics {
interface A{
	public void B();
}	
	
class C implements A{
	public void B() {
		A obj=new C();
	}
}
	


