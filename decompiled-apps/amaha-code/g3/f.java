package g3;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
public abstract class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16180a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16181b;

    public /* synthetic */ f(int i6, Object obj) {
        this.f16180a = i6;
        this.f16181b = obj;
    }

    public abstract void a();

    public abstract void b();

    public final void c(Object obj, boolean z10) {
        Set set = (Set) this.f16181b;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                a();
            }
        } else if (set.remove(obj) && size == 1) {
            b();
        }
    }

    @Override // g3.e
    public final boolean j() {
        Object obj = this.f16181b;
        if (((List) obj).isEmpty()) {
            return true;
        }
        if (((List) obj).size() == 1 && ((n3.a) ((List) obj).get(0)).c()) {
            return true;
        }
        return false;
    }

    @Override // g3.e
    public final List l() {
        return (List) this.f16181b;
    }

    public final String toString() {
        switch (this.f16180a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f16181b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Float f) {
        this(0, Collections.singletonList(new n3.a(f)));
        this.f16180a = 0;
    }

    public f() {
        this.f16180a = 2;
        this.f16181b = Collections.newSetFromMap(new IdentityHashMap());
    }
}
