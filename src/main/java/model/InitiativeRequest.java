package model;

import java.util.List;

public class InitiativeRequest {

    private int total;
    private List <IssueRequest> issues;

    public InitiativeRequest() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<IssueRequest> getIssues() {
        return issues;
    }

    public void setIssues(List<IssueRequest> issues) {
        this.issues = issues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InitiativeRequest that = (InitiativeRequest) o;

        if (total != that.total) return false;
        return issues != null ? issues.equals(that.issues) : that.issues == null;
    }

    @Override
    public int hashCode() {
        int result = total;
        result = 31 * result + (issues != null ? issues.hashCode() : 0);
        return result;
    }
}
