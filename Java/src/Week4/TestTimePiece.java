package Week4;

public class TestTimePiece
{
    public static void main(String args[])
    {
        TimePiece myWatch = new TimePiece("Digital Watch", 12.99, "",9, 45, true);
        TimePiece bigBen = new TimePiece("Analog Watch", 100000, "", 0,0, false);

        bigBen.displayDetails();
        System.out.println("The time is " + myWatch.showTime());
        myWatch.setHours(10);
        myWatch.setMinutes(50);
        bigBen.setTime(22,55);
        bigBen.updateTime(2,5);
        myWatch.displayDetails();
        bigBen.displayDetails();
        System.out.println("There were " + TimePiece.numberOfTimePieces() + " Time pieces created.");
    }
}
