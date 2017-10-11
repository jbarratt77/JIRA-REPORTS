package model;

import java.util.List;

public class Initiative {

    private String title;
    private List<Epic> epics;

    public Initiative() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Epic> getEpics() {
        return epics;
    }

    public void setEpics(List<Epic> epics) {
        this.epics = epics;
    }
}
