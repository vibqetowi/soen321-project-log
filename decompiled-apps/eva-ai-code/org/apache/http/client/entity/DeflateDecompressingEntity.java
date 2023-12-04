package org.apache.http.client.entity;

import org.apache.http.HttpEntity;
/* loaded from: classes5.dex */
public class DeflateDecompressingEntity extends DecompressingEntity {
    public DeflateDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, DeflateInputStreamFactory.getInstance());
    }
}
