import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
class java_pro extends JFrame {
    JTextArea txt;
    JFrame frame;
    JTextPane textPane = new JTextPane();
    public void editor() {
        frame = new JFrame("TEXT EDITOR");
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        } catch (Exception e) {

        }
        txt = new JTextArea();
        JMenuBar a1 = new JMenuBar();

        JMenu fl = new JMenu("File");

        JMenuItem fl1 = new JMenuItem("New");
        JMenuItem fl2 = new JMenuItem("Open");
        JMenuItem fl3 = new JMenuItem("Save");
        JMenuItem fl4 = new JMenuItem("Print");

        fl1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
        });
        fl2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser op = new JFileChooser("D:");
                int r = op.showOpenDialog(null);
                if (r == JFileChooser.APPROVE_OPTION) {
                    File f1 = new File(op.getSelectedFile().getAbsolutePath());
                    try {
                        String s1 = "", s2 = "";
                        FileReader fr = new FileReader(f1);
                        BufferedReader br = new BufferedReader(fr);
                        while ((s1 = br.readLine()) != null) {
                            s2 = s2 + "\n" + s1;
                        }
                        txt.setText(s2);
                    } catch (Exception e1) {

                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "the user cancelled the operation");
                }
            }
        });
        fl3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser obj2 = new JFileChooser("D:");
                int r2 = obj2.showSaveDialog(null);
                if (r2 == JFileChooser.APPROVE_OPTION) {
                    File f2 = new File(obj2.getSelectedFile().getAbsolutePath());
                    try {
                        FileWriter fw = new FileWriter(f2);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(txt.getText());
                        bw.flush();
                        bw.close();
                    } catch (Exception e4) {
                        JOptionPane.showMessageDialog(frame, e4.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "the user cancelled the operation");
                }
            }
        });
        fl4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    txt.print();
                } catch (Exception e3) {
                    JOptionPane.showMessageDialog(frame, e3.getMessage());
                }
            }
        });

        fl.add(fl1);
        fl.add(fl2);
        fl.add(fl3);
        fl.add(fl4);

        JMenu ed = new JMenu("Edit");
        JMenuItem ed1 = new JMenuItem("cut");
        JMenuItem ed2 = new JMenuItem("copy");
        JMenuItem ed3 = new JMenuItem("paste");
        JMenuItem ed4 = new JMenuItem("select all");
        JMenuItem ed5 = new JMenuItem("grammar check");

        ed1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.cut();
            }
        });
        ed2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.copy();
            }
        });
        ed3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.paste();
            }
        });
        ed4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.selectAll();
            }
        });


        ed.add(ed1);
        ed.add(ed2);
        ed.add(ed3);
        ed.add(ed4);
        ed.add(ed5);

    
        JMenuItem cl = new JMenuItem("close");
        cl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        a1.add(fl);
        a1.add(ed);
        
        a1.add(cl);
        
        frame.setJMenuBar(a1);
        frame.setVisible(true);
        frame.add(txt);
        frame.setSize(500, 500);
        frame.show();

    }

    public static void main(String args[]) {
        java_pro obj = new java_pro();
        obj.editor();
    }
}
