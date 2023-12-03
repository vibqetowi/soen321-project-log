package yq;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import com.google.android.exoplayer2.a0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import kotlin.jvm.internal.i;
import yq.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f38890u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f38891v;

    public /* synthetic */ b(f fVar, int i6) {
        this.f38890u = i6;
        this.f38891v = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a0 a0Var;
        int i6 = this.f38890u;
        f this$0 = this.f38891v;
        switch (i6) {
            case 0:
                int i10 = f.R;
                i.g(this$0, "this$0");
                p activity = this$0.getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
                return;
            case 1:
                int i11 = f.R;
                i.g(this$0, "this$0");
                p activity2 = this$0.getActivity();
                i.d(activity2);
                activity2.finish();
                return;
            case 2:
                int i12 = f.R;
                i.g(this$0, "this$0");
                if (!this$0.K && (((a0Var = this$0.N) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || this$0.I))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        this$0.k0(true);
                        return;
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        this$0.k0(false);
                        this$0.U(false);
                        return;
                    } else {
                        return;
                    }
                }
                this$0.Z(true);
                return;
            default:
                int i13 = f.R;
                i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.J) {
                    f.d dVar = new f.d();
                    AudioHelper audioHelper = this$0.G;
                    if (audioHelper != null) {
                        String str = this$0.f38903y;
                        i.d(str);
                        audioHelper.downloadAudioFile(str, dVar);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f38903y;
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
        }
    }
}
