package mattmunz.mshell;

import static com.google.common.collect.Maps.newHashMap; 

import java.util.Map;

import mattmunz.util.MapHelper;

// TODO Rename
public class AliasResolverBuilder<V> 
{
  private final MapHelper mapHelper = new MapHelper();
  
  private final Map<String, V> valuesByAlias = newHashMap();

  private final String valueTypeDescription;
  
  public AliasResolverBuilder(String valueTypeDescription) 
  {
    this.valueTypeDescription = valueTypeDescription; 
  }

  public void put(V value, String... aliases) 
  {
    mapHelper.put(value, valuesByAlias, aliases);
  }
  
  // TODO Rename
  public AliasedObjectCollection<V> buildAOC()
  {
    return new AliasedObjectCollection<V>(valuesByAlias, valueTypeDescription);
  }
}
