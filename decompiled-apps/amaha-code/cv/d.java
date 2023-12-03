package cv;
/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes2.dex */
public abstract class d<K, T> extends a<K, T> {

    /* renamed from: u  reason: collision with root package name */
    public b<T> f12057u;

    public d() {
        k kVar = k.f12069u;
        kotlin.jvm.internal.i.e(kVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this.f12057u = kVar;
    }

    @Override // cv.a
    public final b<T> g() {
        return this.f12057u;
    }
}
