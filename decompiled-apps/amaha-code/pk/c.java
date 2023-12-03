package pk;

import android.content.DialogInterface;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28540u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CoachChatActivity f28541v;

    public /* synthetic */ c(CoachChatActivity coachChatActivity, int i6) {
        this.f28540u = i6;
        this.f28541v = coachChatActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f28540u;
        CoachChatActivity this$0 = this.f28541v;
        switch (i10) {
            case 0:
                int i11 = CoachChatActivity.K;
                i.g(this$0, "this$0");
                f0.a.e(this$0, this$0.C, R.styleable.AppCompatTheme_textColorSearchUrl);
                return;
            default:
                int i12 = CoachChatActivity.K;
                i.g(this$0, "this$0");
                f0.a.e(this$0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, R.styleable.AppCompatTheme_toolbarStyle);
                return;
        }
    }
}
