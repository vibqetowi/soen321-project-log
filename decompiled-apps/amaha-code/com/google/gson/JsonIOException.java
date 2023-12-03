package com.google.gson;
/* loaded from: classes.dex */
public final class JsonIOException extends JsonParseException {
    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, Exception exc) {
        super(str, exc);
    }

    public JsonIOException(Exception exc) {
        super(exc);
    }
}
