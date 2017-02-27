public class TaskHelper{  
  public static BeginTask(){
    Task.Factory.StartNew(()=>{
      //...
    });
  }  
}
