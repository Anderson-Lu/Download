#### First, configure MVC in `ConfigureService` method:

```csharp
public void ConfigureServices(IServiceCollection services)
{
    services.AddMvc();
}
```

#### Then, configure default route maps in `Configure` method:

```csharp
routes.MapRoute(
    name: "default",
    template: "{controller}/{action}/{id?}",
    defaults: new { controller = "Main", action = "Index" }
);

//Another way to define a template
routes.MapRoute(
    name: "default",
    template: "{controller=Main}/{action=Index}/{id?}"
);
```
