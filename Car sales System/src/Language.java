
public class Language {


	private static int idioma = 0;
	private static final int cantIdiomas = 2;

	public static final int ENGLISH = 0;
	public static final int SPANISH = 1;


	public static void setIdioma (int i) {

		if ((i >= 0) && (i < cantIdiomas)) {
			idioma = i;
		}
	}

	// AboutDialog

	public static String getMensajeAbout () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Cars Sales System for TPEO 3 - PSS 2016"; break;
		case Language.SPANISH : mensaje = "Sistema de Venta de Autos para TPEO 3 - PSS 2016"; break;
		default : break;
		}

		return mensaje;
	}

	// AddCarPanel

	public static String getEtiquetaBtn1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Add a Car"; break;
		case Language.SPANISH : mensaje = "Agregar un auto"; break;
		default : break;
		}

		return mensaje;
	}

	public static String getEtiquetaBtn2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Reset"; break;
		case Language.SPANISH : mensaje = "Reiniciar"; break;
		default : break;
		}

		return mensaje;
	}

	public static String getEtiquetaBtn3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Save"; break;
		case Language.SPANISH : mensaje = "Guardar"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorKM () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An error has occured due to incorrect \"Km Traveled\" text field data.\nThis text field must contain a number with one decimal place only."; break;
		case Language.SPANISH : mensaje = "Un error ha ocurrido debido a un valor incorrecto en el campo \"Kilometraje\".\nEste campo de texto debe contener un número con un solo decimal."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorFoto () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An error has occured due to incorrect \"Car's photo\" text field data.\nThis text field must contain a string with at least 6 characters differents to white spaces."; break;
		case Language.SPANISH : mensaje = "Ocurrio un error debido a campos incorrectos en el campo\"Foto del vehiculo\".\nEste campo debe contener una cadena de al menos 6 caracteres que no sean espacios."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorModelo () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An error has occured due to incorrect \"Model\" text field data.\nThis text field must contain any string of at least two non-spaced characters."; break;
		case Language.SPANISH : mensaje = "Un error ha ocurrido debido a un valor incorrecto en el campo \"Modelo\".\nEste campo de texto debe contener cualquier cadena de al menos dos caracteres distintos del espacio."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorAnio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An error has occured due to incorrect \"Year\" text field data.\nThis text field must be in the form, YYYY. ie, 2007."; break;
		case Language.SPANISH : mensaje = "Un error ha ocurrido debido a un valor incorrecto en el campo \"Año\".\nEste campo de texto debe estar en la forma, AAAA. Es decir, 2007."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorFabricante () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An error has occured due to incorrect \"Manufacturer\" text field data.\nThis text field must contain any string of at least two non-spaced characters."; break;
		case Language.SPANISH : mensaje = "Un error ha ocurrido debido a un valor incorrecto en el campo \"Fabricante\".\nEste campo de texto debe contener cualquier cadena de al menos dos caracteres distintos del espacio."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorDesconocido () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "An unknown error has occured. Please ensure your fields meet the following requirements:\n" +
			"The \"Year\" field must contain four numeric digits only\nThe \"Price\" field must contain a valid integer with no decimal places\nThe \"Km Traveled\" field must contain a number which can have a maximum of one decimal place"; break;
		case Language.SPANISH : mensaje = "Un error desconocido ha ocurrido. Por favor asegurate de que tus campos cumplan los siguientes requerimientos:\n" +
			"El campo \"Año\" debe contener solo cuatro dígitos numéricos\nEl campo \"Precio\" debe contener un entero válido sin decimales\nEl campo \"Kilometraje\" debe contener un número con un máximo de un decimal"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorAutos () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The maximum amount of cars for that manufacturer has been reached.\nUnfortunately you cannot add any further cars to this manufacturer"; break;
		case Language.SPANISH : mensaje = "El número máximo de autos para ese fabricante ha sido alcanzado.\nDesafortunadamente no puedes agregar más autos a este fabricante"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorFabricantes () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The maximum amount of manufacturers in the car system has been reached.\nUnfortunately you cannot add any further manufacturers to this system"; break;
		case Language.SPANISH : mensaje = "El número máximo de fabricantes para el sistema de autos ha sido alcanzado.\nDesafortunadamente no puedes agregar más fabricantes a este sistema."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getCampoInvalido () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Invalid field"; break;
		case Language.SPANISH : mensaje = "Campo inválido"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getConfirmacion () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Confirmation"; break;
		case Language.SPANISH : mensaje = "Confirmación"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getTituloProblemaAutos () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Problem adding car"; break;
		case Language.SPANISH : mensaje = "Problema agregando auto"; break;
		default : break;
		}

		return mensaje;
	}
	
	// CarDetailsComponents
	
	public static String getAnio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Year"; break;
		case Language.SPANISH : mensaje = "Año"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getUltimoServicio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Ultimo servicio"; break;
		case Language.SPANISH : mensaje = "Last Service"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getModelo () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Model"; break;
		case Language.SPANISH : mensaje = "Modelo"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrecio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Price"; break;
		case Language.SPANISH : mensaje = "Precio"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getKM () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Km Traveled"; break;
		case Language.SPANISH : mensaje = "Kilometraje"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getInfoExtra () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Extra Information"; break;
		case Language.SPANISH : mensaje = "Información adicional"; break;
		default : break;
		}

		return mensaje;
	}
	
	// CarSalesSystem
	
	public static String getTitulo () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "My Car Company"; break;
		case Language.SPANISH : mensaje = "Mi Compañía de Autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getSubtitulo () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Car Sales System"; break;
		case Language.SPANISH : mensaje = "Sistema de Ventas de Autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getItemMenu1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "File"; break;
		case Language.SPANISH : mensaje = "Archivo"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getItemMenu2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Language"; break;
		case Language.SPANISH : mensaje = "Idioma"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getItemMenu3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "About"; break;
		case Language.SPANISH : mensaje = "Acerca de"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getItemMenu4 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Exit"; break;
		case Language.SPANISH : mensaje = "Salir"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getTituloFrame () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Car Sales"; break;
		case Language.SPANISH : mensaje = "Venta de autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The data file, 'cars.dat' doesn't exist. Plase create an empty file named 'cars.dat'"; break;
		case Language.SPANISH : mensaje = "El archivo de datos, 'cars.dat' no existe. Por favor cree un archivo vacío llamado 'cars.dat'"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The data file, 'cars.dat' is possibly corrupted. Please delete it and create a new empty data file named cars.dat"; break;
		case Language.SPANISH : mensaje = "El archivo de datos, 'cars.dat' posiblemente está corrupto. Por favor elimine el archivo y cree uno nuevo vacío llamadocars.dat"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "There was an error loading 'cars.dat'. Try deleting and creating a new empty file named 'cars.dat'"; break;
		case Language.SPANISH : mensaje = "Hubo un error cargando 'cars.dat'. Intente eliminándolo y creando un archivo nuevo vacío llamado 'cars.dat'"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint4 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Warning, 'public carsUpdated(CarEvent)' method does not exist in "; break;
		case Language.SPANISH : mensaje = "Advertencia, el método 'public carsUpdated(CarEvent)' no existe en "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint5 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = ". You will not receive any car update events"; break;
		case Language.SPANISH : mensaje = ". No recibiras ningun evento de actualizacion de autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrint6 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Warning, the 'public carUpdated(CarEvent)' method couldn't be called for unknown reasons, You will not receive any car update events"; break;
		case Language.SPANISH : mensaje = "Advertencia, el metodo 'public carUpdated(CarEvent)' no puedo ser llamado por razones desconocidas, No recibirás ningún evento de actualización de autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanelActual () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Current panel: "; break;
		case Language.SPANISH : mensaje = "Panel actual: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorDataFile () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The data file could not be written, possibly because you don't have access to this location.\nIf you chose No to retry you will lose all car data from this session.\n\nWould you like to reattempt saving the data file?"; break;
		case Language.SPANISH : mensaje = "El archivo de datos no pudo ser escrito, posiblemente debido a que no tiene acceso a esta locación.\nSi elige No reintentar va a perder toda la informacion de los autos de esta sesión.\n\nDesea reintentar guardar el archivo de datos?"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorDataFileTitulo () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Problem saving"; break;
		case Language.SPANISH : mensaje = "Problema al guardar"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getTituloErrorDataFile () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Problem saving data"; break;
		case Language.SPANISH : mensaje = "Problema guardando datos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getIngles () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "English"; break;
		case Language.SPANISH : mensaje = "Ingles"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getEspa�ol() {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Spanish"; break;
		case Language.SPANISH : mensaje = "Espa�ol"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanel1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Welcome"; break;
		case Language.SPANISH : mensaje = "Bienvenido"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanel2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Add a Car"; break;
		case Language.SPANISH : mensaje = "Agregar un auto"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanel3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Show all makes and models"; break;
		case Language.SPANISH : mensaje = "Mostrar todas las marcas y modelos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanel4 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search on age"; break;
		case Language.SPANISH : mensaje = "Buscar por antiguedad"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPanel5 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search on Price and Distance traveled"; break;
		case Language.SPANISH : mensaje = "Buscar por precio y kilometraje"; break;
		default : break;
		}

		return mensaje;
	}
	
	// SearchByAgePanel
	
	public static String getLabel1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search on age"; break;
		case Language.SPANISH : mensaje = "Búsqueda por antigüedad"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getLabel2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Car Age"; break;
		case Language.SPANISH : mensaje = "Antigüedad del auto"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getLabel3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search"; break;
		case Language.SPANISH : mensaje = "Búsqueda"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getLabel4 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Reset"; break;
		case Language.SPANISH : mensaje = "Reiniciar"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getLabel5 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Previous"; break;
		case Language.SPANISH : mensaje = "Anterior"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getLabel6 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Next"; break;
		case Language.SPANISH : mensaje = "Siguiente"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorSearch1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "You can't navigate any further"; break;
		case Language.SPANISH : mensaje = "No puede navegar más"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorSearch2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Sorry, no search results were returned"; break;
		case Language.SPANISH : mensaje = "Lo sentimos, no se han devuelto resultados de búsqueda."; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getFailBusqueda () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search failed"; break;
		case Language.SPANISH : mensaje = "Error en la búsqueda"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getAlert () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Alert"; break;
		case Language.SPANISH : mensaje = "Alerta"; break;
		default : break;
		}

		return mensaje;
	}
	
	// SearchBYOtherPanel
	
	// REUSAR VARIOS DEL PANEL SearchByAge
	
	public static String getBusqueda1 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Search on Price and Distance Traveled"; break;
		case Language.SPANISH : mensaje = "Buscar por precio y kilometraje"; break;
		default : break;
		}

		return mensaje;
	}
	
	
	public static String getBusqueda2 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Price"; break;
		case Language.SPANISH : mensaje = "Precio"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getBusqueda3 () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Distance traveled"; break;
		case Language.SPANISH : mensaje = "Kilometraje"; break;
		default : break;
		}

		return mensaje;
	}
	
	// ShowAllCarsPanel   REUSAR DE OTROS
	
	// WelcomePanel
	
	public static String getMensajeBienvenido () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Welcome to the Car Sales System"; break;
		case Language.SPANISH : mensaje = "Bienvenido al Sistema de Venta de Autos"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getCantAutos () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Total number of cars: "; break;
		case Language.SPANISH : mensaje = "Número total de autos: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getCantFabricantes () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Total number of manufacturers: "; break;
		case Language.SPANISH : mensaje = "Número total de fabricantes: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getPrecioPromedio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Average car price: "; break;
		case Language.SPANISH : mensaje = "Precio promedio del auto: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getKmPromedio () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Average car kilometers: "; break;
		case Language.SPANISH : mensaje = "Kilometraje promedio: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getAntiguedad () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Average car age: "; break;
		case Language.SPANISH : mensaje = "Antiguedad promedio: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getSistema () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Car Sales System, Version "; break;
		case Language.SPANISH : mensaje = "Sistema de venta de autos, Versión "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getTamanioDatos () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Size of data file: "; break;
		case Language.SPANISH : mensaje = "Tamaño del archivo: "; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getErrorFormatoFecha () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "The format of the date is not valid"; break;
		case Language.SPANISH : mensaje = "El formato de la fecha no es valido"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getFabricante () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Manufacturer"; break;
		case Language.SPANISH : mensaje = "Fabricante"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getFoto () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Car's photo"; break;
		case Language.SPANISH : mensaje = "Foto del auto"; break;
		default : break;
		}

		return mensaje;
	}
	
	public static String getRegistroAgregado () {

		String mensaje = "";

		switch (idioma) {
		case Language.ENGLISH : mensaje = "Record Added"; break;
		case Language.SPANISH : mensaje = "Registro Agregado"; break;
		default : break;
		}

		return mensaje;
	}

}
