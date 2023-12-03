package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.c6;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x5 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19388u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c6 f19389v;

    public /* synthetic */ x5(c6 c6Var, int i6) {
        this.f19388u = i6;
        this.f19389v = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i6 = this.f19388u;
        c6 this$0 = this.f19389v;
        switch (i6) {
            case 0:
                int i10 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.I) {
                    c6.c cVar = new c6.c();
                    AudioHelper audioHelper = this$0.G;
                    if (audioHelper != null) {
                        String str = this$0.f18244w;
                        kotlin.jvm.internal.i.d(str);
                        audioHelper.downloadAudioFile(str, cVar);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.f18244w;
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
                    String string2 = this$0.getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireActivity, string2);
                    return;
                } else {
                    return;
                }
            case 1:
                int i11 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).onBackPressed();
                return;
            case 2:
                int i12 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected()) {
                    this$0.K = true;
                    this$0.X(false);
                    this$0.O(false);
                    return;
                }
                Utils utils2 = Utils.INSTANCE;
                Context requireContext = this$0.requireContext();
                String string3 = this$0.getString(R.string.no_internet_msg);
                kotlin.jvm.internal.i.f(string3, "getString(R.string.no_internet_msg)");
                utils2.showCustomToast(requireContext, string3);
                return;
            case 3:
                int i13 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.O && this$0.S()) {
                    this$0.O = false;
                    this$0.Q(true);
                    ((RobertoButton) this$0._$_findCachedViewById(R.id.btnS15Button)).setVisibility(8);
                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.s15SkipButton)).setVisibility(0);
                    return;
                } else if (!this$0.A && !ConnectionStatusReceiver.isConnected()) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        Utils utils3 = Utils.INSTANCE;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (this$0.D.containsKey("s15_error_2")) {
                            string = UtilFunKt.paramsMapToString(this$0.D.get("s15_error_2"));
                        } else {
                            string = this$0.getString(R.string.no_internet_msg);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                        }
                        utils3.showCustomToast(requireActivity2, string);
                        return;
                    }
                    return;
                } else if (this$0.H) {
                    this$0.X(false);
                    this$0.K = true;
                    this$0.O(false);
                    return;
                } else {
                    this$0.P(this$0.B);
                    this$0.Q(true);
                    return;
                }
            case 4:
                int i14 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.M().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                    this$0.M().finish();
                    return;
                }
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity2).t0();
                return;
            default:
                int i15 = c6.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.M().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.M().getIntent().getStringExtra("source"), "goals")) {
                    this$0.M().n0();
                    return;
                }
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity3).t0();
                return;
        }
    }
}
