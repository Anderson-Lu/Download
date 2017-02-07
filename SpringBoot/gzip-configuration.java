@Configuration
public class ServerConfig {

	public class FaviconConfiguration extends WebMvcConfigurerAdapter{
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry){
			registry.setOrder(Integer.MIN_VALUE);
			registry.addResourceHandler("/favicon.ico").addResourceLocations("/");			
			
			registry.addResourceHandler("/static/**")
			        .addResourceLocations("/")
			        .resourceChain(false)
			        .addResolver(new GzipResourceResolver())
			        .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
		}
	}
}
   
