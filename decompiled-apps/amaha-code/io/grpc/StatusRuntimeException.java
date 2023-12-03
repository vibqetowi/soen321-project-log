package io.grpc;

import tr.i0;
/* loaded from: classes2.dex */
public class StatusRuntimeException extends RuntimeException {

    /* renamed from: u  reason: collision with root package name */
    public final i0 f20424u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f20425v;

    public StatusRuntimeException(i0 i0Var) {
        super(i0.b(i0Var), i0Var.f33493c);
        this.f20424u = i0Var;
        this.f20425v = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        Throwable th2;
        if (this.f20425v) {
            th2 = super.fillInStackTrace();
        } else {
            th2 = this;
        }
        return th2;
    }
}
