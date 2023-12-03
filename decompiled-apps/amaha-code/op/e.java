package op;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Timer;
import kotlin.jvm.internal.i;
/* compiled from: TeleEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class e implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f27709a;

    public e(a aVar) {
        this.f27709a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView rv2, MotionEvent e10) {
        i.g(rv2, "rv");
        i.g(e10, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView rv2, MotionEvent e10) {
        i.g(rv2, "rv");
        i.g(e10, "e");
        a aVar = this.f27709a;
        Timer timer = aVar.f27699z;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            aVar.f27699z = null;
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
