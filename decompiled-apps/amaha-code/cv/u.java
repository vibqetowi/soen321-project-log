package cv;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes2.dex */
public abstract class u<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<ys.d<? extends K>, Integer> f12111a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f12112b = new AtomicInteger(0);

    /* compiled from: ArrayMapOwner.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<ys.d<? extends K>, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ u<K, V> f12113u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<K, V> uVar) {
            super(1);
            this.f12113u = uVar;
        }

        @Override // ss.l
        public final Integer invoke(Object obj) {
            ys.d it = (ys.d) obj;
            kotlin.jvm.internal.i.g(it, "it");
            return Integer.valueOf(this.f12113u.f12112b.getAndIncrement());
        }
    }

    public abstract int a(ConcurrentHashMap concurrentHashMap, ys.d dVar, a aVar);

    public final <T extends K> int b(ys.d<T> kClass) {
        kotlin.jvm.internal.i.g(kClass, "kClass");
        return a(this.f12111a, kClass, new a(this));
    }
}
