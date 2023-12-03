package mi;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25141u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f25142v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25143w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f25144x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f25145y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f25146z;

    public /* synthetic */ b2(NewDynamicParentActivity newDynamicParentActivity, Integer num, String str, boolean z10, kotlin.jvm.internal.x xVar) {
        this.f25143w = newDynamicParentActivity;
        this.f25144x = num;
        this.f25145y = str;
        this.f25142v = z10;
        this.f25146z = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f25141u;
        boolean z10 = this.f25142v;
        Object obj = this.f25146z;
        Object obj2 = this.f25145y;
        Object obj3 = this.f25144x;
        Object obj4 = this.f25143w;
        switch (i6) {
            case 0:
                e2 this$0 = (e2) obj4;
                Activity activity = (Activity) obj3;
                View view = (View) obj2;
                pi.d payload = (pi.d) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ih.p pVar = this$0.f25171a;
                kotlin.jvm.internal.i.g(activity, "$activity");
                kotlin.jvm.internal.i.g(view, "$view");
                kotlin.jvm.internal.i.g(payload, "$payload");
                try {
                    i1.f25206a.getClass();
                    if (i1.a(pVar).f35176i) {
                        i1.a(pVar);
                        hh.g.b(pVar.f20105d, 0, new c2(this$0), 3);
                        return;
                    }
                    View rootView = activity.getWindow().getDecorView().findViewById(16908290).getRootView();
                    if (rootView != null) {
                        FrameLayout frameLayout = (FrameLayout) rootView;
                        j1.a(frameLayout, view, payload, z10);
                        if (payload.d() > 0) {
                            f6.a aVar = new f6.a(frameLayout, view, this$0, activity, payload, 1);
                            this$0.f25173c = aVar;
                            bh.b.f4298b.postDelayed(aVar, payload.d() * 1000);
                        }
                        if (!z10) {
                            i1.b(pVar).b(activity, payload);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                } catch (Exception e10) {
                    pVar.f20105d.a(1, e10, new d2(this$0));
                    return;
                }
            default:
                NewDynamicParentActivity this$02 = (NewDynamicParentActivity) obj4;
                Integer num = (Integer) obj3;
                String str = (String) obj2;
                kotlin.jvm.internal.x transitionNavOptions = (kotlin.jvm.internal.x) obj;
                int i10 = NewDynamicParentActivity.F;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(transitionNavOptions, "$transitionNavOptions");
                try {
                    this$02.z0(num.intValue(), str, z10, (s1.a0) transitionNavOptions.f23469u);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$02.f10901w, e11);
                    return;
                }
        }
    }

    public /* synthetic */ b2(e2 e2Var, Activity activity, RelativeLayout relativeLayout, pi.d dVar, boolean z10) {
        this.f25143w = e2Var;
        this.f25144x = activity;
        this.f25145y = relativeLayout;
        this.f25146z = dVar;
        this.f25142v = z10;
    }
}
