package gv;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final Pattern f16945u;

    /* compiled from: Regex.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final String f16946u;

        /* renamed from: v  reason: collision with root package name */
        public final int f16947v;

        public a(String str, int i6) {
            this.f16946u = str;
            this.f16947v = i6;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f16946u, this.f16947v);
            kotlin.jvm.internal.i.f(compile, "compile(pattern, flags)");
            return new e(compile);
        }
    }

    public e(Pattern pattern) {
        this.f16945u = pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f16945u;
        String pattern2 = pattern.pattern();
        kotlin.jvm.internal.i.f(pattern2, "nativePattern.pattern()");
        return new a(pattern2, pattern.flags());
    }

    public final boolean a(String str) {
        return this.f16945u.matcher(str).find();
    }

    public final boolean b(CharSequence input) {
        kotlin.jvm.internal.i.g(input, "input");
        return this.f16945u.matcher(input).matches();
    }

    public final List c(CharSequence input) {
        kotlin.jvm.internal.i.g(input, "input");
        int i6 = 0;
        r.X0(0);
        Matcher matcher = this.f16945u.matcher(input);
        if (!matcher.find()) {
            return ca.a.O0(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i6, matcher.start()).toString());
            i6 = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i6, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f16945u.toString();
        kotlin.jvm.internal.i.f(pattern, "nativePattern.toString()");
        return pattern;
    }

    public e(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
        this.f16945u = compile;
    }
}
