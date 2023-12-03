package aj;

import android.app.Activity;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import s1.s;
/* compiled from: ClickData.kt */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f588x = 0;

    /* renamed from: y  reason: collision with root package name */
    public final Object f589y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bj.a action) {
        super(cVar);
        i.g(action, "action");
        this.f589y = action;
    }

    @Override // aj.c, gd.d
    public final String toString() {
        int i6 = this.f588x;
        Object obj = this.f589y;
        s sVar = this.f590w;
        switch (i6) {
            case 0:
                return "ClickData(accountMeta=" + ((s5) this.f16400v) + ", campaignData=" + sVar + ", action=" + ((bj.a) obj) + ')';
            case 1:
                return "InAppData(activity='" + ((Object) ((Activity) obj).getClass().getName()) + "', campaignData=" + sVar + ",accountMeta=" + ((s5) this.f16400v) + ')';
            default:
                return "SelfHandledCampaignData(campaignData=" + sVar + ",accountMeta=" + ((s5) this.f16400v) + ", selfHandledCampaign=" + ((h) obj);
        }
    }

    public b(Activity activity, c cVar) {
        super(cVar);
        this.f589y = activity;
    }
}
