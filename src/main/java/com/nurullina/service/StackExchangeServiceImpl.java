package com.nurullina.service;

import com.nurullina.dto.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

/**
 * @author lnurullina
 */
@Service
public class StackExchangeServiceImpl implements StackExchangeService {
    @Autowired
    ApiRequester apiRequester;

    public List<Question> getQuestions(String query) {
        List<Question> list = apiRequester.getSOFQuestionsByQuery(query);
        list.sort(Comparator.comparing(Question::getCreation_date));
        return list;
    }
}
