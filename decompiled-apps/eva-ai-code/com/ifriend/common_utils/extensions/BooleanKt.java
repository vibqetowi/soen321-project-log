package com.ifriend.common_utils.extensions;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
/* compiled from: boolean.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\bø\u0001\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000\u001a)\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u001a\u0018\u0010\b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"getValueOrEmptyStr", "", "", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function0;", "ifFalse", "block", "", "ifTrue", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/reflect/KFunction0;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BooleanKt {
    public static final boolean ifTrue(boolean z, Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            block.invoke(Boolean.valueOf(z));
        }
        return z;
    }

    public static final boolean ifFalse(boolean z, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!z) {
            block.invoke();
        }
        return z;
    }

    public static final String getValueOrEmptyStr(boolean z, Function0<String> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return z ? action.invoke() : "";
    }

    public static final boolean ifTrue(boolean z, KFunction<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            ((Function0) block).invoke();
        }
        return z;
    }
}
