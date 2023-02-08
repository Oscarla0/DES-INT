package aplications2;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;

public class Grafico3Controller {

	
    @FXML
    private StackedAreaChart<Number, Number> stackedAreaChart;

    @FXML
    private NumberAxis stackednumberX;

    @FXML
    private NumberAxis stackednumberY;
	
	
    @FXML
    public void initialize() {
    	XYChart.Series serie1= new XYChart.Series<Number, Number>();
    	serie1.setName("2023");
    	serie1.getData().add(new XYChart.Data<Number, Number>(0,5000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(1,8000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(2,12000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(3,14000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(4,15000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(5,21000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(6,13000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(7,18000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(8,19000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(9,23000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(10,20000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(11,34000));
    	serie1.getData().add(new XYChart.Data<Number, Number>(12,40000));
    	
    	
    	stackedAreaChart.getData().addAll(serie1);
    	XYChart.Series serie2= new XYChart.Series<Number, Number>();
    	serie2.setName("2018");
    	serie2.getData().add(new XYChart.Data<Number, Number>(0,5000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(1,8000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(2,12000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(3,14000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(4,15000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(5,21000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(6,13000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(7,18000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(8,19000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(9,23000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(10,20000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(11,34000));
    	serie2.getData().add(new XYChart.Data<Number, Number>(12,40000));
    	
    	
    	stackedAreaChart.getData().addAll(serie2);
    	
    }
}
