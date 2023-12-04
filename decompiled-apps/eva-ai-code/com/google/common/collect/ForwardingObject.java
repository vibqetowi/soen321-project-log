package com.google.common.collect;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class ForwardingObject {
    protected abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}