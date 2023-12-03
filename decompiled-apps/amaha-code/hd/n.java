package hd;

import re.a;
/* compiled from: OptionalProvider.java */
/* loaded from: classes.dex */
public final class n<T> implements re.b<T>, re.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final d9.p f17434c = new d9.p(9);

    /* renamed from: d  reason: collision with root package name */
    public static final g f17435d = new g(1);

    /* renamed from: a  reason: collision with root package name */
    public a.InterfaceC0519a<T> f17436a;

    /* renamed from: b  reason: collision with root package name */
    public volatile re.b<T> f17437b;

    public n(d9.p pVar, re.b bVar) {
        this.f17436a = pVar;
        this.f17437b = bVar;
    }

    public final void a(a.InterfaceC0519a<T> interfaceC0519a) {
        re.b<T> bVar;
        re.b<T> bVar2;
        re.b<T> bVar3 = this.f17437b;
        g gVar = f17435d;
        if (bVar3 != gVar) {
            interfaceC0519a.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f17437b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f17436a = new dd.a(this.f17436a, 18, interfaceC0519a);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0519a.i(bVar);
        }
    }

    @Override // re.b
    public final T get() {
        return this.f17437b.get();
    }
}
