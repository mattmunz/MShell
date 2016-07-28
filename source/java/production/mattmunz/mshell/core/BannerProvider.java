package mattmunz.mshell.core;

import static java.lang.String.format;
import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE; 
import mattmunz.cli.interactive.WelcomeMessageRepository;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.stereotype.Component;

@Component
@Order(HIGHEST_PRECEDENCE)
public class BannerProvider extends DefaultBannerProvider  
{
	@Override
  public String getBanner() 
	{
	  WelcomeMessageRepository repository 
	    = new WelcomeMessageRepository("Welcome.txt", getClass(), getProviderName(), "help");
	  
    return repository.getWelcomeMessage();
	}

	@Override
  public String getVersion() { return "2.0.0"; }

	/**
	 * @return The phrase used to describe this shell.
	 */
	@Override
	public String getProviderName() { return "M Shell"; }
	
	@Override
	public String getWelcomeMessage() 
	{
	  return format("Welcome to %s. For assistance type \"help\" and then press ENTER.", 
	                getProviderName());
  }
}