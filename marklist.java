import java.awt.*;

class Mark
{
    public static void main(String args[])
    {
        Frame f = new Frame();
        f.setTitle("My Apps");
        f.setSize(300,500);
        f.setVisible(true);
        f.setLayout(null);

        Label l1 = new Label("Student Mark List");
        f.add(l1);
        l1.setBounds(100,50,200,30);

        Label l2 = new Label("Enter Enroll No");
        f.add(l2);
        TextField t1 = new TextField(20);
        f.add(t1);
        l2.setBounds(50,100,120,30);
        t1.setBounds(180,100,100,30);

        Label l3 = new Label("Name");
        f.add(l3);
        TextField t2 = new TextField(20);
        f.add(t2);
        l3.setBounds(50,150,100,30);
        t2.setBounds(180,150,100,30);

        Label l4 = new Label("Java Mark");
        f.add(l4);
        TextField t3 = new TextField(20);
        f.add(t3);
        l4.setBounds(50,200,100,30);
        t3.setBounds(180,200,100,30);

        Label l5 = new Label("OS Mark");
        f.add(l5);
        TextField t4 = new TextField(20);
        f.add(t4);
        l5.setBounds(50,250,100,30);
        t4.setBounds(180,250,100,30);

        Label l6 = new Label("CWS Mark");
        f.add(l6);
        TextField t5 = new TextField(20);
        f.add(t5);
        l6.setBounds(50,300,100,30);
        t5.setBounds(180,300,100,30);

        Label l7 = new Label("Total");
        f.add(l7);
        TextField t6 = new TextField(20);
        f.add(t6);
        l7.setBounds(50,350,100,30);
        t6.setBounds(180,350,100,30);

        Label l8 = new Label("Average");
        f.add(l8);
        TextField t7 = new TextField(20);
        f.add(t7);
        l8.setBounds(50,400,100,30);
        t7.setBounds(180,400,100,30);

        Button b1 = new Button("Save");
        f.add(b1);
        b1.setBounds(120,450,80,30);
    }
}