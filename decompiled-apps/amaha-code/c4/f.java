package c4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4903a;

    /* renamed from: b  reason: collision with root package name */
    public String f4904b;

    /* renamed from: c  reason: collision with root package name */
    public String f4905c;

    /* renamed from: d  reason: collision with root package name */
    public c f4906d;

    /* renamed from: e  reason: collision with root package name */
    public oa.q f4907e;
    public ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4908g;

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f4909a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a f4910b;

        public a() {
            c.a aVar = new c.a();
            aVar.f4917a = true;
            this.f4910b = aVar;
        }

        public final f a() {
            boolean z10;
            boolean z11;
            boolean z12;
            oa.q qVar;
            ArrayList arrayList = this.f4909a;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b bVar = (b) this.f4909a.get(0);
                for (int i6 = 0; i6 < this.f4909a.size(); i6++) {
                    b bVar2 = (b) this.f4909a.get(i6);
                    if (bVar2 != null) {
                        if (i6 != 0) {
                            h hVar = bVar2.f4911a;
                            if (!hVar.f4925d.equals(bVar.f4911a.f4925d) && !hVar.f4925d.equals("play_pass_subs")) {
                                throw new IllegalArgumentException("All products should have same ProductType.");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String optString = bVar.f4911a.f4923b.optString("packageName");
                Iterator it = this.f4909a.iterator();
                while (it.hasNext()) {
                    b bVar3 = (b) it.next();
                    if (!bVar.f4911a.f4925d.equals("play_pass_subs") && !bVar3.f4911a.f4925d.equals("play_pass_subs") && !optString.equals(bVar3.f4911a.f4923b.optString("packageName"))) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
                f fVar = new f();
                if (z10 && !((b) this.f4909a.get(0)).f4911a.f4923b.optString("packageName").isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fVar.f4903a = z11;
                fVar.f4904b = null;
                fVar.f4905c = null;
                c.a aVar = this.f4910b;
                aVar.getClass();
                if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (z12 && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!aVar.f4917a && !z12 && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c();
                cVar.f4915a = null;
                cVar.f4916b = 0;
                fVar.f4906d = cVar;
                fVar.f = new ArrayList();
                fVar.f4908g = false;
                ArrayList arrayList2 = this.f4909a;
                if (arrayList2 != null) {
                    qVar = oa.q.v(arrayList2);
                } else {
                    oa.o oVar = oa.q.f27340v;
                    qVar = oa.b.f27315y;
                }
                fVar.f4907e = qVar;
                return fVar;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final h f4911a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4912b;

        /* compiled from: com.android.billingclient:billing@@5.0.0 */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public h f4913a;

            /* renamed from: b  reason: collision with root package name */
            public String f4914b;
        }

        public /* synthetic */ b(a aVar) {
            this.f4911a = aVar.f4913a;
            this.f4912b = aVar.f4914b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f4915a;

        /* renamed from: b  reason: collision with root package name */
        public int f4916b = 0;

        /* compiled from: com.android.billingclient:billing@@5.0.0 */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f4917a;
        }
    }
}
