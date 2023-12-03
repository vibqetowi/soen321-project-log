package iu;
/* compiled from: OverridingStrategy.kt */
/* loaded from: classes2.dex */
public abstract class k extends com.android.volley.toolbox.a {
    public abstract void J(gt.b bVar, gt.b bVar2);

    @Override // com.android.volley.toolbox.a
    public final void k(gt.b first, gt.b second) {
        kotlin.jvm.internal.i.g(first, "first");
        kotlin.jvm.internal.i.g(second, "second");
        J(first, second);
    }
}
