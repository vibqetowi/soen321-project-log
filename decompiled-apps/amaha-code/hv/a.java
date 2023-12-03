package hv;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.k1;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class a implements j {
    @Override // kotlinx.coroutines.internal.j
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.j
    public k1 b(List<? extends j> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.j
    public int c() {
        return 1073741823;
    }
}
