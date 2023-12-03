package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.IOException;
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    public static ParsingException create(String str, boolean z10) {
        if (z10) {
            return new ParsingException(str);
        }
        return new ParsingStacklessException(str);
    }

    /* loaded from: classes.dex */
    public static class ParsingStacklessException extends ParsingException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        private ParsingStacklessException(String str) {
            super(str);
        }

        private ParsingStacklessException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private ParsingException(String str) {
        super(str);
    }

    public static ParsingException create(String str, Throwable th2, boolean z10) {
        if (z10) {
            return new ParsingException(str, th2);
        }
        return new ParsingStacklessException(str, th2);
    }

    private ParsingException(String str, Throwable th2) {
        super(str, th2);
    }
}
