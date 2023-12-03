package dk;

import android.graphics.drawable.Drawable;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12937u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Drawable f12938v;

    public /* synthetic */ m(Drawable drawable, int i6) {
        this.f12937u = i6;
        this.f12938v = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f12937u;
        Drawable drawable = this.f12938v;
        switch (i6) {
            case 0:
                int i10 = MiniCourseActivity.O;
                drawable.setState(new int[0]);
                return;
            case 1:
                drawable.setState(new int[0]);
                return;
            default:
                drawable.setState(new int[0]);
                return;
        }
    }
}
