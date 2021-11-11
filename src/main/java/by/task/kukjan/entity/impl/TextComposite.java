package by.task.kukjan.entity.impl;

import by.task.kukjan.entity.ComponentType;
import by.task.kukjan.entity.InformationComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class TextComposite implements InformationComponent {

    private static Logger logger = LogManager.getLogger();
    private static final String TABULATION_REGEX = "\t";
    private List<InformationComponent> components = new ArrayList<>();
    private ComponentType type;

    public TextComposite(ComponentType type){
        this.type = type;
    }

    @Override
    public List<InformationComponent> getChildren() {
        return components;
    }

    @Override
    public void addTextComponent(InformationComponent component) {
        components.add(component);
    }

    @Override
    public void removeTextComponent(InformationComponent component) {
        components.remove(component);
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextComposite that = (TextComposite) o;
        return (components != null ? components.equals(that.components) : that.components == null) &&
                (type != null ? type == that.type : that.type == null);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + (components != null ? components.hashCode() : 0);
        result = result * 31 + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = type.getDelimiter();
        for(InformationComponent component : components){
            if(type == ComponentType.TEXT){
                sb.append(TABULATION_REGEX);
            }
            sb.append(component.toString()).append(delimiter);
        }
        return  sb.toString();

    }




}
