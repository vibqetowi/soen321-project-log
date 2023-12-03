package fk;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import ih.p;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import n2.o;
import qg.g0;
import qg.h;
import qg.w;
/* compiled from: MoEngageUtils.kt */
/* loaded from: classes2.dex */
public final class d extends k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f15121u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(0);
        this.f15121u = context;
    }

    @Override // ss.a
    public final hs.k invoke() {
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            ArrayList<String> arrayList = g.f15127b;
            applicationPersistence.setBooleanValue("moengage_alias_updated", false);
            ng.a.f26311a.getClass();
            Context context = this.f15121u;
            i.g(context, "context");
            p pVar = g0.f29558c;
            if (pVar != null) {
                w.f29578a.getClass();
                qg.g d10 = w.d(pVar);
                p pVar2 = d10.f29546a;
                try {
                    pVar2.f20106e.c(new ah.e("LOGOUT_USER", false, new o(2, d10, context)));
                } catch (Throwable th2) {
                    pVar2.f20105d.a(1, th2, new h(d10));
                }
            }
        }
        return hs.k.f19476a;
    }
}
