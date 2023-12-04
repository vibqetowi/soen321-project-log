package com.ifriend.ui.components.modifier;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ClickableModifier.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\t"}, d2 = {"noIndicationClickable", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClickableModifierKt {
    public static /* synthetic */ Modifier noIndicationClickable$default(Modifier modifier, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return noIndicationClickable(modifier, z, function0);
    }

    public static final Modifier noIndicationClickable(Modifier modifier, boolean z, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new ClickableModifierKt$noIndicationClickable$1(z, onClick), 1, null);
    }

    public static /* synthetic */ Modifier noIndicationClickable$default(Modifier modifier, Function0 function0, MutableInteractionSource mutableInteractionSource, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return noIndicationClickable(modifier, function0, mutableInteractionSource, z);
    }

    public static final Modifier noIndicationClickable(Modifier modifier, Function0<Unit> onClick, MutableInteractionSource interactionSource, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return ClickableKt.m452clickableO2vRcR0$default(modifier, interactionSource, null, z, null, null, onClick, 24, null);
    }
}
