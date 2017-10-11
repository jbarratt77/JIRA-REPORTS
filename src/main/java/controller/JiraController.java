package controller;

import model.Epic;
import model.Initiative;
import model.InitiativeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.JiraService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class JiraController {

    @Autowired
    private JiraService jiraService;



    @RequestMapping(value = "/getData",   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Initiative> hello(@RequestParam(value="initiativeName") String initiative) {
        InitiativeRequest initiativeRequest = jiraService.getInitiativeRequest(initiative);
        Initiative init = new Initiative();
        List <Epic> epics = initiativeRequest.getIssues()
                .stream().map( t-> { Epic epic = new Epic();
                                    epic.setTicketId(t.getId());
                                    epic.setTitle(t.getKey());
                                    return epic; })
                .collect(Collectors.toList());

        init.setEpics(epics);
        return ResponseEntity.ok(init);
    }

}
