package jj;

import kotlin.jvm.internal.i;
/* compiled from: TextContent.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f22071a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f22072b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f22073c;

    public d(CharSequence title, CharSequence message, CharSequence summary) {
        i.g(title, "title");
        i.g(message, "message");
        i.g(summary, "summary");
        this.f22071a = title;
        this.f22072b = message;
        this.f22073c = summary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i.b(this.f22071a, dVar.f22071a) && i.b(this.f22072b, dVar.f22072b) && i.b(this.f22073c, dVar.f22073c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f22072b.hashCode();
        return this.f22073c.hashCode() + ((hashCode + (this.f22071a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextContent(title=" + ((Object) this.f22071a) + ", message=" + ((Object) this.f22072b) + ", summary=" + ((Object) this.f22073c) + ')';
    }
}
