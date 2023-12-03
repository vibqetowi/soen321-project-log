package hr;

import android.os.CountDownTimer;
/* compiled from: ScreenS125Fragment.kt */
/* loaded from: classes2.dex */
public final class g5 extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f5 f18452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(f5 f5Var, long j10) {
        super(j10, 1000L);
        this.f18452a = f5Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        f5 f5Var = this.f18452a;
        f5Var.f18374x = 0L;
        f5Var.M();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        f5 f5Var = this.f18452a;
        f5Var.f18374x = j10;
        f5Var.M();
    }
}
