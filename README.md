Demonstrate with a Java Project.
How to fetch all the links on a webpage?
Navigate to the desired webpage
Get list of WebElements with tagname ‘a’ using driver.findElements()-
List<WebElement> allLinks = driver.findElements(By.tagName(“a”));
Traverse through the list using for-each loop
Print the link text using getText() along with its address using getAttribute(“href”)
System.out.println(link.getText() + ” – ” + link.getAttribute(“href”));


**here i have navigated to google.com home page and retrived all lings of webelement having tagname 'a'**
