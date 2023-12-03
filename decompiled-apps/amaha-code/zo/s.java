package zo;

import android.os.Bundle;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
/* compiled from: RecommendedActivityPhysicalFragment.kt */
/* loaded from: classes2.dex */
public final class s implements MotionLayout.h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f39781u;

    public s(p pVar) {
        this.f39781u = pVar;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(int i6) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        p pVar = this.f39781u;
        bundle.putString("activity_id", pVar.P().getGoalId());
        bundle.putString("activity_name", pVar.P().getTitle());
        String lowerCase = pVar.P().getTemplateType().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", pVar.O().f11610y);
        bundle.putBoolean("goal_added", pVar.f39761z);
        if (i6 == R.id.end) {
            pVar.G = false;
            bundle.putBoolean("default_state", false);
        } else {
            pVar.G = true;
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
