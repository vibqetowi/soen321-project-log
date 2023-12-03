package tk;

import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import p.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements a.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33180u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f33181v;

    public /* synthetic */ d(c cVar, int i6) {
        this.f33180u = i6;
        this.f33181v = cVar;
    }

    @Override // p.a.e
    public final void a(View v10, ViewGroup viewGroup) {
        int i6 = this.f33180u;
        c this$0 = this.f33181v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(v10, "v");
                v10.setOnClickListener(new e(this$0, 0));
                if (viewGroup != null) {
                    viewGroup.addView(v10);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(v10, "v");
                e eVar = new e(this$0, 1);
                v10.setOnClickListener(DebouncedOnClickListener.wrap(eVar));
                View findViewById = v10.findViewById(R.id.rbCommunityV1Cta);
                if (findViewById != null) {
                    findViewById.setOnClickListener(DebouncedOnClickListener.wrap(eVar));
                }
                if (viewGroup != null) {
                    viewGroup.addView(v10);
                    return;
                }
                return;
        }
    }
}
