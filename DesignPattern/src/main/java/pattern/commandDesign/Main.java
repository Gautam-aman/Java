package pattern.commandDesign;

import java.util.ArrayList;
import java.util.List;

interface Command {
    void execute();
    void undo();
}

class Light {
    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }
}

class LightCommand implements Command {
    private final Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

class Remote {
    private final List<Command> commands = new ArrayList<>(4);
    private final List<Boolean> pressed = new ArrayList<>(4);

    public Remote() {
        // initialize with 4 slots
        for (int i = 0; i < 4; i++) {
            commands.add(null);
            pressed.add(false);
        }
    }

    // set a command at index (0..3)
    public void setCommand(int index, Command command) {
        if (index < 0 || index >= commands.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and 3");
        }
        commands.set(index, command);
        pressed.set(index, false);
    }

    public void toggle(int index) {
        if (index < 0 || index >= commands.size()) {
            System.out.println("Invalid button index: " + index);
            return;
        }
        Command cmd = commands.get(index);
        if (cmd == null) {
            System.out.println("No command assigned to button " + index);
            return;
        }

        if (pressed.get(index)) {
            cmd.undo();
            pressed.set(index, false);
        } else {
            cmd.execute();
            pressed.set(index, true);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light livingRoom = new Light();

        remote.setCommand(0, new LightCommand(livingRoom));
        remote.toggle(0);
        remote.toggle(0); // Light is Off

        remote.toggle(1); // "No command assigned to button 1"
    }
}
