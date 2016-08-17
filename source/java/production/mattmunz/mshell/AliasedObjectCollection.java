package mattmunz.mshell;

import static com.google.common.collect.Maps.newTreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AliasedObjectCollection<V>
{
  private final Comparator<String> aliasComparator = new Comparator<String>()
  {
    @Override
    public int compare(String leftAlias, String rightAlias)
    {
      return leftAlias.toUpperCase().compareTo(rightAlias.toUpperCase());
    }
  };

  private final TreeMap<String, V> valuesByAlias = newTreeMap(aliasComparator);
  private final String valueTypeDescription;

  AliasedObjectCollection(Map<String, V> valuesByAlias, String valueTypeDescription)
  {
    this.valueTypeDescription = valueTypeDescription;
    this.valuesByAlias.putAll(valuesByAlias);
  }

  public V getValue(String alias)
  {
    V value = valuesByAlias.get(alias);
    
    if (value == null)
    {
      String message = "Unknown " + valueTypeDescription + " alias: [" + alias +"].";
      throw new IllegalArgumentException(message);
    }
    
    return value;
  }
  
  public Map<V, Set<String>> getAliasesByValues()
  {
    Map<V, Set<String>> aliasesByValues = new HashMap<>();
    
    // TODO Is there a Guava method for this general task?
    for (Entry<String, V> entry : valuesByAlias.entrySet())
    {
      V value = entry.getValue();
      Set<String> aliases = aliasesByValues.get(value);
      
      if (aliases == null) 
      { 
        aliases = new HashSet<>();
        aliasesByValues.put(value, aliases);
      }
      
      aliases.add(entry.getKey());
    }
    
    return aliasesByValues;
  }
}
