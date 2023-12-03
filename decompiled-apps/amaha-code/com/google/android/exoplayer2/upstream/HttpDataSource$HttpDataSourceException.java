package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import sc.b;
/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public HttpDataSource$HttpDataSourceException() {
        super(2008);
    }

    public static HttpDataSource$HttpDataSourceException a(final IOException iOException, int i6) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && b.h0(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new HttpDataSource$HttpDataSourceException(iOException) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            };
        }
        return new HttpDataSource$HttpDataSourceException(iOException, i10, i6);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i6) {
        super(str, i6 == 2000 ? 2001 : i6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i6, int i10) {
        super(iOException, i6);
        if (i6 == 2000 && i10 == 1) {
            i6 = 2001;
        }
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i6) {
        super(i6 == 2000 ? 2001 : i6, str, iOException);
    }
}
