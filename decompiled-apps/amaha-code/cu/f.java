package cu;

import au.u;
import au.v;
import is.w;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: VersionRequirement.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f12049b = new f(w.f20676u);

    /* renamed from: a  reason: collision with root package name */
    public final List<u> f12050a;

    /* compiled from: VersionRequirement.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a(v vVar) {
            if (vVar.f3892v.size() == 0) {
                return f.f12049b;
            }
            List<u> list = vVar.f3892v;
            i.f(list, "table.requirementList");
            return new f(list);
        }
    }

    public f(List<u> list) {
        this.f12050a = list;
    }
}
