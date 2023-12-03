package com.moengage.pushbase.activities;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: PushClickDialogTracker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PushClickDialogTracker$onDateSelected$1 extends k implements a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushClickDialogTracker f10195u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f10196v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f10197w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f10198x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushClickDialogTracker$onDateSelected$1(PushClickDialogTracker pushClickDialogTracker, int i6, int i10, int i11) {
        super(0);
        this.f10195u = pushClickDialogTracker;
        this.f10196v = i6;
        this.f10197w = i10;
        this.f10198x = i11;
    }

    @Override // ss.a
    public final String invoke() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        str = this.f10195u.tag;
        sb2.append(str);
        sb2.append(" onDateSelected() : Selected date: ");
        sb2.append(this.f10196v);
        sb2.append('-');
        sb2.append(this.f10197w);
        sb2.append('-');
        sb2.append(this.f10198x);
        return sb2.toString();
    }
}
