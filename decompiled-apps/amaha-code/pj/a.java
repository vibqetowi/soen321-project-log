package pj;
/* compiled from: AddOnFeatures.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28517a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28518b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28519c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28520d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28521e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final long f28522g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f28523h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28524i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28525j;

    public a(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, long j10, boolean z15, String str2, boolean z16) {
        this.f28517a = str;
        this.f28518b = z10;
        this.f28519c = z11;
        this.f28520d = z12;
        this.f28521e = z13;
        this.f = z14;
        this.f28522g = j10;
        this.f28523h = z15;
        this.f28524i = str2;
        this.f28525j = z16;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddOnFeatures(campaignTag='");
        sb2.append(this.f28517a);
        sb2.append("', shouldIgnoreInbox=");
        sb2.append(this.f28518b);
        sb2.append(", pushToInbox=");
        sb2.append(this.f28519c);
        sb2.append(", isRichPush=");
        sb2.append(this.f28520d);
        sb2.append(", isPersistent=");
        sb2.append(this.f28521e);
        sb2.append(", shouldDismissOnClick=");
        sb2.append(this.f);
        sb2.append(", autoDismissTime=");
        sb2.append(this.f28522g);
        sb2.append(", shouldShowMultipleNotification=");
        sb2.append(this.f28523h);
        sb2.append(", largeIconUrl='");
        sb2.append(this.f28524i);
        sb2.append("', hasHtmlContent=");
        return defpackage.c.t(sb2, this.f28525j, ')');
    }
}
