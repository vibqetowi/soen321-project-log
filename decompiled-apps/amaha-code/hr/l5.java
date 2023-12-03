package hr;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import hr.p5;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18746u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p5 f18747v;

    public /* synthetic */ l5(p5 p5Var, int i6) {
        this.f18746u = i6;
        this.f18747v = p5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.exoplayer2.a0 a0Var;
        int i6 = this.f18746u;
        p5 this$0 = this.f18747v;
        switch (i6) {
            case 0:
                int i10 = p5.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.H && (((a0Var = this$0.L) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || this$0.F))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        this$0.h0(true);
                        return;
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        this$0.h0(false);
                        ((ProgressBar) this$0._$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(0);
                        this$0.Q(false);
                        return;
                    } else {
                        return;
                    }
                }
                this$0.X(true);
                return;
            default:
                int i11 = p5.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.G) {
                    p5.d dVar = new p5.d();
                    AudioHelper audioHelper = this$0.D;
                    if (audioHelper != null) {
                        String str = this$0.f18960v;
                        kotlin.jvm.internal.i.d(str);
                        audioHelper.downloadAudioFile(str, dVar);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f18960v;
                        kotlin.jvm.internal.i.d(str2);
                        analyticsBundle.putString(Constants.NOTIFICATION_URL, str2);
                        gk.a.b(analyticsBundle, "activity_audio_download_start");
                        return;
                    }
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                } else if (!ConnectionStatusReceiver.isConnected()) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p requireActivity = this$0.requireActivity();
                    String string = this$0.getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireActivity, string);
                    return;
                } else {
                    return;
                }
        }
    }
}
