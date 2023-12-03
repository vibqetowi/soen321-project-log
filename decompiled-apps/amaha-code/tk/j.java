package tk;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.util.Timer;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class j implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f33191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f33192b;

    public j(View view, c cVar) {
        this.f33191a = cVar;
        this.f33192b = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
        c cVar = this.f33191a;
        cVar.f33174x = false;
        Timer timer = cVar.f33175y;
        if (timer != null) {
            timer.cancel();
        }
        cVar.f33175y = null;
        RecyclerView recyclerView = (RecyclerView) this.f33192b.findViewById(R.id.rvCardV2);
        if (recyclerView != null) {
            recyclerView.b0(this);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
