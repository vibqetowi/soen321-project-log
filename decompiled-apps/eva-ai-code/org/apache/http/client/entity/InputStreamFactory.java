package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public interface InputStreamFactory {
    InputStream create(InputStream inputStream) throws IOException;
}
