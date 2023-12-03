package fq;

import android.os.CountDownTimer;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: StaticS125Fragment.kt */
/* loaded from: classes2.dex */
public final class y extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f15825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, long j10) {
        super(j10, 1000L);
        this.f15825a = zVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        z zVar = this.f15825a;
        zVar.f15836x = 0L;
        if (zVar.isAdded()) {
            ((RobertoButton) zVar._$_findCachedViewById(R.id.btnS125Button)).setVisibility(0);
        }
        zVar.K();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        z zVar = this.f15825a;
        zVar.f15836x = j10;
        zVar.K();
    }
}
