package af;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.google.firebase.perf.metrics.Trace;
import java.util.Map;
import java.util.WeakHashMap;
import jf.e;
import kf.h;
/* compiled from: FragmentStateMonitor.java */
/* loaded from: classes.dex */
public final class c extends y.k {
    public static final df.a f = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Fragment, Trace> f535a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final df.b f536b;

    /* renamed from: c  reason: collision with root package name */
    public final e f537c;

    /* renamed from: d  reason: collision with root package name */
    public final a f538d;

    /* renamed from: e  reason: collision with root package name */
    public final d f539e;

    public c(df.b bVar, e eVar, a aVar, d dVar) {
        this.f536b = bVar;
        this.f537c = eVar;
        this.f538d = aVar;
        this.f539e = dVar;
    }

    @Override // androidx.fragment.app.y.k
    public final void a(Fragment fragment) {
        kf.e eVar;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        df.a aVar = f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.f535a;
        if (!weakHashMap.containsKey(fragment)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        d dVar = this.f539e;
        boolean z10 = dVar.f544d;
        df.a aVar2 = d.f540e;
        if (!z10) {
            aVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            eVar = new kf.e();
        } else {
            Map<Fragment, ef.c> map = dVar.f543c;
            if (!map.containsKey(fragment)) {
                aVar2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                eVar = new kf.e();
            } else {
                ef.c remove = map.remove(fragment);
                kf.e<ef.c> a10 = dVar.a();
                if (!a10.b()) {
                    aVar2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    eVar = new kf.e();
                } else {
                    ef.c a11 = a10.a();
                    a11.getClass();
                    eVar = new kf.e(new ef.c(a11.f13947a - remove.f13947a, a11.f13948b - remove.f13948b, a11.f13949c - remove.f13949c));
                }
            }
        }
        if (!eVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        h.a(trace, (ef.c) eVar.a());
        trace.stop();
    }

    @Override // androidx.fragment.app.y.k
    public final void b(Fragment fragment) {
        String simpleName;
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f537c, this.f536b, this.f538d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f535a.put(fragment, trace);
        d dVar = this.f539e;
        boolean z10 = dVar.f544d;
        df.a aVar = d.f540e;
        if (!z10) {
            aVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map<Fragment, ef.c> map = dVar.f543c;
        if (map.containsKey(fragment)) {
            aVar.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        kf.e<ef.c> a10 = dVar.a();
        if (!a10.b()) {
            aVar.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        } else {
            map.put(fragment, a10.a());
        }
    }
}
