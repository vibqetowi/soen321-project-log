package com.google.firebase.storage;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.i f9836b;

    public /* synthetic */ b(int i6, ya.i iVar) {
        this.f9835a = i6;
        this.f9836b = iVar;
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        int i6 = this.f9835a;
        ya.i iVar = this.f9836b;
        switch (i6) {
            case 0:
                iVar.a(exc);
                return;
            default:
                iVar.a(exc);
                return;
        }
    }
}
