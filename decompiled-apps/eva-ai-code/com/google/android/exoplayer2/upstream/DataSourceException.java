package com.google.android.exoplayer2.upstream;

import java.io.IOException;
/* loaded from: classes2.dex */
public class DataSourceException extends IOException {
    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof DataSourceException) && ((DataSourceException) iOException2).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(int i) {
        this.reason = i;
    }

    public DataSourceException(Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
