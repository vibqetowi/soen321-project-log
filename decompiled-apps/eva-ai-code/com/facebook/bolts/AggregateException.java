package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AggregateException.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "detailMessage", "", "innerThrowables", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "printStackTrace", "", NotificationCompat.CATEGORY_ERROR, "Ljava/io/PrintStream;", "Ljava/io/PrintWriter;", "Companion", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AggregateException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? CollectionsKt.emptyList() : list);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    /* compiled from: AggregateException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/bolts/AggregateException$Companion;", "", "()V", "serialVersionUID", "", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
