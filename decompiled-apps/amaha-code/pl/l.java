package pl;

import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import ql.t;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<ArrayList<hs.f<? extends String, ? extends t.a>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28611u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f28612v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(N14AScreenFragment n14AScreenFragment, String str) {
        super(1);
        this.f28611u = n14AScreenFragment;
        this.f28612v = str;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<hs.f<? extends String, ? extends t.a>> arrayList) {
        t.a aVar;
        String str;
        Object obj;
        ArrayList<hs.f<? extends String, ? extends t.a>> list = arrayList;
        kotlin.jvm.internal.i.f(list, "list");
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = null;
            str = this.f28612v;
            if (hasNext) {
                obj = it.next();
                if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hs.f fVar = (hs.f) obj;
        if (fVar != null) {
            aVar = (t.a) fVar.f19465v;
        }
        if (aVar == t.a.COMPLETED) {
            int i6 = N14AScreenFragment.f10947b0;
            this.f28611u.h0(str);
        }
        return hs.k.f19476a;
    }
}
