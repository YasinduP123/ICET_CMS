import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
class ContactHomeForm extends JFrame {
    static int count = 0;
    public static Contact arr;
    JLabel title1;
    JLabel title2;
    JLabel home;
    private AddContactForm addcontactform;
    private SearchContactForm searchcontactform;
    private UpdateContactForm updatecontactform;
    private ListClass listclass;
    private DeleteContactForm deletecontactform;

    private JButton btnAddContact;
    private JButton btnUpdateContact;
    private JButton btnSearchContact;
    private JButton btnDeleteContact;
    private JButton btnViewContact;
    private JButton btnExit;

    private JPanel photo;

    ContactHomeForm() {
        // BufferedImage myPicture = Image.read(new File(""));
        setSize(500, 300);
        setTitle("Contact management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 2));

        JPanel btnPannel = new JPanel(new GridLayout(7, 1, 10, 10));
        btnPannel.setBackground(Color.GRAY);
        btnPannel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JPanel homepage = new JPanel(new FlowLayout(FlowLayout.CENTER));
        homepage.setBackground(Color.YELLOW);

        home = new JLabel("Home page");
        home.setFont(new Font("", 1, 30));
        homepage.add(home);

        btnPannel.add(homepage);

        btnAddContact = new JButton("Add New Contact");
        btnAddContact.setFont(new Font("", 1, 25));
        btnAddContact.setBackground(Color.BLUE);
        btnAddContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addcontactform = new AddContactForm(count++);
                addcontactform.setVisible(true);
            }
        });
        btnPannel.add(btnAddContact);

        btnUpdateContact = new JButton("Update Contact");
        btnUpdateContact.setFont(new Font("", 1, 25));
        btnUpdateContact.setBackground(Color.BLUE);
        btnUpdateContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evnt) {
                if (updatecontactform == null) {
                    updatecontactform = new UpdateContactForm();
                }
                updatecontactform.setVisible(true);
            }
        });
        btnPannel.add(btnUpdateContact);

        btnSearchContact = new JButton("Search Contact");
        btnSearchContact.setFont(new Font("", 1, 25));
        btnSearchContact.setBackground(Color.BLUE);
        btnSearchContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evn) {
                if (searchcontactform == null) {
                    searchcontactform = new SearchContactForm();
                }
                searchcontactform.setVisible(true);
            }
        });
        btnPannel.add(btnSearchContact);

        btnDeleteContact = new JButton("Delete Contact");
        btnDeleteContact.setFont(new Font("", 1, 25));
        btnDeleteContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (deletecontactform == null) {
                    deletecontactform = new DeleteContactForm();
                }
                deletecontactform.setVisible(true);
            }
        });
        btnDeleteContact.setBackground(Color.BLUE);
        btnPannel.add(btnDeleteContact);

        btnViewContact = new JButton("View Contact");
        btnViewContact.setFont(new Font("", 1, 25));
        btnViewContact.setBackground(Color.BLUE);
        btnViewContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (listclass == null) {
                    listclass = new ListClass();
                }
                listclass.setVisible(true);
            }
        });
        btnPannel.add(btnViewContact);

        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("", 1, 25));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ContactHomeForm.this.dispose();
            }
        });
        exitPanel.add(btnExit);

        btnPannel.add(exitPanel);

        JPanel imagepannel = new JPanel(new GridLayout(2, 1));
        // imagepannel.setBackground(Color.BLACK);

        JPanel subimgpannel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        subimgpannel1.setBackground(Color.white);

        // JPanel add = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // add.setBackground(Color.BLACK);

        JPanel lbltitles = new JPanel(new GridLayout(2, 1));
        // lbltitles.setBackground(Color.BLACK);

        JPanel title1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        title1Panel.setBackground(Color.WHITE);
        JPanel title2panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        title2panel.setBackground(Color.WHITE);

        title1 = new JLabel("Ifrends");
        title1.setFont(new Font("", 1, 30));
        title1Panel.add(title1);

        title2 = new JLabel("Contact Managment");
        title2.setFont(new Font("", 1, 30));
        title2panel.add(title2);

        lbltitles.add(title1Panel);
        lbltitles.add(title2panel);

        subimgpannel1.add(lbltitles);
        imagepannel.add(subimgpannel1);

        ImageIcon originalIcon = new ImageIcon("Color"); // replace with your image path

        // Resize the image
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);

        JPanel photo = new JPanel(new FlowLayout());
        photo.setBackground(Color.LIGHT_GRAY);
        // add.add(photo);
        // subimgpannel1.add(add);
        photo.add(imageLabel);
        // lbltitles.add(photo);
        // JButton btnddd = new JButton("button");
        // photo.add(btnddd);

        // ImageIcon image = new ImageIcon();

        imagepannel.add(photo);
        imagepannel.setBackground(Color.WHITE);

        add(imagepannel);
        add(btnPannel);

        pack();

    }

    public static void main(String args[]) {
        new ContactHomeForm().setVisible(true);

    }
}
