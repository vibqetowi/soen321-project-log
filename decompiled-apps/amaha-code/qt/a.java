package qt;

import gt.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ss.l;
import su.t;
/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes2.dex */
public final class a extends iu.k {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f30105v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Set f30106w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f30107x;

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: qt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0510a implements l<gt.b, hs.k> {
        public C0510a() {
        }

        @Override // ss.l
        public final hs.k invoke(gt.b bVar) {
            gt.b bVar2 = bVar;
            if (bVar2 != null) {
                a.this.f30105v.c(bVar2);
                return hs.k.f19476a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
        }
    }

    public a(t tVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f30105v = tVar;
        this.f30106w = linkedHashSet;
        this.f30107x = z10;
    }

    public static /* synthetic */ void K(int i6) {
        Object[] objArr = new Object[3];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "overridden";
                    }
                } else {
                    objArr[0] = "member";
                }
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3 && i6 != 4) {
                objArr[2] = "addFakeOverride";
            } else {
                objArr[2] = "setOverriddenDescriptors";
            }
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // iu.k
    public final void J(gt.b bVar, gt.b bVar2) {
        if (bVar != null) {
            if (bVar2 != null) {
                return;
            }
            K(2);
            throw null;
        }
        K(1);
        throw null;
    }

    @Override // com.android.volley.toolbox.a
    public final void a(gt.b bVar) {
        if (bVar != null) {
            iu.l.r(bVar, new C0510a());
            this.f30106w.add(bVar);
            return;
        }
        K(0);
        throw null;
    }

    @Override // com.android.volley.toolbox.a
    public final void r(gt.b bVar, Collection<? extends gt.b> collection) {
        if (bVar != null) {
            if (this.f30107x && bVar.m0() != b.a.FAKE_OVERRIDE) {
                return;
            }
            bVar.y0(collection);
            return;
        }
        K(3);
        throw null;
    }
}
