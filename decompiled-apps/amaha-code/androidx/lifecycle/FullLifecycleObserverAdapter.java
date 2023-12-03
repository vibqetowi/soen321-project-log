package androidx.lifecycle;

import androidx.lifecycle.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements n {

    /* renamed from: u  reason: collision with root package name */
    public final f f2348u;

    /* renamed from: v  reason: collision with root package name */
    public final n f2349v;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2350a;

        static {
            int[] iArr = new int[j.b.values().length];
            f2350a = iArr;
            try {
                iArr[j.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2350a[j.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2350a[j.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2350a[j.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2350a[j.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2350a[j.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2350a[j.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(f fVar, n nVar) {
        this.f2348u = fVar;
        this.f2349v = nVar;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        int i6 = a.f2350a[bVar.ordinal()];
        f fVar = this.f2348u;
        switch (i6) {
            case 1:
                fVar.b(pVar);
                break;
            case 2:
                fVar.g(pVar);
                break;
            case 3:
                fVar.a(pVar);
                break;
            case 4:
                fVar.d(pVar);
                break;
            case 5:
                fVar.e(pVar);
                break;
            case 6:
                fVar.f(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f2349v;
        if (nVar != null) {
            nVar.c(pVar, bVar);
        }
    }
}
