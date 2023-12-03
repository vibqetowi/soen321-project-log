package hr;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e9 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18349u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f9 f18350v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f18351w;

    public /* synthetic */ e9(f9 f9Var, ConstraintLayout constraintLayout, int i6) {
        this.f18349u = i6;
        this.f18350v = f9Var;
        this.f18351w = constraintLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f18349u;
        ConstraintLayout item = this.f18351w;
        f9 this$0 = this.f18350v;
        switch (i6) {
            case 0:
                int i10 = f9.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(item, "$item");
                this$0.O(item);
                return;
            case 1:
                int i11 = f9.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(item, "$item");
                this$0.O(item);
                return;
            default:
                int i12 = f9.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(item, "$item");
                this$0.O(item);
                return;
        }
    }
}
