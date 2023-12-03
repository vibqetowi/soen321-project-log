package fl;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15133u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15134v;

    public /* synthetic */ c(CustomDashboardActivity customDashboardActivity, int i6) {
        this.f15133u = i6;
        this.f15134v = customDashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yp.c cVar;
        DrawerLayout drawerLayout;
        yp.c cVar2;
        yp.c cVar3;
        yp.c cVar4;
        yp.c cVar5;
        ConstraintLayout constraintLayout;
        yp.c cVar6;
        yp.c cVar7;
        yp.c cVar8;
        yp.c cVar9;
        yp.c cVar10;
        yp.c cVar11;
        yp.c cVar12;
        int i6 = this.f15133u;
        AppCompatSeekBar appCompatSeekBar = null;
        CustomDashboardActivity this$0 = this.f15134v;
        switch (i6) {
            case 0:
                int i10 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar13 = this$0.A;
                if (cVar13 != null && (drawerLayout = (DrawerLayout) cVar13.f34634y) != null) {
                    drawerLayout.c();
                    return;
                }
                return;
            case 1:
                int i11 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar14 = this$0.A;
                if (cVar14 != null && (cVar2 = (yp.c) cVar14.f34632w) != null) {
                    appCompatSeekBar = cVar2.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(8);
                    return;
                }
                return;
            case 2:
                int i12 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar15 = this$0.A;
                if (cVar15 != null && (cVar3 = (yp.c) cVar15.f34632w) != null) {
                    appCompatSeekBar = cVar3.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(9);
                    return;
                }
                return;
            case 3:
                int i13 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar16 = this$0.A;
                if (cVar16 != null && (cVar4 = (yp.c) cVar16.f34632w) != null) {
                    appCompatSeekBar = cVar4.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(10);
                    return;
                }
                return;
            case 4:
                int i14 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar17 = this$0.A;
                if (cVar17 != null && (cVar5 = (yp.c) cVar17.f34632w) != null && (constraintLayout = cVar5.f38734a) != null) {
                    BottomSheetBehavior.from(constraintLayout).setState(4);
                }
                String str = gk.a.f16573a;
                Bundle bundle = new Bundle();
                defpackage.e.s(bundle, "course", "type", "overall");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "self_care_nps_cancel");
                return;
            case 5:
                int i15 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar18 = this$0.A;
                if (cVar18 != null && (cVar6 = (yp.c) cVar18.f34632w) != null) {
                    appCompatSeekBar = cVar6.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(0);
                    return;
                }
                return;
            case 6:
                int i16 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar19 = this$0.A;
                if (cVar19 != null && (cVar7 = (yp.c) cVar19.f34632w) != null) {
                    appCompatSeekBar = cVar7.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(1);
                    return;
                }
                return;
            case 7:
                int i17 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar20 = this$0.A;
                if (cVar20 != null && (cVar8 = (yp.c) cVar20.f34632w) != null) {
                    appCompatSeekBar = cVar8.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(2);
                    return;
                }
                return;
            case 8:
                int i18 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar21 = this$0.A;
                if (cVar21 != null && (cVar9 = (yp.c) cVar21.f34632w) != null) {
                    appCompatSeekBar = cVar9.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(3);
                    return;
                }
                return;
            case 9:
                int i19 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar22 = this$0.A;
                if (cVar22 != null && (cVar10 = (yp.c) cVar22.f34632w) != null) {
                    appCompatSeekBar = cVar10.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(4);
                    return;
                }
                return;
            case 10:
                int i20 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar23 = this$0.A;
                if (cVar23 != null && (cVar11 = (yp.c) cVar23.f34632w) != null) {
                    appCompatSeekBar = cVar11.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(5);
                    return;
                }
                return;
            case 11:
                int i21 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar24 = this$0.A;
                if (cVar24 != null && (cVar12 = (yp.c) cVar24.f34632w) != null) {
                    appCompatSeekBar = cVar12.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(6);
                    return;
                }
                return;
            default:
                int i22 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                v.c cVar25 = this$0.A;
                if (cVar25 != null && (cVar = (yp.c) cVar25.f34632w) != null) {
                    appCompatSeekBar = cVar.f38743k;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(7);
                    return;
                }
                return;
        }
    }
}
