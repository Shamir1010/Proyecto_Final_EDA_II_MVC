package main;

import controlador.LoginController;
import vista.LoginView;

/**
 *
 * @author Shamir Rivera
 */

public class Main {
    public static void main(String[] args) {
        LoginView vistaLogin = new LoginView();
        LoginController controlador = new LoginController(vistaLogin);
        controlador.iniciar();
    }
}
