package qm;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: JournalBasicFragment.kt */
/* loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final Rect f29867u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f29868v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f29869w;

    public d(View view, j jVar) {
        this.f29868v = view;
        this.f29869w = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        View view = this.f29868v;
        if (view != null) {
            j jVar = this.f29869w;
            boolean z11 = true;
            int applyDimension = (int) TypedValue.applyDimension(1, jVar.F, view.getResources().getDisplayMetrics());
            Rect rect = this.f29867u;
            view.getWindowVisibleDisplayFrame(rect);
            if (view.getRootView().getHeight() - (rect.bottom - rect.top) >= applyDimension) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 == jVar.D) {
                return;
            }
            jVar.D = z10;
            if (z10) {
                androidx.fragment.app.p requireActivity = jVar.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                ((JournalParentActivity) requireActivity).p0();
                ConstraintLayout constraintLayout = (ConstraintLayout) jVar._$_findCachedViewById(R.id.clJournalBasicFooterContainer);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) jVar._$_findCachedViewById(R.id.clJournalBasicKeyboardOpenContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                RobertoEditText robertoEditText = (RobertoEditText) jVar._$_findCachedViewById(R.id.etJournalBasicTitleText);
                if ((robertoEditText == null || !robertoEditText.hasFocus()) ? false : false) {
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) jVar._$_findCachedViewById(R.id.clJournalBasicKeyboardOpenContainer);
                    if (constraintLayout3 != null) {
                        constraintLayout3.setBackgroundTintList(g0.a.c(R.color.white, jVar.requireContext()));
                        return;
                    }
                    return;
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) jVar._$_findCachedViewById(R.id.clJournalBasicKeyboardOpenContainer);
                if (constraintLayout4 != null) {
                    constraintLayout4.setBackgroundTintList(g0.a.c(R.color.transparent, jVar.requireContext()));
                    return;
                }
                return;
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) jVar._$_findCachedViewById(R.id.clJournalBasicKeyboardOpenContainer);
            if (constraintLayout5 != null) {
                constraintLayout5.setVisibility(8);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new tl.o(5, jVar), 100L);
        }
    }
}
