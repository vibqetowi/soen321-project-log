package io.grpc;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes4.dex */
public interface Compressor {
    OutputStream compress(OutputStream outputStream) throws IOException;

    String getMessageEncoding();
}
