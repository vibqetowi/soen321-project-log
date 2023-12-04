package org.apache.http.client.entity;

import org.apache.http.HttpEntity;
/* loaded from: classes5.dex */
public class GzipDecompressingEntity extends DecompressingEntity {
    public GzipDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, GZIPInputStreamFactory.getInstance());
    }
}
