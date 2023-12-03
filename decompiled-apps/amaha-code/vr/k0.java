package vr;

import com.theinnerhour.b2b.utils.Constants;
import vr.s;
/* compiled from: FailingClientStream.java */
/* loaded from: classes2.dex */
public final class k0 extends k2 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f35739b;

    /* renamed from: c  reason: collision with root package name */
    public final tr.i0 f35740c;

    /* renamed from: d  reason: collision with root package name */
    public final s.a f35741d;

    /* renamed from: e  reason: collision with root package name */
    public final io.grpc.c[] f35742e;

    public k0(tr.i0 i0Var, io.grpc.c[] cVarArr) {
        this(i0Var, s.a.PROCESSED, cVarArr);
    }

    @Override // vr.k2, vr.r
    public final void j(b1 b1Var) {
        b1Var.c(this.f35740c, "error");
        b1Var.c(this.f35741d, Constants.SCREEN_PROGRESS);
    }

    @Override // vr.k2, vr.r
    public final void n(s sVar) {
        sc.b.B("already started", !this.f35739b);
        this.f35739b = true;
        io.grpc.c[] cVarArr = this.f35742e;
        int length = cVarArr.length;
        int i6 = 0;
        while (true) {
            tr.i0 i0Var = this.f35740c;
            if (i6 < length) {
                cVarArr[i6].s(i0Var);
                i6++;
            } else {
                sVar.b(i0Var, this.f35741d, new tr.c0());
                return;
            }
        }
    }

    public k0(tr.i0 i0Var, s.a aVar, io.grpc.c[] cVarArr) {
        sc.b.s("error must not be OK", !i0Var.e());
        this.f35740c = i0Var;
        this.f35741d = aVar;
        this.f35742e = cVarArr;
    }
}
