package com.bugsnag.android;

import gv.n;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: RootDetector.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "line", "", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class RootDetector$checkBuildProps$1$1$2 extends k implements l<String, Boolean> {
    public static final RootDetector$checkBuildProps$1$1$2 INSTANCE = new RootDetector$checkBuildProps$1$1$2();

    public RootDetector$checkBuildProps$1$1$2() {
        super(1);
    }

    @Override // ss.l
    public /* bridge */ /* synthetic */ Boolean invoke(String str) {
        return Boolean.valueOf(invoke2(str));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(String line) {
        i.h(line, "line");
        return n.H0(line, "ro.debuggable=[1]") || n.H0(line, "ro.secure=[0]");
    }
}
