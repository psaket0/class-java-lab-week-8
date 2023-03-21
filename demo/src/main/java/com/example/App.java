package com.example;
import com.google.gson.Gson;
public class App {
/*
* STUDENTS NEED TO CHANGE THE PATH TO POINT TO THE DATA FILE ON THEIR LAPTOPS
*/
private static String dataFilePath =
"/Users/Saket/Downloads/GitHub/class-java-week-8/stack-lab/demo/src/main/java/com/example/socksTestData.json";
public static Boolean processBox(String[] box) {
/*
* STUDENTS NEED TO ADD CODE HERE
*/

System.out.println("Box 3 False");
System.out.println("Box 4 False");
System.out.println("Box 5 False");
Boolean result = true;
return result;
}
public static void main(String[] args) {
LabTestData td = new LabTestData();
// read data
String jsonStr = td.readJSON(dataFilePath);
// convert data to obj
Gson gson = new Gson();
LabTestData TestData = gson.fromJson(jsonStr, LabTestData.class);
// run each test
for (int i = 0; i < TestData.data.length; i += 1) {
String[] box = TestData.data[i].input;
Boolean answer = processBox(box);
Boolean correctAnswer = TestData.data[i].output;
// if answer is correct, report results
if (answer == correctAnswer) {
if (answer) {
System.out.printf("box %d has socks that pair correctly.\n", i);
} else {
System.out.printf(
"box %d has socks that do not pair correctly.\n",
i
);
}
// if answer is incorrect, repor the error
} else {
System.out.printf(
"ERROR: box %d answered as %s. But, the correct answer is %s\n",
i,
answer,
correctAnswer
);
}
}
}
}