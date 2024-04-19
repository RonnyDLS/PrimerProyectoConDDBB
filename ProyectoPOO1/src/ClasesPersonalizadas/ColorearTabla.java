package ClasesPersonalizadas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorearTabla extends DefaultTableCellRenderer{
    
    private Component componente;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Font font = new Font("Tahoma", Font.BOLD, 11);
        if(!table.getValueAt(row, 3).toString().equals("")){
            this.setForeground(Color.WHITE);
            componente.setFont(font);
        }
        else {
            this.setForeground(Color.BLACK);
        }        
        return this;
    }    
    
}