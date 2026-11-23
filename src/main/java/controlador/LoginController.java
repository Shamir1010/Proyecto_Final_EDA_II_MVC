package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.LoginView;
import vista.MenuPrincipalView;

/**
 *
 * @author Shamir Rivera
 */

public class LoginController implements ActionListener {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.btnIngresar.addActionListener(this);
    }

    public void iniciar() {
        loginView.setTitle("SIDEDAII - Inicio");
        loginView.setLocationRelativeTo(null);
        loginView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginView.btnIngresar) {
            MenuPrincipalView menu = new MenuPrincipalView();
            menu.setTitle("SIDEDAII - Menú Principal");
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
            loginView.dispose(); // Cierra el Login
        }
    }
}