package goodbye.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("secondService")
public class SecondServiceProperties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
