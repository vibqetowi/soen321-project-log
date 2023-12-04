package com.ifriend.ui.components.modifier;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConditionalModifier.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006¨\u0006\t"}, d2 = {"conditional", "Landroidx/compose/ui/Modifier;", "condition", "", "modifier", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ifTrue", "ifFalse", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConditionalModifierKt {
    public static final Modifier conditional(Modifier modifier, boolean z, Function1<? super Modifier, ? extends Modifier> modifier2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(modifier2, "modifier");
        return z ? modifier.then(modifier2.invoke(Modifier.Companion)) : modifier;
    }

    public static final Modifier conditional(Modifier modifier, boolean z, Function1<? super Modifier, ? extends Modifier> ifTrue, Function1<? super Modifier, ? extends Modifier> ifFalse) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(ifTrue, "ifTrue");
        Intrinsics.checkNotNullParameter(ifFalse, "ifFalse");
        if (z) {
            return modifier.then(ifTrue.invoke(Modifier.Companion));
        }
        return modifier.then(ifFalse.invoke(Modifier.Companion));
    }
}
