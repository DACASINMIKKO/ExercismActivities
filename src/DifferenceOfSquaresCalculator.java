public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input){
        int sum = 0;
        for (int i = 0; i <= input; i++){
            sum += i;
        }
        int ans = sum*sum;
        return ans;
    }

    public int computeSumOfSquaresTo(int input){
        int sum = 0;
        for (int i = 0; i <= input; i++){
            sum += (i * i);
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int input){
        int answer = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return answer;
    }
}
