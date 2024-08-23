package ir.freeland.spring.el.model;

import java.util.List;

public class Department {
	private List<Worker> workers;

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}

}