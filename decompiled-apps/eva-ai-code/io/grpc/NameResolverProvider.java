package io.grpc;

import io.grpc.NameResolver;
/* loaded from: classes4.dex */
public abstract class NameResolverProvider extends NameResolver.Factory {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isAvailable();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int priority();
}
