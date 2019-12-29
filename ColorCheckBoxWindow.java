public class ColorCheckBoxWindow extends JFrame
{
   private JLabel messageLabel;      // A message to the user
   private JCheckBox yellowCheckBox; // To select yellow background
   private JCheckBox redCheckBox;    // To select red foreground
   private final int WINDOW_WIDTH = 300;  // Window width
   private final int WINDOW_HEIGHT = 200; // Window height

   /**
      Constructor
   */

   public ColorCheckBoxWindow()
   {
      // Set the text for the title bar.
      setTitle("Color Check Boxes");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a label.
      messageLabel = new JLabel("Select the check " +
                          "boxes to change colors.");

      // Create the check boxes.
      yellowCheckBox = new JCheckBox("Yellow background");
      redCheckBox = new JCheckBox("Red foreground");

      // Add an item listener to the check boxes.
      yellowCheckBox.addItemListener(new CheckBoxListener());
      redCheckBox.addItemListener(new CheckBoxListener());

      // Add a FlowLayout manager to the content pane.
      setLayout(new FlowLayout());

      // Add the label and check boxes to the content pane.
      add(messageLabel);
      add(yellowCheckBox);
      add(redCheckBox);

      // Display the window.
      setVisible(true);
   }
