public class JsonDotNetHelper{

  //Convert Json to specific object
  public T DeserializeJsonToObject<T>(string json){
    return JsonConvert.DeserializeObject<T>(json);
  }

  //Convert object to json
  public string SerializeObjectToJson(object obj){
     return JsonConvert.SerializeObject(obj);
  }
}


