package gt;

import java.util.Collection;
/* compiled from: CallableMemberDescriptor.java */
/* loaded from: classes2.dex */
public interface b extends gt.a, y {

    /* compiled from: CallableMemberDescriptor.java */
    /* loaded from: classes2.dex */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED
    }

    @Override // gt.a, gt.j
    b b();

    b d0(j jVar, z zVar, o oVar);

    @Override // gt.a
    Collection<? extends b> f();

    a m0();

    void y0(Collection<? extends b> collection);
}
