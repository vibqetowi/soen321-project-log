package c9;

import android.os.Looper;
import c9.h;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ListenerSet.java */
/* loaded from: classes.dex */
public final class j<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c9.b f5141a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5142b;

    /* renamed from: c  reason: collision with root package name */
    public final b<T> f5143c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f5144d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<Runnable> f5145e;
    public final ArrayDeque<Runnable> f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5146g;

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t3);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void f(T t3, h hVar);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f5147a;

        /* renamed from: b  reason: collision with root package name */
        public h.a f5148b = new h.a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5149c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5150d;

        public c(T t3) {
            this.f5147a = t3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.f5147a.equals(((c) obj).f5147a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5147a.hashCode();
        }
    }

    public j(Looper looper, s sVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, sVar, bVar);
    }

    public final void a() {
        ArrayDeque<Runnable> arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        i iVar = this.f5142b;
        if (!iVar.a()) {
            iVar.d(iVar.g(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f5145e;
        boolean z10 = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z10) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    public final void b(int i6, a<T> aVar) {
        this.f.add(new s7.b(new CopyOnWriteArraySet(this.f5144d), i6, aVar, 1));
    }

    public final void c() {
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f5144d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            next.f5150d = true;
            if (next.f5149c) {
                h b10 = next.f5148b.b();
                this.f5143c.f(next.f5147a, b10);
            }
        }
        copyOnWriteArraySet.clear();
        this.f5146g = true;
    }

    public j(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, c9.b bVar, b<T> bVar2) {
        this.f5141a = bVar;
        this.f5144d = copyOnWriteArraySet;
        this.f5143c = bVar2;
        this.f5145e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.f5142b = bVar.b(looper, new a9.e(1, this));
    }
}
