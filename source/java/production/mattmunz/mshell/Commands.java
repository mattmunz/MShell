package mattmunz.mshell;

import java.util.List;

public class Commands
{
  public static void 
    assertParameterCountEquals(int expectedParameterCount, List<String> parameters,
                               String usageDescription)
  {
    if (parameters.size() != expectedParameterCount) 
    { 
      String message = "This command requires one parameter. Usage: " + usageDescription + ".";
      throw new IllegalArgumentException(message); 
    }
  }
}
