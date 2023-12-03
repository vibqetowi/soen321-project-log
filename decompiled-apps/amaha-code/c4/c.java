package c4;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q<l> f4901a;

    public c(kotlinx.coroutines.r rVar) {
        this.f4901a = rVar;
    }

    public final void a(g billingResult, List<PurchaseHistoryRecord> list) {
        kotlin.jvm.internal.i.f(billingResult, "billingResult");
        this.f4901a.l0(new l(billingResult, list));
    }
}
