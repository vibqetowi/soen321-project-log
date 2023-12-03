package w2;
/* compiled from: LiveDataUtils.java */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public Object f36298a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y2.a f36299b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f36300c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o.a f36301d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.u f36302e;

    /* compiled from: LiveDataUtils.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Object f36303u;

        public a(Object obj) {
            this.f36303u = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (h.this.f36300c) {
                Object apply = h.this.f36301d.apply(this.f36303u);
                h hVar = h.this;
                Object obj = hVar.f36298a;
                if (obj == null && apply != null) {
                    hVar.f36298a = apply;
                    hVar.f36302e.i(apply);
                } else if (obj != null && !obj.equals(apply)) {
                    h hVar2 = h.this;
                    hVar2.f36298a = apply;
                    hVar2.f36302e.i(apply);
                }
            }
        }
    }

    public h(y2.a aVar, Object obj, n2.z zVar, androidx.lifecycle.u uVar) {
        this.f36299b = aVar;
        this.f36300c = obj;
        this.f36301d = zVar;
        this.f36302e = uVar;
    }

    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        ((y2.b) this.f36299b).a(new a(obj));
    }
}
