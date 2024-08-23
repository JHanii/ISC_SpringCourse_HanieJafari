package ir.freeland.spring.scopeadvance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ir.freeland.spring.scopeadvance.service.ApplicationScopedService;
import ir.freeland.spring.scopeadvance.service.PrototypeScopedService;
import ir.freeland.spring.scopeadvance.service.RequestScopedService;
import ir.freeland.spring.scopeadvance.service.SessionScopedService;
import ir.freeland.spring.scopeadvance.service.SingletonScopedService;

@RestController
public class AppController2 {

	@Autowired
	private ApplicationScopedService applicationScopedService;

	@Autowired
	private PrototypeScopedService prototypeScopedService;

	@Autowired
	private RequestScopedService requestScopedService;

	@Autowired
	private SessionScopedService sessionScopedService;

	@Autowired
	private SingletonScopedService singletonScopedService;

	private ResponseText buildText() {
		ResponseText text = new ResponseText();
		text.setApplicationBean(applicationScopedService.printAndReturnToString());
		text.setSingletonBean(singletonScopedService.printAndReturnToString());
		text.setPrototypeBean(prototypeScopedService.printAndReturnToString());
		text.setSessionBean(sessionScopedService.printAndReturnToString());
		text.setRequestBean(requestScopedService.printAndReturnToString());
		return text;
	}

	@RequestMapping("/anotherapi")
	public ResponseText anotherApi() {
		return buildText();
	}
}
