package k4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22955a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f22956b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((v) message.obj).recycle();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(v<?> vVar, boolean z10) {
        if (!this.f22955a && !z10) {
            this.f22955a = true;
            vVar.recycle();
            this.f22955a = false;
        }
        this.f22956b.obtainMessage(1, vVar).sendToTarget();
    }
}
