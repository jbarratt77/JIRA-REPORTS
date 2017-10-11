package service;

import model.InitiativeRequest;
import model.IssueRequest;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class JiraServiceTest {

    private JiraService jiraService;
    private IssueRequest expectedIssue1;
    private String authToken= ""; //put the auth token for your credentials

    @Before
    public void setUp(){
        jiraService = new JiraService(authToken);
        expectedIssue1 = new IssueRequest();
        expectedIssue1.setKey("TEST-23");
        expectedIssue1.setId("52595");
    }
    @Test
    public void getInitiativeRequest() throws Exception {
        InitiativeRequest initiativeRequest = jiraService.getInitiativeRequest("DataPresentation");
        assertThat(initiativeRequest.getIssues().size(), is(3));
        assertThat(initiativeRequest.getIssues().get(0), is(expectedIssue1));

    }

}