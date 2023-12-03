package tk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33185u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f33186v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f33187w;

    public /* synthetic */ g(View view, c cVar, int i6) {
        this.f33185u = i6;
        this.f33186v = view;
        this.f33187w = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f33185u;
        c this$0 = this.f33187w;
        View v10 = this.f33186v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RecyclerView recyclerView = (RecyclerView) v10.findViewById(R.id.rvCardV2);
                    if (recyclerView != null) {
                        recyclerView.h(new j(v10, this$0));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f33171u, e10);
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RecyclerView recyclerView2 = (RecyclerView) v10.findViewById(R.id.rvCommunityCardV3);
                    if (recyclerView2 != null) {
                        recyclerView2.h(new n(v10, this$0));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f33171u, e11);
                    return;
                }
        }
    }
}
