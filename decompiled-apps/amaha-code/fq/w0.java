package fq;

import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15819u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ y0 f15820v;

    public /* synthetic */ w0(y0 y0Var, int i6) {
        this.f15819u = i6;
        this.f15820v = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f15819u;
        y0 this$0 = this.f15820v;
        switch (i6) {
            case 0:
                int i10 = y0.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText(this$0.C.get(this$0.E));
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                int i11 = y0.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 2:
                int i12 = y0.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RelativeLayout relativeLayout = this$0.G;
                    kotlin.jvm.internal.i.d(relativeLayout);
                    ((ScrollView) this$0._$_findCachedViewById(R.id.scrollView)).scrollTo(0, relativeLayout.getTop());
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f15826u, "exception", e10);
                    return;
                }
            default:
                int i13 = y0.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollView)).fullScroll(130);
                return;
        }
    }
}
