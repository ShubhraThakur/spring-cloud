public class ReloadableProperties extends StandardServletEnvironment{

@Override
    public void initPropertySources(ServletContext servletContext, ServletConfig servletConfig) {
 super.initPropertySources(servletContext,servletConfig);
 customizePropertySources(this.getPropertySources());
   }

@Override
  protected void customizePropertySources(MutablePropertySources propertySources) {
    super.customizePropertySources(propertySources);
    try {
      PropertySource<?> source = initConfigServicePropertySourceLocator(this);
      propertySources.addLast(source);

    } catch (

    Exception ex) {
      ex.printStackTrace();
    }
  }

  private PropertySource<?> initConfigServicePropertySourceLocator(Environment environment) {

    ConfigClientProperties configClientProperties = new ConfigClientProperties(environment);
    configClientProperties.setUri("http://localhost:8888");
    configClientProperties.setProfile("dev");
    configClientProperties.setLabel("master");
    configClientProperties.setName("YourApplicationName");

    System.out.println("##################### will load the client configuration");
    System.out.println(configClientProperties);

    ConfigServicePropertySourceLocator configServicePropertySourceLocator =
        new ConfigServicePropertySourceLocator(configClientProperties);

    return configServicePropertySourceLocator.locate(environment);
    }

}