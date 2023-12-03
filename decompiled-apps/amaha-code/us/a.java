package us;

import kotlin.jvm.internal.i;
import ys.m;
/* compiled from: ObservableProperty.kt */
/* loaded from: classes2.dex */
public abstract class a<V> {

    /* renamed from: a  reason: collision with root package name */
    public V f34506a;

    public a(V v10) {
        this.f34506a = v10;
    }

    public void a(m property) {
        i.g(property, "property");
    }

    public final Object b(m property) {
        i.g(property, "property");
        return this.f34506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, m property) {
        i.g(property, "property");
        a(property);
        this.f34506a = obj;
    }
}
