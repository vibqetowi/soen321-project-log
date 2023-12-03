package lv;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CertificatePinner.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<List<? extends X509Certificate>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f24615u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f24616v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f24617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, List<? extends Certificate> list, String str) {
        super(0);
        this.f24615u = gVar;
        this.f24616v = list;
        this.f24617w = str;
    }

    @Override // ss.a
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> j10;
        androidx.work.k kVar = this.f24615u.f24611b;
        List<Certificate> list = this.f24616v;
        if (kVar == null) {
            j10 = null;
        } else {
            j10 = kVar.j(this.f24617w, list);
        }
        if (j10 != null) {
            list = j10;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        for (Certificate certificate : list) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
