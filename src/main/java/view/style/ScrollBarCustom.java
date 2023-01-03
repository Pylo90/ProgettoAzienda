package view.style;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(16, 8));
        setForeground(Color.BLACK);
        setBackground(new Color(255, 248, 238));
    }
}