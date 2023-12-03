package com.theinnerhour.b2b.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlin.Metadata;
import ls.d;
import ns.c;
import ns.e;
/* compiled from: PostLoginNotificationWorkManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@e(c = "com.theinnerhour.b2b.service.PostLoginNotificationWorkManager", f = "PostLoginNotificationWorkManager.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall, R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorControlHighlight}, m = "doWork")
/* loaded from: classes2.dex */
public final class PostLoginNotificationWorkManager$doWork$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostLoginNotificationWorkManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLoginNotificationWorkManager$doWork$1(PostLoginNotificationWorkManager postLoginNotificationWorkManager, d<? super PostLoginNotificationWorkManager$doWork$1> dVar) {
        super(dVar);
        this.this$0 = postLoginNotificationWorkManager;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.doWork(this);
    }
}
