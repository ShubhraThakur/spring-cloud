// imports from java/spring/lombok
public abstract class ReloadableProperties {

  @Autowired
  protected StandardEnvironment environment;
  private long lastModTime = 0L;
  private Path configPath = null;
  private PropertySource<?> appConfigPropertySource = null;

  @PostConstruct
  private void stopIfProblemsCreatingContext() {
    System.out.println("reloading");
    MutablePropertySources propertySources = environment.getPropertySources();
    Optional<PropertySource<?>> appConfigPsOp =
        StreamSupport.stream(propertySources.spliterator(), false)
            .filter(ps -> ps.getName().matches("^.*applicationConfig.*file:.*$"))
            .findFirst();
    if (!appConfigPsOp.isPresent())  {
      // this will stop context initialization 
      // (i.e. kill the spring boot program before it initializes)
      throw new RuntimeException("Unable to find property Source as file");
    }
    appConfigPropertySource = appConfigPsOp.get();

    String filename = appConfigPropertySource.getName();
    filename = filename
        .replace("applicationConfig: [file:", "")
        .replaceAll("\\]$", "");

    configPath = Paths.get(filename);

  }