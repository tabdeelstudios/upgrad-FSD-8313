public class HelloWorld {
    public static void main(String[] args) {
        // Strings
        // String userEmail = " testuser100@hello.com ";
        // int length = userEmail.length();
        // System.out.println(length);
        // String updatedEmail = userEmail.trim();
        // System.out.println(userEmail);
        // System.out.println(updatedEmail.toUpperCase());

        // Increment Decrement
        // int a = 10;
        // System.out.println(--a);
        // System.out.println(a);

        // Compound
        // int result = 17;
        // result += 10;
        // System.out.println(result);

        // Decision Making
        // float billAmount = 18000.00f;
        // float discount = 0.00f;

        // 1. If
        // if (billAmount > 10000) {
        // discount = 0.10f;
        // }

        // 2. If Else
        // if (billAmount > 10000) {
        // discount = 0.10f;
        // } else {
        // discount = 0.05f;
        // }

        // 3. Else If Ladder
        // if (billAmount > 10000) {
        // discount = 0.1f;
        // } else if (billAmount > 7500) {
        // discount = 0.075f;
        // } else if (billAmount > 5000) {
        // discount = 0.05f;
        // } else {
        // discount = 0.025f;
        // }

        // 4. Ternary Operator
        // (condition) ? what if true : what if false ;
        // discount = billAmount > 10000 ? 0.10f : 0.05f;

        // 5. Switch
        // int choice = 1;

        // switch (choice) {
        // case 1:
        // System.out.println("Choice is 1");
        // break;
        // case 2:
        // System.out.println("Choice is 2");
        // break;
        // case 3:
        // System.out.println("Choice is 3");
        // break;
        // default:
        // System.out.println("Invalid choice!");
        // }

        // fall through

        boolean isMember = false;
        float billAmount = 10000.00f;

        // if (isMember == false && billAmount > 5000.00) {
        // System.out.println("Discount applied!");
        // }

        // if (isMember == true || billAmount > 5000.00) {
        // System.out.println("Discount applied!");
        // }

        System.out.println(isMember);
        System.out.println(!isMember);

        // System.out.println("The discount is : " + discount);
    }
}