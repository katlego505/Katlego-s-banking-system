package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingSystemGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sakhi's First Capital Bank");
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new CardLayout());

        // Panels
        JPanel menuPanel = createMenuPanel(mainPanel);
        JPanel addCustomerPanel = createAddCustomerPanel(mainPanel);
        JPanel openAccountPanel = createOpenAccountPanel(mainPanel);
        JPanel depositPanel = createDepositPanel(mainPanel);
        JPanel withdrawPanel = createWithdrawPanel(mainPanel);
        JPanel viewAccountsPanel = createViewAccountsPanel(mainPanel);
        JPanel viewTransactionsPanel = createViewTransactionsPanel(mainPanel);

        // Add all panels to mainPanel
        mainPanel.add(menuPanel, "menu");
        mainPanel.add(addCustomerPanel, "addCustomer");
        mainPanel.add(openAccountPanel, "openAccount");
        mainPanel.add(depositPanel, "deposit");
        mainPanel.add(withdrawPanel, "withdraw");
        mainPanel.add(viewAccountsPanel, "viewAccounts");
        mainPanel.add(viewTransactionsPanel, "viewTransactions");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    // -------------------- Menu Panel --------------------
    private static JPanel createMenuPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(173, 216, 230)); // Light Blue

        JLabel title = new JLabel("Sakhi's First Capital Bank");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setBounds(220, 30, 500, 50);
        panel.add(title);

        String[] buttons = {"Add Customer", "Open Account", "Deposit", "Withdraw", "View Accounts", "View Transactions"};
        String[] panels = {"addCustomer", "openAccount", "deposit", "withdraw", "viewAccounts", "viewTransactions"};

        int y = 150;
        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            btn.setBounds(320, y, 250, 40);
            btn.setBackground(new Color(0, 123, 255));
            btn.setForeground(Color.WHITE);
            String panelName = panels[i];
            btn.addActionListener(e -> switchPanel(mainPanel, panelName));
            panel.add(btn);
            y += 60;
        }

        return panel;
    }

    // -------------------- Add Customer Panel --------------------
    private static JPanel createAddCustomerPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 228, 225)); // Misty Rose

        JLabel label = new JLabel("Add New Customer");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(280, 30, 400, 40);
        panel.add(label);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(180, 100, 100, 25);
        panel.add(firstNameLabel);
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(300, 100, 200, 25);
        panel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(180, 140, 100, 25);
        panel.add(lastNameLabel);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(300, 140, 200, 25);
        panel.add(lastNameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(180, 180, 100, 25);
        panel.add(addressLabel);
        JTextField addressField = new JTextField();
        addressField.setBounds(300, 180, 200, 25);
        panel.add(addressField);

        JButton addBtn = new JButton("Add Customer");
        addBtn.setBounds(300, 220, 150, 30);
        addBtn.setBackground(new Color(0, 191, 255));
        addBtn.setForeground(Color.WHITE);
        addBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel, "Customer added successfully! (Mock)");
        });
        panel.add(addBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(460, 220, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- Open Account Panel --------------------
    private static JPanel createOpenAccountPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 255, 240)); // Honeydew

        JLabel label = new JLabel("Open New Account");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(280, 30, 400, 40);
        panel.add(label);

        JLabel accTypeLabel = new JLabel("Account Type:");
        accTypeLabel.setBounds(180, 100, 120, 25);
        panel.add(accTypeLabel);
        String[] types = {"Savings", "Investment", "Cheque"};
        JComboBox<String> accTypeBox = new JComboBox<>(types);
        accTypeBox.setBounds(320, 100, 200, 25);
        panel.add(accTypeBox);

        JLabel initDepositLabel = new JLabel("Initial Deposit:");
        initDepositLabel.setBounds(180, 140, 120, 25);
        panel.add(initDepositLabel);
        JTextField depositField = new JTextField();
        depositField.setBounds(320, 140, 200, 25);
        panel.add(depositField);

        JButton openBtn = new JButton("Open Account");
        openBtn.setBounds(320, 180, 150, 30);
        openBtn.setBackground(new Color(60, 179, 113));
        openBtn.setForeground(Color.WHITE);
        openBtn.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Account opened successfully! (Mock)"));
        panel.add(openBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(480, 180, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- Deposit Panel --------------------
    private static JPanel createDepositPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(224, 255, 255)); // Light Cyan

        JLabel label = new JLabel("Deposit Funds");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(300, 30, 400, 40);
        panel.add(label);

        JLabel accLabel = new JLabel("Account Number:");
        accLabel.setBounds(180, 100, 120, 25);
        panel.add(accLabel);
        JTextField accField = new JTextField();
        accField.setBounds(320, 100, 200, 25);
        panel.add(accField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(180, 140, 120, 25);
        panel.add(amountLabel);
        JTextField amountField = new JTextField();
        amountField.setBounds(320, 140, 200, 25);
        panel.add(amountField);

        JButton depositBtn = new JButton("Deposit");
        depositBtn.setBounds(320, 180, 100, 30);
        depositBtn.setBackground(new Color(0, 191, 255));
        depositBtn.setForeground(Color.WHITE);
        depositBtn.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Deposit functionality not implemented yet!"));
        panel.add(depositBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(430, 180, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- Withdraw Panel --------------------
    private static JPanel createWithdrawPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 228, 225)); // Misty Rose

        JLabel label = new JLabel("Withdraw Funds");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(300, 30, 400, 40);
        panel.add(label);

        JLabel accLabel = new JLabel("Account Number:");
        accLabel.setBounds(180, 100, 120, 25);
        panel.add(accLabel);
        JTextField accField = new JTextField();
        accField.setBounds(320, 100, 200, 25);
        panel.add(accField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(180, 140, 120, 25);
        panel.add(amountLabel);
        JTextField amountField = new JTextField();
        amountField.setBounds(320, 140, 200, 25);
        panel.add(amountField);

        JButton withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setBounds(320, 180, 100, 30);
        withdrawBtn.setBackground(new Color(220, 20, 60));
        withdrawBtn.setForeground(Color.WHITE);
        withdrawBtn.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Withdraw functionality not implemented yet!"));
        panel.add(withdrawBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(430, 180, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- View Accounts Panel --------------------
    private static JPanel createViewAccountsPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 255, 240)); // Honeydew

        JLabel label = new JLabel("Accounts Overview");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(280, 30, 400, 40);
        panel.add(label);

        // Placeholder Table
        JTextArea textArea = new JTextArea("No account data yet!");
        textArea.setBounds(180, 100, 500, 300);
        panel.add(textArea);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(380, 420, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- View Transactions Panel --------------------
    private static JPanel createViewTransactionsPanel(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 250, 205)); // Lemon Chiffon

        JLabel label = new JLabel("Transaction History");
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setBounds(280, 30, 400, 40);
        panel.add(label);

        // Placeholder Table
        JTextArea textArea = new JTextArea("No transactions yet!");
        textArea.setBounds(180, 100, 500, 300);
        panel.add(textArea);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(380, 420, 100, 30);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(e -> switchPanel(mainPanel, "menu"));
        panel.add(backBtn);

        return panel;
    }

    // -------------------- Helper Method --------------------
    private static void switchPanel(JPanel mainPanel, String panelName) {
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, panelName);
    }
}
