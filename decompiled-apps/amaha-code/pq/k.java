package pq;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28790u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m f28791v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f28792w;

    public /* synthetic */ k(m mVar, View view, int i6) {
        this.f28790u = i6;
        this.f28791v = mVar;
        this.f28792w = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f28790u;
        View view2 = this.f28792w;
        m this$0 = this.f28791v;
        switch (i6) {
            case 0:
                int i10 = m.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J(view2, ((RobertoTextView) view2.findViewById(R.id.rowTitle)).getText().toString());
                this$0.M();
                return;
            default:
                int i11 = m.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J(view2, ((RobertoTextView) view2.findViewById(R.id.rowTitle)).getText().toString());
                this$0.M();
                return;
        }
    }
}
