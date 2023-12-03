package z2;

import android.os.Build;
import androidx.work.q;
import is.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import v2.j;
import v2.n;
import v2.s;
import v2.x;
/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f39138a;

    static {
        String f = q.f("DiagnosticsWrkr");
        i.f(f, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f39138a = f;
    }

    public static final String a(n nVar, x xVar, j jVar, List list) {
        String str;
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb2.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            v2.i c10 = jVar.c(ca.a.a0(sVar));
            if (c10 != null) {
                num = Integer.valueOf(c10.f34717c);
            } else {
                num = null;
            }
            String str2 = sVar.f34734a;
            String m22 = u.m2(nVar.b(str2), ",", null, null, null, 62);
            String m23 = u.m2(xVar.a(str2), ",", null, null, null, 62);
            StringBuilder g5 = d.g("\n", str2, "\t ");
            g5.append(sVar.f34736c);
            g5.append("\t ");
            g5.append(num);
            g5.append("\t ");
            g5.append(sVar.f34735b.name());
            g5.append("\t ");
            g5.append(m22);
            g5.append("\t ");
            g5.append(m23);
            g5.append('\t');
            sb2.append(g5.toString());
        }
        String sb3 = sb2.toString();
        i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
