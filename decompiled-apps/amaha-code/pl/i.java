package pl;

import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Locale;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements a3.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28603a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f28604b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f28605c;

    public /* synthetic */ i(Fragment fragment, kotlin.jvm.internal.x xVar, int i6) {
        this.f28603a = i6;
        this.f28605c = fragment;
        this.f28604b = xVar;
    }

    @Override // a3.m
    public final void onResult(Object obj) {
        int i6 = this.f28603a;
        kotlin.jvm.internal.x jsonString = this.f28604b;
        Fragment fragment = this.f28605c;
        switch (i6) {
            case 0:
                N14AScreenFragment this$0 = (N14AScreenFragment) fragment;
                int i10 = N14AScreenFragment.f10947b0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.lavN14ScreenLottie)).setComposition((a3.c) obj);
                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.lavN14ScreenLottie)).setRepeatMode(1);
                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.lavN14ScreenLottie)).setRepeatCount(-1);
                jsonString.f23469u = "";
                return;
            case 1:
                nn.a this$02 = (nn.a) fragment;
                a3.c cVar = (a3.c) obj;
                int i11 = nn.a.f26415y;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this$02._$_findCachedViewById(R.id.ab1Lottie);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setComposition(cVar);
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this$02._$_findCachedViewById(R.id.ab1Lottie);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.h();
                }
                jsonString.f23469u = "";
                return;
            case 2:
                nn.b this$03 = (nn.b) fragment;
                a3.c cVar2 = (a3.c) obj;
                int i12 = nn.b.f26427y;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this$03._$_findCachedViewById(R.id.ab2Lottie);
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setComposition(cVar2);
                }
                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) this$03._$_findCachedViewById(R.id.ab2Lottie);
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.h();
                }
                jsonString.f23469u = "";
                return;
            case 3:
                zo.e this$04 = (zo.e) fragment;
                a3.c cVar3 = (a3.c) obj;
                int i13 = zo.e.e0;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                LottieAnimationView lottieAnimationView5 = (LottieAnimationView) this$04._$_findCachedViewById(R.id.lavRAAnimation);
                if (lottieAnimationView5 != null) {
                    lottieAnimationView5.setComposition(cVar3);
                }
                jsonString.f23469u = "";
                return;
            case 4:
                zo.i this$05 = (zo.i) fragment;
                a3.c cVar4 = (a3.c) obj;
                int i14 = zo.i.f39715j0;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                LottieAnimationView lottieAnimationView6 = (LottieAnimationView) this$05._$_findCachedViewById(R.id.lavRAAnimation);
                if (lottieAnimationView6 != null) {
                    lottieAnimationView6.setComposition(cVar4);
                }
                jsonString.f23469u = "";
                long j10 = 1000;
                long j11 = 60;
                String format = String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf((int) ((((((LottieAnimationView) this$05._$_findCachedViewById(R.id.lavRAAnimation)).getDuration() * Integer.parseInt(this$05.E)) / j10) % 3600) / j11)), Integer.valueOf((int) (((((LottieAnimationView) this$05._$_findCachedViewById(R.id.lavRAAnimation)).getDuration() * Integer.parseInt(this$05.E)) / j10) % j11)));
                kotlin.jvm.internal.i.f(format, "format(\n                …                        )");
                ((RobertoTextView) this$05._$_findCachedViewById(R.id.tvRAProgress)).setText("00:00/".concat(format));
                return;
            default:
                zo.p this$06 = (zo.p) fragment;
                a3.c cVar5 = (a3.c) obj;
                int i15 = zo.p.R;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                LottieAnimationView lottieAnimationView7 = (LottieAnimationView) this$06._$_findCachedViewById(R.id.lavRAAnimation);
                if (lottieAnimationView7 != null) {
                    lottieAnimationView7.setComposition(cVar5);
                }
                jsonString.f23469u = "";
                return;
        }
    }
}
