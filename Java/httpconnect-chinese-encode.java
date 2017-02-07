 	private String readFromStream(HttpURLConnection httpConnect) throws Exception{
		InputStream contentStream = httpConnect.getInputStream();			
		BufferedReader contentReader = new BufferedReader(new InputStreamReader(contentStream,"UTF-8"));
		String content = "",tmp = "";
		while((tmp=contentReader.readLine()) !=null){
			content = tmp.concat(tmp);
		}
		contentReader.close();
		contentStream.close();
		return content;
	}
