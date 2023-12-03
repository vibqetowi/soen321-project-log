package j$.util.concurrent;

import j$.time.AbstractC0689a;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21176b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f21177c;

    public /* synthetic */ u(int i6, Object obj, Object obj2) {
        this.f21175a = i6;
        this.f21176b = obj;
        this.f21177c = obj2;
    }

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.f21175a = 2;
        this.f21177c = biFunction;
        this.f21176b = function;
    }

    public final /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        switch (this.f21175a) {
            case 0:
                return AbstractC0689a.a(this, biConsumer);
            default:
                return AbstractC0689a.a(this, biConsumer);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f21176b).accept(obj);
        ((Consumer) this.f21177c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i6 = this.f21175a;
        Object obj3 = this.f21177c;
        Object obj4 = this.f21176b;
        switch (i6) {
            case 0:
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return AbstractC0689a.b(this, function);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return AbstractC0689a.g((BiFunction) this.f21177c, (Function) this.f21176b, obj, obj2);
    }
}
