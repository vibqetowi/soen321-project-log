package c4;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final g f4938a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4939b;

    public l(@RecentlyNonNull g billingResult, @RecentlyNonNull List<? extends PurchaseHistoryRecord> list) {
        kotlin.jvm.internal.i.g(billingResult, "billingResult");
        this.f4938a = billingResult;
        this.f4939b = list;
    }

    public final boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (kotlin.jvm.internal.i.b(this.f4938a, lVar.f4938a) && kotlin.jvm.internal.i.b(this.f4939b, lVar.f4939b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f4938a.hashCode() * 31;
        List list = this.f4939b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f4938a + ", purchaseHistoryRecordList=" + this.f4939b + ')';
    }
}
