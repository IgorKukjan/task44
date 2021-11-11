package by.task.kukjan.parser;

import by.task.kukjan.entity.InformationComponent;
import by.task.kukjan.exception.TextException;

public interface DataParser {
    public InformationComponent parse(String data) throws TextException;
}
