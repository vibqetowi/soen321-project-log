package hr;

import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y7 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19420u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z7 f19421v;

    public /* synthetic */ y7(z7 z7Var, int i6) {
        this.f19420u = i6;
        this.f19421v = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f19420u;
        z7 this$0 = this.f19421v;
        switch (i6) {
            case 0:
                int i10 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText(this$0.f19450x.get(this$0.f19452z));
                return;
            case 1:
                int i11 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                return;
            case 2:
                int i12 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RelativeLayout relativeLayout = this$0.B;
                    kotlin.jvm.internal.i.d(relativeLayout);
                    ((ScrollView) this$0._$_findCachedViewById(R.id.scrollView)).scrollTo(0, relativeLayout.getTop());
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f19447u, "exception", e10);
                    return;
                }
            default:
                int i13 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollView)).fullScroll(130);
                return;
        }
    }
}
