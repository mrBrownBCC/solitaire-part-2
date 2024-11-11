Setup Steps:
1) Go to the ports tab. Click "Add port" and type the number 6080. 
2) Follow the link to your forwarded address. This is where your GUI should be available once you run your code


Programming Instructions:
(All code should be added within App.java)

For this part of the project, we’ll focus on creating the layout for your solitaire game using BorderLayout and GridLayout. Follow these instructions to set up each section and add placeholder text.

1) Create the Main Frame: Start by creating a JFrame to hold your game layout. Set the JFrame's layout to BorderLayout. Make sure to set the frame to visible!
2) Create a JPanel for Each BorderLayout Section: We will use the five main areas in BorderLayout: NORTH, SOUTH, EAST, WEST, and CENTER.
3) Top Panel (NORTH): Create a JPanel for the top section. Set it to be visible in the NORTH area of the BorderLayout.
Add a JLabel with the text "Your Name's Solitaire" (replace "Your Name" with your actual name) and add this to the top panel.
4) Left Panel (WEST): Create another JPanel for the left section, which will represent the "pile" area. Label it as "Pile" and add this panel to the WEST area.
5) Main Play Area (CENTER):This is where the seven main stacks will go. Create a JPanel "playArea" and set its layout to GridLayout with one row and seven columns. Use a loop to create seven JPanels, each representing a "stack." Inside each, add a JLabel with the text "Stack 1", "Stack 2", etc. Add each stack to playArea, then add playArea to the CENTER area.
6) Bottom Panel (SOUTH): Create a JPanel for the bottom section, which can hold any information or additional text you’d like.

Testing:
To test your code, open the GUI you create!

Submission:
Run the following 3 commands in the terminal:
1) git add . 
2) git commit -m "Submitting my code"
3) git push

Additional Resources:

Layout resources are provided in Canvas. 

https://docs.oracle.com/javase/tutorial/uiswing/components/index.html 

https://www.youtube.com/channel/UCV9MhzHCMx0Y83b5F8HWv-Q 

https://www.youtube.com/watch?v=mDxEGtMNPtA 