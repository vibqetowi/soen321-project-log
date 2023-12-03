package com.google.firebase.messaging;

import java.util.Locale;
/* loaded from: classes.dex */
public final class SendException extends Exception {
    public SendException(String str) {
        super(str);
        if (str != null) {
            str.toLowerCase(Locale.US).getClass();
        }
    }
}
