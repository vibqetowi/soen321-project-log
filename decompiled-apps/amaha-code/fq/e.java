package fq;

import android.os.CountDownTimer;
/* compiled from: StaticNotify21Fragment.kt */
/* loaded from: classes2.dex */
public final class e extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f15695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, long j10) {
        super(j10, 1000L);
        this.f15695a = dVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        d dVar = this.f15695a;
        dVar.f15682x = 0L;
        dVar.Q();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        d dVar = this.f15695a;
        dVar.f15682x = j10;
        dVar.Q();
    }
}
