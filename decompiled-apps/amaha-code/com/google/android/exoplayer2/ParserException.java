package com.google.android.exoplayer2;

import java.io.IOException;
/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6158u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6159v;

    public ParserException(String str, Exception exc, boolean z10, int i6) {
        super(str, exc);
        this.f6158u = z10;
        this.f6159v = i6;
    }

    public static ParserException a(String str, Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }
}
