import java.awt.*;

class Course_Demo
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Applications");
        f.setSize(500, 500);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Label l1 = new Label("Select your course");
        f.add(l1);

        Checkbox cb1 = new Checkbox("BCA");
        f.add(cb1);

        Checkbox cb2 = new Checkbox("BSC AIDS");
        f.add(cb2);

        Checkbox cb3 = new Checkbox("BSC AIML");
        f.add(cb3);

        Button b1 = new Button("Save");
        f.add(b1);

        f.setVisible(true);
    }
}