package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
/* compiled from: SnackbarManager.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f9175e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9176a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9177b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f9178c;

    /* renamed from: d  reason: collision with root package name */
    public c f9179d;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f9176a) {
                if (gVar.f9178c == cVar || gVar.f9179d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void b();

        void c(int i6);
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f9181a;

        /* renamed from: b  reason: collision with root package name */
        public int f9182b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9183c;

        public c(int i6, BaseTransientBottomBar.c cVar) {
            this.f9181a = new WeakReference<>(cVar);
            this.f9182b = i6;
        }
    }

    public static g b() {
        if (f9175e == null) {
            f9175e = new g();
        }
        return f9175e;
    }

    public final boolean a(c cVar, int i6) {
        b bVar = cVar.f9181a.get();
        if (bVar != null) {
            this.f9177b.removeCallbacksAndMessages(cVar);
            bVar.c(i6);
            return true;
        }
        return false;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        boolean z10;
        c cVar2 = this.f9178c;
        if (cVar2 == null) {
            return false;
        }
        if (cVar != null && cVar2.f9181a.get() == cVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.f9176a) {
            if (c(cVar)) {
                c cVar2 = this.f9178c;
                if (!cVar2.f9183c) {
                    cVar2.f9183c = true;
                    this.f9177b.removeCallbacksAndMessages(cVar2);
                }
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.f9176a) {
            if (c(cVar)) {
                c cVar2 = this.f9178c;
                if (cVar2.f9183c) {
                    cVar2.f9183c = false;
                    f(cVar2);
                }
            }
        }
    }

    public final void f(c cVar) {
        int i6 = cVar.f9182b;
        if (i6 == -2) {
            return;
        }
        if (i6 <= 0) {
            if (i6 == -1) {
                i6 = 1500;
            } else {
                i6 = 2750;
            }
        }
        Handler handler = this.f9177b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i6);
    }
}
