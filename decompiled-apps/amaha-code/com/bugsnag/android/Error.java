package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class Error implements JsonStream.Streamable {
    private final ErrorInternal impl;
    private final Logger logger;

    public Error(ErrorInternal errorInternal, Logger logger) {
        this.impl = errorInternal;
        this.logger = logger;
    }

    public static List<Error> createError(Throwable th2, Collection<String> collection, Logger logger) {
        return ErrorInternal.Companion.createError(th2, collection, logger);
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to error." + str + ", ignoring");
    }

    public String getErrorClass() {
        return this.impl.getErrorClass();
    }

    public String getErrorMessage() {
        return this.impl.getErrorMessage();
    }

    public List<Stackframe> getStacktrace() {
        return this.impl.getStacktrace();
    }

    public ErrorType getType() {
        return this.impl.getType();
    }

    public void setErrorClass(String str) {
        if (str != null) {
            this.impl.setErrorClass(str);
        } else {
            logNull("errorClass");
        }
    }

    public void setErrorMessage(String str) {
        this.impl.setErrorMessage(str);
    }

    public void setType(ErrorType errorType) {
        if (errorType != null) {
            this.impl.setType(errorType);
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }
}
