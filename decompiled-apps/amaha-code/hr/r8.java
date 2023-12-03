package hr;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r8 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19097u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f19098v;

    public /* synthetic */ r8(int i6, Object obj) {
        this.f19097u = i6;
        this.f19098v = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f19097u;
        Object obj = this.f19098v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.x act = (kotlin.jvm.internal.x) obj;
                int i10 = s8.C;
                kotlin.jvm.internal.i.g(act, "$act");
                ((TemplateActivity) act.f23469u).onBackPressed();
                return;
            case 1:
                t8 this$0 = (t8) obj;
                int i11 = t8.f19209z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            case 2:
                u8 this$02 = (u8) obj;
                int i12 = u8.f19252w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                androidx.fragment.app.p activity2 = this$02.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).t0();
                return;
            case 3:
                z8 this$03 = (z8) obj;
                int i13 = z8.f19454w;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                androidx.fragment.app.p activity3 = this$03.getActivity();
                kotlin.jvm.internal.i.d(activity3);
                activity3.onBackPressed();
                androidx.fragment.app.p activity4 = this$03.getActivity();
                kotlin.jvm.internal.i.d(activity4);
                activity4.onBackPressed();
                return;
            case 4:
                a9 this$04 = (a9) obj;
                int i14 = a9.f18163w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                androidx.fragment.app.p activity5 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity5).t0();
                return;
            case 5:
                b9 this$05 = (b9) obj;
                int i15 = b9.f18209w;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                Context context = this$05.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$05._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new hd.a(13, this$05);
                a1Var.b();
                return;
            case 6:
                h9 this$06 = (h9) obj;
                int i16 = h9.f18549w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                androidx.fragment.app.p activity6 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity6).t0();
                return;
            case 7:
                ca this$07 = (ca) obj;
                int i17 = ca.f18266w;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                Editable text = ((RobertoEditText) this$07._$_findCachedViewById(R.id.etS97Input)).getText();
                if (text != null && text.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity7 = this$07.getActivity();
                    kotlin.jvm.internal.i.d(activity7);
                    String string = this$07.getString(R.string.enter_number);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.enter_number)");
                    utils.showCustomToast(activity7, string);
                    return;
                }
                androidx.fragment.app.p activity8 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity = (TemplateActivity) activity8;
                int parseInt = Integer.parseInt(String.valueOf(((RobertoEditText) this$07._$_findCachedViewById(R.id.etS97Input)).getText()));
                Object obj2 = templateActivity.F.get("sleep_duration");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                if (parseInt < Integer.parseInt((String) obj2)) {
                    Utils.INSTANCE.showCustomToast(templateActivity, "Duration can't be less than Sleep Time");
                    return;
                }
                HashMap<String, Object> hashMap = templateActivity.F;
                hashMap.put("s97_user_data", String.valueOf(((RobertoEditText) this$07._$_findCachedViewById(R.id.etS97Input)).getText()));
                hashMap.put("other_duration", String.valueOf(((RobertoEditText) this$07._$_findCachedViewById(R.id.etS97Input)).getText()));
                templateActivity.s0(new ea());
                return;
            default:
                int i18 = jr.a.f22571w;
                ((jr.a) obj).getActivity().finish();
                return;
        }
    }
}
