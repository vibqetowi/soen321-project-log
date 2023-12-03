package com.bugsnag.android;

import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: RootDetector.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class RootDetector$checkBuildProps$1$1$1 extends k implements l<String, String> {
    public static final RootDetector$checkBuildProps$1$1$1 INSTANCE = new RootDetector$checkBuildProps$1$1$1();

    public RootDetector$checkBuildProps$1$1$1() {
        super(1);
    }

    @Override // ss.l
    public final String invoke(String line) {
        i.h(line, "line");
        Pattern compile = Pattern.compile("\\s");
        i.f(compile, "compile(pattern)");
        String replaceAll = compile.matcher(line).replaceAll("");
        i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }
}
