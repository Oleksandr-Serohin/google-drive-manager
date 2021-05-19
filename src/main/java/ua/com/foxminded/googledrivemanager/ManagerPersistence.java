package ua.com.foxminded.googledrivemanager;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Data
@PropertySource("classpath:application.properties")
public class ManagerPersistence {

    @Value("${spring.security.oauth2.autToken}")
    String token;
}
