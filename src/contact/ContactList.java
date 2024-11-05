package contact;
import com.sun.javafx.scene.text.TextLayout;
import javax.swing.*;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class ContactList extends javax.swing.JFrame {
     DefaultTableModel model;
     File f;
  
    public ContactList() throws IOException, Exception {
        initComponents();
        ImageIcon img=new ImageIcon("src/Icons/Pic.JPG");
        //setIconImage("");
        setTitle("EELU's Project");
        setSize(1400,800);
        setLocationRelativeTo(null);
       model = (DefaultTableModel)table.getModel();
       table.setAutoCreateRowSorter(true);
       f=new File("src\\dataSet.bin");
       if(!f.exists())f.createNewFile();
       start();
    }
    
    public void start() throws Exception{
        FileInputStream Fi =new FileInputStream(f);
        if (f.length() <= 0) return;
        ObjectInputStream Oi=new ObjectInputStream(Fi);
         Vector<Vector> tableData = (Vector<Vector>) Oi.readObject();
        Fi.close();
        Oi.close();
        ContactsNum=tableData.size();
         for (int i = 0; i < ContactsNum; i++) {
            model.addRow(new Object[]{tableData.get(i).get(0) , tableData.get(i).get(1) , tableData.get(i).get(2) , tableData.get(i).get(3) , tableData.get(i).get(4)});
        }
        updateCounter(ContactsNum);
        checkIdNumbers();
    }
    public void updateFile() throws Exception{
        Vector<Vector> tableVector=model.getDataVector();
        FileOutputStream F =new FileOutputStream(f);
        ObjectOutputStream O=new ObjectOutputStream(F);
        O.writeObject(tableVector);
        F.close();
        O.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        NewContactPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FullNameText = new javax.swing.JTextField();
        PhoneNumberText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        ContactsListLabel = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        CounterLabel = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(0, 102, 102));
        MainPanel.setPreferredSize(new java.awt.Dimension(1400, 800));

        NewContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "New Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N
        NewContactPanel.setOpaque(false);
        NewContactPanel.setPreferredSize(new java.awt.Dimension(300, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-city-buildings-16.png"))); // NOI18N
        jLabel1.setText("Full Name");

        FullNameText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FullNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameTextActionPerformed(evt);
            }
        });

        PhoneNumberText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PhoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-gmail-16.png"))); // NOI18N
        jLabel3.setText("Email");

        EmailText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-city-buildings-16.png"))); // NOI18N
        jLabel4.setText("Address");

        AddressText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextActionPerformed(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.red);
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("*");

        jLabel6.setBackground(java.awt.Color.red);
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("*");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-phone-50.png"))); // NOI18N
        jLabel7.setText("Phone Number");

        AddButton.setBackground(new java.awt.Color(204, 102, 0));
        AddButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-plus-16.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("*");

        ClearButton.setBackground(new java.awt.Color(204, 102, 0));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pngwing.com.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewContactPanelLayout = new javax.swing.GroupLayout(NewContactPanel);
        NewContactPanel.setLayout(NewContactPanelLayout);
        NewContactPanelLayout.setHorizontalGroup(
            NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewContactPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewContactPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(NewContactPanelLayout.createSequentialGroup()
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ClearButton))
                        .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddressText, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addGroup(NewContactPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(PhoneNumberText)
                            .addGroup(NewContactPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(FullNameText))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        NewContactPanelLayout.setVerticalGroup(
            NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewContactPanelLayout.createSequentialGroup()
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewContactPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(NewContactPanelLayout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(NewContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        ContactsListLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        ContactsListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContactsListLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-contacts-16.png"))); // NOI18N
        ContactsListLabel.setText("Contacts List");

        Jlabel.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        Jlabel.setText("Contacts : ");

        table.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Name", "Phone Num", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(30);
        table.setRowMargin(2);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(120);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        searchBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Name", "Phone Num", "Email", "Address" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-search-16.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        CounterLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 29)); // NOI18N
        CounterLabel.setText("0");

        DeleteButton.setBackground(new java.awt.Color(204, 102, 0));
        DeleteButton.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/352303_delete_icon.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(204, 102, 0));
        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reload_560463.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Jlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CounterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ContactsListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NewContactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(448, 448, 448)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(searchButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactsListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jlabel)
                        .addComponent(CounterLabel)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewContactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTextActionPerformed

    private void PhoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
     if(checkMainInfo()){
         Contact newContact ;
        if(AddressText.getText().trim().isEmpty())
            newContact=new Contact(FullNameText.getText().trim() ,PhoneNumberText.getText().trim(),EmailText.getText().trim() );
        else{
            newContact=new Contact(FullNameText.getText().trim() ,PhoneNumberText.getText().trim(),EmailText.getText().trim(),AddressText.getText().trim() );
        } 
        
      if(!newContact.Flag() )
          JOptionPane.showMessageDialog(this, newContact.getMessege(),"Error Messege",JOptionPane.INFORMATION_MESSAGE );
        else{
             try {
                 AddToTable(newContact);
             } catch (Exception ex) {
                 Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
             }
        }    
         
     }
     
     else{
          JOptionPane.showMessageDialog(this, "Please Enter Main Information ( Name , Phone Num , Email ) !", "Error Messege",JOptionPane.INFORMATION_MESSAGE);
     }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed
/*All	
Name
Phone Num
Email
Address*/
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchBox.getText().trim().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Please enter a value to search for !" , "Error Messege" , JOptionPane.ERROR_MESSAGE);
        }else {
            if (ComboBox.getSelectedItem().equals("ALL") ) {
                for (int i = 0; i < ContactsNum; i++) {
                    for (int j = 1; j < 5; j++) {
                        if (model.getValueAt(i , j).equals(searchBox.getText().trim())) {
                            validSearch(i);
                            return;
                        }
                    }
                }
            } else if(ComboBox.getSelectedItem().equals("Name")){
                for (int i = 0; i < ContactsNum; i++) {
                    if (model.getValueAt(i , 1).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else if(ComboBox.getSelectedItem().equals("Phone Num")){
                for (int i = 0; i < ContactsNum; i++) {
                    if (model.getValueAt(i , 2).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else if(ComboBox.getSelectedItem().equals("Email")){
                for (int i = 0; i < ContactsNum; i++) {
                    if (model.getValueAt(i , 3).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            } else {
                for (int i = 0; i < ContactsNum; i++) {
                    if (model.getValueAt(i , 4).equals(searchBox.getText().trim())) {
                        validSearch(i);
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Not founded data in the Option : " + ComboBox.getSelectedItem() , "Not founded !!" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
      int index = table.getSelectedRow();
      if(index<0){
          JOptionPane.showMessageDialog(this,"Please Select a Row !!", "No Selected Row",JOptionPane.ERROR_MESSAGE );
      }
      else{
          model.removeRow(index);
          ContactsNum--;
          updateCounter(ContactsNum);
      }
         try {
              updateFile();
          } catch (Exception ex) {
              Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
          }
         checkIdNumbers();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if (checkMainInfo()) {
            Contact newContact;
            if (AddressText.getText().trim().isEmpty()){
                newContact = new Contact(FullNameText.getText().trim() , PhoneNumberText.getText().trim(), EmailText.getText().trim());
            } else {
                newContact = new Contact(FullNameText.getText().trim() , PhoneNumberText.getText().trim(), EmailText.getText().trim() , AddressText.getText().trim());
            }
            if (!newContact.Flag()) {
                JOptionPane.showMessageDialog(this, newContact.getMessege(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    updateToTable(newContact);
                } catch (Exception ex) {
                    Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Please enter the Main Information !" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_UpdateButtonActionPerformed
    public boolean checkMainInfo(){
        return !FullNameText.getText().trim().isEmpty() &&
               !PhoneNumberText.getText().trim().isEmpty()&&
                !EmailText.getText().trim().isEmpty();
    }
    /////////////////////////////////////////
    void clear(){
        FullNameText.setText("");
        PhoneNumberText.setText("");
        EmailText.setText("");
        AddressText.setText("");
    }
public static int ContactsNum;

   public void AddToTable(Contact C) throws Exception{
     model.addRow(new Object[]{table.getRowCount()+1,C.getFullName(),C.getPhoneNumber(),C.getEmail() , C.getAddress().isEmpty()? "Empty":C.getAddress() });
    ContactsNum++;
    updateCounter(ContactsNum);
    clear();
    updateFile();
    }
    public void validSearch(int i){
        table.setRowSelectionInterval(i , i);
        FullNameText.setText(model.getValueAt(i , 1)+"");
        PhoneNumberText.setText(model.getValueAt(i , 2)+"");
        EmailText.setText(model.getValueAt(i , 3)+"");
        AddressText.setText(model.getValueAt(i , 4)+"");
        JOptionPane.showMessageDialog(this,"Founded in the " + ComboBox.getSelectedItem()+ " data !!" , "Result of your search" , JOptionPane.INFORMATION_MESSAGE);
    } 
   public void checkIdNumbers(){
        for (int i = 0; i < ContactsNum; i++) {
            model.setValueAt(i+1, i, 0);
        }
        updateCounter(ContactsNum);
    }
    public void updateCounter(int numOfClients){
        CounterLabel.setText(ContactsNum + "");
    }
     public void updateToTable(Contact c) throws Exception{
        int i = table.getSelectedRow();
        model.setValueAt(c.getFullName(), i , 1);
        model.setValueAt(c.getPhoneNumber(),i , 2);
        model.setValueAt(c.getEmail(),i, 3);
        model.setValueAt(c.getAddress(),i, 4);
        updateFile();
    }
   
   
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ContactList().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddressText;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel ContactsListLabel;
    private javax.swing.JLabel CounterLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField FullNameText;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NewContactPanel;
    private javax.swing.JTextField PhoneNumberText;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
