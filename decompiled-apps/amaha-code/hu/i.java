package hu;

import is.u;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public enum i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: v  reason: collision with root package name */
    public static final Set<i> f19551v;

    /* renamed from: w  reason: collision with root package name */
    public static final Set<i> f19552w;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f19556u;

    static {
        i[] values = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : values) {
            if (iVar.f19556u) {
                arrayList.add(iVar);
            }
        }
        f19551v = u.M2(arrayList);
        f19552w = is.k.k2(values());
    }

    i(boolean z10) {
        this.f19556u = z10;
    }
}
