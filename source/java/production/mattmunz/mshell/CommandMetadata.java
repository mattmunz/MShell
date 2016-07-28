package mattmunz.mshell;

/**
 * This is kind of a legacy class that is only needed for V1.
 * 
 * TODO Move all this legacy code to a common place and deprecate it?
 */
enum CommandMetadata
{
  // TODO The usage message could be refactored a little
  BUILD("build", "build <project name>"), CLEAN("clean", "clean <project name>"), 
  ENVIRONMENT_VARIABLES("environmentvariables", "ev; List all environment variables"),
  HELP("help", "help"), 
  MUSIC_CONTROL("mc", "mc <subcommand>; Subcommands: get, addmellow, addnotmellow. For music control."),
  QUIT("quit", "quit; End this shell session"), SYSTEM_PROPERTIES("systemproperties", "sp; List all system properties");
  
  // TODO Need multiple aliases for a command, for example quit and exit...
  private final String alias;
  private final String shortUsageDescription;

  private CommandMetadata(String alias, String shortUsageDescription)
  {
    this.alias = alias; 
    this.shortUsageDescription = shortUsageDescription;
  }

  String getAlias() { return alias; }

  String getShortUsageDescription() { return shortUsageDescription; }
}
