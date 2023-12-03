package com.theinnerhour.b2b.persistence;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlin.Metadata;
import ls.d;
import ns.c;
import ns.e;
/* compiled from: FirebasePersistenceUtils.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@e(c = "com.theinnerhour.b2b.persistence.FirebasePersistenceUtils", f = "FirebasePersistenceUtils.kt", l = {210}, m = "setUserPreferencesValue")
/* loaded from: classes2.dex */
public final class FirebasePersistenceUtils$setUserPreferencesValue$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebasePersistenceUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePersistenceUtils$setUserPreferencesValue$1(FirebasePersistenceUtils firebasePersistenceUtils, d<? super FirebasePersistenceUtils$setUserPreferencesValue$1> dVar) {
        super(dVar);
        this.this$0 = firebasePersistenceUtils;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object userPreferencesValue;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        userPreferencesValue = this.this$0.setUserPreferencesValue(null, this);
        return userPreferencesValue;
    }
}
