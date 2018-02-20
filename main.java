import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{

    public static void main(String[] args){
        main frameTabel = new main();
    }

    JButton customer = new JButton("Create/Modify Customer Account");
    JButton order = new JButton("Place Order");
    JButton logout = new JButton("Logout");
    JPanel panel = new JPanel();


    main(){
        super("Main Menu");
        setSize(400,300);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        customer.setBounds(70, 40, 250, 50);
        order.setBounds(70, 100, 250, 50);
        logout.setBounds(70, 160, 250, 50);


        panel.add(customer);
        panel.add(order);
        panel.add(logout);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        // This is how you call another acitvity on click event
        order.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);

                    // Create the new JFrame object
                    String say_hello = "Hi, main";
                    new order(say_hello);
                    
                }
            });



       // actioncustomer();
      //  actionreset();
       // actionexit();
    }

    // Call the another activity
   

    

}
