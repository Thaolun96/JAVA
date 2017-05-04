import java.awt.*;     
import java.awt.event.*;  
public class bai3 extends Frame
      implements ActionListener, WindowListener {
   private TextField tfCount;  
   private Button btnCount;    
   private int count = 0;      
   public bai3() {
      setLayout(new FlowLayout()); 
      add(new Label("Counter"));   
      tfCount = new TextField("0", 10); 
      tfCount.setEditable(false);       
      add(tfCount);                     
      btnCount = new Button("Count");  
      btnCount.addActionListener(this);
      addWindowListener(this);
      setTitle("WindowEvent Demo"); 
      setSize(250, 100);            
      setVisible(true);            
   }
   public static void main(String[] args) {
      new bai3();  
   }
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  
   }
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}
    
