package mk;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class c implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25328u;

    public c(BookmarkingActivity bookmarkingActivity) {
        this.f25328u = bookmarkingActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((ConstraintLayout) this.f25328u.n0(R.id.clBookmarkBottomSheetContainer2)).setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
