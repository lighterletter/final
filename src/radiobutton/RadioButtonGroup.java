package radiobutton;

import java.util.Scanner;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 * <p/>
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {
    private int numOfButtons;
    private int selectedButton;

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons The number of buttons in the group.
     * @param initial    The button number that is initially selected.
     * @raise RuntimeException
     * The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        // TODO: Implement this method.
        checkValidInput(numButtons, initial);
        numOfButtons = numButtons - 1;
        for (int i = 0; i < numOfButtons; i++) {

                selectedButton = initial;
        }
    }

    private void checkValidInput(int numOfButtons, int selectedButton) {
        if (selectedButton >= numOfButtons) {
            throw new RuntimeException("invalid input: button does not exist");
        }
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
        numOfButtons = numButtons - 1;
        checkValidInput(numOfButtons, selectedButton);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     *
     * @param button The button number to select.
     * @raise RuntimeException
     * The button number is invalid.
     */
    public void select(int button) {
        // TODO: Implement this method.
        checkValidInput(numOfButtons, button);
        selectedButton = button;
    }

    /**
     * Returns whether a given button is selected.
     *
     * @param button The button number to check.
     * @raise RuntimeException
     * The button number is invalid.
     */
    public boolean isSelected(int button) {
        // TODO: Implement this method.
        return button == selectedButton;
    }

    public int getSelectedButton() {
        return selectedButton;
    }

    public int getNumOfButtons() {
        return numOfButtons;
    }

    // TODO: Add attributes and helper methods as needed.

    public static void main(String[] args) {
        RadioButtonGroup radio = new RadioButtonGroup(4,3);
        System.out.println("Radio buttons created starting at 0, number of buttons : " + radio.getNumOfButtons());
        System.out.println("Current selected button: " + radio.getSelectedButton());
        System.out.println("Selecting button: 2 " );
        radio.select(2);
        System.out.println();
        System.out.println("Is 4 selected: "+ radio.isSelected(4));
        System.out.println("Is 3 selected: "+ radio.isSelected(3));
        System.out.println("Is 2 selected: "+ radio.isSelected(2));
        System.out.println("Is 1 selected: "+ radio.isSelected(1));
        System.out.println("Is 0 selected: "+ radio.isSelected(0));
        System.out.println();
        System.out.println("Selected button: "+ radio.getSelectedButton());
        System.out.println("number of buttons: " + radio.getNumOfButtons());

    }

}
