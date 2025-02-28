/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cameracostcomparisons;

/**
 *
 * @author Confidence
 */
public class CameraCostComparisons {

    public static void main(String[] args) {
        // Define the camera manufacturers
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        
        // Define the prices for Mirrorless and DSLR cameras
        double[][] prices = {
            {10500, 8500}, // Prices for CANON
            {9500, 7200},  // Prices for SONY
            {12000, 8000}  // Prices for NIKON
        };
        
        // Array to store cost differences
        double[] costDifferences = new double[manufacturers.length];
        
        // Variable to track the maximum cost difference
        double maxDifference = 0;
        String maxManufacturer = "";
        
        // Print report header
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.printf("%-10s %-10s %-10s%n", "", "MIRRORLESS", "DSLR");
        
        // Loop through the manufacturers and print their prices
        for (int i = 0; i < manufacturers.length; i++) {
            System.out.printf("%-10s R %.2f R %.2f%n", manufacturers[i], prices[i][0], prices[i][1]);
        }
        
        // Print results header
        System.out.println("\nCAMERA TECHNOLOGY RESULTS");
        System.out.println("-------------------------");
        
        // Calculate cost differences and find the maximum
        for (int i = 0; i < manufacturers.length; i++) {
            // Calculate the difference between Mirrorless and DSLR prices
            costDifferences[i] = prices[i][0] - prices[i][1];
            System.out.printf("%-10s R %.2f", manufacturers[i], costDifferences[i]);
            
            // Check if the difference is greater than or equal to R2500
            if (costDifferences[i] >= 2500) {
                System.out.print(" ***");
            }
            System.out.println();
            
            // Update the maximum difference and manufacturer
            if (costDifferences[i] > maxDifference) {
                maxDifference = costDifferences[i];
                maxManufacturer = manufacturers[i];
            }
        }
        
        // Print the manufacturer with the greatest cost difference
        System.out.printf("%nCAMERA WITH THE MOST COST DIFFERENCE: %s%n", maxManufacturer);
    }
}
    
