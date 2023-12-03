package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0722j;
import j$.util.C0723k;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class Y implements BiConsumer, IntFunction, IntBinaryOperator, LongBinaryOperator, LongFunction, ObjLongConsumer, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21409a;

    public /* synthetic */ Y(int i6) {
        this.f21409a = i6;
    }

    public final /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        switch (this.f21409a) {
            case 0:
                return AbstractC0689a.a(this, biConsumer);
            default:
                return AbstractC0689a.a(this, biConsumer);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j10) {
        ((C0723k) obj).accept(j10);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21409a) {
            case 0:
                ((C0722j) obj).a((C0722j) obj2);
                return;
            default:
                ((C0723k) obj).a((C0723k) obj2);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i6) {
        return Integer.valueOf(i6);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j10) {
        return Long.valueOf(j10);
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i6, int i10) {
        return Math.max(i6, i10);
    }

    public final long b(long j10, long j11) {
        switch (this.f21409a) {
            case 3:
                return Math.max(j10, j11);
            case 4:
            default:
                return Math.min(j10, j11);
            case 5:
                return j10 + j11;
        }
    }
}
