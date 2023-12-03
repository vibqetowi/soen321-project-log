package aj;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import gd.d;
import kotlin.jvm.internal.i;
import s1.s;
/* compiled from: InAppBaseData.kt */
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: w  reason: collision with root package name */
    public final s f590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s campaignData, s5 accountMeta) {
        super(accountMeta);
        i.g(campaignData, "campaignData");
        i.g(accountMeta, "accountMeta");
        this.f590w = campaignData;
    }

    @Override // gd.d
    public String toString() {
        return "InAppBaseData(campaignData='" + this.f590w + "', accountMeta=" + ((s5) this.f16400v) + ')';
    }

    public c(c cVar) {
        this(cVar.f590w, (s5) cVar.f16400v);
    }
}
