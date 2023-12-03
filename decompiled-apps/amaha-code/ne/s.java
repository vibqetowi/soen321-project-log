package ne;

import ne.x;
import oe.a;
/* compiled from: OnlineStateTracker.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public int f26263b;

    /* renamed from: c  reason: collision with root package name */
    public a.C0452a f26264c;

    /* renamed from: e  reason: collision with root package name */
    public final oe.a f26266e;
    public final a f;

    /* renamed from: a  reason: collision with root package name */
    public he.w f26262a = he.w.UNKNOWN;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26265d = true;

    /* compiled from: OnlineStateTracker.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public s(oe.a aVar, am.w wVar) {
        this.f26266e = aVar;
        this.f = wVar;
    }

    public final void a(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (this.f26265d) {
            kc.f.d0("OnlineStateTracker", "%s", format);
            this.f26265d = false;
            return;
        }
        kc.f.z("OnlineStateTracker", "%s", format);
    }

    public final void b(he.w wVar) {
        if (wVar != this.f26262a) {
            this.f26262a = wVar;
            ((x.a) ((am.w) this.f).f671v).c(wVar);
        }
    }

    public final void c(he.w wVar) {
        a.C0452a c0452a = this.f26264c;
        if (c0452a != null) {
            c0452a.a();
            this.f26264c = null;
        }
        this.f26263b = 0;
        if (wVar == he.w.ONLINE) {
            this.f26265d = false;
        }
        b(wVar);
    }
}
