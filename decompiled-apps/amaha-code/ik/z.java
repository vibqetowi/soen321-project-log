package ik;

import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements a3.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20348a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20349b;

    public /* synthetic */ z(int i6, Object obj) {
        this.f20348a = i6;
        this.f20349b = obj;
    }

    @Override // a3.m
    public final void onResult(Object obj) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        int i6 = this.f20348a;
        Object obj2 = this.f20349b;
        switch (i6) {
            case 0:
                x this$0 = (x) obj2;
                a3.c cVar = (a3.c) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (cVar != null) {
                    this$0.C = cVar;
                    return;
                }
                return;
            case 1:
                x this$02 = (x) obj2;
                a3.c cVar2 = (a3.c) obj;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (cVar2 != null) {
                    this$02.D = cVar2;
                    return;
                }
                return;
            default:
                LoginSignupReworkActivity this$03 = (LoginSignupReworkActivity) obj2;
                a3.c cVar3 = (a3.c) obj;
                int i10 = LoginSignupReworkActivity.C;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (cVar3 != null) {
                    try {
                        j7.k kVar = this$03.f11312y;
                        if (kVar != null && (lottieAnimationView2 = (LottieAnimationView) kVar.A) != null) {
                            lottieAnimationView2.setComposition(cVar3);
                        }
                        j7.k kVar2 = this$03.f11312y;
                        if (kVar2 != null && (lottieAnimationView = (LottieAnimationView) kVar2.A) != null) {
                            lottieAnimationView.j();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$03.f11309v, e10);
                        return;
                    }
                }
                return;
        }
    }
}
