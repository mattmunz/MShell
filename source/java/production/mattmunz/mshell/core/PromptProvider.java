package mattmunz.mshell.core;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE; 

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultPromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(HIGHEST_PRECEDENCE)
public class PromptProvider extends DefaultPromptProvider 
{
	@Override
	public String getPrompt() { return "> "; }
	
	@Override
	public String getProviderName() 
	{ 
    throw new UnsupportedOperationException("The name for this provider is not used or needed.");
  }
}
