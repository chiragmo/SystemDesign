package jobAutomation.util;

protected class ConfigurationFile {
private File configFile; private Properties props;

	protected ReadConfigurationFile() throws AllException {
		try {
		 configFile = new File("../resources/config.properties");
		 props = new Properties();
		 props.load(reader);
		} catch (FileNotFoundException ex) {
			throw new AllException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
		} catch (IOException ex) {
			throw new AllException(e.getMessage(),"IO_EXCEPTION");
		} finally {
			try {
				if(configFile !=null) configFile.close();
			} catch (IOException e) {
				throw new AllException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
			}
		}
	}

		/*
		 * Uses variable.props and retuns the value of the property 
		*/	
	protected String getProperty(String keyName) {
		
	}


}