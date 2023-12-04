package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/* loaded from: classes4.dex */
final class FilesystemPropertiesLoader implements PropertiesLoader {
    private final String filePath;
    private final ILogger logger;

    public FilesystemPropertiesLoader(String str, ILogger iLogger) {
        this.filePath = str;
        this.logger = iLogger;
    }

    @Override // io.sentry.config.PropertiesLoader
    public Properties load() {
        try {
            File file = new File(this.filePath);
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            }
            return null;
        } catch (IOException e) {
            this.logger.log(SentryLevel.ERROR, e, "Failed to load Sentry configuration from file: %s", this.filePath);
            return null;
        }
    }
}
