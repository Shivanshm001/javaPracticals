//StringBuffer

class Main{
    public static void print(Object msg){
        System.out.println(msg);
        System.out.println();
    }
    public static void main(String[] args) {
        StringBuffer text =
                new StringBuffer("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        StringBuffer firstName = new StringBuffer("Shivansh");

        print("Append a string at the end : ");
        print(firstName.append(" Mishra"));
        print("Insert string at specified index : ");
        print(firstName.insert(0, "Name : "));
        print("Delete a portion from start index upto end index : ");
        print(text.delete(0,15));
        print("Remove a character at specific location : ");
        print(firstName.deleteCharAt(0));
        print("Reverse a string : ");
        print(firstName.reverse());
        firstName.reverse(); //
        print("Replace the characters from start to end index : ");
        print(firstName.replace(0,5,"____"));

    }
}