package gv;

import java.util.List;
import java.util.regex.Matcher;
/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f16941a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f16942b;

    /* renamed from: c  reason: collision with root package name */
    public a f16943c;

    /* compiled from: Regex.kt */
    /* loaded from: classes2.dex */
    public static final class a extends is.c<String> {
        public a() {
        }

        @Override // is.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        @Override // is.a
        public final int g() {
            return d.this.f16941a.groupCount() + 1;
        }

        @Override // is.c, java.util.List
        public final Object get(int i6) {
            String group = d.this.f16941a.group(i6);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // is.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        @Override // is.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public d(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.i.g(input, "input");
        this.f16941a = matcher;
        this.f16942b = input;
    }

    @Override // gv.c
    public final List<String> a() {
        if (this.f16943c == null) {
            this.f16943c = new a();
        }
        a aVar = this.f16943c;
        kotlin.jvm.internal.i.d(aVar);
        return aVar;
    }

    @Override // gv.c
    public final d next() {
        int i6;
        Matcher matcher = this.f16941a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i10 = end + i6;
        CharSequence charSequence = this.f16942b;
        if (i10 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.i.f(matcher2, "matcher.pattern().matcher(input)");
        if (!matcher2.find(i10)) {
            return null;
        }
        return new d(matcher2, charSequence);
    }
}
