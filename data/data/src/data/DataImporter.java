package data;

//DataImporter.java
abstract class DataImporter {
 
 public final void importData() {
     readData();
     parseData();
     validateData();
     saveData();
 }

 protected void readData() {
     System.out.println("Reading data from file...");
 }

 protected abstract void parseData();

 protected abstract void validateData();

 protected void saveData() {
     System.out.println("Saving data to database...");
 }
}
