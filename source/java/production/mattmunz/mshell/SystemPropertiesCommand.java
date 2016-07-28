package mattmunz.mshell;

import java.io.Console;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

class SystemPropertiesCommand implements Command
{
  private final Console console;
  
  SystemPropertiesCommand(Console console) { this.console = console; }

  @Override
  public void run() throws IOException, InterruptedException
  {
    Properties properties = System.getProperties();
    
    for (Entry<Object, Object> entry : properties.entrySet())
    {
      console.printf("%s -> %s\n", entry.getKey(), entry.getValue());
    }
  }
}
