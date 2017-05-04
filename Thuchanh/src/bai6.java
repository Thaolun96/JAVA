import java.awt.*;
import java.awt.event.*;
public class bai6 extends Frame implements KeyListener {
   private TextField tfInput;  
   private TextArea taDisplay; 
   public bai6() {
      setLayout(new FlowLayout()); 
      add(new Label("Enter Text: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40); 
      add(taDisplay);
      tfInput.addKeyListener(this);
      setTitle("KeyEvent Demo"); 
      setSize(400, 200);        
      setVisible(true);        
   }
   public static void main(String[] args) {
      new bai6(); 
   }
   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}
