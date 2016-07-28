package mattmunz.mshell.core;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE; 

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultHistoryFileNameProvider;
import org.springframework.stereotype.Component;

@Component
@Order(HIGHEST_PRECEDENCE)
public class HistoryFileNameProvider extends DefaultHistoryFileNameProvider 
{
	@Override
  public String getHistoryFileName() { return "mshell-springshell-experiment.log"; }

	/**
	 * TODO There appears to be a limitation in the HistoryFileNameProvider and PromptProvider 
	 *      interfaces which require a redundant and unused provider name.
	 */
	@Override
	public String getProviderName() 
	{ 
	  throw new UnsupportedOperationException("The name for this provider is not used or needed.");
	}
}
