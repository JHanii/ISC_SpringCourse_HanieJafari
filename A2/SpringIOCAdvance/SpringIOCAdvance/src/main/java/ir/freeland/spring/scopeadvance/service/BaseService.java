package ir.freeland.spring.scopeadvance.service;

public interface BaseService {

	default public String printAndReturnToString() {
		System.out.println(BaseService.this.toString());
		return this.toString();
	}

}
