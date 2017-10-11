package configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.JiraService;

@Configuration
public class ApplicationConfig {

    @Value("${authToken}")
    private String authToken;

    @Bean
    public JiraService getJiraService(){
        return  new JiraService(authToken);
    }
}
