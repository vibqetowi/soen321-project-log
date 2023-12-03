package ns;

import ls.e;
import ls.f;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class c extends a {
    private final ls.f _context;
    private transient ls.d<Object> intercepted;

    public c(ls.d<Object> dVar, ls.f fVar) {
        super(dVar);
        this._context = fVar;
    }

    @Override // ls.d
    public ls.f getContext() {
        ls.f fVar = this._context;
        kotlin.jvm.internal.i.d(fVar);
        return fVar;
    }

    public final ls.d<Object> intercepted() {
        ls.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            ls.e eVar = (ls.e) getContext().e(e.a.f24519u);
            if (eVar == null || (dVar = eVar.c0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // ns.a
    public void releaseIntercepted() {
        ls.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            ls.f context = getContext();
            int i6 = ls.e.f24518n;
            f.b e10 = context.e(e.a.f24519u);
            kotlin.jvm.internal.i.d(e10);
            ((ls.e) e10).w0(dVar);
        }
        this.intercepted = b.f26775u;
    }

    public c(ls.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
