package view;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Homepage {
    private GridBagLayout gb;
    private GridBagConstraints gbc;
    private JButton editingButton, settingButton;
    private JFrame mainFrame;
    private JLabel accountLabel, directoryLabel;
    private JPanel accountPanel, contentPanel, titlePanel;
    
    public Homepage() {
        UIManager.put("Button.font", new Font("SegoeUI", Font.BOLD, 16));
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
        accountPanel.setBackground(new Color(0, 159, 229, 255));
        accountPanel.setLayout(new BorderLayout());

        accountLabel = new JLabel("   Bùi Anh Quốc    ", new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\image\\avatar.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)), 0);
        accountLabel.setFont(accountLabel.getFont().deriveFont((float)17.0));

        accountPanel.add(accountLabel, BorderLayout.EAST);

        gbc.insets = new Insets(0, 0, 10, 0);
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1; gbc.weighty = 30;

        mainFrame.add(accountPanel, gbc);
    }

    public void content() {
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        gbc.insets = new Insets(0, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 1; gbc.weighty = 1050;

        mainFrame.add(contentPanel, gbc);
    }

    public void title() {
        GridBagConstraints _gbc = new GridBagConstraints();
        JLabel homeLabel = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\image\\home.png"));
        JPanel panel1 = new JPanel(new BorderLayout()), panel2 = new JPanel(new BorderLayout()), panel3 = new JPanel(new BorderLayout());

        directoryLabel = new JLabel("Home");

        editingButton = new JButton("TURN EDITTING ON");
        editingButton.setBackground(new Color(0, 159, 229, 255));
        editingButton.setForeground(Color.WHITE);
        editingButton.setPreferredSize(new Dimension(200, 40));

        gbc.insets = new Insets(0, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 1; gbc.weighty = 200;

        settingButton = new JButton(new ImageIcon(System.getProperty("user.dir") + "\\src\\image\\setting.png"));
        settingButton.setBackground(Color.WHITE);
        

        panel1.setBackground(Color.WHITE);
        panel1.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel1.setLayout(new BorderLayout());
        panel1.add(directoryLabel, BorderLayout.SOUTH);
        panel1.add(homeLabel, BorderLayout.WEST);

        panel2.setBackground(Color.WHITE);
        panel2.setBorder(new EmptyBorder(10, 10, 10, 20));
        panel2.add(settingButton);

        panel3.setBackground(Color.WHITE);
        panel3.setBorder(new EmptyBorder(10, 10, 30, 20));
        panel3.add(editingButton);
        
        titlePanel = new JPanel();
        titlePanel.setBackground(Color.WHITE);
        titlePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        titlePanel.setLayout(new GridBagLayout());
        
        _gbc.anchor = GridBagConstraints.NORTHWEST; _gbc.gridx = 0; _gbc.gridy = 0; _gbc.weightx = 1; _gbc.weighty = 1; titlePanel.add(panel1, _gbc);
        _gbc.anchor = GridBagConstraints.NORTHEAST; _gbc.gridx = 1; _gbc.gridy = 0; _gbc.weightx = 1; _gbc.weighty = 1; titlePanel.add(panel2, _gbc);
        _gbc.anchor = GridBagConstraints.SOUTHWEST; _gbc.gridx = 0; _gbc.gridy = 1; _gbc.weightx = 1; _gbc.weighty = 1; titlePanel.add(new JLabel(), _gbc);
        _gbc.anchor = GridBagConstraints.SOUTHEAST; _gbc.gridx = 1; _gbc.gridy = 1; _gbc.weightx = 1; _gbc.weighty = 1; titlePanel.add(panel3, _gbc);

        mainFrame.add(titlePanel, gbc);
    }

    JPanel getAccountPanel() {return accountPanel;}
    JPanel getContentPanel() {return contentPanel;}
    JPanel getTitlePanel() {return titlePanel;}
}