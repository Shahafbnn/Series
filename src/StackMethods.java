public class StackMethods {
    public static <T> boolean contains(Stack<T> s, T x) {
        boolean found = false;
        Stack<T> temp = new Stack<>();
        T currentVal;

        // Counting while preserving the values of s in temp:
        while (!s.isEmpty() && !found) {
            // Removing the last value from the stack:
            currentVal = s.pop();
            // Checking if it is equal to the given value:
            found = currentVal.equals(x);
            // Adding the removed value to temp for later preservation:
            temp.push(currentVal);
        }

        // Restoring the values in s since it's now empty:
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        return found;
    }
}
