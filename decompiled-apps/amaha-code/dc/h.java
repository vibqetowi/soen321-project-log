package dc;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.a0;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertStoriesActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12748u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f12749v;

    public /* synthetic */ h(int i6, Object obj) {
        this.f12748u = i6;
        this.f12749v = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        boolean z10;
        a0 a0Var;
        int i6 = this.f12748u;
        Object obj = this.f12749v;
        switch (i6) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                if (event.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f12761o;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        kVar.f12759m = false;
                    }
                    kVar.u();
                    kVar.f12759m = true;
                    kVar.f12761o = System.currentTimeMillis();
                }
                return false;
            case 1:
                ExpertStoriesActivity this$0 = (ExpertStoriesActivity) obj;
                int i10 = ExpertStoriesActivity.I;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(event, "event");
                try {
                    int pointerCount = event.getPointerCount();
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        int actionMasked = event.getActionMasked();
                        if (actionMasked != 0) {
                            if (actionMasked != 1) {
                                if (actionMasked == 2 && System.currentTimeMillis() - this$0.C >= 200 && (a0Var = this$0.f11142v) != null) {
                                    a0Var.z(false);
                                }
                            } else if (System.currentTimeMillis() - this$0.C < 200) {
                                float x10 = event.getX();
                                event.getY();
                                String str = "therapy";
                                if (x10 <= this$0.B) {
                                    String str2 = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("source", "app_km_video");
                                    if (!this$0.E) {
                                        str = "psychiatry";
                                    }
                                    bundle.putString("flow", str);
                                    bundle.putInt("step_num", this$0.f11144x + 1);
                                    hs.k kVar2 = hs.k.f19476a;
                                    gk.a.b(bundle, "therapy_psychiatry_km_step");
                                    int i12 = this$0.f11144x;
                                    if (i12 > 0) {
                                        this$0.F = false;
                                        this$0.f11144x = i12 - 1;
                                        this$0.q0();
                                    }
                                } else {
                                    String str3 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("source", "app_km_video");
                                    if (!this$0.E) {
                                        str = "psychiatry";
                                    }
                                    bundle2.putString("flow", str);
                                    bundle2.putInt("step_num", this$0.f11144x + 1);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle2, "therapy_psychiatry_km_step");
                                    int i13 = this$0.f11144x;
                                    if (i13 < 3) {
                                        this$0.F = false;
                                        this$0.f11144x = i13 + 1;
                                        this$0.q0();
                                    }
                                }
                            } else {
                                a0 a0Var2 = this$0.f11142v;
                                if (a0Var2 != null) {
                                    a0Var2.z(true);
                                }
                            }
                        } else {
                            this$0.C = System.currentTimeMillis();
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.A, e10);
                }
                return true;
            case 2:
                ho.f this$02 = (ho.f) obj;
                int i14 = ho.f.f17995x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.J(-1);
                view.performClick();
                return false;
            case 3:
                ho.m this$03 = (ho.m) obj;
                int i15 = ho.m.f18019x;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.J(-1);
                view.performClick();
                return false;
            case 4:
                GestureDetector gestureDetector = (GestureDetector) obj;
                int i16 = ho.n.f18024z;
                kotlin.jvm.internal.i.g(gestureDetector, "$gestureDetector");
                return gestureDetector.onTouchEvent(event);
            case 5:
                ExperimentProfileActivity this$04 = (ExperimentProfileActivity) obj;
                int i17 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (event.getAction() == 1) {
                    view.performClick();
                }
                return this$04.J;
            default:
                ((zp.c) obj).f39793v.c(3000);
                return false;
        }
    }
}
