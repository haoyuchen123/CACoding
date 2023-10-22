package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import view.SignupView;

import javax.swing.*;
import java.awt.*;


public class ClearPresenter implements ClearOutputBoundary {


    public ClearPresenter() {
    }

    @Override
    public void prepareSuccessView(ClearOutputData users) {
        JOptionPane.showMessageDialog(users.panel,users.putDeletedUsersAsString());

    }
}

