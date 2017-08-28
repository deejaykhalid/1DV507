package ko222gj_assign1;

import java.util.Arrays;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;


public class Histogram{
 
 public static void main(String[] args) { 
     // Generate data
     CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();
    
     chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
  chart.getStyler().setHasAnnotations(true);
  chart.getStyler().setChartTitleVisible(true);
   //chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
  
  
  
  
    
    
  
   chart.addSeries("test",Arrays.asList(new Integer[] { 100, 10, 1, 3, 100 }), Arrays.asList(new Integer[] {10, 5, 9, 6, 5 }));    
       
    
   // Display scatter plot
   // chart.addSeries("Gaussian Blob", xData, yData);

   new SwingWrapper(chart).displayChart();
 }
 
 }