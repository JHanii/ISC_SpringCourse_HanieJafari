package ir.freeland.spring.realworldexamplesautowire.services.dao;

public interface DAOInterface {

	default public void doSomething(){
		System.out.println(" This is from default method");
	}
}
