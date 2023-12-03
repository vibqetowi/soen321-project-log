package com.theinnerhour.b2b.persistence;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlin.Metadata;
import ls.d;
import ns.c;
import ns.e;
/* compiled from: FirebasePersistenceUtils.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@e(c = "com.theinnerhour.b2b.persistence.FirebasePersistenceUtils", f = "FirebasePersistenceUtils.kt", l = {R.styleable.AppCompatTheme_textColorSearchUrl, 139}, m = "updateCourseInfo")
/* loaded from: classes2.dex */
public final class FirebasePersistenceUtils$updateCourseInfo$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebasePersistenceUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePersistenceUtils$updateCourseInfo$1(FirebasePersistenceUtils firebasePersistenceUtils, d<? super FirebasePersistenceUtils$updateCourseInfo$1> dVar) {
        super(dVar);
        this.this$0 = firebasePersistenceUtils;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object updateCourseInfo;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        updateCourseInfo = this.this$0.updateCourseInfo(null, this);
        return updateCourseInfo;
    }
}
