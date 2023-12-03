package com.google.gson;
/* loaded from: classes.dex */
public final class JsonSyntaxException extends JsonParseException {
    public JsonSyntaxException(String str) {
        super(str);
    }

    public JsonSyntaxException(String str, Exception exc) {
        super(str, exc);
    }

    public JsonSyntaxException(Exception exc) {
        super(exc);
    }
}
