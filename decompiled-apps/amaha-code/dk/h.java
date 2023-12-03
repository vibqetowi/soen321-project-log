package dk;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.a1;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12924u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniCourseActivity f12925v;

    public /* synthetic */ h(MiniCourseActivity miniCourseActivity, int i6) {
        this.f12924u = i6;
        this.f12925v = miniCourseActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f12924u;
        MiniCourseActivity this$0 = this.f12925v;
        switch (i6) {
            case 0:
                MiniCourseActivity.u0(this$0);
                return;
            case 1:
                int i10 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                a1 a1Var = new a1(this$0, (AppCompatImageView) this$0.v0(R.id.miniCourseMoreOptions));
                k.f a10 = a1Var.a();
                androidx.appcompat.view.menu.f fVar = a1Var.f1344b;
                a10.inflate(R.menu.topical_card_menu, fVar);
                fVar.findItem(R.id.action_remove_card).setTitle(this$0.getString(R.string.resetMinicourseCta));
                a1Var.f1346d = new am.w(11, this$0);
                a1Var.b();
                return;
            case 2:
                int i11 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(8);
                    return;
                }
                return;
            case 3:
                int i12 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar2 != null) {
                    appCompatSeekBar2.setProgress(9);
                    return;
                }
                return;
            case 4:
                int i13 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar3 != null) {
                    appCompatSeekBar3.setProgress(10);
                    return;
                }
                return;
            case 5:
                int i14 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                BottomSheetBehavior.from((ConstraintLayout) this$0.v0(R.id.clNPSBottomSheet)).setState(4);
                String str = gk.a.f16573a;
                Bundle bundle = new Bundle();
                defpackage.e.s(bundle, "course", "type", "foundation_course");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "self_care_nps_cancel");
                return;
            case 6:
                int i15 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar4 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar4 != null) {
                    appCompatSeekBar4.setProgress(0);
                    return;
                }
                return;
            case 7:
                int i16 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar5 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar5 != null) {
                    appCompatSeekBar5.setProgress(1);
                    return;
                }
                return;
            case 8:
                int i17 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar6 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar6 != null) {
                    appCompatSeekBar6.setProgress(2);
                    return;
                }
                return;
            case 9:
                int i18 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar7 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar7 != null) {
                    appCompatSeekBar7.setProgress(3);
                    return;
                }
                return;
            case 10:
                int i19 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar8 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar8 != null) {
                    appCompatSeekBar8.setProgress(4);
                    return;
                }
                return;
            case 11:
                int i20 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar9 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar9 != null) {
                    appCompatSeekBar9.setProgress(5);
                    return;
                }
                return;
            case 12:
                int i21 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar10 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar10 != null) {
                    appCompatSeekBar10.setProgress(6);
                    return;
                }
                return;
            case 13:
                int i22 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                AppCompatSeekBar appCompatSeekBar11 = (AppCompatSeekBar) this$0.v0(R.id.sbNPSSelector);
                if (appCompatSeekBar11 != null) {
                    appCompatSeekBar11.setProgress(7);
                    return;
                }
                return;
            case 14:
                int i23 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && this$0.B) {
                    boolean contains = ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion());
                    int i24 = this$0.L;
                    if (contains) {
                        this$0.startActivityForResult(tr.r.s(this$0, true).putExtra("source", "mini_course_activity").putExtra(Constants.CAMPAIGN_ID, this$0.M), i24);
                        return;
                    } else {
                        this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "basic_course_screen"), i24);
                        return;
                    }
                }
                this$0.C0();
                ((ScrollView) this$0.v0(R.id.lockedViewScroll)).setVisibility(8);
                ((AppCompatImageView) this$0.v0(R.id.miniCourseMoreOptions)).setVisibility(0);
                return;
            default:
                int i25 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                    this$0.startActivityForResult(tr.r.s(this$0, true).putExtra("source", "mini_course_activity").putExtra(Constants.CAMPAIGN_ID, this$0.M), this$0.L);
                    return;
                } else {
                    this$0.startActivity(tr.r.s(this$0, false).putExtra("source", "mini_course_activity"));
                    return;
                }
        }
    }
}
