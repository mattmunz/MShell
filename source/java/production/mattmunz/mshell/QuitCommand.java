package mattmunz.mshell;

import static java.lang.System.exit;

import java.io.Console;
import java.io.IOException;

class QuitCommand implements Command
{
  private final Console console;

  QuitCommand(Console console) { this.console = console; }
  
  @Override
  public void run() throws IOException, InterruptedException
  {
    console.format("Goodbye!%n");
    exit(0);
  }
}
