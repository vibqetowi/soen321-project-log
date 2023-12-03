package zo;

import android.os.Bundle;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
/* compiled from: RecommendedActivityGifFragment.kt */
/* loaded from: classes2.dex */
public final class m implements MotionLayout.h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f39750u;

    public m(i iVar) {
        this.f39750u = iVar;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(int i6) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        i iVar = this.f39750u;
        bundle.putString("activity_id", iVar.S().getGoalId());
        bundle.putString("activity_name", iVar.S().getTitle());
        String lowerCase = iVar.S().getTemplateType().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", iVar.P().f11610y);
        bundle.putBoolean("goal_added", iVar.X);
        if (i6 == R.id.end) {
            iVar.D = false;
            bundle.putBoolean("default_state", false);
        } else {
            iVar.D = true;
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
