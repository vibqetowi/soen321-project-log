package hr;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.Utils;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g8 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18470u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f18471v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j8 f18472w;

    public /* synthetic */ g8(TemplateActivity templateActivity, j8 j8Var, int i6) {
        this.f18470u = i6;
        this.f18471v = templateActivity;
        this.f18472w = j8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rr.b j0Var;
        int i6 = this.f18470u;
        TemplateActivity act = this.f18471v;
        j8 this$0 = this.f18472w;
        switch (i6) {
            case 0:
                int i10 = j8.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                if (this$0.K().getPros().size() == 0 && this$0.K().getCons().size() == 0) {
                    Utils utils = Utils.INSTANCE;
                    Object obj = this$0.f18635x.get("s60_error");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    utils.showCustomToast(act, (String) obj);
                    return;
                }
                HashMap<String, Object> hashMap = act.F;
                hashMap.put("pros-and-cons", this$0.K());
                hashMap.put("s60_user_list", this$0.K());
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                rr.a aVar = (rr.a) activity;
                if (act.W) {
                    j0Var = new k0();
                } else {
                    j0Var = new j0();
                }
                aVar.s0(j0Var);
                return;
            case 1:
                int i11 = j8.A;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                act.F.put("s60_user_list", this$0.K());
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new hd.a(8, this$0);
                a1Var.b();
                return;
            default:
                int i12 = j8.A;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                act.F.put("s60_user_list", this$0.K());
                act.s0(new b0());
                return;
        }
    }

    public /* synthetic */ g8(j8 j8Var, TemplateActivity templateActivity) {
        this.f18470u = 0;
        this.f18472w = j8Var;
        this.f18471v = templateActivity;
    }
}
