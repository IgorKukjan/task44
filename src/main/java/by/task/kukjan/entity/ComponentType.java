package by.task.kukjan.entity;

public enum ComponentType {
    TEXT("\n\t"),
    PARAGRAPH(" "),
    SENTENCE(" "),
    WORD(""),
    SYMBOL_LEAF(""),
    PUNCTUATION_LEAF("");

    private final String delimiter;

    ComponentType(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
