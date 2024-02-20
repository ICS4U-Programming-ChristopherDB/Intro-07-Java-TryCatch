package com.example;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculates the volume of a sphere.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 15-2-2024
 */

// VolSphere class
public final class TryCatch {

  /** Private constructor to prevent instantiation. */
  private VolSphere() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    // Instantiating scanner object to read user input.
    Scanner sc = new Scanner(System.in);
    // Hardcoded three decimal places for the decimal formatter.
    final String decimalString = "0.000";
    final DecimalFormat decimalFormatter = new DecimalFormat(decimalString);
    // Asks the user to enter the radius of the sphere.
    System.out.print("Enter the radius of your sphere: ");
    // Try-catch to catch invalid radius input.
    try {
      final double userRadius = sc.nextDouble();
      // Condition executed if a positive radius is entered.
      if (userRadius > 0) {
        sc.nextLine();
        System.out.print("\nEnter the units of the radius: ");
        // Gets the units of the radius.
        final String inputUnits = sc.nextLine() + "^3";
        // Calculation broken into two steps to prevent long line
        final double halfCalculation = (4.0f / 3.0f) * Math.PI;
        final double sphereVolume = halfCalculation * Math.pow(userRadius, 3);
        // Formats the volume to three decimal places.
        final String formattedVolume = decimalFormatter.format(sphereVolume);
        // Prints the volume of the sphere.
        System.out.println("The volume is: " + formattedVolume + inputUnits);
      } else {
        System.out.println("You must enter a positive radius.");
      }

    } catch (Exception e) {
      System.out.println("You must enter a number!");
    }
  }
}
