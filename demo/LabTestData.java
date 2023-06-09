package com.example;

// file io
import java.io.FileReader;
import java.io.FileWriter;

public class LabTestData {

  public TestData[] data;

  public LabTestData() {
    data = new TestData[2];

    String[] socks = { "Volvo", "BMW", "Ford", "Mazda" };
    TestData d = new TestData();
    d.input = socks;
    d.output = true;
    data[0] = d;

    TestData d2 = new TestData();
    d2.input = socks;
    d2.output = true;
    data[1] = d2;
  }

  // reads a json string from a file
  public String readJSON(String filepath) {
    String result = "";

    // open file, if the file exists

    try {
      FileReader file = new FileReader(filepath);
      // read the file
      int ch;
      while ((ch = file.read()) != -1) result += (char) ch;

      // close file
      file.close();
    } catch (Exception e) {
      System.out.printf("ERROR: Unable to read the file %s\n", filepath);
    }

    return result;
  }

  // writes a json string to a file
  public void writeJSON(String filepath, String json) {
    try {
      // open file
      FileWriter file = new FileWriter(filepath);

      // write json string
      for (int i = 0; i < json.length(); i++) file.write(json.charAt(i));

      // close file
      file.close();
    } catch (Exception e) {
      System.out.printf("ERROR: Unable to write the file %s\n", filepath);
    }
  }
}
