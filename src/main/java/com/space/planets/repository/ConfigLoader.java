package com.space.planets.repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ConfigLoader {

    public static Properties loadConfig() {
        Properties properties = new Properties();
        try (InputStream inputStream = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            Logger.getLogger(ConfigLoader.class.getName()).log(Level.SEVERE, null, e);
        }
        return properties;
    }
}
