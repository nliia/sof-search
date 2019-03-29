package com.nurullina.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author lnurullina
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionsResponse {
    private List<Question> items;

    public QuestionsResponse() {
    }

    public QuestionsResponse(List<Question> items) {
        this.items = items;
    }

    public List<Question> getItems() {
        return items;
    }

    public void setItems(List<Question> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "QuestionsResponse{" +
                "items=" + items +
                '}';
    }
}
