package interface_adapter.clear_users;


import use_case.clear_users.ClearInputBoundary;

import javax.swing.*;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary userClearInteractor;
    public ClearController(ClearInputBoundary userClearInteractor) {
        this.userClearInteractor = userClearInteractor;
    }

    public void execute(JPanel panel) {
        userClearInteractor.execute(panel);
    }
}

