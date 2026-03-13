import java.awt.*;

class App_Demo
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Application");
        f.setSize(500,500);
        f.setVisible(true);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Label l1 = new Label("Date of Birth");
        f.add(l1);

        // Month choice
        Choice c1 = new Choice();

        c1.addItem("January");
        c1.addItem("February");
        c1.addItem("March");
        c1.addItem("April");
        c1.addItem("May");
        c1.addItem("June");
        c1.addItem("July");
        c1.addItem("August");
        c1.addItem("September");
        c1.addItem("October");
        c1.addItem("November");
        c1.addItem("December");

        f.add(c1);

        // Day choice
        Choice c2 = new Choice();
        for(int i=1;i<=31;i++)
        {
            c2.addItem(""+i);
        }
        f.add(c2);

        // Year choice
        Choice c3 = new Choice();
        for(int i=2000;i<=2024;i++)
        {
            c3.addItem(""+i);
        }
        f.add(c3);
    }
}