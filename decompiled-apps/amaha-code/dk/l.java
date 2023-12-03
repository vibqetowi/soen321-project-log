package dk;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12935u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniCourseActivity f12936v;

    public /* synthetic */ l(MiniCourseActivity miniCourseActivity, int i6) {
        this.f12935u = i6;
        this.f12936v = miniCourseActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f12935u;
        MiniCourseActivity this$0 = this.f12936v;
        switch (i6) {
            case 0:
                int i10 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDestroyed()) {
                    Drawable background = ((ConstraintLayout) this$0.v0(R.id.newTutorialLayout).findViewById(R.id.basicCourseBackground)).getBackground();
                    if (background instanceof RippleDrawable) {
                        background.setHotspot(0.0f, 0.0f);
                        ((RippleDrawable) background).setState(new int[]{16842919, 16842910});
                        if (!this$0.isDestroyed()) {
                            new Handler().postDelayed(new m(background, 0), 150L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoTextView) this$0.v0(R.id.proPurchaseText)).setVisibility(0);
                ((RecyclerView) this$0.v0(R.id.basicCourseRecyclerView)).setVisibility(0);
                this$0.v0(R.id.newTutorialLayout).setVisibility(8);
                ((RobertoTextView) this$0.v0(R.id.newTutDesc)).setVisibility(8);
                return;
        }
    }
}
