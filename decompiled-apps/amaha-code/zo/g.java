package zo;

import android.os.Bundle;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
/* compiled from: RecommendedActivityAudioFragment.kt */
/* loaded from: classes2.dex */
public final class g implements MotionLayout.h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f39712u;

    public g(e eVar) {
        this.f39712u = eVar;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(int i6) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        e eVar = this.f39712u;
        bundle.putString("activity_id", eVar.Q().getGoalId());
        bundle.putString("activity_name", eVar.Q().getTitle());
        String lowerCase = eVar.Q().getTemplateType().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", eVar.O().f11610y);
        bundle.putBoolean("goal_added", eVar.C);
        if (i6 == R.id.end) {
            eVar.X = false;
            bundle.putBoolean("default_state", false);
        } else {
            eVar.X = true;
            bundle.putBoolean("default_state", true);
        }
        gk.a.b(bundle, "activity_bottom_sheet_drag");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void b() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void c() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void d() {
    }
}
