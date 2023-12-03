package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.o;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f942a;

    /* renamed from: c  reason: collision with root package name */
    public final o f944c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f945d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f946e;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<h> f943b = new ArrayDeque<>();
    public boolean f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements n, androidx.activity.a {

        /* renamed from: u  reason: collision with root package name */
        public final androidx.lifecycle.j f947u;

        /* renamed from: v  reason: collision with root package name */
        public final h f948v;

        /* renamed from: w  reason: collision with root package name */
        public b f949w;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.j jVar, h hVar) {
            this.f947u = jVar;
            this.f948v = hVar;
            jVar.a(this);
        }

        @Override // androidx.lifecycle.n
        public final void c(p pVar, j.b bVar) {
            if (bVar == j.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<h> arrayDeque = onBackPressedDispatcher.f943b;
                h hVar = this.f948v;
                arrayDeque.add(hVar);
                b bVar2 = new b(hVar);
                hVar.f968b.add(bVar2);
                if (o0.a.a()) {
                    onBackPressedDispatcher.c();
                    hVar.f969c = onBackPressedDispatcher.f944c;
                }
                this.f949w = bVar2;
            } else if (bVar == j.b.ON_STOP) {
                b bVar3 = this.f949w;
                if (bVar3 != null) {
                    bVar3.cancel();
                }
            } else if (bVar == j.b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f947u.c(this);
            this.f948v.f968b.remove(this);
            b bVar = this.f949w;
            if (bVar != null) {
                bVar.cancel();
                this.f949w = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new i(runnable, 0);
        }

        public static void b(Object obj, int i6, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i6, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.a {

        /* renamed from: u  reason: collision with root package name */
        public final h f951u;

        public b(h hVar) {
            this.f951u = hVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            ArrayDeque<h> arrayDeque = onBackPressedDispatcher.f943b;
            h hVar = this.f951u;
            arrayDeque.remove(hVar);
            hVar.f968b.remove(this);
            if (o0.a.a()) {
                hVar.f969c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f942a = runnable;
        if (o0.a.a()) {
            this.f944c = new o(2, this);
            this.f945d = a.a(new androidx.activity.b(2, this));
        }
    }

    public final void a(p pVar, h hVar) {
        androidx.lifecycle.j lifecycle = pVar.getLifecycle();
        if (lifecycle.b() == j.c.DESTROYED) {
            return;
        }
        hVar.f968b.add(new LifecycleOnBackPressedCancellable(lifecycle, hVar));
        if (o0.a.a()) {
            c();
            hVar.f969c = this.f944c;
        }
    }

    public final void b() {
        Iterator<h> descendingIterator = this.f943b.descendingIterator();
        while (descendingIterator.hasNext()) {
            h next = descendingIterator.next();
            if (next.f967a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f942a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z10;
        Iterator<h> descendingIterator = this.f943b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (descendingIterator.next().f967a) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f946e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f945d;
            if (z10 && !this.f) {
                a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z10 && this.f) {
                a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }
}
