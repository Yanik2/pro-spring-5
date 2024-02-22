package org.example.dsl;

import org.springframework.stereotype.Service;

@Service
public class SingerServiceImpl implements SingerService {
    private final RuleFactory ruleFactory;
    private final RuleEngine ruleEngine;

    public SingerServiceImpl(RuleFactory ruleFactory, RuleEngine ruleEngine) {
        this.ruleFactory = ruleFactory;
        this.ruleEngine = ruleEngine;
    }

    @Override
    public void applyRule(Singer singer) {
        final var ageCategoryRule = ruleFactory.getAgeCategoryRule();
        ruleEngine.run(ageCategoryRule, singer);
    }
}
