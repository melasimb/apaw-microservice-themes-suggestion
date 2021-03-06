package es.upm.miw.apaw_microservice_themes_suggestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SuggestionBusinessController {

    private SuggestionDao suggestionDao;

    @Autowired
    public SuggestionBusinessController(SuggestionDao suggestionDao) {
        this.suggestionDao = suggestionDao;
    }

    public SuggestionDto create(SuggestionDto suggestionDto) {
        Suggestion suggestion = new Suggestion(suggestionDto.getNegative(), suggestionDto.getDescription());
        this.suggestionDao.save(suggestion);
        return new SuggestionDto(suggestion);
    }

    public List<SuggestionDto> readAll() {
        List<Suggestion> suggestions = this.suggestionDao.findAll();
        return suggestions.stream().map(SuggestionDto::new).collect(Collectors.toList());
    }
}
