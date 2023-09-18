public class ReviewTester
{
    public static void main(String[] args)
    {
        Review review = new Review();
        
        String reviewText = "This was a terrible restaurant! The pizza crust was too chewy, and I disliked the pasta. I would definitely not come back.";
        // String reviewText = "Oppenheimer marks another engrossing achievement from Christopher Nolan that benefits from Murphy's tour-de-force performance and stunning visuals.";
        
        double totalSentiment = review.totalSentiment(reviewText);
        System.out.println(totalSentiment);
        
        double starRating = review.starRating(reviewText);
        System.out.println(starRating);
    }
}