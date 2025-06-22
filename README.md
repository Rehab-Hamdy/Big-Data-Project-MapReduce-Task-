# 🗂️ Product Review Summary - Hadoop MapReduce

This project calculates the **average review rating for each product category** using **Hadoop MapReduce**.

## 📌 What It Does

- Reads product review data from a CSV file
- Extracts all categories for each product
- Collects review ratings
- Calculates the **average rating per category** using Map and Reduce functions

## 🛠 Technologies Used

- Java
- Hadoop MapReduce
- HDFS

## 📁 Project Structure

- `PRSDriver.java`: Sets up and runs the MapReduce job
- `PRSMapper.java`: Maps each product category to its rating
- `PRSReducer.java`: Calculates the average rating per category

  ## 🧪 Input example
id,product_name,price,categories,...,rating,...
123,Phone,299,Electronics|Mobile,...,4,...

## 📤 Output example
Electronics 4.2
Mobile 3.9
Books 4.7
