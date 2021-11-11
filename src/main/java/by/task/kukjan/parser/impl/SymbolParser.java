package by.task.kukjan.parser.impl;

import by.task.kukjan.creater.CreateLeaf;
import by.task.kukjan.entity.ComponentType;
import by.task.kukjan.entity.InformationComponent;
import by.task.kukjan.entity.impl.TextComposite;
import by.task.kukjan.exception.TextException;
import by.task.kukjan.parser.DataParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser implements DataParser {
    private static Logger logger = LogManager.getLogger();
    private static final String SYMBOL_REGEX = ".";


    @Override
    public InformationComponent parse(String lexeme) throws TextException {
        Pattern pattern = Pattern.compile(SYMBOL_REGEX);
        Matcher matcher = pattern.matcher(lexeme);
        InformationComponent word = new TextComposite(ComponentType.WORD);
        while(matcher.find()){
            InformationComponent leaf = CreateLeaf.createLeaf(matcher.group());
            word.addTextComponent(leaf);
        }
        logger.log(Level.INFO, "Symbols parsing is finished");
        return word;
    }
}
