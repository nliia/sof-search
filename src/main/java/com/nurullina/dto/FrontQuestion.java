package com.nurullina.dto;

import java.util.Date;

/**
 * @author lnurullina
 */
public class FrontQuestion {
    private Boolean answered;
    private String title;
    private String creationDate;
    private ShallowUser owner;
    private String link;

    public FrontQuestion(Question q) {
        this.answered = q.getIs_answered();
        this.title = q.getTitle();
        this.creationDate = new Date(q.getCreation_date() * 1000L).toString();
        this.owner = q.getOwner();
        this.link = q.getLink();
    }

    public Boolean getAnswered() {
        return answered;
    }

    public void setAnswered(Boolean answered) {
        this.answered = answered;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public ShallowUser getOwner() {
        return owner;
    }

    public void setOwner(ShallowUser owner) {
        this.owner = owner;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
