package applogic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class RetryApplication {


    @Retryable(maxAttemptsExpression  = "${retry.maxAttempts: 5}",backoff =@Backoff(delayExpression  = "${retry.maxDelay}", multiplier = 2))
    public String getValue(){
        System.out.println("sree");
        RestTemplate rt = new RestTemplate();
        rt.getForObject("http://localhost:9090/demo",Object.class );
        return "hello";
    }
    @Recover
    public String getRecoveryMessage(){
        System.out.println("recover message");
        return "Recovery Message";
    }
}
