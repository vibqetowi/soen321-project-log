package org.apache.http.entity;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes5.dex */
public interface ContentProducer {
    void writeTo(OutputStream outputStream) throws IOException;
}
