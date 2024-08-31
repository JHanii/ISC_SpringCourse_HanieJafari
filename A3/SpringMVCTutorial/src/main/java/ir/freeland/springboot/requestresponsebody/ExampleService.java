package ir.freeland.springboot.requestresponsebody;

import org.springframework.stereotype.Service;


@Service
public class ExampleService {

    public boolean fakeAuthenticate(LoginForm lf) {
        return true;
    }
}