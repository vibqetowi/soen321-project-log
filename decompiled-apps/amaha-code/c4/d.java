package c4;

import com.android.billingclient.api.Purchase;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q<n> f4902a;

    public d(kotlinx.coroutines.r rVar) {
        this.f4902a = rVar;
    }

    public final void a(g billingResult, List<Purchase> purchases) {
        kotlin.jvm.internal.i.f(billingResult, "billingResult");
        kotlin.jvm.internal.i.f(purchases, "purchases");
        this.f4902a.l0(new n(billingResult, purchases));
    }
}
