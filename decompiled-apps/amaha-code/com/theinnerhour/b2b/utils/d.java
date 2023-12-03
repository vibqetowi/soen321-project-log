package com.theinnerhour.b2b.utils;

import ss.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11796a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f11797b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11798c;

    public /* synthetic */ d(q qVar, String str, int i6) {
        this.f11796a = i6;
        this.f11797b = qVar;
        this.f11798c = str;
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        int i6 = this.f11796a;
        String str = this.f11798c;
        q qVar = this.f11797b;
        switch (i6) {
            case 0:
                FireStoreUtilsKt.l(qVar, str, exc);
                return;
            case 1:
                FireStoreUtilsKt.b(qVar, str, exc);
                return;
            default:
                FireStoreUtilsKt.A(qVar, str, exc);
                return;
        }
    }
}
