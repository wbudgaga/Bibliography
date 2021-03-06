/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.core;

import cs518.a2.budgaga.sorter.Sorter;
import cs518.a2.budgaga.sorter.SorterByJournal;
import cs518.a2.budgaga.sorter.SorterByLastname;
import cs518.a2.budgaga.sorter.SorterByPublicationDate;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author budgaga
 */
public class Bibliography extends javax.swing.JPanel{
    private EntriesContainer entriesContainer;
    private VetoableChangeSupport   vcs                     = new VetoableChangeSupport(this);
    private Sorter                  sorter                  = new SorterByLastname();;
    private boolean                 sortByAuthorLastname    = true;
    private boolean                 sortByJournal           = false;
    private boolean                 sortByPublicationDate   = false;
    /**
     * Creates new form Bibliography1
     */
    public Bibliography() {
        initComponents();
        vcs.addVetoableChangeListener(new SortTypeVoteChangeListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bibfileField = new javax.swing.JTextField();
        load = new javax.swing.JButton();
        browse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();
        errorMSG = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Name of bibfile:");

        load.setText("Load");
        load.setMaximumSize(new java.awt.Dimension(76, 28));
        load.setMinimumSize(new java.awt.Dimension(76, 28));
        load.setPreferredSize(new java.awt.Dimension(76, 28));
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        browse.setText("Browse...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bibfileField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {browse, load});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bibfileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {browse, load});

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);

        next.setText("Next");
        next.setMaximumSize(new java.awt.Dimension(76, 28));
        next.setMinimumSize(new java.awt.Dimension(76, 28));
        next.setPreferredSize(new java.awt.Dimension(76, 28));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setEditable(false);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        exit.setText("Exit");
        exit.setMaximumSize(new java.awt.Dimension(76, 28));
        exit.setMinimumSize(new java.awt.Dimension(76, 28));
        exit.setPreferredSize(new java.awt.Dimension(76, 28));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        errorMSG.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(errorMSG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMSG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void errorMSG(String msg){
        errorMSG.setText(msg);
    }

    public void reset(){
        sortByAuthorLastname    = false;
        sortByJournal           = false;
        sortByPublicationDate   = false;
    }
    
    public void setSortByAuthorLastname(boolean value){  
        try{
            vcs.fireVetoableChange("sortByAuthorLastname", this, value);
            sortByAuthorLastname = true;
            setSort(new SorterByLastname());
        } catch (PropertyVetoException e) {}
     }
    public boolean isSortByAuthorLastname(){
        return sortByAuthorLastname;
    }
    
    public void setSortByJournal(boolean value){
        try{
            vcs.fireVetoableChange("sortByJournal", this, value);
            sortByJournal           = true;
            setSort(new SorterByJournal());
        } catch (PropertyVetoException e) {}
    }
    public boolean isSortByJournal(){
        return sortByJournal;
    }
    
    public void setSortByPublicationDate(boolean value){        
        try{
            vcs.fireVetoableChange("sortByPublicationDate", this, value);
            sortByPublicationDate   = true;
            setSort(new SorterByPublicationDate());
        } catch (PropertyVetoException e) {}
    }
    public boolean isSortByPublicationDate(){
        return sortByPublicationDate;
    }
    
    private void setSort(Sorter newSorter){
        sorter                  = newSorter;
        sort();
    }
    
    private void sort(){
        if (entriesContainer!= null){
            sorter.setList(entriesContainer.getEntries());
            next();
        }
    }
        
    public void next(){
        errorMSG("");
        String entryKey = sorter.nextKey();
        if (entryKey == null) {
            errorMSG("No entries remaining");
            return;
        }
        textArea.setText(entriesContainer.getEntry(entryKey));
    }

    private void loadFile(){
        File file                   = new File(bibfileField.getText());
        try {
            textArea.read( new FileReader( file.getAbsolutePath() ), null );
            entriesContainer = new EntriesContainer(textArea.getText());
            textArea.setText("");
            sort();
        } catch (IOException ex) {
           errorMSG("problem accessing file"+file.getAbsolutePath());
        }
    }

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        errorMSG("");
        if (bibfileField.getText().trim().isEmpty()) {
            errorMSG("Invalid bibfile name!");
        } else if (new File(bibfileField.getText()).exists()) {
            loadFile();
        } else {
            errorMSG("File not found!");
        }
    }//GEN-LAST:event_loadActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        errorMSG("");
        int returnVal               = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            bibfileField.setText(fileChooser.getSelectedFile().getPath());
            loadFile();
        } else {
            errorMSG("File access cancelled by user.");
        }
    }//GEN-LAST:event_browseActionPerformed
       
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        next();
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bibfileField;
    private javax.swing.JButton browse;
    private javax.swing.JLabel errorMSG;
    private javax.swing.JButton exit;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton load;
    private javax.swing.JButton next;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
