package com.theinnerhour.b2b.utils;

import android.content.SharedPreferences;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import kotlin.Metadata;
/* compiled from: SessionManagerUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SessionManagerUtils$pref$2 extends kotlin.jvm.internal.k implements ss.a<SharedPreferences> {
    final /* synthetic */ SessionManagerUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerUtils$pref$2(SessionManagerUtils sessionManagerUtils) {
        super(0);
        this.this$0 = sessionManagerUtils;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final SharedPreferences invoke() {
        SessionManager sessionManager;
        MyApplication a10 = MyApplication.V.a();
        sessionManager = this.this$0.persistence;
        return a10.getSharedPreferences(sessionManager.getPrefName(), 0);
    }
}
