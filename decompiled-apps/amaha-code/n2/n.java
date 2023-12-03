package n2;

import androidx.work.impl.WorkDatabase;
import id.f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25831u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f25832v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25833w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f25834x;

    public /* synthetic */ n(int i6, Object obj, Object obj2, Object obj3) {
        this.f25831u = i6;
        this.f25832v = obj;
        this.f25833w = obj2;
        this.f25834x = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f25831u;
        Object obj = this.f25834x;
        Object obj2 = this.f25833w;
        Object obj3 = this.f25832v;
        switch (i6) {
            case 0:
                String str = (String) obj;
                WorkDatabase workDatabase = ((p) obj3).f25843y;
                ((ArrayList) obj2).addAll(workDatabase.v().a(str));
                return workDatabase.u().p(str);
            default:
                id.e eVar = (id.e) obj3;
                eVar.getClass();
                return eVar.f19974u.submit(new q7.f((Callable) obj2, 16, (f.b) obj));
        }
    }
}
