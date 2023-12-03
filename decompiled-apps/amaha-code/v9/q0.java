package v9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import v9.b;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class q0 extends ma.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f34937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b bVar, Looper looper) {
        super(looper);
        this.f34937a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r0 == 5) goto L101;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Object obj;
        boolean z10 = false;
        if (this.f34937a.R.get() != message.arg1) {
            int i6 = message.what;
            if ((i6 == 2 || i6 == 1 || i6 == 7) ? true : true) {
                r0 r0Var = (r0) message.obj;
                r0Var.b();
                r0Var.d();
                return;
            }
            return;
        }
        int i10 = message.what;
        if (i10 != 1 && i10 != 7) {
            if (i10 == 4) {
                this.f34937a.getClass();
            }
        }
        if (!this.f34937a.d()) {
            r0 r0Var2 = (r0) message.obj;
            r0Var2.b();
            r0Var2.d();
            return;
        }
        int i11 = message.what;
        PendingIntent pendingIntent = null;
        if (i11 == 4) {
            this.f34937a.O = new s9.b(message.arg2);
            b bVar = this.f34937a;
            if (!bVar.P && !TextUtils.isEmpty(bVar.z()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(bVar.z());
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (z10) {
                b bVar2 = this.f34937a;
                if (!bVar2.P) {
                    bVar2.H(3, null);
                    return;
                }
            }
            s9.b bVar3 = this.f34937a.O;
            if (bVar3 == null) {
                bVar3 = new s9.b(8);
            }
            this.f34937a.E.a(bVar3);
            this.f34937a.C(bVar3);
        } else if (i11 == 5) {
            s9.b bVar4 = this.f34937a.O;
            if (bVar4 == null) {
                bVar4 = new s9.b(8);
            }
            this.f34937a.E.a(bVar4);
            this.f34937a.C(bVar4);
        } else if (i11 == 3) {
            Object obj2 = message.obj;
            if (obj2 instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj2;
            }
            s9.b bVar5 = new s9.b(message.arg2, pendingIntent);
            this.f34937a.E.a(bVar5);
            this.f34937a.C(bVar5);
        } else if (i11 == 6) {
            this.f34937a.H(5, null);
            b.a aVar = this.f34937a.J;
            if (aVar != null) {
                aVar.z(message.arg2);
            }
            this.f34937a.getClass();
            System.currentTimeMillis();
            b.G(this.f34937a, 5, 1, null);
        } else if (i11 == 2 && !this.f34937a.j()) {
            r0 r0Var3 = (r0) message.obj;
            r0Var3.b();
            r0Var3.d();
        } else {
            int i12 = message.what;
            if ((i12 == 2 || i12 == 1 || i12 == 7) ? true : true) {
                r0 r0Var4 = (r0) message.obj;
                synchronized (r0Var4) {
                    obj = r0Var4.f34940a;
                    if (r0Var4.f34941b) {
                        String obj3 = r0Var4.toString();
                        Log.w("GmsClient", "Callback proxy " + obj3 + " being reused. This is not safe.");
                    }
                }
                if (obj != null) {
                    try {
                        r0Var4.a();
                    } catch (RuntimeException e10) {
                        throw e10;
                    }
                }
                synchronized (r0Var4) {
                    r0Var4.f34941b = true;
                }
                r0Var4.d();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + i12, new Exception());
        }
    }
}
