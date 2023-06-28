package dz2;
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Enum;


class gui{
    
    private static long prev_up = 0;
    private static long prev_down = 0;
    private static long prev_enter = 0;
    private static JComboBox<String> tasks = new JComboBox<>(new String[]{"t1","t2","t3","t4"});
    private static JLabel cool_story = new JLabel(getLabelContent(0));
    
    private  static String getLabelContent(int code){
        String out = "";
        switch (code) {
            
            case 0:
                out = "t1";
                break;
            case 1:
                out = "t2";
                break;
            case 2:
                out = "t3";
                break;
            case 3:
                out = "t4";
                break;
            case 4:
                out = String.join("","<html>cool stories here!<br>",
            "переключение между задачами : стрелочки вверх-вниз, 1234 на цифровом блоке<br>",
            "выбрать - энтер</html>", "<br> <b>Escape - выводит справку></b>");
                break;
            default:
                out = getLabelContent(4);
                break;
            
        }
        return out;
    }
    
    public static void main(String args[]){
        tasks.setEnabled(false);
        KeyboardFocusManager
            .getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(
                new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent e) {
                    long ctime_up = 0;
                    long ctime_down = 0;
                    long ctime_enter = 0; 
                    Integer delay = 150;
                    switch (e.getExtendedKeyCode())
                    {
                        case 38:
                            ctime_up = e.getWhen();
                            if ((ctime_up - prev_up) > delay)
                            {   if (!tasks.isFocusOwner()){
                                Integer focus = tasks.getSelectedIndex();
                                switch (focus)  {
                                    case 0:
                                        tasks.setSelectedIndex(3);
                                        break;
                                
                                    default:
                                        tasks.setSelectedIndex(focus-1);
                                                }
                                        }
                            }
                            prev_up = ctime_up;
                            
                            break;
                        case 40:
                            ctime_down = e.getWhen();
                            if ((ctime_down - prev_down) > delay)
                            {if (!tasks.isFocusOwner()){
                                Integer focus = tasks.getSelectedIndex();
                                switch (focus) {
                                    case 3:
                                        tasks.setSelectedIndex(0);
                                        break;
                                
                                    default:
                                        tasks.setSelectedIndex(focus+1);
                                                }   
                                        }
                            }
                            prev_down = ctime_down;
                            break;
                        case 10:
                            ctime_enter = e.getWhen();
                            if ((ctime_enter - prev_enter) > delay)
                            {
                                cool_story.setText(getLabelContent(tasks.getSelectedIndex()));
                            }
                            prev_enter = ctime_enter;
                            
                            break;
                        case 49:
                        case 97:
                            tasks.setSelectedIndex(0);
                            break;
                        case 50:
                        case 98:
                            tasks.setSelectedIndex(1);
                            break;
                        case 51:
                        case 99:
                            tasks.setSelectedIndex(2);
                            break;
                        case 52:
                        case 100:
                            tasks.setSelectedIndex(3);
                            break;
                        case 27:
                            cool_story.setText(getLabelContent(4));
                            break;
                        default:
                            // System.out.println(e.getKeyCode());
                            // System.out.println(e.getExtendedKeyCode());
                            break;
                    
                    }
                        


                    return false;
                }
            });
        JFrame frame = new JFrame("exceptional#2");
        frame.setSize(400,400);
        JPanel control = new JPanel(new GridLayout(2,1));
        JPanel output = new JPanel(new GridLayout(1,1));
        control.setMinimumSize(new Dimension(400, 50));
        control.setMaximumSize(new Dimension(400, 50));
        control.setSize(new Dimension(400, 50));
        output.setMinimumSize(new Dimension(400,350));
        output.setMaximumSize(new Dimension(400,350));
        output.setSize(new Dimension(400,350));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.setLayout(new GridLayout(2,1));
        
        tasks.setMaximumSize(new Dimension(200, 75));
        JButton clickMe = new JButton("go!<click or enter>");
        cool_story.setHorizontalAlignment(SwingConstants.LEFT);
        control.add(tasks);
        control.add(clickMe);
        output.add(cool_story);
        frame.getContentPane().add(control,BorderLayout.NORTH);
        frame.getContentPane().add(output,BorderLayout.AFTER_LAST_LINE);
        frame.setAlwaysOnTop(true);
            frame.setVisible(true); // Adds Button to content pane of frame
        }
       
       
    }