package sm;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: JournalThoughtDescriptionFragment.kt */
/* loaded from: classes2.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final Rect f31728u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f31729v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ s f31730w;

    public n(View view, s sVar) {
        this.f31729v = view;
        this.f31730w = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        Rect rect = this.f31728u;
        s sVar = this.f31730w;
        try {
            View view = this.f31729v;
            if (view != null) {
                boolean z11 = true;
                int applyDimension = (int) TypedValue.applyDimension(1, sVar.D, view.getResources().getDisplayMetrics());
                view.getWindowVisibleDisplayFrame(rect);
                if (view.getRootView().getHeight() - (rect.bottom - rect.top) >= applyDimension) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 == sVar.C) {
                    return;
                }
                sVar.C = z10;
                if (z10) {
                    androidx.fragment.app.p requireActivity = sVar.requireActivity();
                    kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                    ((JournalParentActivity) requireActivity).p0();
                    ConstraintLayout constraintLayout = (ConstraintLayout) sVar._$_findCachedViewById(R.id.clJournalThoughtDescriptionFooterNextCta);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) sVar._$_findCachedViewById(R.id.clJTSKeyboardOpenContainer);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                    RobertoEditText robertoEditText = (RobertoEditText) sVar._$_findCachedViewById(R.id.etJournalThoughtDescriptionDescriptionText);
                    if (robertoEditText == null || !robertoEditText.hasFocus()) {
                        z11 = false;
                    }
                    if (z11) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) sVar._$_findCachedViewById(R.id.clJTSKeyboardOpenContainer);
                        if (constraintLayout3 != null) {
                            constraintLayout3.setBackgroundTintList(g0.a.c(R.color.white, sVar.requireContext()));
                            return;
                        }
                        return;
                    }
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) sVar._$_findCachedViewById(R.id.clJTSKeyboardOpenContainer);
                    if (constraintLayout4 != null) {
                        constraintLayout4.setBackgroundTintList(g0.a.c(R.color.transparent, sVar.requireContext()));
                        return;
                    }
                    return;
                }
                ConstraintLayout constraintLayout5 = (ConstraintLayout) sVar._$_findCachedViewById(R.id.clJTSKeyboardOpenContainer);
                if (constraintLayout5 != null) {
                    constraintLayout5.setVisibility(8);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new tl.o(7, sVar), 100L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sVar.f31735v, e10);
        }
    }
}
