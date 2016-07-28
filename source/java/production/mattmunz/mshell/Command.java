package mattmunz.mshell;

import java.io.IOException; 

/**
 * This is sort of a legacy interface for use with MShell V1.
 */
public interface Command 
{
  /**
   * As needed these exceptions can be removed. This would require the implementor to wrap 
   * exceptions as {@link RuntimeException}s.
   */
	void run() throws IOException, InterruptedException;
}
