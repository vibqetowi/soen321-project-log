package tm;

import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f33320b;

    public /* synthetic */ g(e eVar, int i6) {
        this.f33319a = i6;
        this.f33320b = eVar;
    }

    @Override // ya.e
    public final void onFailure(Exception e10) {
        int i6 = this.f33319a;
        String str = "";
        e this$0 = this.f33320b;
        switch (i6) {
            case 0:
                LogHelper logHelper = LogHelper.INSTANCE;
                String str2 = this$0.f33302z;
                kotlin.jvm.internal.i.f(e10, "e");
                logHelper.e(str2, e10);
                w<ImageResponse> wVar = this$0.N;
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage != null) {
                    str = localizedMessage;
                }
                wVar.i(new ImageResponse.Failure(str));
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(e10, "e");
                LogHelper.INSTANCE.e(this$0.f33302z, e10);
                w<ImageResponse> wVar2 = this$0.N;
                String localizedMessage2 = e10.getLocalizedMessage();
                if (localizedMessage2 != null) {
                    str = localizedMessage2;
                }
                wVar2.i(new ImageResponse.Failure(str));
                return;
        }
    }
}
