package by.test.kukjan.parser;

import by.task.kukjan.creater.CreateLeaf;
import by.task.kukjan.entity.ComponentType;
import by.task.kukjan.entity.InformationComponent;
import by.task.kukjan.entity.impl.TextComposite;
import by.task.kukjan.exception.TextException;
import by.task.kukjan.parser.DataParser;
import by.task.kukjan.parser.impl.SymbolParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SymbolParserTest {
    private DataParser parser;
    private InformationComponent word;
    private String testLine = "a";

    @BeforeClass
    public void createParser(){
        parser = new SymbolParser();
        word = new TextComposite(ComponentType.WORD);
        word.addTextComponent(CreateLeaf.createLeaf("a"));
    }

    @Test
    public void symbolParserTest() throws TextException{
        InformationComponent result = parser.parse(testLine);
        assertEquals(result, word);
    }
}
