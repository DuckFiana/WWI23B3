package de.rinderle.dhbw.wwi23b3.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CustomDirectory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public CustomDirectory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public int getSize() {
        int result = 0;
        for (FileSystemComponent component : components) {
            result += component.getSize();
        }
        return result;
    }
}