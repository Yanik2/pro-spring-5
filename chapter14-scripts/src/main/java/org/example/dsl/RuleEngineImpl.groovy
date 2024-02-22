package org.example.dsl

import org.springframework.stereotype.Component

@Component("ruleEngine")
class RuleEngineImpl implements RuleEngine {
    @Override
    void run(Rule rule, Object object) {
        println "executing rule"

        def exit = false

        rule.parameters.each {ArrayList params ->
            def paramIndex = 0
            def success = true
            if (!exit) {
                rule.conditions.each {
                    println "condition param index : " + paramIndex
                    success = success && it(object, params[paramIndex])
                    println "condition success: " + success
                    paramIndex++
                }

                if (success && !exit) {
                    rule.actions.each {
                        println "action param index: " + paramIndex
                        it(object, params[paramIndex])
                        paramIndex++
                    }
                    if(rule.singlehit) {
                        exit=true
                    }
                }
            }
        }
    }
}
