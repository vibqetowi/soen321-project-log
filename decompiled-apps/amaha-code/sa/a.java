package sa;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import ta.g4;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final j1 f31379a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
    /* renamed from: sa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0534a extends g4 {
    }

    public a(j1 j1Var) {
        this.f31379a = j1Var;
    }

    public final void a(InterfaceC0534a interfaceC0534a) {
        j1 j1Var = this.f31379a;
        j1Var.getClass();
        synchronized (j1Var.f8440e) {
            for (int i6 = 0; i6 < j1Var.f8440e.size(); i6++) {
                if (interfaceC0534a.equals(((Pair) j1Var.f8440e.get(i6)).first)) {
                    Log.w(j1Var.f8436a, "OnEventListener already registered.");
                    return;
                }
            }
            f1 f1Var = new f1(interfaceC0534a);
            j1Var.f8440e.add(new Pair(interfaceC0534a, f1Var));
            if (j1Var.f8442h != null) {
                try {
                    j1Var.f8442h.registerOnMeasurementEventListener(f1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(j1Var.f8436a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j1Var.b(new v0(j1Var, f1Var, 2));
        }
    }
}
