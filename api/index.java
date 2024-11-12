import com.vercel.serverless.HttpRequest;
import com.vercel.serverless.HttpResponse;
import com.vercel.serverless.Serverless;

public class Index implements Serverless {
    @Override
    public HttpResponse handleRequest(HttpRequest request) {
        String response = "<html>" +
                            "<head>" +
                            "<meta charset='UTF-8'>" +
                            "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
                            "<title>Welcome to My Java Web App</title>" +
                            "<style>" +
                            "body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f9; }" +
                            "header { background-color: #333; color: #fff; padding: 15px; text-align: center; }" +
                            "main { padding: 20px; text-align: center; }" +
                            "h1 { color: #333; }" +
                            "p { color: #555; font-size: 18px; }" +
                            "footer { background-color: #333; color: #fff; text-align: center; padding: 10px; position: fixed; bottom: 0; width: 100%; }" +
                            "</style>" +
                            "</head>" +
                            "<body>" +
                            "<header>" +
                            "<h1>Welcome to My Java Web App!</h1>" +
                            "</header>" +
                            "<main>" +
                            "<p>This is a simple web application built with Java and the HttpServer API.</p>" +
                            "<p>Feel free to explore more about Java web development!</p>" +
                            "</main>" +
                            "<footer>" +
                            "<p>Made with <span style='color: red;'>&#x2764;</span> by Your Name</p>" +
                            "</footer>" +
                            "</body>" +
                            "</html>";

        // Devuelve la respuesta HTTP
        return HttpResponse.ok(response);
    }
}
