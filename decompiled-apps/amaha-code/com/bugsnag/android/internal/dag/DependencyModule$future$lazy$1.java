package com.bugsnag.android.internal.dag;

import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: DependencyModule.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DependencyModule$future$lazy$1 extends k implements a<T> {
    final /* synthetic */ a $initializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependencyModule$future$lazy$1(a aVar) {
        super(0);
        this.$initializer = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // ss.a
    public final T invoke() {
        return this.$initializer.invoke();
    }
}
