package dl;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12995u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f12996v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f12997w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f12998x;

    public /* synthetic */ d0(int i6, zm.m mVar, int i10) {
        this.f12995u = 3;
        this.f12996v = i6;
        this.f12998x = mVar;
        this.f12997w = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        int i6;
        IBinder iBinder;
        Editable text;
        String obj;
        String str3;
        int i10;
        IBinder iBinder2;
        yp.c cVar;
        RobertoEditText robertoEditText;
        yp.c cVar2;
        ConstraintLayout constraintLayout;
        yp.c cVar3;
        RobertoEditText robertoEditText2;
        Editable text2;
        String obj2;
        int i11 = this.f12997w;
        int i12 = this.f12996v;
        int i13 = this.f12995u;
        Object obj3 = this.f12998x;
        switch (i13) {
            case 0:
                V3DashboardActivity this$0 = (V3DashboardActivity) obj3;
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                RobertoEditText robertoEditText3 = (RobertoEditText) this$0.n0(R.id.etNPSBottomSheetFeedback);
                if (robertoEditText3 == null || (text = robertoEditText3.getText()) == null || (obj = text.toString()) == null) {
                    str = "";
                } else {
                    str = obj;
                }
                if (this$0.J0 == null) {
                    str2 = "self_care_nps_feedback_submit";
                    i6 = 0;
                } else {
                    ml.c0 P0 = this$0.P0();
                    str2 = "self_care_nps_feedback_submit";
                    i6 = 0;
                    ta.v.H(kc.f.H(P0), null, 0, new ml.u0(P0, i11, i12, str, null), 3);
                }
                BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.clNPSBottomSheet)).setState(4);
                Object systemService = this$0.getSystemService("input_method");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                RobertoEditText robertoEditText4 = (RobertoEditText) this$0.n0(R.id.etNPSBottomSheetFeedback);
                if (robertoEditText4 != null) {
                    iBinder = robertoEditText4.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, i6);
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                defpackage.e.s(bundle, "course", "type", "overall");
                bundle.putInt("rating", i11);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, str2);
                return;
            case 1:
                CustomDashboardActivity this$02 = (CustomDashboardActivity) obj3;
                int i15 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                v.c cVar4 = this$02.A;
                if (cVar4 == null || (cVar3 = (yp.c) cVar4.f34632w) == null || (robertoEditText2 = cVar3.f38737d) == null || (text2 = robertoEditText2.getText()) == null || (obj2 = text2.toString()) == null) {
                    str3 = "";
                } else {
                    str3 = obj2;
                }
                jl.e eVar = this$02.f10808w;
                if (eVar != null) {
                    i10 = 0;
                    ta.v.H(kc.f.H(eVar), null, 0, new jl.p(eVar, i11, i12, str3, null), 3);
                } else {
                    i10 = 0;
                }
                v.c cVar5 = this$02.A;
                if (cVar5 != null && (cVar2 = (yp.c) cVar5.f34632w) != null && (constraintLayout = cVar2.f38734a) != null) {
                    BottomSheetBehavior.from(constraintLayout).setState(4);
                }
                Object systemService2 = this$02.getSystemService("input_method");
                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                v.c cVar6 = this$02.A;
                if (cVar6 != null && (cVar = (yp.c) cVar6.f34632w) != null && (robertoEditText = cVar.f38737d) != null) {
                    iBinder2 = robertoEditText.getWindowToken();
                } else {
                    iBinder2 = null;
                }
                inputMethodManager2.hideSoftInputFromWindow(iBinder2, i10);
                String str5 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                defpackage.e.s(bundle2, "course", "type", "overall");
                bundle2.putInt("rating", i11);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "self_care_nps_feedback_submit");
                return;
            case 2:
                bm.r this$03 = (bm.r) obj3;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.G = i12;
                this$03.w(i11, true);
                this$03.k(0, this$03.H);
                return;
            case 3:
                zm.m this$04 = (zm.m) obj3;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (i12 == this$04.F) {
                    Extensions extensions = Extensions.INSTANCE;
                    Context context = this$04.B;
                    String string = context.getString(R.string.locked);
                    kotlin.jvm.internal.i.f(string, "context.getString(R.string.locked)");
                    Extensions.toast$default(extensions, context, string, 0, 2, null);
                    return;
                }
                CourseDayModelV1 courseDayModelV1 = this$04.f39670x.get(i11);
                kotlin.jvm.internal.i.d(courseDayModelV1);
                this$04.C.invoke(courseDayModelV1, Integer.valueOf(i11));
                return;
            default:
                po.b this$05 = (po.b) obj3;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                this$05.E = i12;
                this$05.v(i11, null);
                this$05.k(0, this$05.F);
                return;
        }
    }

    public /* synthetic */ d0(Object obj, int i6, int i10, int i11) {
        this.f12995u = i11;
        this.f12998x = obj;
        this.f12996v = i6;
        this.f12997w = i10;
    }
}
