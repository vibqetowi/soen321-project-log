package com.google.firebase.storage;

import ya.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ya.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.a f9838b;

    public /* synthetic */ c(ya.a aVar, int i6) {
        this.f9837a = i6;
        this.f9838b = aVar;
    }

    @Override // ya.c
    public final void b() {
        int i6 = this.f9837a;
        ya.a aVar = this.f9838b;
        switch (i6) {
            case 0:
                v vVar = (v) aVar.f38391a.f38396u;
                synchronized (vVar.f38416a) {
                    if (!vVar.f38418c) {
                        vVar.f38418c = true;
                        vVar.f38420e = null;
                        vVar.f38417b.h(vVar);
                        return;
                    }
                    return;
                }
            default:
                aVar.a();
                return;
        }
    }
}
