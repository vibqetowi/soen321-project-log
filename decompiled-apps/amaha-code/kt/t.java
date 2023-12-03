package kt;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes2.dex */
public final class t extends iu.k {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Set f23895v;

    public t(LinkedHashSet linkedHashSet) {
        this.f23895v = linkedHashSet;
    }

    public static /* synthetic */ void K(int i6) {
        Object[] objArr = new Object[3];
        if (i6 != 1) {
            if (i6 != 2) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i6 != 1 && i6 != 2) {
            objArr[2] = "addFakeOverride";
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
            iu.l.r(bVar, null);
            this.f23895v.add(bVar);
            return;
        }
        K(0);
        throw null;
    }
}
