package wo;

import android.os.CountDownTimer;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Arrays;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class q extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36984a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(60000L, 1000L);
        this.f36984a = nVar;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        String str;
        n nVar = this.f36984a;
        androidx.lifecycle.w<String> wVar = nVar.f36965h;
        nVar.getClass();
        try {
            long j11 = j10 / 1000;
            StringBuilder sb2 = new StringBuilder();
            long j12 = 60;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12)}, 1));
            kotlin.jvm.internal.i.f(format, "format(format, *args)");
            sb2.append(format);
            sb2.append(':');
            String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 % j12)}, 1));
            kotlin.jvm.internal.i.f(format2, "format(format, *args)");
            sb2.append(format2);
            str = sb2.toString();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(nVar.f36959a, e10);
            str = "";
        }
        wVar.i(str);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }
}
