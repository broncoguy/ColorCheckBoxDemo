private class CheckBoxListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
         // Determine which check box was clicked.
         if (e.getSource() == yellowCheckBox)
         {
            // Is the yellow check box selected? If so, we
            // want to set the background color to yellow.
            if (yellowCheckBox.isSelected())
            {
               // The yellow check box was selected. Set
               // the background color for the content
               // pane and the two check boxes to yellow.
               getContentPane().setBackground(Color.yellow);
               yellowCheckBox.setBackground(Color.yellow);
               redCheckBox.setBackground(Color.yellow);
            }
            else
            {
               // The yellow check box was deselected. Set
               // the background color for the content
               // pane and the two check boxes to light gray.
               getContentPane().setBackground(Color.lightGray);
               yellowCheckBox.setBackground(Color.lightGray);
               redCheckBox.setBackground(Color.lightGray);
            }
         }
         else if (e.getSource() == redCheckBox)
         {
            // Is the red check box selected? If so, we want
            // to set the forground color to red.
            if (redCheckBox.isSelected())
            {
               // The red check box was selected. Set the
               // foreground color for the label and the
               // two check boxes to red.
               messageLabel.setForeground(Color.red);
               yellowCheckBox.setForeground(Color.red);
               redCheckBox.setForeground(Color.red);
            }
            else
            {
               // The red check box was deselected. Set the
               // foreground color for the label and the
               // two check boxes to black.
               messageLabel.setForeground(Color.black);
               yellowCheckBox.setForeground(Color.black);
               redCheckBox.setForeground(Color.black);
            }
         }
      }
   }
   
