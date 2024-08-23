package ir.freeland.spring.realworldexamplesautowire.services;

public interface ServiceInterface {

	default public void doSomething(){
		System.out.println(" This is from default method");
	}
}
