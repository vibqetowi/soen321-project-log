package com.ifriend.common_utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.DelayKt;
/* compiled from: iterable.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0086Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"forEachInfinite", "", ExifInterface.GPS_DIRECTION_TRUE, "", "delay", "Lkotlin/time/Duration;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "forEachInfinite-dWUq8MI", "(Ljava/lang/Iterable;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IterableKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:16:0x004a). Please submit an issue!!! */
    /* renamed from: forEachInfinite-dWUq8MI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object m6851forEachInfinitedWUq8MI(java.lang.Iterable<? extends T> r4, long r5, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.ifriend.common_utils.extensions.IterableKt$forEachInfinite$1
            if (r0 == 0) goto L14
            r0 = r8
            com.ifriend.common_utils.extensions.IterableKt$forEachInfinite$1 r0 = (com.ifriend.common_utils.extensions.IterableKt$forEachInfinite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.ifriend.common_utils.extensions.IterableKt$forEachInfinite$1 r0 = new com.ifriend.common_utils.extensions.IterableKt$forEachInfinite$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            long r4 = r0.J$0
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r2 = r0.L$0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r6
            r5 = r4
            r4 = r2
            goto L4a
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L43:
            kotlin.ResultKt.throwOnFailure(r8)
        L46:
            java.util.Iterator r8 = r4.iterator()
        L4a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r8.next()
            r7.invoke(r2)
            r0.L$0 = r4
            r0.L$1 = r7
            r0.L$2 = r8
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.m8803delayVtjQ1oo(r5, r0)
            if (r2 != r1) goto L4a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ifriend.common_utils.extensions.IterableKt.m6851forEachInfinitedWUq8MI(java.lang.Iterable, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: forEachInfinite-dWUq8MI$$forInline  reason: not valid java name */
    private static final <T> Object m6852forEachInfinitedWUq8MI$$forInline(Iterable<? extends T> iterable, long j, Function1<? super T, Unit> function1, Continuation<? super Unit> continuation) {
        while (true) {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                function1.invoke((T) it.next());
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                DelayKt.m8803delayVtjQ1oo(j, null);
                InlineMarker.mark(1);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
