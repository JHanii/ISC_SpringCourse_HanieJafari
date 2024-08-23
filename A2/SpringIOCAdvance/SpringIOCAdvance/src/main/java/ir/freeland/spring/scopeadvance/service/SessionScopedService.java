package ir.freeland.spring.scopeadvance.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Service
public class SessionScopedService implements BaseService {
}