///
// Convert a string from one encoding to another
///
public static string EncodingConvert(Encoding srcEncoding,Encoding desEncoding,string str){    
    byte[] srcBytes = srcEncoding.GetBytes(Message);
    byte[] desBytes = Encoding.Convert(desEncoding, desEncoding, utfBytes);
    string result = desEncoding.GetString(desBytes);
    return result;
}
