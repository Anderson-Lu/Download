### The Thread class doesn't work in .Net Core

The Thread class is in the System.Threading.Thread package, which is included in Microsoft.NETCore.App, but not in NETStandard.Library. This means that Thread will work out of the box in a .Net Core application, but to use it in a .Net Core library, you need to add "System.Threading.Thread": "4.0.0" to "dependencies" in your project.json.

Instead, you can use the following codes by Task:

```csharp
Task.Factory.StartNew(()=>{
  //do something here
})
```

### Install Mircosoft .NET Core 1.0.0 VS 2015 Tooling Preview 2 failed.

```log
Setup Failed One or more issues caused the setup to fail. 
Please fix the issues and then retry setup. 
For more information see the log file. 
Setup has detected that Visual Studio 2015 Update 3 may not be completely installed. 
Please repair Visual Studio 2015 Update 3, then install this product again.
```

To fix it, you can run the installer with following command:

```bash
DotNetCore.1.0.0-VS2015Tools.Preview2.exe SKIP_VSU_CHECK=1
```
