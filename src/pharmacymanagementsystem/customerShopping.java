/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chai
 */
public class customerShopping extends javax.swing.JFrame {

    Customer client = new Customer();
    DefaultTableModel inventoryModel = new DefaultTableModel();
    DefaultTableModel cartModel = new DefaultTableModel();

    /**
     * Creates new form menu
     */
    public customerShopping() {
        initComponents();

        session_nameLabel.setText(client.getName());
        session_roleLabel.setText(client.getRoleName());

        inventoryModel = (DefaultTableModel) inventoryTable.getModel();
        cartModel = (DefaultTableModel) cartTable.getModel();

        // Restrict user to maximum 1 row selection at a time
        inventoryTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cartTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Allow table to be sortable through column headers (ID, Name, Company...)
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(inventoryModel);
        inventoryTable.setRowSorter(sorter);

        // By default, sort table by Name in ascending order
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(1, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);

        // Populate the table
        populateInventoryTable(client.getInventory());

        // Detect changes to searchField
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                sortTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                sortTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                sortTable();
            }

            public void sortTable() {
                // Filter table based on ID and Name only
                try {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchField.getText(), 0, 1));   
                } catch(Exception e) {
                    System.out.println("Error filtering based on searchField.");
                } finally {
                    System.out.println("Filtering table based on searchField.");
                }                
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        filterGroup = new NoneSelectedButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        session_nameLabel = new javax.swing.JLabel();
        session_roleLabel = new javax.swing.JLabel();
        signOutButton = new javax.swing.JButton();
        shopButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchResetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewMedicineButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filter_inStockCheckbox = new javax.swing.JCheckBox();
        addCartButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalAmountField = new javax.swing.JLabel();
        removeItemButton = new javax.swing.JButton();
        header1 = new javax.swing.JLabel();
        purchaseButton = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));

        jPanel1.setBackground(new java.awt.Color(143, 252, 220));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(165, 32767));

        session_nameLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        session_nameLabel.setText("Name");

        session_roleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        session_roleLabel.setText("Role");

        signOutButton.setText("Sign Out");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        shopButton.setBackground(new java.awt.Color(184, 207, 229));
        shopButton.setText("Shop for Medicine");

        accountButton.setText("Account Settings");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(session_nameLabel)
                            .addComponent(session_roleLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(session_nameLabel)
                .addGap(1, 1, 1)
                .addComponent(session_roleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(shopButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        header.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        header.setText("Shop for Medicine");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Company", "Unit", "Price", "Quantity Left"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(inventoryTable);
        if (inventoryTable.getColumnModel().getColumnCount() > 0) {
            inventoryTable.getColumnModel().getColumn(0).setResizable(false);
        }

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        searchResetButton.setText("Reset");
        searchResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchResetButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Quick Search (Medicine ID or Name)");

        viewMedicineButton.setText("View Medicine Details");
        viewMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicineButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Filter by");

        filter_inStockCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        filterGroup.add(filter_inStockCheckbox);
        filter_inStockCheckbox.setText("Show only medicine with ready stock");
        filter_inStockCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filter_inStockCheckboxItemStateChanged(evt);
            }
        });
        filter_inStockCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_inStockCheckboxActionPerformed(evt);
            }
        });

        addCartButton.setText("Add to Cart");
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filter_inStockCheckbox)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchResetButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewMedicineButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchResetButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter_inStockCheckbox)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewMedicineButton)
                    .addComponent(addCartButton))
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(cartTable);
        if (cartTable.getColumnModel().getColumnCount() > 0) {
            cartTable.getColumnModel().getColumn(0).setResizable(false);
            cartTable.getColumnModel().getColumn(1).setResizable(false);
            cartTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            cartTable.getColumnModel().getColumn(2).setResizable(false);
            cartTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setText("TOTAL");

        totalAmountField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        totalAmountField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalAmountField.setText("00.00");
        totalAmountField.setToolTipText("");

        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(removeItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeItemButton)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(totalAmountField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        header1.setText("Shopping Cart");

        purchaseButton.setBackground(new java.awt.Color(204, 255, 204));
        purchaseButton.setText("Make Instant Purchase!");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header)
                    .addComponent(header1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1532, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void populateInventoryTable(List<Medicine> inventory) {
        inventoryModel.setRowCount(0);

        for (Medicine data : inventory) {
            Vector row = new Vector();
            row.add(data.getID());
            row.add(data.getName());
            row.add(data.getCompany());
            row.add(data.getUnit());
            row.add(data.getPrice());
            row.add(data.getQuantity());

            inventoryModel.addRow(row);
        }
    }
    
    public void populateCartTable() {
        cartModel.setRowCount(0);
        
        for (CartItem data : client.getCart()) {
            cartModel.addRow(new Object[] {data.getID(), data.getName(), data.getQuantity(), data.getAmount()});
        }
        
        totalAmountField.setText( Double.toString(client.getCartTotalAmount()) );
    }

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "We're sad to see you go...", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String message = client.logout();

            new login(message).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        new customerAccountSettings().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_accountButtonActionPerformed

    private void searchResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchResetButtonActionPerformed
        // Clear the fields including username's search field
        searchField.setText("");
    }//GEN-LAST:event_searchResetButtonActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased

    }//GEN-LAST:event_searchFieldKeyReleased

    private void viewMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicineButtonActionPerformed
        String medicineID = getItemBySelectedRow(inventoryTable, 0);
        if (medicineID == null) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        new customerViewMedicine(medicineID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewMedicineButtonActionPerformed

    private void filter_inStockCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_inStockCheckboxActionPerformed

    }//GEN-LAST:event_filter_inStockCheckboxActionPerformed

    private void filter_inStockCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filter_inStockCheckboxItemStateChanged
        if (filter_inStockCheckbox.isSelected()) {
            populateInventoryTable(client.getInventory(true));
        } else {
            populateInventoryTable(client.getInventory(false));
        }
    }//GEN-LAST:event_filter_inStockCheckboxItemStateChanged

    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        String id = getItemBySelectedRow(inventoryTable, 0);
        if (id == null) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Medicine medicine = client.getMedicine(id);

        // Popup dialogbox to ask for medicine's quantity
        String[] choices = {"1", "2", "3", "4", "5"};
        String input = (String) JOptionPane.showInputDialog(null, "How many do you need?", "Quantity of Medicine", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

        // User chose to cancel from the dialogbox
        if (input == null) {
            return;
        }

        if (!Validation.isInteger(input)) {
            JOptionPane.showMessageDialog(null, "Quantity selected is invalid. \nPlease try again.", "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int quantitySelected = Integer.parseInt(input);
        if (quantitySelected > medicine.getQuantity()) {
            JOptionPane.showMessageDialog(null, "Sorry, we do not have sufficient stock.\nQuantity left: " + medicine.getQuantity(), "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Save to cart
        client.addCart(id, medicine.getName(), medicine.getPrice(), quantitySelected);
        
        populateCartTable();
    }//GEN-LAST:event_addCartButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        String id = getItemBySelectedRow(cartTable, 0);
        if (id == null) {
            JOptionPane.showMessageDialog(null, "Please select a row from Shopping Cart.", "Opps!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        client.removeCart(id);
        populateCartTable();
        
        
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        if (client.isCartEmpty()) {
            JOptionPane.showMessageDialog(null, "To begin your purchase, please add an item to cart.", "Opps!", JOptionPane.ERROR_MESSAGE);           
            return;
        }
        
        boolean result = client.makePurchase();
        populateCartTable();
        populateInventoryTable(client.getInventory());
        
        if (result) {
            JOptionPane.showMessageDialog(null, "You have successfully made your purchase.\nPlease queue up at the cashier counter to retrieve the items.", "Thank you for the purchase!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

    String getItemBySelectedRow(JTable table, int col) {
        int row = table.getSelectedRow();

        if (row == -1) {
            return null;
        }

        return table.getValueAt(row, col).toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton addCartButton;
    private javax.swing.JTable cartTable;
    private javax.swing.ButtonGroup filterGroup;
    private javax.swing.JCheckBox filter_inStockCheckbox;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchResetButton;
    private javax.swing.JLabel session_nameLabel;
    private javax.swing.JLabel session_roleLabel;
    private javax.swing.JButton shopButton;
    private javax.swing.JButton signOutButton;
    private javax.swing.JLabel totalAmountField;
    private javax.swing.JButton viewMedicineButton;
    // End of variables declaration//GEN-END:variables
}
