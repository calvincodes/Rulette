package rulette.gaia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import rulette.ruleinput.RuleInput;
import rulette.ruleinput.RuleType;
import rulette.ruleinput.value.InputDataType;

public class RuleInputMother {
    private static final Random randGen = new Random();

    public static List<RuleInput> getDefaultRangeRuleInputs(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("0 or less dummy rule input objects requested");
        }

        List<RuleInput> dummyObjs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = randGen.nextInt();
            dummyObjs.add(RuleInput.createRuleInput(
                id, "input-name-" + id, id, RuleType.RANGE, InputDataType.STRING, "inputValue-" + id));
        }

        return dummyObjs;
    }

    public static List<RuleInput> getDefaultValueRuleInputs(int n) throws Exception {
        if (n <= 0) {
            throw new Exception("0 or less dummy rule input objects requested");
        }

        List<RuleInput> dummyObjs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = randGen.nextInt();
            dummyObjs.add(RuleInput.createRuleInput(
                id, "input-name-" + id, id, RuleType.RANGE, InputDataType.STRING, "inputValue-" + id));
        }

        return dummyObjs;
    }
}