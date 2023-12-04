package io.grpc.alts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.SystemUtils;
/* loaded from: classes4.dex */
final class CheckGcpEnvironment {
    private static final String DMI_PRODUCT_NAME = "/sys/class/dmi/id/product_name";
    private static final String WINDOWS_COMMAND = "powershell.exe";
    private static final Logger logger = Logger.getLogger(CheckGcpEnvironment.class.getName());
    private static Boolean cachedResult = null;

    private CheckGcpEnvironment() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized boolean isOnGcp() {
        boolean booleanValue;
        synchronized (CheckGcpEnvironment.class) {
            if (cachedResult == null) {
                cachedResult = Boolean.valueOf(isRunningOnGcp());
            }
            booleanValue = cachedResult.booleanValue();
        }
        return booleanValue;
    }

    static boolean checkProductNameOnLinux(BufferedReader bufferedReader) throws IOException {
        String trim = bufferedReader.readLine().trim();
        return trim.equals("Google") || trim.equals("Google Compute Engine");
    }

    static boolean checkBiosDataOnWindows(BufferedReader bufferedReader) throws IOException {
        String readLine;
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                return false;
            }
        } while (!readLine.startsWith("Manufacturer"));
        return readLine.substring(readLine.indexOf(58) + 1).trim().equals("Google");
    }

    private static boolean isRunningOnGcp() {
        Path path;
        BufferedReader newBufferedReader;
        try {
            if (SystemUtils.IS_OS_LINUX) {
                path = Paths.get(DMI_PRODUCT_NAME, new String[0]);
                newBufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
                return checkProductNameOnLinux(newBufferedReader);
            } else if (SystemUtils.IS_OS_WINDOWS) {
                return checkBiosDataOnWindows(new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(WINDOWS_COMMAND, "Get-WmiObject", "-Class", "Win32_BIOS").start().getInputStream(), StandardCharsets.UTF_8)));
            } else {
                return false;
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Fail to read platform information: ", (Throwable) e);
            return false;
        }
    }
}
