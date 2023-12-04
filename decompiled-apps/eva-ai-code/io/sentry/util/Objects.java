package io.sentry.util;
/* loaded from: classes4.dex */
public final class Objects {
    private Objects() {
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}
