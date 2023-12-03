package vm;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f35285u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LearningHubExperimentActivity f35286v;

    public /* synthetic */ e(LearningHubExperimentActivity learningHubExperimentActivity, int i6) {
        this.f35285u = i6;
        this.f35286v = learningHubExperimentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a.b s10;
        RecyclerView.e eVar;
        wm.b bVar;
        RecyclerView.e eVar2;
        wm.b bVar2;
        RecyclerView.e eVar3;
        int i6 = this.f35285u;
        LearningHubExperimentActivity this$0 = this.f35286v;
        switch (i6) {
            case 0:
                int i10 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                MotionLayout motionLayout = (MotionLayout) this$0.n0(R.id.mlLearningHubExperimentParent);
                if (motionLayout != null && (s10 = motionLayout.s(R.id.transitionLearningHubExperiment)) != null) {
                    s10.f1685o = true;
                }
                FrameLayout frameLayout = (FrameLayout) this$0.n0(R.id.flLearningHubExperimentSearchFragmentContainer);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                this$0.f11271x = true;
                y supportFragmentManager = this$0.getSupportFragmentManager();
                androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                l2.h(R.anim.slide_fade_in, R.anim.slide_fade_out, 0, 0);
                l2.f(R.id.flLearningHubExperimentSearchFragmentContainer, this$0.f11272y, null);
                l2.j();
                this$0.getWindow().setStatusBarColor(g0.a.b(this$0, R.color.login_grey_background));
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "cm_post_search_click");
                return;
            case 1:
                int i11 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                this$0.finish();
                return;
            case 2:
                int i12 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clLearningHubExperimentBottomSheet)).setState(4);
                return;
            case 3:
                int i13 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clLearningHubExperimentBottomSheet)).setState(3);
                Bundle bundle2 = new Bundle();
                defpackage.b.s(bundle2, "course", bundle2, "cm_post_filter_click");
                return;
            case 4:
                int i14 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                RecyclerView recyclerView = (RecyclerView) this$0.n0(R.id.rvLearningHubExperimentHistory);
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof wm.b) {
                    bVar = (wm.b) eVar;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.w("Read");
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.n0(R.id.ivLearningHubExperimentHistoryFilterAlert);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clLearningHubExperimentBottomSheet)).setState(4);
                RobertoTextView robertoTextView = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterRead);
                if (robertoTextView != null) {
                    robertoTextView.setTextColor(g0.a.b(this$0, R.color.sea));
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterUnread);
                if (robertoTextView2 != null) {
                    robertoTextView2.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterAll);
                if (robertoTextView3 != null) {
                    robertoTextView3.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                Bundle bundle3 = new Bundle();
                defpackage.e.s(bundle3, "course", "filter_selected", "read");
                gk.a.b(bundle3, "cm_post_filter_apply");
                return;
            case 5:
                int i15 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                RecyclerView recyclerView2 = (RecyclerView) this$0.n0(R.id.rvLearningHubExperimentHistory);
                if (recyclerView2 != null) {
                    eVar2 = recyclerView2.getAdapter();
                } else {
                    eVar2 = null;
                }
                if (eVar2 instanceof wm.b) {
                    bVar2 = (wm.b) eVar2;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    bVar2.w("Unread");
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.n0(R.id.ivLearningHubExperimentHistoryFilterAlert);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clLearningHubExperimentBottomSheet)).setState(4);
                RobertoTextView robertoTextView4 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterRead);
                if (robertoTextView4 != null) {
                    robertoTextView4.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterUnread);
                if (robertoTextView5 != null) {
                    robertoTextView5.setTextColor(g0.a.b(this$0, R.color.sea));
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterAll);
                if (robertoTextView6 != null) {
                    robertoTextView6.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                Bundle bundle4 = new Bundle();
                defpackage.e.s(bundle4, "course", "filter_selected", "unread");
                gk.a.b(bundle4, "cm_post_filter_apply");
                return;
            default:
                wm.b bVar3 = null;
                int i16 = LearningHubExperimentActivity.F;
                i.g(this$0, "this$0");
                RecyclerView recyclerView3 = (RecyclerView) this$0.n0(R.id.rvLearningHubExperimentHistory);
                if (recyclerView3 != null) {
                    eVar3 = recyclerView3.getAdapter();
                } else {
                    eVar3 = null;
                }
                if (eVar3 instanceof wm.b) {
                    bVar3 = eVar3;
                }
                if (bVar3 != null) {
                    bVar3.w("All");
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.n0(R.id.ivLearningHubExperimentHistoryFilterAlert);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                }
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clLearningHubExperimentBottomSheet)).setState(4);
                RobertoTextView robertoTextView7 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterRead);
                if (robertoTextView7 != null) {
                    robertoTextView7.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                RobertoTextView robertoTextView8 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterUnread);
                if (robertoTextView8 != null) {
                    robertoTextView8.setTextColor(g0.a.b(this$0, R.color.title_high_contrast));
                }
                RobertoTextView robertoTextView9 = (RobertoTextView) this$0.n0(R.id.tvLearningHubExperimentBottomSheetFilterAll);
                if (robertoTextView9 != null) {
                    robertoTextView9.setTextColor(g0.a.b(this$0, R.color.sea));
                }
                Bundle bundle5 = new Bundle();
                defpackage.e.s(bundle5, "course", "filter_selected", "all");
                gk.a.b(bundle5, "cm_post_filter_apply");
                return;
        }
    }
}
