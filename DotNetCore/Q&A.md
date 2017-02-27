### The Thread class doesn't work in .Net Core

The Thread class is in the System.Threading.Thread package, which is included in Microsoft.NETCore.App, but not in NETStandard.Library. This means that Thread will work out of the box in a .Net Core application, but to use it in a .Net Core library, you need to add "System.Threading.Thread": "4.0.0" to "dependencies" in your project.json.

Instead, you can use the following codes by Task:

```csharp
Task.Factory.StartNew(()=>{
  //do something here
})
```
