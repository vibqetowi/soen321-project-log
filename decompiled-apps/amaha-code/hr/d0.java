package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18273u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f18274v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f18275w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f18276x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18277y;

    public /* synthetic */ d0(TemplateActivity templateActivity, kotlin.jvm.internal.u uVar, String str, kotlin.jvm.internal.x xVar, int i6) {
        this.f18273u = i6;
        this.f18274v = templateActivity;
        this.f18275w = uVar;
        this.f18276x = str;
        this.f18277y = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18273u;
        kotlin.jvm.internal.x model = this.f18277y;
        String resultKey = this.f18276x;
        kotlin.jvm.internal.u setGoal = this.f18275w;
        TemplateActivity act = this.f18274v;
        switch (i6) {
            case 0:
                int i10 = e0.f18327w;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(setGoal, "$setGoal");
                kotlin.jvm.internal.i.g(resultKey, "$resultKey");
                kotlin.jvm.internal.i.g(model, "$model");
                Goal y02 = act.y0();
                if (y02 != null && setGoal.f23466u) {
                    y02.getData().put(resultKey, model.f23469u);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                if (act.getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    act.n0();
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 1:
                int i11 = z1.f19431w;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(setGoal, "$saveResult");
                kotlin.jvm.internal.i.g(resultKey, "$resultKey");
                kotlin.jvm.internal.i.g(model, "$model");
                Goal y03 = act.y0();
                if (y03 != null && setGoal.f23466u) {
                    y03.getData().put(resultKey, model.f23469u);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                act.t0();
                return;
            default:
                int i12 = z3.f19436w;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(setGoal, "$setGoal");
                kotlin.jvm.internal.i.g(resultKey, "$resultKey");
                kotlin.jvm.internal.i.g(model, "$model");
                Goal y04 = act.y0();
                if (y04 != null && setGoal.f23466u) {
                    y04.getData().put(resultKey, model.f23469u);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                if (act.getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    act.n0();
                    return;
                } else {
                    act.t0();
                    return;
                }
        }
    }
}
