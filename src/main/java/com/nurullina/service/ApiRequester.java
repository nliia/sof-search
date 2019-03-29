package com.nurullina.service;

import com.nurullina.dto.Question;
import com.nurullina.dto.QuestionsResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lnurullina
 */
@Service
public class ApiRequester {
    private final static String BASE_URL = "https://api.stackexchange.com/2.2/search/advanced?order=desc&sort=activity&title=";
    private static final String SITE_PARAM = "&site=stackoverflow";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Logger logger;

    List<Question> getSOFQuestionsByQuery(String query) {
        HttpEntity request = new HttpEntity(new HttpHeaders());
        QuestionsResponse response = null;
        try {
            response = restTemplate.exchange(BASE_URL + query + SITE_PARAM, HttpMethod.GET, request, QuestionsResponse.class).getBody();
            logger.debug("Got response from server: " + response);
        } catch (Exception e) {
            logger.error("Error occured during communication with server:" + e.getMessage());
        }

        return response == null ? new ArrayList<>() : response.getItems();
    }
}
