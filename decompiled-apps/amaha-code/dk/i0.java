package dk;

import android.content.DialogInterface;
import com.theinnerhour.b2b.activity.WebviewActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12931u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ WebviewActivity f12932v;

    public /* synthetic */ i0(WebviewActivity webviewActivity, int i6) {
        this.f12931u = i6;
        this.f12932v = webviewActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f12931u;
        WebviewActivity this$0 = this.f12932v;
        switch (i10) {
            case 0:
                int i11 = WebviewActivity.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                f0.a.e(this$0, this$0.C, this$0.B);
                return;
            case 1:
                int i12 = WebviewActivity.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                f0.a.e(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this$0.A);
                return;
            default:
                int i13 = WebviewActivity.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.finish();
                return;
        }
    }
}
