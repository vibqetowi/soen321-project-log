package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import kotlin.Metadata;
/* compiled from: SessionManagerUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SessionManagerUtils$versionCode$2 extends kotlin.jvm.internal.k implements ss.a<String> {
    public static final SessionManagerUtils$versionCode$2 INSTANCE = new SessionManagerUtils$versionCode$2();

    public SessionManagerUtils$versionCode$2() {
        super(0);
    }

    @Override // ss.a
    public final String invoke() {
        MyApplication.a aVar = MyApplication.V;
        return String.valueOf(h0.a.a(aVar.a().getPackageManager().getPackageInfo(aVar.a().getPackageName(), 0)));
    }
}
