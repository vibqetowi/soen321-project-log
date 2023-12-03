package hr;

import android.os.CountDownTimer;
/* compiled from: ScreenS41Fragment.kt */
/* loaded from: classes2.dex */
public final class v7 extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w7 f19300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(w7 w7Var, long j10) {
        super(j10, 1000L);
        this.f19300a = w7Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        long j10;
        w7 w7Var = this.f19300a;
        w7Var.f19356y = 0L;
        w7Var.Q();
        int i6 = w7Var.f19353v - 1;
        w7Var.f19353v = i6;
        if (i6 > 0) {
            if (i6 % 2 == 0) {
                j10 = w7Var.f19357z;
            } else if (i6 <= 1) {
                j10 = 1200000;
            } else {
                j10 = 300000;
            }
            w7Var.f19356y = j10;
            v7 v7Var = new v7(w7Var, j10);
            w7Var.f19354w = v7Var;
            v7Var.start();
            w7Var.P();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        w7 w7Var = this.f19300a;
        w7Var.f19356y = j10;
        w7Var.Q();
    }
}
