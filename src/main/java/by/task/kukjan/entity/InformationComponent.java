package by.task.kukjan.entity;

import java.util.List;

public interface InformationComponent {

    List<InformationComponent> getChildren();

    void addTextComponent(InformationComponent component);

    void removeTextComponent(InformationComponent component);

    ComponentType getType();
}
