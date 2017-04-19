//Skip(1) is used for remove header(s)
public List<List<string>> ReadCsvFile(string filePath){
    try{
        return File.ReadAllLines(filePath).Select(row=>row.Split(',').ToList<string>()).Skip(1).ToList<List<string>>();
    }catch(Exception e){
        return null;
    }
}

