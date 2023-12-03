package tm;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ya.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f33324b;

    public /* synthetic */ i(int i6, Object obj) {
        this.f33323a = i6;
        this.f33324b = obj;
    }

    @Override // ya.c
    public final void b() {
        int i6 = this.f33323a;
        Object obj = this.f33324b;
        switch (i6) {
            case 0:
                e eVar = (e) obj;
                boolean z10 = eVar.Q;
                w<ImageResponse> wVar = eVar.N;
                if (z10) {
                    wVar.i(ImageResponse.Cancelled.INSTANCE);
                    return;
                } else {
                    wVar.i(new ImageResponse.Failure("No Internet Connection"));
                    return;
                }
            case 1:
                e this$0 = (e) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z11 = this$0.Q;
                w<ImageResponse> wVar2 = this$0.N;
                if (z11) {
                    wVar2.i(ImageResponse.Cancelled.INSTANCE);
                    return;
                } else {
                    wVar2.i(new ImageResponse.Failure("No Internet Connection"));
                    return;
                }
            default:
                SplashScreenActivity this$02 = (SplashScreenActivity) obj;
                int i10 = SplashScreenActivity.G;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                jp.d dVar = this$02.B;
                if (dVar != null) {
                    dVar.E = false;
                    dVar.D = true;
                    dVar.g();
                    return;
                }
                kotlin.jvm.internal.i.q("splashScreenViewModel");
                throw null;
        }
    }
}
