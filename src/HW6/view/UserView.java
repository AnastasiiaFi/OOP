package HW6.view;

import HW6.data.User;

import java.awt.*;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}