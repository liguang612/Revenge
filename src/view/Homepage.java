package view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Homepage {
    private GridBagLayout gb;
    private GridBagConstraints gbc;
    private JFrame mainFrame;
    private JLabel accountLabel;
    private JPanel accountPanel, contentPanel, titlePanel;
    
    public Homepage() {
        UIManager.put("Label.font", new Font("SegoeUI", Font.PLAIN, 14));
        mainFrame = new JFrame("Phần mềm thi trắc nghiệm");

        gb = new GridBagLayout(); 
        gbc = new GridBagConstraints(); 
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setLayout(gb);

        account();
        content();
        title();

        mainFrame.setVisible(true);
    }

    public void account() {
        accountPanel = new JPanel();
        accountPanel.setBackground(Color.BLUE);
        accountPanel.setLayout(new BorderLayout());

        accountLabel = new JLabel("   Bùi Anh Quốc    ", new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\image\\avatar.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)), 0);
        accountLabel.setFont(accountLabel.getFont().deriveFont((float)17.0));

        accountPanel.add(accountLabel, BorderLayout.EAST);

        gbc.insets = new Insets(0, 0, 10, 0);
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1; gbc.weighty = 50;

        mainFrame.add(accountPanel, gbc);
    }

    public void content() {
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        gbc.insets = new Insets(0, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 1; gbc.weighty = 00;

        mainFrame.add(contentPanel, gbc);
    }

    public void title() {
        titlePanel = new JPanel();
        titlePanel.setBackground(Color.WHITE);
        titlePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        titlePanel.setLayout(new GridLayout(3, 2, 20, 10));

        titlePanel.add(new JLabel("home"));
        titlePanel.add(new JButton("settings"));
        titlePanel.add(new JLabel("path"));
        titlePanel.add(new JLabel());
        titlePanel.add(new JLabel());
        titlePanel.add(new JButton("Editing"));

        gbc.insets = new Insets(0, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 1; gbc.weighty = 200;

        mainFrame.add(titlePanel, gbc);
    }
}