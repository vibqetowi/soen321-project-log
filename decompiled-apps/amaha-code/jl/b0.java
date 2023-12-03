package jl;

import androidx.lifecycle.o0;
/* compiled from: LibraryLogsViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class b0 extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22091b;

    /* renamed from: c  reason: collision with root package name */
    public final cn.e1 f22092c;

    public b0(cn.e1 e1Var, int i6) {
        this.f22091b = i6;
        switch (i6) {
            case 1:
                this.f22092c = e1Var;
                return;
            case 2:
                this.f22092c = e1Var;
                return;
            case 3:
                this.f22092c = e1Var;
                return;
            case 4:
                this.f22092c = e1Var;
                return;
            case 5:
                this.f22092c = e1Var;
                return;
            case 6:
                this.f22092c = e1Var;
                return;
            default:
                this.f22092c = e1Var;
                return;
        }
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final androidx.lifecycle.l0 a(Class cls) {
        int i6 = this.f22091b;
        cn.e1 e1Var = this.f22092c;
        switch (i6) {
            case 0:
                return new a0(e1Var);
            case 1:
                return new k0(e1Var);
            case 2:
                return new x1(e1Var);
            case 3:
                return new cn.b(e1Var);
            case 4:
                return new cn.i(e1Var);
            case 5:
                return new cn.o(e1Var);
            default:
                return new cn.j0(e1Var);
        }
    }
}
