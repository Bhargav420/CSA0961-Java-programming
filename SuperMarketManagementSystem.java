import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SuperMarketManagementSystem {
    private JFrame frame;
    private JTextField productNameField;
    private JTextField productPriceField;
    private JTextField productQuantityField;
    private JTextArea productDetailsArea;
    private JButton addButton;
    private JButton removeButton;
    private JButton clearButton;
    private DefaultListModel<String> productListModel;
    private JList<String> productList;

    private ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SuperMarketManagementSystem();
            }
        });
    }

    public SuperMarketManagementSystem() {
        if (showLoginDialog()) {
            createGUI();
        } else {
            System.exit(0); // Exit if login fails
        }
    }

    private boolean showLoginDialog() {
        JDialog loginDialog = new JDialog(frame, "Login", true);
        loginDialog.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        loginDialog.add(userLabel);
        loginDialog.add(userField);
        loginDialog.add(passLabel);
        loginDialog.add(passField);
        loginDialog.add(loginButton);
        loginDialog.add(cancelButton);

        loginDialog.pack();
        loginDialog.setLocationRelativeTo(null);

        final boolean[] loginSuccessful = {false};

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Validate the username and password (replace with actual validation logic)
                if (username.equals("admin") && password.equals("password")) {
                    loginSuccessful[0] = true;
                    loginDialog.dispose();
                } else {
                    JOptionPane.showMessageDialog(loginDialog, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginDialog.dispose();
            }
        });

        loginDialog.setVisible(true);

        return loginSuccessful[0];
    }

    private void createGUI() {
        frame = new JFrame("Super Market Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create product details panel
        JPanel productDetailsPanel = new JPanel();
        productDetailsPanel.setLayout(new GridLayout(4, 2));
        productDetailsPanel.add(new JLabel("Product Name:"));
        productNameField = new JTextField(20);
        productDetailsPanel.add(productNameField);
        productDetailsPanel.add(new JLabel("Product Price:"));
        productPriceField = new JTextField(20);
        productDetailsPanel.add(productPriceField);
        productDetailsPanel.add(new JLabel("Product Quantity:"));
        productQuantityField = new JTextField(20);
        productDetailsPanel.add(productQuantityField);
        productDetailsPanel.add(new JLabel("Product Details (yes/no):"));
        productDetailsArea = new JTextArea(5, 20);
        productDetailsPanel.add(new JScrollPane(productDetailsArea));

        // Create product list panel
        JPanel productListPanel = new JPanel();
        productListPanel.setLayout(new BorderLayout());
        productListModel = new DefaultListModel<>();
        productList = new JList<>(productListModel);
        productListPanel.add(new JScrollPane(productList), BorderLayout.CENTER);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add Product");
        addButton.addActionListener(new AddButtonListener());
        buttonPanel.add(addButton);
        removeButton = new JButton("Remove Product");
        removeButton.addActionListener(new RemoveButtonListener());
        buttonPanel.add(removeButton);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearButtonListener());
        buttonPanel.add(clearButton);

        // Add panels to frame
        frame.add(productDetailsPanel, BorderLayout.NORTH);
        frame.add(productListPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String productName = productNameField.getText().trim();
            if (productName.isEmpty() || !productName.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(frame, "Invalid product name. Please enter a valid string.");
                return;
            }

            double productPrice;
            int productQuantity;
            try {
                productPrice = Double.parseDouble(productPriceField.getText());
                productQuantity = Integer.parseInt(productQuantityField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values for price and quantity.");
                return;
            }

            String productDetails = productDetailsArea.getText().trim().toLowerCase();
            if (!productDetails.equals("yes") && !productDetails.equals("no")) {
                JOptionPane.showMessageDialog(frame, "Invalid product details. Please enter 'yes' or 'no'.");
                return;
            }

            Product product = new Product(productName, productPrice, productQuantity, productDetails);
            products.add(product);
            productListModel.addElement("Name: " + product.getName());
            productListModel.addElement("Price: " + product.getPrice());
            productListModel.addElement("Quantity: " + product.getQuantity());
            productListModel.addElement("Total Price: " + product.getTotalPrice());
            productListModel.addElement("Details: " + product.getDetails());
            productListModel.addElement("----------");

            productNameField.setText("");
            productPriceField.setText("");
            productQuantityField.setText("");
            productDetailsArea.setText("");
        }
    }

    private class RemoveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = productList.getSelectedIndex();
            if (selectedIndex != -1) {
                products.remove(selectedIndex / 6);
                for (int i = 0; i < 6; i++) {
                    productListModel.remove(selectedIndex - (selectedIndex % 6));
                }
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            productNameField.setText("");
            productPriceField.setText("");
            productQuantityField.setText("");
            productDetailsArea.setText("");
            productListModel.clear();
            products.clear();
        }
    }

    private static class Product {
        private String name;
        private double price;
        private int quantity;
        private String details;

        public Product(String name, double price, int quantity, String details) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.details = details;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getDetails() {
            return details;
        }

        public double getTotalPrice() {
            return price * quantity;
        }
    }
}
