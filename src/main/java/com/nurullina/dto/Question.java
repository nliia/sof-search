package com.nurullina.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author lnurullina
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {
    private Boolean is_answered;
    private String title;
    private Long creation_date;
    private ShallowUser owner;
    private String link;

    Question() {
    }

    public Boolean getIs_answered() {
        return is_answered;
    }

    public void setIs_answered(Boolean is_answered) {
        this.is_answered = is_answered;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Long creation_date) {
        this.creation_date = creation_date;
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

    @Override
    public String toString() {
        return "Question{" +
                "is_answered=" + is_answered +
                ", title='" + title + '\'' +
                ", creation_date=" + creation_date +
                ", owner=" + owner +
                ", link='" + link + '\'' +
                '}';
    }
}
