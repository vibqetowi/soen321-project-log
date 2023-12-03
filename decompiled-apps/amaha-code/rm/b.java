package rm;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import tl.o;
/* compiled from: JournalTodayQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final Rect f30792u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f30793v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ h f30794w;

    public b(View view, h hVar) {
        this.f30793v = view;
        this.f30794w = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        Rect rect = this.f30792u;
        h hVar = this.f30794w;
        try {
            View view = this.f30793v;
            if (view != null) {
                boolean z11 = true;
                int applyDimension = (int) TypedValue.applyDimension(1, hVar.G, view.getResources().getDisplayMetrics());
                view.getWindowVisibleDisplayFrame(rect);
                if (view.getRootView().getHeight() - (rect.bottom - rect.top) >= applyDimension) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 == hVar.F) {
                    return;
                }
                hVar.F = z10;
                if (z10) {
                    p requireActivity = hVar.requireActivity();
                    kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                    ((JournalParentActivity) requireActivity).p0();
                    ConstraintLayout constraintLayout = (ConstraintLayout) hVar._$_findCachedViewById(R.id.clJournalQuestionFooterNextCta);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hVar._$_findCachedViewById(R.id.clJournalQuestionKeyboardOpenContainer);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                    RobertoEditText robertoEditText = (RobertoEditText) hVar._$_findCachedViewById(R.id.etJournalQuestionDescriptionText);
                    if (robertoEditText == null || !robertoEditText.hasFocus()) {
                        z11 = false;
                    }
                    if (z11) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) hVar._$_findCachedViewById(R.id.clJournalQuestionKeyboardOpenContainer);
                        if (constraintLayout3 != null) {
                            constraintLayout3.setBackgroundTintList(g0.a.c(R.color.white, hVar.requireContext()));
                            return;
                        }
                        return;
                    }
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) hVar._$_findCachedViewById(R.id.clJournalQuestionKeyboardOpenContainer);
                    if (constraintLayout4 != null) {
                        constraintLayout4.setBackgroundTintList(g0.a.c(R.color.transparent, hVar.requireContext()));
                        return;
                    }
                    return;
                }
                ConstraintLayout constraintLayout5 = (ConstraintLayout) hVar._$_findCachedViewById(R.id.clJournalQuestionKeyboardOpenContainer);
                if (constraintLayout5 != null) {
                    constraintLayout5.setVisibility(8);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new o(6, hVar), 100L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(hVar.f30800v, e10);
        }
    }
}
