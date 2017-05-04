import java.awt.*;        
import java.awt.event.*;
public class bai1 extends Frame implements ActionListener {
       private Label lblCount;
       private TextField tfCount;
       private Button chọn;
       private int count = 0;
    public bai1 () {    
         setLayout(new FlowLayout());
         lblCount = new Label("Counter");
          add(lblCount);
         tfCount = new TextField("0", 10);
         tfCount.setEditable(false); 
         add(tfCount); 
         chọn = new Button("Count");
         add(chọn);
         chọn.addActionListener(this);
         setTitle("AWT Counter");  
         setSize(250, 100);    
         setVisible(true);
    }
   public static void main(String[] args) {
      bai1 app = new bai1();
   }
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; 
      tfCount.setText(count + ""); 
    }
}
