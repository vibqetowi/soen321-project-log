package com.google.gson;
/* loaded from: classes.dex */
public class JsonParseException extends RuntimeException {
    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Exception exc) {
        super(str, exc);
    }

    public JsonParseException(Exception exc) {
        super(exc);
    }
}
