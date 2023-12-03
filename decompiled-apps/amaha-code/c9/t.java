package c9;

import android.os.Handler;
import android.os.Message;
import c9.i;
import java.util.ArrayList;
/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f5194b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f5195a;

    /* compiled from: SystemHandlerWrapper.java */
    /* loaded from: classes.dex */
    public static final class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        public Message f5196a;

        public final void a() {
            Message message = this.f5196a;
            message.getClass();
            message.sendToTarget();
            this.f5196a = null;
            ArrayList arrayList = t.f5194b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public t(Handler handler) {
        this.f5195a = handler;
    }

    public static a l() {
        a aVar;
        ArrayList arrayList = f5194b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                aVar = new a();
            } else {
                aVar = (a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return aVar;
    }

    @Override // c9.i
    public final boolean a() {
        return this.f5195a.hasMessages(0);
    }

    @Override // c9.i
    public final a b(int i6, int i10, int i11) {
        a l2 = l();
        l2.f5196a = this.f5195a.obtainMessage(i6, i10, i11);
        return l2;
    }

    @Override // c9.i
    public final a c(Object obj, int i6, int i10, int i11) {
        a l2 = l();
        l2.f5196a = this.f5195a.obtainMessage(i6, i10, i11, obj);
        return l2;
    }

    @Override // c9.i
    public final boolean d(i.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.f5196a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.f5195a.sendMessageAtFrontOfQueue(message);
        aVar2.f5196a = null;
        ArrayList arrayList = f5194b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar2);
            }
        }
        return sendMessageAtFrontOfQueue;
    }

    @Override // c9.i
    public final void e() {
        this.f5195a.removeMessages(2);
    }

    @Override // c9.i
    public final boolean f(Runnable runnable) {
        return this.f5195a.post(runnable);
    }

    @Override // c9.i
    public final a g(int i6) {
        a l2 = l();
        l2.f5196a = this.f5195a.obtainMessage(i6);
        return l2;
    }

    @Override // c9.i
    public final void h() {
        this.f5195a.removeCallbacksAndMessages(null);
    }

    @Override // c9.i
    public final boolean i(long j10) {
        return this.f5195a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // c9.i
    public final boolean j(int i6) {
        return this.f5195a.sendEmptyMessage(i6);
    }

    @Override // c9.i
    public final a k(int i6, Object obj) {
        a l2 = l();
        l2.f5196a = this.f5195a.obtainMessage(i6, obj);
        return l2;
    }
}
