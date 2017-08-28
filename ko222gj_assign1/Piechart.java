package ko222gj_assign1;

import java.awt.Color;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
public class Piechart{

 
 public static void main(String[] args) {
 
   
  org.knowm.xchart.PieChart chart = new PieChartBuilder().width(800).height(600).title("Score Histogram").title("score").title("Number").build();
  //chart.getStyler().setSeriesColors(sliceColors);
// Customise Chart
Color[] sliceColors = new Color[] { new Color(224, 68, 14), new Color(230, 105, 62), new Color(236, 143, 110), new Color(243, 180, 159), new Color(246, 199, 182) };
chart.getStyler().setSeriesColors(sliceColors);
  
// Series
            chart.addSeries("Gold", 24);
   chart.addSeries("Silver", 21);
   chart.addSeries("Platinum", 39);
   chart.addSeries("Copper", 17);
   chart.addSeries("Zinc", 40);
   
  
   new SwingWrapper<PieChart>(chart).displayChart();;
  }
   
  
 
 }
