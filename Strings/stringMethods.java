class stringMethods
{
public static void main(String[]args)
{
String s="RAMESH Ramesh Ramesh!";
String s1="HELLO,hi,WORLD!,universe";
StringBuffer sb=new StringBuffer("ramesh");
System.out.println("the length of the given string is  "+s.length()); //.length() is used to find the length of the string
System.out.println(s.isEmpty()); //.isEmpty() is used to check whether the string instance contain any value or not.
System.out.println(s.charAt(3)+" is the 3rd indexed char from  the given string"); //.charAt(int) is used to select a spcific char from a given string based on the index number.
System.out.println(s.codePointAt(4)+" is the ASCII number of the char carring the index of 4"); //.codePointAt(int) is used to return the ASCII number of the given indexed char.
System.out.println(s.codePointBefore(2)+" is the ASCII number of the char carring the before  the specified index"); //.codePointBefore(int) is same as the codepointAt() but this gives ASCII number of char carring the before  the specified index.
System.out.println(s.codePointCount(1,5)+"is the NUMBER of the char's which are in the range of 1-4");// .codePointCount(int, int) is used to return the multiple ASCII numbers of the char's in the given range of indexes.
System.out.println(s.equals("ramesh"));//.equals(java.lang.Object) is used to compare two values which are present in the variables or instances 
System.out.println(s.contentEquals(sb));//.contentEquals(java.lang.StringBuffer) is used to compare the string and the stringbuffer.
System.out.println(s.contentEquals("pepsi"));//.contentEquals(java.lang.CharSequence) is used to compare the string with the given sequence of the char's. 
System.out.println(s.equalsIgnoreCase("ramesh"));//.equalsIgnoreCase(java.lang.String) is used to compare the two strings without worrying about the case sensitivity.
System.out.println(s.compareTo("ramesh"));//.compareTo(java.lang.String) is used to compare the two string based on their ASCII values,It helps to determine the order of strings. 	 
System.out.println(s.compareToIgnoreCase("ramesh"));//.compareToIgnoreCase(java.lang.String) is same as the compareTo(java.lang.String),in this it ignores the case sensitivity.
System.out.println(s.startsWith("R",0));//.startsWith(java.lang.String, int) is used to  checks if a string starts with the specified prefix, beginning at a specified index.
System.out.println(s.startsWith("r"));//.startsWith(java.lang.String) is used to check if a string starts with the specified string.
System.out.println(s.endsWith("D"));//.endsWith(java.lang.String) is used to check if a string ends with the specifed string.
System.out.println(s1.hashCode());//.hashCode() is used to  get a hash code value for the object (-ve or +ve).
System.out.println(s.indexOf("R"));//.indexOf(int) is used find the index value of the specified char.	
System.out.println(s.indexOf("R",1));//.indexOf(int, int) is same as the .indexOf(int) but when we have two similar words in the same string we can find the index of the specified char by giving the start index where it starts to search.
System.out.println(s.lastIndexOf("m"));//.lastIndexOf(int) is used to find the last occurrence of a specified character within a string.
System.out.println(s.lastIndexOf("m",12));//.lastIndexOf(int, int) is same as the .lastIndexOf(int) but it search the index of specified char by moving backward from the given index.
System.out.println(s.indexOf("h"));//.indexOf(java.lang.String) is  used to return the index of the specified char from the given string.
System.out.println(s.substring(7));//.substring(int) is used to extract a portion of a string starting from a specified index all the way to the end of the string.
System.out.println(s.substring(0,4));//.substring(int, int) is used to extract a portion of a string, starting from a specified beginIndex and ending at a specified endIndex.
System.out.println(s.subSequence(7,14));//.subSequence(int, int) is similar to substring(int, int), but it returns a CharSequence instead of a String.
System.out.println(s.concat(s1));//.concat(java.lang.String) is used to addup or concatinate two strings.
System.out.println(s.replace("R","S"));//.replace(char, char) is used to replace a specified char into another specified char.
System.out.println(s.matches(s1));//.matches(java.lang.String) is used to check the specified string match together or not.
System.out.println(s.contains("ramesh"));//.contains(java.lang.CharSequence) is used to check whether the specified string conatin in another specified one(main string).
System.out.println(s.replaceFirst("Ramesh","THARUN"));//.replaceFirst(java.lang.String, java.lang.String) is used to replace the first substring of this string that matches the given regular expression with the given replacement.
System.out.println(s.replaceAll("Ramesh","ThArun"));//.replaceAll(java.lang.String, java.lang.String) is used to replace each substring of this string that matches the given regular expression with the given replacement.
System.out.println(s1.replace("WORLD","Universe"));//.replace(java.lang.CharSequence, java.lang.CharSequence) is used to replace all occurrences of a specified target sequence with a specified replacement sequence in a string.
System.out.println(s.toLowerCase(Locale.US));//.toLowerCase(java.util.Locale) is used to convert all of the characters in a string to lower case using the rules of the specified Locale.
System.out.println(s.toLowerCase());//.toLowerCase() is used to convert all the char's into lowercase without any Locale.
System.out.println(s.toUpperCase(Locale.US));//.toUpperCase(java.util.Locale) is used to convert all of the characters in a string to upper case using the rules of the specified Locale. 
System.out.println(s.toUpperCase());//.toUpperCase() is used to convert all the char's into UPPERcase without any Locale.
System.out.println(s.trim());//.trim() is used remove any leading and trailing whitespace from a string. It's a simple yet powerful way to clean up a string.
System.out.println(s.strip());//.strip() is used to remove any leading and trailing whitespace from a string, similar to trim(), but it also removes other types of whitespace characters that trim() might miss.
System.out.println(s.isBlank());
}
}