package uj;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import java.util.Arrays;
/* compiled from: Template.kt */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f34212a;

    /* renamed from: b  reason: collision with root package name */
    public final qh.a f34213b;

    /* renamed from: c  reason: collision with root package name */
    public final qj.a[] f34214c;

    /* renamed from: d  reason: collision with root package name */
    public final f f34215d;

    /* renamed from: e  reason: collision with root package name */
    public final h f34216e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f34217g;

    /* renamed from: h  reason: collision with root package name */
    public final s5 f34218h;

    /* renamed from: i  reason: collision with root package name */
    public final s5 f34219i;

    public o(String templateName, qh.a defaultText, qj.a[] defaultAction, f fVar, h hVar, String assetColor, boolean z10, s5 headerStyle, s5 dismissCta) {
        kotlin.jvm.internal.i.g(templateName, "templateName");
        kotlin.jvm.internal.i.g(defaultText, "defaultText");
        kotlin.jvm.internal.i.g(defaultAction, "defaultAction");
        kotlin.jvm.internal.i.g(assetColor, "assetColor");
        kotlin.jvm.internal.i.g(headerStyle, "headerStyle");
        kotlin.jvm.internal.i.g(dismissCta, "dismissCta");
        this.f34212a = templateName;
        this.f34213b = defaultText;
        this.f34214c = defaultAction;
        this.f34215d = fVar;
        this.f34216e = hVar;
        this.f = assetColor;
        this.f34217g = z10;
        this.f34218h = headerStyle;
        this.f34219i = dismissCta;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Template(templateName='");
        sb2.append(this.f34212a);
        sb2.append("', defaultText=");
        sb2.append(this.f34213b);
        sb2.append(", defaultAction=");
        String arrays = Arrays.toString(this.f34214c);
        kotlin.jvm.internal.i.f(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", collapsedTemplate=");
        sb2.append(this.f34215d);
        sb2.append(", expandedTemplate=");
        sb2.append(this.f34216e);
        sb2.append(", assetColor='");
        sb2.append(this.f);
        sb2.append("', shouldShowLargeIcon=");
        sb2.append(this.f34217g);
        sb2.append(", headerStyle=");
        sb2.append(this.f34218h);
        sb2.append(", dismissCta=");
        sb2.append(this.f34219i);
        sb2.append(')');
        return sb2.toString();
    }
}
