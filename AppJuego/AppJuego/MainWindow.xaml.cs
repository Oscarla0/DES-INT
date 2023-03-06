using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace AppJuego
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Window1 ventana = new Window1();

            this.Visibility = Visibility.Hidden;
            ventana.ShowDialog();

        }

        private void Button_Click_Inicio(object sender, RoutedEventArgs e)
        {
            MainWindow ventana = new MainWindow();

            this.Visibility = Visibility.Hidden;
            ventana.ShowDialog();
        }
    }
}
