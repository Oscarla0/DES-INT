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
using System.Windows.Shapes;

namespace AppJuego
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        public Window1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Window2 ventana = new Window2();
            this.Visibility = Visibility.Hidden;
            ventana.Owner = this;
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
