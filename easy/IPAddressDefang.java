/* Replace . in an IP Address to [.] using StringBuilder approach

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

Optimal Solution:
1) Traverse through the String, if it is a '.', append '[.]' to the String builder
                             if it's not, append the same to the String Builder
2) Convert StringBuilder.toString and return


TimeComplexity O(n)
*/

class IPAddressDefang {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
             if (address.charAt(i) == '.'){
                sb.append("[.]");
             }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
