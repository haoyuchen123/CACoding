package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupOutputData;

import javax.swing.*;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearPresenter;




    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearPresenter){
        this.clearUserDataAccessObject = userDataAccessInterface;

        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute(JPanel panel) {
        ArrayList<String> listUser = clearUserDataAccessObject.getAllUserNames();
        clearUserDataAccessObject.deleteAllUsers();
        ClearOutputData clearOutputData = new ClearOutputData(listUser, panel);
        clearPresenter.prepareSuccessView(clearOutputData);

    }
}
