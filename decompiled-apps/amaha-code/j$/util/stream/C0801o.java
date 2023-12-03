package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0801o implements Consumer, Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21521a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21522b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f21523c;

    public /* synthetic */ C0801o(int i6, Object obj, Object obj2) {
        this.f21521a = i6;
        this.f21522b = obj;
        this.f21523c = obj2;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21521a) {
            case 0:
                return AbstractC0689a.c(this, consumer);
            case 5:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i6 = this.f21521a;
        Object obj2 = this.f21523c;
        Object obj3 = this.f21522b;
        switch (i6) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C0810p3) obj3).a((Consumer) obj2, obj);
                return;
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i6 = this.f21521a;
        Object obj = this.f21523c;
        Object obj2 = this.f21522b;
        switch (i6) {
            case 1:
                j$.time.e.b(obj);
                return new C0821s0((EnumC0838w0) obj2);
            case 2:
                return new C0816r0((EnumC0838w0) obj2, (Predicate) obj);
            case 3:
                j$.time.e.b(obj);
                return new C0830u0((EnumC0838w0) obj2);
            default:
                j$.time.e.b(obj);
                return new C0826t0((EnumC0838w0) obj2);
        }
    }
}
