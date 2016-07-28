package mattmunz.mshell;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.List;

class HelpCommand implements Command
{
  private final List<CommandMetadata> commandMetadatas;

  HelpCommand(CommandMetadata... commandMetadatas)
  {
    this(asList(commandMetadatas));
  }

  private HelpCommand(List<CommandMetadata> commandMetadatas)
  {
    this.commandMetadatas = commandMetadatas;
  }

  @Override
  public void run() throws IOException, InterruptedException
  {
    System.out.println("Commands:");
    
    for (CommandMetadata commandMetadata : commandMetadatas)
    {
      System.out.println(commandMetadata.getAlias() + ": " 
                         + commandMetadata.getShortUsageDescription());
    }
  }
}
