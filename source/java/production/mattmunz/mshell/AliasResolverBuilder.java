package mattmunz.mshell;

import static com.google.common.collect.Maps.newTreeMap; 

import java.util.Comparator;
import java.util.Map;

import mattmunz.util.MapHelper;

public class AliasResolverBuilder<V> 
{
  private final Comparator<String> aliasComparator = new Comparator<String>()
  {
    @Override
    public int compare(String leftAlias, String rightAlias)
    {
      return leftAlias.toUpperCase().compareTo(rightAlias.toUpperCase());
    }
  };

  private final MapHelper mapHelper = new MapHelper();
  
  private final Map<String, V> valuesByAlias = newTreeMap(aliasComparator);

  public void put(V value, String... aliases) 
  {
    mapHelper.put(value, valuesByAlias, aliases);
  }

  public Map<String, V> build() 
  { 
    // TODO Would be great to have a utility for making these defensive copies...
    Map<String, V> valuesByAliasCopy = newTreeMap(aliasComparator);
    valuesByAliasCopy.putAll(valuesByAlias);
    
    return valuesByAliasCopy; 
  }
}
