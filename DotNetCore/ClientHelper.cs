//Get client ip address in .Net core app
public static class HttpContextExtension
{
    public static string GetUserIp(this HttpContext context)
    {
        var ip = context.Request.Headers["X-Forwarded-For"].FirstOrDefault();
        if (string.IsNullOrEmpty(ip))
        {
            ip = context.Connection.RemoteIpAddress.ToString();
        }
        return ip;
    }
}
