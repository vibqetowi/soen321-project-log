package c4;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final g f4936a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4937b;

    public j(@RecentlyNonNull g billingResult, @RecentlyNonNull ArrayList arrayList) {
        kotlin.jvm.internal.i.g(billingResult, "billingResult");
        this.f4936a = billingResult;
        this.f4937b = arrayList;
    }

    public final boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.i.b(this.f4936a, jVar.f4936a) && kotlin.jvm.internal.i.b(this.f4937b, jVar.f4937b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f4936a.hashCode() * 31;
        List list = this.f4937b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.f4936a + ", productDetailsList=" + this.f4937b + ')';
    }
}
