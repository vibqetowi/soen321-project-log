package com.moengage.pushbase.activities;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: PushClickDialogTracker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PushClickDialogTracker$onItemSelected$1 extends k implements a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushClickDialogTracker f10200u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f10201v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushClickDialogTracker$onItemSelected$1(PushClickDialogTracker pushClickDialogTracker, long j10) {
        super(0);
        this.f10200u = pushClickDialogTracker;
        this.f10201v = j10;
    }

    @Override // ss.a
    public final String invoke() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        str = this.f10200u.tag;
        sb2.append(str);
        sb2.append(" onItemSelected() : Item selected. Time: ");
        sb2.append(this.f10201v);
        return sb2.toString();
    }
}
