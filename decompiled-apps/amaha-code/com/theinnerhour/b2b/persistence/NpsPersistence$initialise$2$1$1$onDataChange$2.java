package com.theinnerhour.b2b.persistence;

import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: NpsPersistence.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lhs/k;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NpsPersistence$initialise$2$1$1$onDataChange$2 extends k implements l<Void, hs.k> {
    final /* synthetic */ l<Boolean, Object> $onLoad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NpsPersistence$initialise$2$1$1$onDataChange$2(l<? super Boolean, ? extends Object> lVar) {
        super(1);
        this.$onLoad = lVar;
    }

    @Override // ss.l
    public /* bridge */ /* synthetic */ hs.k invoke(Void r12) {
        invoke2(r12);
        return hs.k.f19476a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Void r22) {
        NpsPersistence.INSTANCE.setNpsInitComplete(true);
        this.$onLoad.invoke(Boolean.TRUE);
    }
}
