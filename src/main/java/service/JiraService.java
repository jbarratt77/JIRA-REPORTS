package service;

import model.InitiativeRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


public class JiraService {

    private RestTemplate restTemplate;
    private String authToken;

    public JiraService(String authToken) {
        restTemplate = new RestTemplate();
        this.authToken = authToken;
    }


    public InitiativeRequest getInitiativeRequest(String initiativeName) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authToken);

        Map<String, String> params = new HashMap<String, String>();
        params.put("jql", "cf[14802]="+initiativeName);

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<InitiativeRequest> response =       restTemplate.exchange("https://whitbreadis.atlassian.net/rest/api/2/search?jql=cf[14802]=DataPresentation", HttpMethod.GET, entity, InitiativeRequest.class, params);

        return response.getBody();
    }
}
