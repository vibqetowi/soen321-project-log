package sq;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.j;
import com.google.android.material.snackbar.Snackbar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import sq.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31916u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f31917v;

    public /* synthetic */ s(u uVar, int i6) {
        this.f31916u = i6;
        this.f31917v = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f31916u;
        u this$0 = this.f31917v;
        switch (i6) {
            case 0:
                int i10 = u.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.B && !ConnectionStatusReceiver.isConnected()) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.startCTA)).setText("RETRY");
                        Snackbar.h((ConstraintLayout) this$0._$_findCachedViewById(R.id.a30parent), "Something went wrong. Try again after ensuring you are connected to a fast network and have enough memory on your phone.", -1).i();
                        return;
                    }
                    return;
                }
                this$0.Q();
                try {
                    ((RobertoButton) this$0._$_findCachedViewById(R.id.startCTA)).animate().translationY(60.0f).alpha(0.0f).setListener(new t(this$0));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f31919u, e10);
                }
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.timer)).setVisibility(0);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.skipPrompt)).setVisibility(0);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.skipPrompt)).setOnClickListener(new s(this$0, 2));
                if (ConnectionStatusReceiver.isConnected() || this$0.B) {
                    this$0.C = new j.b(this$0.requireContext()).a();
                    if (this$0.B) {
                        Utils utils = Utils.INSTANCE;
                        String str2 = this$0.A;
                        kotlin.jvm.internal.i.d(str2);
                        Context context = this$0.getContext();
                        kotlin.jvm.internal.i.d(context);
                        str = utils.getAudioFilePath(str2, context);
                    } else {
                        str = this$0.A;
                    }
                    com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(Uri.parse(str));
                    a0 a0Var = this$0.C;
                    if (a0Var != null) {
                        a0Var.h0(b10);
                        a0 a0Var2 = this$0.C;
                        if (a0Var2 != null) {
                            a0Var2.E(this$0);
                            a0 a0Var3 = this$0.C;
                            if (a0Var3 != null) {
                                a0Var3.l();
                                this$0.O(true);
                            } else {
                                kotlin.jvm.internal.i.q("simpleExoplayer");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("simpleExoplayer");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("simpleExoplayer");
                        throw null;
                    }
                }
                this$0.G = true;
                return;
            case 1:
                int i11 = u.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.G && this$0.P() && this$0.I) {
                    this$0.I = false;
                    ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).j();
                    a0 a0Var4 = this$0.C;
                    if (a0Var4 != null) {
                        a0Var4.z(true);
                        this$0.Q();
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tipText)).setVisibility(0);
                        return;
                    }
                    kotlin.jvm.internal.i.q("simpleExoplayer");
                    throw null;
                }
                return;
            case 2:
                int i12 = u.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                u.a aVar = this$0.f31920v;
                kotlin.jvm.internal.i.e(aVar, "null cannot be cast to non-null type android.os.CountDownTimer");
                aVar.cancel();
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity).A = true;
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity2).t0();
                return;
            default:
                int i13 = u.a.f31925b;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity3).t0();
                return;
        }
    }
}
