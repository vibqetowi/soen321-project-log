package c4;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.Purchase;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final g f4940a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4941b;

    public n(@RecentlyNonNull g billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        kotlin.jvm.internal.i.g(billingResult, "billingResult");
        kotlin.jvm.internal.i.g(purchasesList, "purchasesList");
        this.f4940a = billingResult;
        this.f4941b = purchasesList;
    }

    public final boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.i.b(this.f4940a, nVar.f4940a) && kotlin.jvm.internal.i.b(this.f4941b, nVar.f4941b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4941b.hashCode() + (this.f4940a.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.f4940a + ", purchasesList=" + this.f4941b + ')';
    }
}
