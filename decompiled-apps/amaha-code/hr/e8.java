package hr;

import android.widget.ImageButton;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.libPackage.exoPlayer2.CustomTimeBar;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet$onViewCreated$3;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e8 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18347u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f18348v;

    public /* synthetic */ e8(int i6, Object obj) {
        this.f18347u = i6;
        this.f18348v = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f18347u;
        Object obj = this.f18348v;
        switch (i6) {
            case 0:
                f8 this$0 = (f8) obj;
                int i10 = f8.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 1:
                w8 this$02 = (w8) obj;
                int i11 = w8.f19358y;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.I();
                ((ScrollView) this$02._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 2:
                f9 this$03 = (f9) obj;
                int i12 = f9.C;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.I();
                ((ScrollView) this$03._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 3:
                ImageButton imgAdd = (ImageButton) obj;
                int i13 = ka.A;
                kotlin.jvm.internal.i.g(imgAdd, "$imgAdd");
                imgAdd.setVisibility(8);
                return;
            case 4:
                int i14 = CustomTimeBar.f11740f0;
                ((CustomTimeBar) obj).e(false);
                return;
            default:
                NotificationPermissionBottomSheet$onViewCreated$3.a((NotificationPermissionBottomSheet) obj);
                return;
        }
    }
}
