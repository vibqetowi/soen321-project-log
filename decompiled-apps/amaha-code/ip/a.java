package ip;

import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import jp.d;
import kotlin.jvm.internal.i;
import ya.e;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20505a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashScreenActivity f20506b;

    public /* synthetic */ a(SplashScreenActivity splashScreenActivity, int i6) {
        this.f20505a = i6;
        this.f20506b = splashScreenActivity;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        int i6 = this.f20505a;
        SplashScreenActivity this$0 = this.f20506b;
        switch (i6) {
            case 0:
                int i10 = SplashScreenActivity.G;
                i.g(this$0, "this$0");
                i.g(it, "e");
                d dVar = this$0.B;
                if (dVar != null) {
                    dVar.E = false;
                    dVar.D = true;
                    dVar.g();
                    LogHelper.INSTANCE.i(this$0.f11625w, "getDynamicLink:onFailure", it);
                    return;
                }
                i.q("splashScreenViewModel");
                throw null;
            default:
                int i11 = SplashScreenActivity.G;
                i.g(this$0, "this$0");
                i.g(it, "it");
                d dVar2 = this$0.B;
                if (dVar2 != null) {
                    dVar2.f();
                    return;
                } else {
                    i.q("splashScreenViewModel");
                    throw null;
                }
        }
    }
}
