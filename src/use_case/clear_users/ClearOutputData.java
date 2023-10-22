package use_case.clear_users;

// TODO Complete me

import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.util.ArrayList;

public class ClearOutputData {

    final ArrayList<String> users;
    public final JPanel panel;
    public ClearOutputData(ArrayList<String> users, JPanel panel) {
        this.users = users;
        this.panel = panel;
    }

    public String putDeletedUsersAsString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String user : users) {
            stringBuilder.append(user).append("\n");
        }

        return stringBuilder.toString().trim();
    }
}


