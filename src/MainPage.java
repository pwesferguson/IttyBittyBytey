import javax.swing.*;

public class MainPage {
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
    private JPanel MainPage;

    public static void main(String[] args) {
        //This code loads up the UI. Please don't change it unless you're sure!
        JFrame frame = new JFrame("MainPage");
        frame.setContentPane(new MainPage().MainPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
