package hk;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.r0;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17632u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        super(0);
        this.f17632u = exptInitialAssessmentActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17632u;
        r0.a(exptInitialAssessmentActivity.getWindow(), false);
        com.google.firebase.messaging.j jVar = new com.google.firebase.messaging.j(5);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.i.u((ConstraintLayout) exptInitialAssessmentActivity.u0(R.id.parentLayoutAssessment), jVar);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView initialAssessmentCounter = (RobertoTextView) exptInitialAssessmentActivity.u0(R.id.initialAssessmentCounter);
        kotlin.jvm.internal.i.f(initialAssessmentCounter, "initialAssessmentCounter");
        insetsUtils.addStatusBarHeight(initialAssessmentCounter);
        LinearLayout initialAssessmentIcons = (LinearLayout) exptInitialAssessmentActivity.u0(R.id.initialAssessmentIcons);
        kotlin.jvm.internal.i.f(initialAssessmentIcons, "initialAssessmentIcons");
        insetsUtils.addStatusBarHeight(initialAssessmentIcons);
        ConstraintLayout parentLayoutAssessment = (ConstraintLayout) exptInitialAssessmentActivity.u0(R.id.parentLayoutAssessment);
        kotlin.jvm.internal.i.f(parentLayoutAssessment, "parentLayoutAssessment");
        insetsUtils.addBottomNavHeight(parentLayoutAssessment);
        return hs.k.f19476a;
    }
}
