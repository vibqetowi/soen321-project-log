package com.bugsnag.android.ndk;

import hs.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.y;
import ss.a;
/* compiled from: NativeBridge.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs/k;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final /* synthetic */ class NativeBridge$onStateChange$1 extends f implements a<k> {
    public NativeBridge$onStateChange$1(NativeBridge nativeBridge) {
        super(0, nativeBridge);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "refreshSymbolTable";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return y.a(NativeBridge.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "refreshSymbolTable()V";
    }

    @Override // ss.a
    public /* bridge */ /* synthetic */ k invoke() {
        invoke2();
        return k.f19476a;
    }

    @Override // ss.a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NativeBridge) this.receiver).refreshSymbolTable();
    }
}
