package hr;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r5 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19084u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s5 f19085v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f19086w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f19087x;

    public /* synthetic */ r5(s5 s5Var, kotlin.jvm.internal.x xVar, TemplateActivity templateActivity, int i6) {
        this.f19084u = i6;
        this.f19085v = s5Var;
        this.f19086w = xVar;
        this.f19087x = templateActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rr.b t2Var;
        int i6 = this.f19084u;
        TemplateActivity act = this.f19087x;
        kotlin.jvm.internal.x model = this.f19086w;
        s5 this$0 = this.f19085v;
        switch (i6) {
            case 0:
                int i10 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(model, "$model");
                kotlin.jvm.internal.i.g(act, "$act");
                try {
                    if (this$0.f19151v.size() > 0) {
                        ((ScreenResult30Model) model.f23469u).setList(this$0.f19151v);
                        HashMap<String, Object> hashMap = act.F;
                        hashMap.put("screen_model_30", model.f23469u);
                        hashMap.put("s145_user_list", ((ScreenResult30Model) model.f23469u).getList());
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (((TemplateActivity) activity).W) {
                            t2Var = new v2();
                        } else {
                            t2Var = new t2();
                        }
                        act.s0(t2Var);
                        return;
                    }
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    String string = this$0.getString(R.string.enter_text);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                    utils.showCustomToast(activity2, string);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f19150u, "exception in on click listener", e10);
                    return;
                }
            case 1:
                int i11 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(model, "$model");
                kotlin.jvm.internal.i.g(act, "$act");
                this$0.M();
                ((ScreenResult30Model) model.f23469u).setList(this$0.f19151v);
                HashMap<String, Object> hashMap2 = act.F;
                hashMap2.put("screen_model_30", model.f23469u);
                hashMap2.put("s145_user_list", ((ScreenResult30Model) model.f23469u).getList());
                act.s0(new b0());
                return;
            default:
                int i12 = s5.f19149x;
                kotlin.jvm.internal.i.g(model, "$model");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                ((ScreenResult30Model) model.f23469u).setList(this$0.f19151v);
                HashMap<String, Object> hashMap3 = act.F;
                hashMap3.put("screen_model_30", model.f23469u);
                hashMap3.put("s145_user_list", ((ScreenResult30Model) model.f23469u).getList());
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new fq.s(this$0, 25);
                a1Var.b();
                return;
        }
    }

    public /* synthetic */ r5(kotlin.jvm.internal.x xVar, s5 s5Var, TemplateActivity templateActivity) {
        this.f19084u = 2;
        this.f19086w = xVar;
        this.f19085v = s5Var;
        this.f19087x = templateActivity;
    }
}
