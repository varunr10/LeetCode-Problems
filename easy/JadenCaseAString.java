/*
Capitalize the first letter of each word like Jaden Smith's tweets :P

If String is null or empty, return null.
If String is already jaden-cased, return the message;
Else Convert it into Jaden Case.

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

*/

public class JadenCaseAString {
	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
		
    if(phrase == "" || phrase == null)
		  return null;
    
    StringBuilder output = new StringBuilder();
    
    for(int i = 0; i < phrase.length(); i++){
      if(i == 0){
        output.append(Character.toUpperCase(phrase.charAt(i)));
        i += 1;
      }
      else if(phrase.charAt(i) == ' ' ){
        output.append(" ");
        output.append(Character.toUpperCase(phrase.charAt(i+1)));
        i += 2;
      }
      else{
        output.append(phrase.charAt(i));
        i += 1;
      }
    }
    System.out.println(output.toString());
    return output.toString();
	}
}
