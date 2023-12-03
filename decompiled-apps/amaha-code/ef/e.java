package ef;

import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kf.i;
import lf.k;
import lf.m;
/* compiled from: TraceMetricBuilder.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Trace f13956a;

    public e(Trace trace) {
        this.f13956a = trace;
    }

    public final m a() {
        List unmodifiableList;
        m.a f02 = m.f0();
        f02.B(this.f13956a.f9801x);
        f02.z(this.f13956a.E.f23322u);
        Trace trace = this.f13956a;
        i iVar = trace.E;
        i iVar2 = trace.F;
        iVar.getClass();
        f02.A(iVar2.f23323v - iVar.f23323v);
        for (b bVar : this.f13956a.f9802y.values()) {
            f02.y(bVar.f13946v.get(), bVar.f13945u);
        }
        ArrayList<Trace> arrayList = this.f13956a.B;
        if (!arrayList.isEmpty()) {
            for (Trace trace2 : arrayList) {
                f02.x(new e(trace2).a());
            }
        }
        Map<String, String> attributes = this.f13956a.getAttributes();
        f02.u();
        m.Q((m) f02.f10073v).putAll(attributes);
        Trace trace3 = this.f13956a;
        synchronized (trace3.A) {
            ArrayList arrayList2 = new ArrayList();
            for (hf.a aVar : trace3.A) {
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        k[] b10 = hf.a.b(unmodifiableList);
        if (b10 != null) {
            List asList = Arrays.asList(b10);
            f02.u();
            m.S((m) f02.f10073v, asList);
        }
        return f02.r();
    }
}
