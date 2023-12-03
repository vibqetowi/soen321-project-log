package jn;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f22508u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f22509v;

    public /* synthetic */ d(e eVar, int i6) {
        this.f22508u = i6;
        this.f22509v = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f22508u;
        e this$0 = this.f22509v;
        switch (i6) {
            case 0:
                int i10 = e.B;
                i.g(this$0, "this$0");
                p activity = this$0.getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                ((ScreenLogsActivity) activity).getOnBackPressedDispatcher().b();
                return;
            case 1:
                int i11 = e.B;
                i.g(this$0, "this$0");
                a aVar = this$0.f22512w;
                if (aVar != null) {
                    y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                    a aVar2 = this$0.f22512w;
                    if (aVar2 != null) {
                        aVar.show(supportFragmentManager, aVar2.getTag());
                        return;
                    } else {
                        i.q("domainBottomSheet");
                        throw null;
                    }
                }
                i.q("domainBottomSheet");
                throw null;
            default:
                int i12 = e.B;
                i.g(this$0, "this$0");
                b bVar = new b();
                Bundle bundle = new Bundle();
                bundle.putString("key", Constants.SCREEN_GRATITUDE_JOURNAL);
                bVar.setArguments(bundle);
                p activity2 = this$0.getActivity();
                i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                ((ScreenLogsActivity) activity2).s0(bVar);
                return;
        }
    }
}
