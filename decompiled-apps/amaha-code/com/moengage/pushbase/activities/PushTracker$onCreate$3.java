package com.moengage.pushbase.activities;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: PushTracker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PushTracker$onCreate$3 extends k implements a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushTracker f10212u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushTracker$onCreate$3(PushTracker pushTracker) {
        super(0);
        this.f10212u = pushTracker;
    }

    @Override // ss.a
    public final String invoke() {
        String str;
        str = this.f10212u.tag;
        return i.n(" onCreate() : ", str);
    }
}
