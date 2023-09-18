public class ReviewTester
{
    public static void main(String[] args)
    {
        Review review = new Review();
        
        // String fileName = "simpleReview.txt";
        String fileName = "oppenheimerReview.txt";
        
        double totalSentiment = review.totalSentiment(fileName);
        System.out.println(totalSentiment);
        
        double starRating = review.starRating(fileName);
        System.out.println(starRating);
    }
}