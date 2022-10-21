// Add a class FillInQuestion to the question hierarchy of Section 9.1. Such a question is constructed with a
// string that contains the answer, surrounded by _ _, for example, "The inventor of Java was _James Gosling_".
// The question should be displayed as The inventor of Java was ____ .
public class FillInQuestion extends Questions{
    public void setText(String text)
    {
       super.setText(text);
    }
    public void display()
    {
        int i = 0;
        while (i<text.length()) {
            if (text.charAt(i) == '_') break;
            System.out.print(text.charAt(i));
            i++;
        }
        System.out.println("____");
    }
    public String getTextWithAnswer()
    {
        return text;
    }
}


