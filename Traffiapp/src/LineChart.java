/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 /*
 * @author thasiii
 */

//Created by : Thasina Thamilnesan (ID: w1728662)
  public class LineChart {

   public static void main( String[ ] args ) throws Exception {
      DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        line_chart_dataset.setValue (69 , "lgvs (Large Goods Vehicles)" ,"A3022"  );
        line_chart_dataset.setValue (244, "lgvs (Large Goods Vehicles)" , "A380" );
        line_chart_dataset.setValue (22, "lgvs (Large Goods Vehicles)","A385 " );
        line_chart_dataset.setValue (102, "lgvs (Large Goods Vehicles)","A379 " );
        line_chart_dataset.setValue (51, "lgvs (Large Goods Vehicles)","B3199" );
        line_chart_dataset.setValue (35, "lgvs (Large Goods Vehicles)","C" );
        line_chart_dataset.setValue (15, "lgvs (Large Goods Vehicles)","U" );
        

      JFreeChart lineChartObject = ChartFactory.createLineChart(
         "Contribution of lgvs","Road Names",
         "lgvs",
         line_chart_dataset,PlotOrientation.VERTICAL,
         true,true,false);

      int width = 648 ;    /* Width of the image */
      int height = 326 ;   /* Height of the image */ 
      File lineChart = new File( "Contribution of lgvs.png" ); 
      ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);
   }
}
   
   

