package aplications2;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Grafico2Controller {
	
    @FXML
    private LineChart<String, Number> linechart;

    @FXML
    private CategoryAxis linechartcatX;

    @FXML
    private NumberAxis linechartnumbY;
    @FXML
	public void initialize() {
		
    	XYChart.Series serie1= new XYChart.Series<String, Number>();
    	serie1.setName("2018");
    	serie1.getData().add(new XYChart.Data<String, Number>("Enero",8000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Febrero",12000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Marzo",14000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Abril",15000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Mayo",21000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Junio",13000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Julio",18000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Agosto",19000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Septiembre",23000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Octubre",20000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Noviembre",34000));
    	serie1.getData().add(new XYChart.Data<String, Number>("Diciembre",40000));
    	linechart.getData().addAll(serie1);
    	
    	
    	XYChart.Series serie2= new XYChart.Series<>();
    	serie2.setName("2023");
    	serie2.getData().add(new XYChart.Data<String, Number>("Enero",20000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Febrero",15000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Marzo",9000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Abril",17000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Mayo",15000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Junio",14000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Julio",12000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Agosto",10000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Septiembre",13000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Octubre",18000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Noviembre",21000));
    	serie2.getData().add(new XYChart.Data<String, Number>("Diciembre",29000));


    	
    	linechart.getData().addAll(serie2);
    	
    }
}
