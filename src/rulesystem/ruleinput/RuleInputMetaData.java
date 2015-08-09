package rulesystem.ruleinput;

import java.io.Serializable;
import rulesystem.ruleinput.value.InputDataType;

public class RuleInputMetaData implements Serializable {
    private final int id;
    private final int ruleSystemId;
    private final String name;
    private final int priority;
    private final RuleType ruleType;
    private final InputDataType ruleDataType;

    public RuleInputMetaData(int id, int ruleSystemId, String name, int priority, RuleType ruleType, InputDataType ruleDataType)
            throws Exception {
        this.id = id;
        this.name = name;
        this.ruleSystemId = ruleSystemId;
        this.priority = priority;
        this.ruleType = ruleType;
        this.ruleDataType = ruleDataType;
    }

    public int getId() {
        return id;
    }

    public int getRuleSystemId() {
        return ruleSystemId;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public RuleType getRuleType() {
        return ruleType;
    }

    public InputDataType getRuleDataType() {
        return ruleDataType;
    }
}