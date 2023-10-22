package myrest;

import applogic.RetryApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private RetryApplication retryApplication;

    public HelloController(RetryApplication retryApplication) {
        this.retryApplication = retryApplication;
    }

    @GetMapping("/retry")
    String hello() {
        return retryApplication.getValue();
    }

}

