package p;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: AsyncLayoutInflater.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f27809a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f27810b;

    /* renamed from: c  reason: collision with root package name */
    public final d f27811c;

    /* compiled from: AsyncLayoutInflater.java */
    /* renamed from: p.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0463a implements Handler.Callback {
        public C0463a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            View view = cVar.f27817d;
            a aVar = a.this;
            if (view == null) {
                cVar.f27817d = aVar.f27809a.inflate(cVar.f27816c, cVar.f27815b, false);
            }
            cVar.f27818e.a(cVar.f27817d, cVar.f27815b);
            d dVar = aVar.f27811c;
            dVar.getClass();
            cVar.f27818e = null;
            cVar.f27814a = null;
            cVar.f27815b = null;
            cVar.f27816c = 0;
            cVar.f27817d = null;
            dVar.f27821v.a(cVar);
            return true;
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class b extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f27813a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            String[] strArr = f27813a;
            for (int i6 = 0; i6 < 3; i6++) {
                try {
                    createView = createView(str, strArr[i6], attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public a f27814a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f27815b;

        /* renamed from: c  reason: collision with root package name */
        public int f27816c;

        /* renamed from: d  reason: collision with root package name */
        public View f27817d;

        /* renamed from: e  reason: collision with root package name */
        public e f27818e;
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class d extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public static final d f27819w;

        /* renamed from: u  reason: collision with root package name */
        public final ArrayBlockingQueue<c> f27820u = new ArrayBlockingQueue<>(10);

        /* renamed from: v  reason: collision with root package name */
        public final s0.e<c> f27821v = new s0.e<>(10);

        static {
            d dVar = new d();
            f27819w = dVar;
            dVar.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    c take = this.f27820u.take();
                    try {
                        take.f27817d = take.f27814a.f27809a.inflate(take.f27816c, take.f27815b, false);
                    } catch (RuntimeException e10) {
                        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e10);
                    }
                    Message.obtain(take.f27814a.f27810b, 0, take).sendToTarget();
                } catch (InterruptedException e11) {
                    Log.w("AsyncLayoutInflater", e11);
                }
            }
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(View view, ViewGroup viewGroup);
    }

    public a(Context context) {
        C0463a c0463a = new C0463a();
        this.f27809a = new b(context);
        this.f27810b = new Handler(c0463a);
        this.f27811c = d.f27819w;
    }

    public final void a(int i6, ViewGroup viewGroup, e eVar) {
        d dVar = this.f27811c;
        c b10 = dVar.f27821v.b();
        if (b10 == null) {
            b10 = new c();
        }
        b10.f27814a = this;
        b10.f27816c = i6;
        b10.f27815b = viewGroup;
        b10.f27818e = eVar;
        try {
            dVar.f27820u.put(b10);
        } catch (InterruptedException e10) {
            throw new RuntimeException("Failed to enqueue async inflate request", e10);
        }
    }
}
