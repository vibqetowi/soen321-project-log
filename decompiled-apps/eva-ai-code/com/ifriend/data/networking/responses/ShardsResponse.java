package com.ifriend.data.networking.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ShardsResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/data/networking/responses/ShardsResponse;", "", "shard", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getShard", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShardsResponse {
    private final String key;
    private final String shard;

    public ShardsResponse(String shard, String key) {
        Intrinsics.checkNotNullParameter(shard, "shard");
        Intrinsics.checkNotNullParameter(key, "key");
        this.shard = shard;
        this.key = key;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getShard() {
        return this.shard;
    }
}
