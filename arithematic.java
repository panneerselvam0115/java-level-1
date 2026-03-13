import java.awt.*;

class Arithematic
{
    public static void main(String args[])
    {
        Frame f = new Frame();
        f.setTitle("My Apps");
        f.setSize(350,350);
        f.setVisible(true);
        f.setLayout(null);

        Label l1 = new Label("Arithmetic Operations");
        f.add(l1);
        l1.setBounds(100,50,200,30);

        Label l2 = new Label("Enter No 1");
        f.add(l2);
        l2.setBounds(50,100,80,30);

        TextField t1 = new TextField();
        f.add(t1);
        t1.setBounds(150,100,100,30);

        Label l3 = new Label("Enter No 2");
        f.add(l3);
        l3.setBounds(50,150,80,30);

        TextField t2 = new TextField();
        f.add(t2);
        t2.setBounds(150,150,100,30);

        Label l4 = new Label("Result");
        f.add(l4);
        l4.setBounds(50,200,80,30);

        TextField t3 = new TextField();
        f.add(t3);
        t3.setBounds(150,200,100,30);

        Button b1 = new Button("Add");
        f.add(b1);
        b1.setBounds(50,250,50,30);

        Button b2 = new Button("Sub");
        f.add(b2);
        b2.setBounds(110,250,50,30);

        Button b3 = new Button("Mul");
        f.add(b3);
        b3.setBounds(170,250,50,30);

        Button b4 = new Button("Div");
        f.add(b4);
        b4.setBounds(230,250,50,30);
    }
}