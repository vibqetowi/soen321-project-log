package c4;

import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing-ktx@@5.0.0 */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q<j> f4896a;

    public b(kotlinx.coroutines.r rVar) {
        this.f4896a = rVar;
    }

    public final void a(g billingResult, ArrayList arrayList) {
        kotlin.jvm.internal.i.f(billingResult, "billingResult");
        this.f4896a.l0(new j(billingResult, arrayList));
    }
}
