package by.task.kukjan.entity.impl;

import by.task.kukjan.entity.ComponentType;
import by.task.kukjan.entity.InformationComponent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class LetterLeaf implements InformationComponent {

    private static Logger logger = LogManager.getLogger();
    private ComponentType type;
    private char symbol;

    public LetterLeaf(ComponentType type, char symbol) {
        this.type = type;
        this.symbol = symbol;
    }

    @Override
    public List<InformationComponent> getChildren() {
        logger.log(Level.ERROR, "Unsupported operation get children on symbol");
        throw new UnsupportedOperationException("Unsupported operation get children on symbol");
    }

    @Override
    public void addTextComponent(InformationComponent component) {
        logger.log(Level.ERROR, "Unsupported operation \"add\" on symbol");
        throw new UnsupportedOperationException("Unsupported operation \"add\" on symbol");
    }

    @Override
    public void removeTextComponent(InformationComponent component) {
        logger.log(Level.ERROR, "Unsupported operation \"remove\" on symbol");
        throw new UnsupportedOperationException("Unsupported operation \"remove\" on symbol");
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LetterLeaf that = (LetterLeaf) o;
        if(symbol != that.symbol)
            return false;
        return type != null ? type == that.type : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + (type != null ? type.hashCode() : 0);
        result = result * 31 + Character.hashCode(symbol);
        return result;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }
}
