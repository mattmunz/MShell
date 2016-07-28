package mattmunz.mshell;

import static java.lang.System.getenv;

import java.io.Console;
import java.io.IOException;
import java.util.Map.Entry;

class EnvironmentVariablesCommand implements Command
{
  private final Console console;
  
  EnvironmentVariablesCommand(Console console) { this.console = console; }

  @Override
  public void run() throws IOException, InterruptedException
  {
    for (Entry<String, String> entry : getenv().entrySet()) 
    {
      console.format("%s = %s%n", entry.getKey(), entry.getValue());
    }
  }
}
