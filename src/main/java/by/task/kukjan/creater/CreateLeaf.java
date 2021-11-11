package by.task.kukjan.creater;

import by.task.kukjan.entity.ComponentType;
import by.task.kukjan.entity.InformationComponent;
import by.task.kukjan.entity.impl.LetterLeaf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateLeaf {
    private static Logger logger = LogManager.getLogger();
    private static final String ALPHABET_REGEX = "\\p{IsAlphabetic}";

    public static InformationComponent createLeaf(String symbol){
        Pattern pattern = Pattern.compile(ALPHABET_REGEX);
        Matcher matcher = pattern.matcher(symbol);

        while(matcher.find()){
            return new LetterLeaf(ComponentType.SYMBOL_LEAF, symbol.charAt(0));
        }
        return new LetterLeaf(ComponentType.PUNCTUATION_LEAF, symbol.charAt(0));
    }
}
