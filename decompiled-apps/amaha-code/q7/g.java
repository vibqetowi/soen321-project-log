package q7;

import c9.w;
import com.google.android.exoplayer2.audio.a;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29256u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f29257v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f29258w;

    public /* synthetic */ g(int i6, long j10, Object obj) {
        this.f29256u = i6;
        this.f29258w = obj;
        this.f29257v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f29256u;
        long j10 = this.f29257v;
        Object obj = this.f29258w;
        switch (i6) {
            case 0:
                a.C0132a c0132a = (a.C0132a) obj;
                c0132a.getClass();
                int i10 = w.f5205a;
                c0132a.f6254b.W(j10);
                return;
            default:
                ExperimentProfileActivity this$0 = (ExperimentProfileActivity) obj;
                int i11 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.tvStatValue4Minutes);
                    if (robertoTextView != null) {
                        robertoTextView.setText(String.valueOf(j10 + 1));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e10);
                    return;
                }
        }
    }
}
