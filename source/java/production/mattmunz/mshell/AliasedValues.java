package mattmunz.mshell;

import java.util.Map;

@Deprecated
public class AliasedValues
{
  @Deprecated
  /*
   * TODO Maybe it would be better to create a custom type for alias resolution instead of 
   *      a map. In that case, this method can go on that class...
   */
  public static <V> V 
    getValueForAlias(String alias, Map<String, V> valuesByAlias, String valueTypeDescription)
  {
    V value = valuesByAlias.get(alias);
    
    if (value == null)
    {
      throw new IllegalArgumentException("Unknown " + valueTypeDescription + " alias: [" 
                                         + alias +"].");
    }
    
    return value;
  }
}
