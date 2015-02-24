package org.societies.api.setting;

import org.societies.groups.setting.BooleanSetting;

/**
 * Represents a RulesSetting
 */
public class RulesSetting extends BooleanSetting {

    private final String rule;

    public RulesSetting(String rule, String id) {
        super("rule-" + id);
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    @Override
    public String toString() {
        return "RulesSetting{" +
                "rule='" + rule + '\'' +
                '}';
    }
}
