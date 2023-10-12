public class LinearEquation {
    // Variables that can be used only in this class and methods
    private double slope;
    private double yIntercept;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String slopeInterceptForm;
    private double distance;
    private double yValue;

    //Calls the calculations
    public LinearEquation(String coordinate1,String coordinate2) {
            coordinateConversion(coordinate1, coordinate2);
            slopeFinder();
            yInterceptFinder();
            slopeInterceptFormCalculator();
            distanceFinder();

    }

    //Converts the coordinates into an easier format to calculate
    public void coordinateConversion(String coordinate1,String coordinate2){
        x1 = Double.parseDouble(coordinate1.substring(1,coordinate1.indexOf(",")));
        y1 = Double.parseDouble(coordinate1.substring(coordinate1.indexOf(",") + 1,coordinate1.length()-1));

        x2 = Double.parseDouble(coordinate2.substring(1,coordinate2.indexOf(",")));
        y2 = Double.parseDouble(coordinate2.substring(coordinate2.indexOf(",") + 1,coordinate2.length()-1));
    }

    //Calculates the slope
    private void slopeFinder() {
       if (x1 == x2){
           return;
       }
       else {

           slope = (y2 - y1) / (x2 - x1);
           slope = (double) Math.round(slope * 100) / 100;
       }
    }

    //calculates the y intercept
    private void yInterceptFinder() {
        yIntercept = y1 - (slope*x1);
        yIntercept = (double) Math.round(yIntercept * 100) /100;

    }

    //calculates the slope intercept form of the coordinates
    public String slopeInterceptFormCalculator() {
        slopeInterceptForm = " y = " + (y2-y1) + "/" + (x2-x1) + "x+  " + yIntercept;
        return slopeInterceptForm;
    }

    //calculates the distance between the coordinates
    private void distanceFinder() {
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        distance = (double) Math.round(distance * 100) /100;
    }

    //calculates the y value given the x value
    public String yValueCalculator(double xValue) {
        yValue = (xValue*slope) + yIntercept;
        return "(" + xValue + "," + yValue + ")";
    }

    //formats the print statements of the information the user receives after inputting their coordinates
    public String toString() {
        return "First pair: (" + x1 + "," + y1 + ")\n" +
                "Second pair: (" + x2 + "," + y2 + ")\n" +
                "Slope of line: " + slope + "\n" +
                "Y-intercept: " + yIntercept+ "\n"
                + " Slope intercept form: " + slopeInterceptForm + "\n" +
                "Distance between points: " + distance;
    }
}


