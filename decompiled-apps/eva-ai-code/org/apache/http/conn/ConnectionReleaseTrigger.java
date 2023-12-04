package org.apache.http.conn;

import java.io.IOException;
/* loaded from: classes5.dex */
public interface ConnectionReleaseTrigger {
    void abortConnection() throws IOException;

    void releaseConnection() throws IOException;
}
