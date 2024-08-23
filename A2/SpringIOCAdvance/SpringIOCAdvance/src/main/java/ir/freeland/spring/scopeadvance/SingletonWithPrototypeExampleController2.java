package ir.freeland.spring.scopeadvance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ir.freeland.spring.scopeadvance.SingletonWithPrototypeExampleController1.ResponseObj;
import ir.freeland.spring.scopeadvance.service.singletonwithprototype.ApplicationContextAwareService;
import ir.freeland.spring.scopeadvance.service.singletonwithprototype.ContainsAppContextService;
import ir.freeland.spring.scopeadvance.service.singletonwithprototype.ScopedProxyExampleService;

@RestController
public class SingletonWithPrototypeExampleController2 {
	@Autowired
	private ApplicationContextAwareService applicationContextAwareService;
	@Autowired
	private ContainsAppContextService containsAppContextService;
	@Autowired
	private ScopedProxyExampleService scopedProxyExampleService;

	@RequestMapping("/singleton2")
	public ResponseObj printObjects() {
		ResponseObj responseObj = new ResponseObj();
		responseObj.setApplicationContextAwareService(applicationContextAwareService.printAndReturnToString());
		responseObj.setContainsAppContextService(containsAppContextService.printAndReturnToString());
		responseObj.setScopedProxyExampleService(scopedProxyExampleService.printAndReturnToString());
		return responseObj;
	}

}
