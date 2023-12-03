package fk;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import ih.p;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qg.g0;
import qg.n;
import qg.w;
import ug.l;
/* compiled from: MoEngageUtils.kt */
/* loaded from: classes2.dex */
public final class e extends k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f15122u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f15123v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str) {
        super(0);
        this.f15122u = context;
        this.f15123v = str;
    }

    @Override // ss.a
    public final hs.k invoke() {
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            ArrayList<String> arrayList = g.f15127b;
            if (applicationPersistence.getBooleanValue("moengage_alias_updated", false)) {
                Context context = this.f15122u;
                i.g(context, "context");
                String alias = this.f15123v;
                i.g(alias, "alias");
                p pVar = g0.f29558c;
                if (pVar != null) {
                    w.f29578a.getClass();
                    qg.g d10 = w.d(pVar);
                    ih.a aVar2 = new ih.a("USER_ATTRIBUTE_UNIQUE_ID", alias, l.b(alias));
                    try {
                        ug.b bVar = d10.f29548c;
                        bVar.getClass();
                        bVar.f34102a.f20106e.c(new ah.e("SET_ALIAS", false, new ug.a(bVar, context, aVar2, 0)));
                    } catch (Throwable th2) {
                        d10.f29546a.f20105d.a(1, th2, new n(d10));
                    }
                }
                ApplicationPersistence.getInstance().setBooleanValue("moengage_alias_updated", true);
            }
        }
        return hs.k.f19476a;
    }
}
