package pk;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import je.o;
import kotlin.jvm.internal.i;
import rk.f;
/* compiled from: CoachChatActivity.kt */
/* loaded from: classes2.dex */
public final class d implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final Handler f28542u = new Handler();

    /* renamed from: v  reason: collision with root package name */
    public final o f28543v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ CoachChatActivity f28544w;

    public d(CoachChatActivity coachChatActivity) {
        this.f28544w = coachChatActivity;
        this.f28543v = new o(25, coachChatActivity);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s10) {
        i.g(s10, "s");
        Handler handler = this.f28542u;
        handler.removeCallbacksAndMessages(null);
        LogHelper.INSTANCE.i(this.f28544w.f10626v, "aftertextchange");
        handler.postDelayed(this.f28543v, 2000L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s10, int i6, int i10, int i11) {
        i.g(s10, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s10, int i6, int i10, int i11) {
        i.g(s10, "s");
        LogHelper logHelper = LogHelper.INSTANCE;
        CoachChatActivity coachChatActivity = this.f28544w;
        logHelper.i(coachChatActivity.f10626v, "ontextchange");
        if (s10.length() > 0) {
            this.f28542u.removeCallbacksAndMessages(null);
            f fVar = coachChatActivity.G;
            if (fVar != null) {
                fVar.f(Constants.TYPING);
            } else {
                i.q("chatViewModel");
                throw null;
            }
        }
    }
}
