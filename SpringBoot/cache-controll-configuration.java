@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
   registry.addResourceHandler("/static/**")
           .addResourceLocations("classpath:/static/")
           .setCacheControl(CacheControl
                   .maxAge(10, TimeUnit.MINUTES)
                   .cachePrivate());
}
