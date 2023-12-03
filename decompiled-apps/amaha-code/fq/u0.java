package fq;

import android.os.CountDownTimer;
/* compiled from: StaticS41Fragment.kt */
/* loaded from: classes2.dex */
public final class u0 extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f15806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, long j10) {
        super(j10, 1000L);
        this.f15806a = v0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        long j10;
        v0 v0Var = this.f15806a;
        v0Var.f15815y = 0L;
        v0Var.P();
        int i6 = v0Var.f15812v - 1;
        v0Var.f15812v = i6;
        if (i6 > 0) {
            if (i6 % 2 == 0) {
                j10 = v0Var.f15816z;
            } else if (i6 <= 1) {
                j10 = 1200000;
            } else {
                j10 = 300000;
            }
            v0Var.f15815y = j10;
            u0 u0Var = new u0(v0Var, j10);
            v0Var.f15813w = u0Var;
            u0Var.start();
            v0Var.O();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        v0 v0Var = this.f15806a;
        v0Var.f15815y = j10;
        v0Var.P();
    }
}
