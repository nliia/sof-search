package com.nurullina.service;

import com.nurullina.dto.Question;

import java.util.List;

/**
 * @author lnurullina
 */
public interface StackExchangeService {

    List<Question> getQuestions(String query);
}
