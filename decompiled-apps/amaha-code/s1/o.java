package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<f, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f31194u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<f> f31195v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f31196w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f31197x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Bundle f31198y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.u uVar, ArrayList arrayList, kotlin.jvm.internal.v vVar, i iVar, Bundle bundle) {
        super(1);
        this.f31194u = uVar;
        this.f31195v = arrayList;
        this.f31196w = vVar;
        this.f31197x = iVar;
        this.f31198y = bundle;
    }

    @Override // ss.l
    public final hs.k invoke(f fVar) {
        List<f> list;
        f entry = fVar;
        kotlin.jvm.internal.i.g(entry, "entry");
        this.f31194u.f23466u = true;
        List<f> list2 = this.f31195v;
        int indexOf = list2.indexOf(entry);
        if (indexOf != -1) {
            kotlin.jvm.internal.v vVar = this.f31196w;
            int i6 = indexOf + 1;
            list = list2.subList(vVar.f23467u, i6);
            vVar.f23467u = i6;
        } else {
            list = is.w.f20676u;
        }
        this.f31197x.a(entry.f31115v, this.f31198y, entry, list);
        return hs.k.f19476a;
    }
}
