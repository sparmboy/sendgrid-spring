# sendgrid-spring
Spring wrapper for sendgrid client library

## Import
```xml
<dependency>
    <groupId>com.sarm</groupId>
    <artifactId>sendgrid-spring</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Usage
Define the following properties in your Spring application properties
```properties
# Your send grid API KEY 
sendgrid.apiKey: <YOUR_API_KEY>

# The sender email address
sendgrid.defaultFrom: noreply@yourdomain.com

# The name of the sender
sendgrid.defaultName: Bob

# The default send grid template ID (Optional)
sendgrid.defaultTemplateId: d-123 
```

Send emails as follows:

```java
import com.sarm.sendgrid.model.EmailRecipient;
import com.sarm.sendgrid.model.EmailRequest;
import com.sarm.sendgrid.service.SendGridClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.util.Arrays;

@ComponentScan("com.sarm.sendgrid")
public class MyEmailService {
    @Autowired
    SendGridClientService sendGridClientService;

    public void sendExample() throws IOException {
        sendGridClientService.send(
                EmailRequest.builder()
                        .recipients(Arrays.asList(
                                EmailRecipient.builder()
                                        .name("Bob Chumley-Warner")
                                        .email("bcm@example.com")
                                        .build()))
                        .message("Hello bob")
                        .build()
        );
    }
}
```