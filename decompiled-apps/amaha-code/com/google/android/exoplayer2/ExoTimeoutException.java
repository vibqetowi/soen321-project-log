package com.google.android.exoplayer2;
/* loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoTimeoutException(int i6) {
        super(r2);
        String str;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    str = "Undefined timeout.";
                } else {
                    str = "Detaching surface timed out.";
                }
            } else {
                str = "Setting foreground mode timed out.";
            }
        } else {
            str = "Player release timed out.";
        }
    }
}
