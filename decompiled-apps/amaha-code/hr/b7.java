package hr;

import android.widget.ImageButton;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18205u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c7 f18206v;

    public /* synthetic */ b7(c7 c7Var, int i6) {
        this.f18205u = i6;
        this.f18206v = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f18205u;
        c7 this$0 = this.f18206v;
        switch (i6) {
            case 0:
                int i10 = c7.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)) != null) {
                    ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                    return;
                }
                return;
            case 1:
                int i11 = c7.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText(this$0.f18257x.get(0));
                return;
            default:
                int i12 = c7.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollView)).fullScroll(130);
                return;
        }
    }
}
