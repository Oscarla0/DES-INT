package aplications2;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedAreaChart;


public class GraficosController {


    @FXML
    private LineChart<?, ?> linechart;

    @FXML
    private CategoryAxis linechartcatX;

    @FXML
    private NumberAxis linechartnumbY;
	
    @FXML
    private PieChart piechart;
	
    @FXML
    private StackedAreaChart<?, ?> stackedAreaChart;

    @FXML
    private NumberAxis stackednumberX;

    @FXML
    private NumberAxis stackednumberY;
    
    @FXML 
   private void initialize() {
		// Rellenamos los datos del gráfico
		ObservableList<PieChart.Data> piechartinfo = FXCollections.observableArrayList(
                new PieChart.Data("Bebidas",12),
                new PieChart.Data("Frutas",10),
                new PieChart.Data("Panaderia",7.5),
                new PieChart.Data("Lacteos y derivados",7.5),
                new PieChart.Data("Carniceria",9),
                new PieChart.Data("Cereales y derivados",8));

		piechart.setData(piechartinfo);
		piechart.setStartAngle(90);

	}
    
}
