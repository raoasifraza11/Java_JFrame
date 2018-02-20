import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class order extends JFrame{

    String aa="",bb="",cc="",dd="";
    /*JButton pay = new JButton("Pay");
    JButton btotal = new JButton("Total");
    JButton reset = new JButton("Reset");
    JButton exit = new JButton("Exit");;*/
    JPanel panel = new JPanel();
    JLabel cid = new JLabel("Customer ID:");
    JTextField textcid = new JTextField(15);

    /*JLabel gtotal = new JLabel("Grand Total :");
    JTextField textgtotal = new JTextField(15);

    JLabel dish = new JLabel("Dish");
     JLabel colddrinks = new JLabel("- Cold Drinks");
      JLabel cake = new JLabel("- Cake");
       JLabel hotdrinks = new JLabel("- Hot Drinks");
        JLabel soup = new JLabel("- Soup");


    JLabel price = new JLabel("Price");
     JLabel price1 = new JLabel("RM3");
      JLabel price2 = new JLabel("RM6");
       JLabel price3 = new JLabel("RM2");
        JLabel price4 = new JLabel("RM5");

    JLabel quantity = new JLabel("Quantity");
     JTextField qty1 = new JTextField(15);
      JTextField qty2 = new JTextField(15);
       JTextField qty3 = new JTextField(15);
        JTextField qty4 = new JTextField(15);

    JLabel total = new JLabel("Total");
      JTextField ttl1 = new JTextField(15);
       JTextField ttl2 = new JTextField(15);
        JTextField ttl3 = new JTextField(15);
         JTextField ttl4 = new JTextField(15);
*/

   public order(String say_hello){
        super("Order");
        setSize(350,450);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        cid.setBounds(70, 20, 100, 30);
        textcid.setBounds(170, 25, 100, 20);
/*
        gtotal.setBounds(150, 300, 100, 30);
        textgtotal.setBounds(230, 300, 80, 30);

       dish.setBounds(45, 60, 100, 30);
       colddrinks.setBounds(20, 100, 100, 30);
       cake.setBounds(20, 140, 100, 30);
       hotdrinks.setBounds(20, 180, 100, 30);
       soup.setBounds(20, 220, 100, 30);

       price.setBounds(120, 60, 100, 30);
       price1.setBounds(120, 100, 100, 30);
       price2.setBounds(120, 140, 100, 30);
       price3.setBounds(120, 180, 100, 30);
       price4.setBounds(120, 220, 100, 30);

       quantity.setBounds(190, 60, 100, 30);
       qty1.setBounds(200, 100, 30, 30);
       qty2.setBounds(200, 140, 30, 30);
       qty3.setBounds(200, 180, 30, 30);
       qty4.setBounds(200, 220, 30, 30);

       total.setBounds(280, 60, 30, 30);
       ttl1.setBounds(280, 100, 30, 30);
       ttl2.setBounds(280, 140, 30, 30);
       ttl3.setBounds(280, 180, 30, 30);
       ttl4.setBounds(280, 220, 30, 30);

       btotal.setBounds(20, 360, 70, 20);
       pay.setBounds(100, 360, 60, 20);
       reset.setBounds(170, 360, 70, 20);
       exit.setBounds(250, 360, 60, 20);

        panel.add(pay);
        panel.add(btotal);
        panel.add(reset);
        panel.add(exit);
*/
        panel.add(cid);
        panel.add(textcid);

        textcid.setText(say_hello);
/*
        panel.add(gtotal);
        panel.add(textgtotal);

        panel.add(dish);
        panel.add(colddrinks);
        panel.add(cake);
        panel.add(hotdrinks);
        panel.add(soup);

        panel.add(price);
        panel.add(price1);
        panel.add(price2);
        panel.add(price3);
        panel.add(price4);

        panel.add(quantity);
        panel.add(qty1);
        panel.add(qty2);
        panel.add(qty3);
        panel.add(qty4);

        panel.add(total);
        panel.add(ttl1);
        panel.add(ttl2);
        panel.add(ttl3);
        panel.add(ttl4);
*/
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //actionreset();
        //actionbtotal();
        //actionexit();
    }

      /*public void actionbtotal()
      {
        btotal.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
        try
        {
            int ff=Integer.parseInt(qty1.getText())*3;
            String xx=Integer.toString(ff);
            aa=xx;
            ttl1.setText(xx);
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee.getMessage());
        }
        try
        {
            String xx=Integer.toString(Integer.parseInt(qty2.getText())*6);
            bb=xx;
            ttl2.setText(xx);
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee.getMessage());
        }
        try
        {
            String xx=Integer.toString(Integer.parseInt(qty3.getText())*2);
            cc=xx;
            ttl3.setText(xx);
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee.getMessage());
        }
        try
        {
            String xx=Integer.toString(Integer.parseInt(qty4.getText())*5);
            dd=xx;
            ttl4.setText(xx);
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee.getMessage());
        }
        try
        {
            int a=Integer.parseInt(aa)+Integer.parseInt(bb)+Integer.parseInt(cc)+Integer.parseInt(dd);
            String oo=Integer.toString(a);
            textgtotal.setText(oo);
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee.getMessage());
        }

                }
        });
    }

      public void actionexit(){
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             System.exit(0);
                }
        });
    }


    public void actionreset(){
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
        qty1.setText("");
        qty2.setText("");
        qty3.setText("");
        qty4.setText("");
        ttl1.setText("");
        ttl2.setText("");
        ttl3.setText("");
        ttl4.setText("");
        textgtotal.setText("");

                }
        });
    }*/
}

