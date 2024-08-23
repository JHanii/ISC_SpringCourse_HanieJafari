package ir.freeland.spring.scopeadvance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import ir.freeland.spring.scopeadvance.service.ApplicationScopedService;
import ir.freeland.spring.scopeadvance.service.PrototypeScopedService;
import ir.freeland.spring.scopeadvance.service.RequestScopedService;
import ir.freeland.spring.scopeadvance.service.SessionScopedService;
import ir.freeland.spring.scopeadvance.service.SingletonScopedService;
import ir.freeland.spring.scopeadvance.service.WebsocketScopedService;

@Controller
public class AppController {

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

	@Autowired
	private WebsocketScopedService websocketScopedService;

	private ResponseText buildText() {
		ResponseText text = new ResponseText();
		text.setApplicationBean(applicationScopedService.printAndReturnToString());
		text.setSingletonBean(singletonScopedService.printAndReturnToString());
		text.setPrototypeBean(prototypeScopedService.printAndReturnToString());
		text.setSessionBean(sessionScopedService.printAndReturnToString());
		text.setWebsocketBean(websocketScopedService.printAndReturnToString());
		text.setRequestBean(requestScopedService.printAndReturnToString());
		return text;
	}

	@MessageMapping("/websocket")
	@SendToUser("/queue/reply")
	public String handle(String greeting) {
		ResponseText text = buildText();
		System.out.println(text);
		return text.toString();
	}
}
