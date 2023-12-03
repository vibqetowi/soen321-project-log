package qk;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.chat.model.ChatProgress;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: ChatHelper.kt */
/* loaded from: classes2.dex */
public final class d extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f29648u;

    public d(c cVar) {
        this.f29648u = cVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        c cVar = this.f29648u;
        i.g(error, "error");
        try {
            cVar.f29642d.l(ChatProgress.FAILURE);
            super.onErrorResponse(error);
            LogHelper.INSTANCE.e(cVar.f29639a, "https://api.theinnerhour.com/v1/getkey", error);
        } catch (Exception e10) {
            cVar.f29642d.l(ChatProgress.FAILURE);
            LogHelper.INSTANCE.e(cVar.f29639a, "https://api.theinnerhour.com/v1/getkey", e10);
        }
    }
}
