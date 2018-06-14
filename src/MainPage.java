

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.*;
import java.sql.Connection;


public class MainPage implements ActionListener {
    private JRadioButton memberRadioButton;
    private JRadioButton employeeRadioButton;
    private JTextField textField1;
    private JRadioButton titleRadioButton;
    private JRadioButton personRadioButton;
    private JButton searchByButton;
    private JButton checkAvailabilityOfTitleButton;
    private JButton sortItemsButton;
    private JTextField textField2;
    private JButton countItemsButton;
    private JTextField textField3;
    private JSpinner spinner1;
    private JButton startItemListSearchButton;
    private JButton seeMemberInfoButton;
    private JButton seeAllUserInfoButton;
    private JButton deleteItemSByButton;
    private JTextField numberOfItemsInTextField;
    private JTextField listItemsItem1Item2TextField;
    private JButton borrowItemByIDButton;
    private JButton returnItemByIDButton;
    private JButton avgRatingOfItemsButton;
    private JRadioButton minRadioButton;
    private JRadioButton maxRadioButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton updateUserInfoButton;
    private JButton viewMemberBalanceButton;
    private JButton updateCreditCardInfoButton;
    private JTextField textField8;
    private JButton payBalaceButton;
    private JTextField textField9;
    private JPanel MainPagePanel;
    private JTable table1;
    private JScrollPane resultsTableScroll;
    public JFrame mainFrame;


    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
    }

    public MainPage() {
        System.out.println("MainPage Constructor");
        //This code loads up the UI. Please don't change it unless you're sure!
        mainFrame = new JFrame("MainPagePanel");
        mainFrame.setContentPane(MainPagePanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

        initializeButtons();
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println("Default action event handler called. This is a problem!");
        //System.exit(0);
    }

    public void initializeButtons() {
        System.out.println("Init Buttons");
        checkAvailabilityOfTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("checkAvailabilityButtonPressed");

                //make the query to the data base
                //save the result
                boolean result = Item.ItemAvailable();

                //create the table with the correct number of rows & columns
                String data[][]={ {"101","Amit","670000"},
                        {"102","Jai","780000"},
                        {"101","Sachin","ooo"}};
                String column[]={"ID","NAME","SALARY"};
                    loadDisplayTable(data, column);

            }
        });

    }

    public void loadDisplayTable(String [][] data, String [] column) {


        table1 = new JTable(data,column);
        resultsTableScroll.getViewport().add(table1);
        mainFrame.add(resultsTableScroll);

    }

}
