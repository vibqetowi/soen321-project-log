package hr;

import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k8 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18692u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o8 f18693v;

    public /* synthetic */ k8(o8 o8Var, int i6) {
        this.f18692u = i6;
        this.f18693v = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f18692u;
        o8 this$0 = this.f18693v;
        switch (i6) {
            case 0:
                int i10 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvFromTime)).setText(this$0.B.format(this$0.D.getTime()));
                return;
            case 1:
                int i11 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvToTime)).setText(this$0.B.format(this$0.E.getTime()));
                return;
            case 2:
                int i12 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.llEditText1)).setText(this$0.K().getText());
                return;
            case 3:
                int i13 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ViewPager viewPager = (ViewPager) this$0._$_findCachedViewById(R.id.stepsViewPager);
                if (viewPager != null) {
                    viewPager.v(this$0.f18925x);
                    return;
                }
                return;
            case 4:
                int i14 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.llEditText1)).setText(this$0.K().getText());
                return;
            default:
                int i15 = o8.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ScrollView scrollView = (ScrollView) this$0._$_findCachedViewById(R.id.scrollView1);
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                }
                return;
        }
    }
}
