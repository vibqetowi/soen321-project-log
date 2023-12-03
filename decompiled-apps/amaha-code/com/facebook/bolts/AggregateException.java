package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AggregateException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AggregateException extends Exception {
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream err) {
        i.g(err, "err");
        super.printStackTrace(err);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter err) {
        i.g(err, "err");
        super.printStackTrace(err);
        throw null;
    }
}
