/*
 * Tugas pertemuan 7 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Revina
 */
public class BiodataTableModel extends AbstractTableModel {
    
    private String[] columnNames = { "Nama", "Nomor Telp", "Alamat", "Jenis Kelamin" };
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
    public int getRowCount() {
        return data.size();
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col) {
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }
    
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void add(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

}
