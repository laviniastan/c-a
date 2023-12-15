package com.example.weatherApp.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URISyntaxException;

@Slf4j
@Component
public class OpenApiDefinitionRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        log.info("Opening swagger definition");
        openOpenApiDefinition();
    }

    /***
     * Method used to automatically open swager definition after startup
     */
    private void openOpenApiDefinition() {
        String url = "http://localhost:8080/swagger-ui/index.html#/";
        try {
            openWebBrowser(url);
        } catch (IOException | URISyntaxException e) {
           log.error("Could not open swagger definition");
           e.printStackTrace();
        }
    }

    private void openWebBrowser(String url) throws IOException, URISyntaxException {
        Runtime runtime = Runtime.getRuntime();
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            runtime.exec("xdg-open " + url);
        }
    }

}
