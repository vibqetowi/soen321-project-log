package com.ifriend.analytics.impl.tools;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ThrowableExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"changedStackTraceElement", "", "", "throwableName", "", "methodUsed", "declaringClass", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThrowableExtKt {
    public static final void changedStackTraceElement(Throwable th, String throwableName, String methodUsed, String declaringClass) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(throwableName, "throwableName");
        Intrinsics.checkNotNullParameter(methodUsed, "methodUsed");
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        String str = throwableName;
        if (str.length() == 0) {
            str = th.getClass().getSimpleName();
        }
        StackTraceElement stackTraceElement = new StackTraceElement(declaringClass, methodUsed, str, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        CollectionsKt.addAll(arrayList2, stackTrace);
        arrayList.add(0, stackTraceElement);
        th.setStackTrace((StackTraceElement[]) arrayList2.toArray(new StackTraceElement[0]));
    }
}
