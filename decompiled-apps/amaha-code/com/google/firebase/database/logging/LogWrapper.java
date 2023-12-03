package com.google.firebase.database.logging;

import com.google.firebase.database.logging.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;
import v.g;
/* loaded from: classes.dex */
public class LogWrapper {
    private final String component;
    private final Logger logger;
    private final String prefix;

    public LogWrapper(Logger logger, String str) {
        this(logger, str, null);
    }

    private static String exceptionStacktrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private String toLog(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.prefix != null) {
            return this.prefix + " - " + str;
        }
        return str;
    }

    public void debug(String str, Object... objArr) {
        debug(str, null, objArr);
    }

    public void error(String str, Throwable th2) {
        this.logger.onLogMessage(Logger.Level.ERROR, this.component, toLog(str, new Object[0]) + "\n" + exceptionStacktrace(th2), now());
    }

    public void info(String str) {
        this.logger.onLogMessage(Logger.Level.INFO, this.component, toLog(str, new Object[0]), now());
    }

    public boolean logsDebug() {
        if (this.logger.getLogLevel().ordinal() <= Logger.Level.DEBUG.ordinal()) {
            return true;
        }
        return false;
    }

    public void warn(String str) {
        warn(str, null);
    }

    public LogWrapper(Logger logger, String str, String str2) {
        this.logger = logger;
        this.component = str;
        this.prefix = str2;
    }

    public void debug(String str, Throwable th2, Object... objArr) {
        if (logsDebug()) {
            String log = toLog(str, objArr);
            if (th2 != null) {
                StringBuilder d10 = g.d(log, "\n");
                d10.append(exceptionStacktrace(th2));
                log = d10.toString();
            }
            this.logger.onLogMessage(Logger.Level.DEBUG, this.component, log, now());
        }
    }

    public void warn(String str, Throwable th2) {
        String log = toLog(str, new Object[0]);
        if (th2 != null) {
            StringBuilder d10 = g.d(log, "\n");
            d10.append(exceptionStacktrace(th2));
            log = d10.toString();
        }
        this.logger.onLogMessage(Logger.Level.WARN, this.component, log, now());
    }
}
