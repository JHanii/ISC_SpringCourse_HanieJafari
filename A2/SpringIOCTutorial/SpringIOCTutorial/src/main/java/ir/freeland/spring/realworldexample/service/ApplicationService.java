package ir.freeland.spring.realworldexample.service;

import ir.freeland.spring.realworldexample.dao.DaoInterface;

public class ApplicationService implements IApplicationService{
	private DaoInterface database;
	
	public ApplicationService(DaoInterface database) {
		this.database = database;
	}

	@Override
	public void create() {
		System.out.println("New App creating...");
		database.add();	
	}

}
