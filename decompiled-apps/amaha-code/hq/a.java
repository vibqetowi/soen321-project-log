package hq;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import com.google.android.exoplayer2.a0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import hq.e;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18095u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f18096v;

    public /* synthetic */ a(e eVar, int i6) {
        this.f18095u = i6;
        this.f18096v = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var;
        int i6 = this.f18095u;
        e this$0 = this.f18096v;
        switch (i6) {
            case 0:
                int i10 = e.Q;
                i.g(this$0, "this$0");
                p activity = this$0.getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity).t0();
                return;
            case 1:
                int i11 = e.Q;
                i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.I) {
                    e.d dVar = new e.d();
                    AudioHelper audioHelper = this$0.F;
                    if (audioHelper != null) {
                        String str = this$0.f18105v;
                        i.d(str);
                        audioHelper.downloadAudioFile(str, dVar);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f18105v;
                        i.d(str2);
                        analyticsBundle.putString(Constants.NOTIFICATION_URL, str2);
                        gk.a.b(analyticsBundle, "activity_audio_download_start");
                        return;
                    }
                    i.q("audioHelper");
                    throw null;
                } else if (!ConnectionStatusReceiver.isConnected()) {
                    Utils utils = Utils.INSTANCE;
                    p requireActivity = this$0.requireActivity();
                    String string = this$0.getString(R.string.no_internet_msg);
                    i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireActivity, string);
                    return;
                } else {
                    return;
                }
            default:
                int i12 = e.Q;
                i.g(this$0, "this$0");
                if (!this$0.J && (((a0Var = this$0.M) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || this$0.H))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        this$0.b0(true);
                        return;
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        this$0.b0(false);
                        this$0.Q(false);
                        return;
                    } else {
                        return;
                    }
                }
                this$0.U(true);
                return;
        }
    }
}
