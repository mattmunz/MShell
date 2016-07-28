package mattmunz.mshell.core.commands;

import static java.lang.String.format;
import static java.lang.System.getenv;

import java.util.Map.Entry;

import org.springframework.shell.core.CommandMarker; 
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;

@Component
public class SystemCommands implements CommandMarker 
{
	private static final String EV_HELP = "List all system environment variables";

  @CliCommand(value = { "environment variables", "ev" }, help = EV_HELP)
	public String getEnvironmentVariables() 
	{
	  StringBuilder builder = new StringBuilder();
	  
	  for (Entry<String, String> entry : getenv().entrySet()) 
	  {
	    builder.append(format("%s = %s%n", entry.getKey(), entry.getValue()));
	  }
	  
	  return builder.toString();
	}
}
