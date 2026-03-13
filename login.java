import java.awt.*;

class login_demo
{
    public static void main(String args[])
    {
        // Create Frame
        Frame f = new Frame("Login Page");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        // Username Label
        Label l1 = new Label("User Name:");
        f.add(l1);

        // Username TextField
        TextField t1 = new TextField(20);
        f.add(t1);

        // Password Label
        Label l2 = new Label("Password:");
        f.add(l2);

        // Password TextField
        TextField t2 = new TextField(20);
        t2.setEchoChar('*');   // Hide password characters
        f.add(t2);

        // Login Button
        Button b1 = new Button("Login");
        f.add(b1);

        // Logout Button
        Button b2 = new Button("Logout");
        f.add(b2);
    }
}