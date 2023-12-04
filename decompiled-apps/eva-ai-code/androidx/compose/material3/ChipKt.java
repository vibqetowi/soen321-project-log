package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a¦\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a¼\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0097\u0001\u0010(\u001a\u00020\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a¦\u0001\u0010.\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a®\u0001\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001a\u008f\u0001\u00105\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a®\u0001\u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001aÅ\u0001\u00109\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010:\u001aÑ\u0001\u0010;\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002012\b\u0010\u0017\u001a\u0004\u0018\u0001022\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u008f\u0001\u0010>\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a&\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SuggestionChipPadding", "AssistChip", "", "onClick", "Lkotlin/Function0;", Constants.ScionAnalytics.PARAM_LABEL, "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ChipColors;", "elevation", "Landroidx/compose/material3/ChipElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/material3/ChipBorder;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/BorderStroke;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "Landroidx/compose/material3/SelectableChipBorder;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        ChipElevation chipElevation2;
        int i12;
        Modifier modifier3;
        int i13;
        int i14;
        ChipBorder chipBorder2;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        ChipElevation chipElevation3;
        ChipColors chipColors3;
        boolean z3;
        Composer composer2;
        Modifier modifier5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        ChipElevation chipElevation4;
        MutableInteractionSource mutableInteractionSource3;
        ChipBorder chipBorder4;
        ChipColors chipColors4;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(-1932300596);
        ComposerKt.sourceInformation(startRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)110@5623L5,111@5674L18,112@5745L21,113@5813L18,114@5883L39,120@6059L10,121@6137L19,115@5928L543:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(label) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i17 = 8388608;
                                i4 |= i17;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i17 = 4194304;
                        i4 |= i17;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i16 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i16;
                        }
                        i16 = 33554432;
                        i4 |= i16;
                    }
                    if ((i & 1879048192) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(chipBorder)) {
                            i15 = 536870912;
                            i4 |= i15;
                        }
                        i15 = 268435456;
                        i4 |= i15;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i11 = i2 | 6;
                        i9 = i8;
                    } else {
                        i9 = i8;
                        if ((i2 & 14) != 0) {
                            i10 = i2;
                            if ((i4 & 1533916891) != 306783378 && (i10 & 11) == 2 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                function25 = function22;
                                chipElevation4 = chipElevation;
                                chipBorder4 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                chipColors4 = chipColors2;
                                modifier5 = modifier2;
                                z4 = z2;
                                composer2 = startRestartGroup;
                                function26 = function2;
                                shape3 = shape;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i18 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i5 != 0 ? true : z2;
                                    function23 = i6 != 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function27 = i7 != 0 ? null : function22;
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        shape2 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        shape2 = shape;
                                    }
                                    if ((i3 & 128) != 0) {
                                        chipColors2 = AssistChipDefaults.INSTANCE.m1577assistChipColorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 100663296, 255);
                                        i4 &= -29360129;
                                    }
                                    ChipColors chipColors5 = chipColors2;
                                    if ((i3 & 256) != 0) {
                                        i12 = i4 & (-234881025);
                                        chipElevation2 = AssistChipDefaults.INSTANCE.m1578assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    } else {
                                        chipElevation2 = chipElevation;
                                        i12 = i4;
                                    }
                                    if ((i3 & 512) != 0) {
                                        modifier3 = companion;
                                        i13 = i10;
                                        i14 = i9;
                                        chipBorder2 = AssistChipDefaults.INSTANCE.m1576assistChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                                        i12 &= -1879048193;
                                    } else {
                                        modifier3 = companion;
                                        i13 = i10;
                                        i14 = i9;
                                        chipBorder2 = chipBorder;
                                    }
                                    if (i14 != 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        modifier4 = modifier3;
                                        chipBorder3 = chipBorder2;
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        modifier4 = modifier3;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        chipBorder3 = chipBorder2;
                                    }
                                    function24 = function27;
                                    chipElevation3 = chipElevation2;
                                    i4 = i12;
                                    chipColors3 = chipColors5;
                                    z3 = z5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    if ((i3 & 512) != 0) {
                                        i4 &= -1879048193;
                                    }
                                    function23 = function2;
                                    function24 = function22;
                                    shape2 = shape;
                                    chipElevation3 = chipElevation;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    chipColors3 = chipColors2;
                                    modifier4 = modifier2;
                                    i13 = i10;
                                    z3 = z2;
                                    chipBorder3 = chipBorder;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1932300596, i4, i13, "androidx.compose.material3.AssistChip (Chip.kt:103)");
                                }
                                TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                                int i19 = (i4 >> 9) & 14;
                                long m3301unboximpl = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i19).getValue().m3301unboximpl();
                                startRestartGroup.startReplaceableGroup(839902004);
                                ComposerKt.sourceInformation(startRestartGroup, "127@6316L21");
                                State<BorderStroke> borderStroke$material3_release = chipBorder3 == null ? null : chipBorder3.borderStroke$material3_release(z3, startRestartGroup, i19 | ((i4 >> 24) & 112));
                                startRestartGroup.endReplaceableGroup();
                                composer2 = startRestartGroup;
                                int i20 = i4 << 6;
                                ChipBorder chipBorder5 = chipBorder3;
                                ChipColors chipColors6 = chipColors3;
                                boolean z6 = z3;
                                m1618ChipnkUnTEs(modifier4, onClick, z3, label, fromToken, m3301unboximpl, function23, function24, shape2, chipColors6, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier5 = modifier4;
                                function25 = function24;
                                chipElevation4 = chipElevation3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                chipBorder4 = chipBorder5;
                                chipColors4 = chipColors6;
                                z4 = z6;
                                function26 = function23;
                                shape3 = shape2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ChipKt$AssistChip$2(onClick, label, modifier5, z4, function26, function25, shape3, chipColors4, chipElevation4, chipBorder4, mutableInteractionSource3, i, i2, i3));
                            return;
                        }
                        i11 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    }
                    i10 = i11;
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    ChipColors chipColors52 = chipColors2;
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    function24 = function27;
                    chipElevation3 = chipElevation2;
                    i4 = i12;
                    chipColors3 = chipColors52;
                    z3 = z5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                    int i192 = (i4 >> 9) & 14;
                    long m3301unboximpl2 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i192).getValue().m3301unboximpl();
                    startRestartGroup.startReplaceableGroup(839902004);
                    ComposerKt.sourceInformation(startRestartGroup, "127@6316L21");
                    if (chipBorder3 == null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (borderStroke$material3_release != null) {
                    }
                    composer2 = startRestartGroup;
                    int i202 = i4 << 6;
                    ChipBorder chipBorder52 = chipBorder3;
                    ChipColors chipColors62 = chipColors3;
                    boolean z62 = z3;
                    m1618ChipnkUnTEs(modifier4, onClick, z3, label, fromToken2, m3301unboximpl2, function23, function24, shape2, chipColors62, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i202 & 7168) | (i202 & 3670016) | (i202 & 29360128) | (i202 & 234881024) | (i202 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                    function25 = function24;
                    chipElevation4 = chipElevation3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    chipBorder4 = chipBorder52;
                    chipColors4 = chipColors62;
                    z4 = z62;
                    function26 = function23;
                    shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                i10 = i11;
                if ((i4 & 1533916891) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i18 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                ChipColors chipColors522 = chipColors2;
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if (i14 != 0) {
                }
                function24 = function27;
                chipElevation3 = chipElevation2;
                i4 = i12;
                chipColors3 = chipColors522;
                z3 = z5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                int i1922 = (i4 >> 9) & 14;
                long m3301unboximpl22 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i1922).getValue().m3301unboximpl();
                startRestartGroup.startReplaceableGroup(839902004);
                ComposerKt.sourceInformation(startRestartGroup, "127@6316L21");
                if (chipBorder3 == null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (borderStroke$material3_release != null) {
                }
                composer2 = startRestartGroup;
                int i2022 = i4 << 6;
                ChipBorder chipBorder522 = chipBorder3;
                ChipColors chipColors622 = chipColors3;
                boolean z622 = z3;
                m1618ChipnkUnTEs(modifier4, onClick, z3, label, fromToken22, m3301unboximpl22, function23, function24, shape2, chipColors622, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i2022 & 7168) | (i2022 & 3670016) | (i2022 & 29360128) | (i2022 & 234881024) | (i2022 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier4;
                function25 = function24;
                chipElevation4 = chipElevation3;
                mutableInteractionSource3 = mutableInteractionSource2;
                chipBorder4 = chipBorder522;
                chipColors4 = chipColors622;
                z4 = z622;
                function26 = function23;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            i10 = i11;
            if ((i4 & 1533916891) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i18 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            ChipColors chipColors5222 = chipColors2;
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (i14 != 0) {
            }
            function24 = function27;
            chipElevation3 = chipElevation2;
            i4 = i12;
            chipColors3 = chipColors5222;
            z3 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
            int i19222 = (i4 >> 9) & 14;
            long m3301unboximpl222 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i19222).getValue().m3301unboximpl();
            startRestartGroup.startReplaceableGroup(839902004);
            ComposerKt.sourceInformation(startRestartGroup, "127@6316L21");
            if (chipBorder3 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            composer2 = startRestartGroup;
            int i20222 = i4 << 6;
            ChipBorder chipBorder5222 = chipBorder3;
            ChipColors chipColors6222 = chipColors3;
            boolean z6222 = z3;
            m1618ChipnkUnTEs(modifier4, onClick, z3, label, fromToken222, m3301unboximpl222, function23, function24, shape2, chipColors6222, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i20222 & 7168) | (i20222 & 3670016) | (i20222 & 29360128) | (i20222 & 234881024) | (i20222 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier5 = modifier4;
            function25 = function24;
            chipElevation4 = chipElevation3;
            mutableInteractionSource3 = mutableInteractionSource2;
            chipBorder4 = chipBorder5222;
            chipColors4 = chipColors6222;
            z4 = z6222;
            function26 = function23;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i10 = i11;
        if ((i4 & 1533916891) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i18 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        ChipColors chipColors52222 = chipColors2;
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (i14 != 0) {
        }
        function24 = function27;
        chipElevation3 = chipElevation2;
        i4 = i12;
        chipColors3 = chipColors52222;
        z3 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken2222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
        int i192222 = (i4 >> 9) & 14;
        long m3301unboximpl2222 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i192222).getValue().m3301unboximpl();
        startRestartGroup.startReplaceableGroup(839902004);
        ComposerKt.sourceInformation(startRestartGroup, "127@6316L21");
        if (chipBorder3 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        composer2 = startRestartGroup;
        int i202222 = i4 << 6;
        ChipBorder chipBorder52222 = chipBorder3;
        ChipColors chipColors62222 = chipColors3;
        boolean z62222 = z3;
        m1618ChipnkUnTEs(modifier4, onClick, z3, label, fromToken2222, m3301unboximpl2222, function23, function24, shape2, chipColors62222, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i202222 & 7168) | (i202222 & 3670016) | (i202222 & 29360128) | (i202222 & 234881024) | (i202222 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier4;
        function25 = function24;
        chipElevation4 = chipElevation3;
        mutableInteractionSource3 = mutableInteractionSource2;
        chipBorder4 = chipBorder52222;
        chipColors4 = chipColors62222;
        z4 = z62222;
        function26 = function23;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        int i14;
        ChipColors chipColors2;
        int i15;
        int i16;
        int i17;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        ChipElevation chipElevation3;
        ChipBorder chipBorder2;
        ChipColors chipColors3;
        boolean z3;
        int i18;
        Composer composer2;
        Modifier modifier4;
        ChipElevation chipElevation4;
        MutableInteractionSource mutableInteractionSource3;
        ChipBorder chipBorder3;
        ChipColors chipColors4;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(1295844802);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)181@9326L5,182@9377L26,183@9456L29,185@9569L39,191@9744L10,192@9822L19,186@9613L543:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(label) ? 32 : 16;
        }
        int i21 = i3 & 4;
        if (i21 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            obj = chipColors;
                            if (startRestartGroup.changed(obj)) {
                                i20 = 8388608;
                                i4 |= i20;
                            }
                        } else {
                            obj = chipColors;
                        }
                        i20 = 4194304;
                        i4 |= i20;
                    } else {
                        obj = chipColors;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i19;
                        }
                        i19 = 33554432;
                        i4 |= i19;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                        i9 = i8;
                    } else {
                        i9 = i8;
                        if ((i & 1879048192) == 0) {
                            i4 |= startRestartGroup.changed(chipBorder) ? 536870912 : 268435456;
                        }
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i13 = i2 | 6;
                        i11 = i10;
                    } else {
                        i11 = i10;
                        if ((i2 & 14) != 0) {
                            i12 = i2;
                            if ((i4 & 1533916891) != 306783378 && (i12 & 11) == 2 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                function26 = function22;
                                chipElevation4 = chipElevation;
                                chipBorder3 = chipBorder;
                                chipColors4 = obj;
                                modifier4 = modifier2;
                                z4 = z2;
                                composer2 = startRestartGroup;
                                function25 = function2;
                                shape3 = shape;
                                mutableInteractionSource3 = mutableInteractionSource;
                            } else {
                                startRestartGroup.startDefaults();
                                int i22 = i12;
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i21 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i5 != 0 ? true : z2;
                                    function23 = i6 != 0 ? null : function2;
                                    function24 = i7 != 0 ? null : function22;
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        shape2 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        shape2 = shape;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i14 = i4 & (-29360129);
                                        chipColors2 = AssistChipDefaults.INSTANCE.m1579elevatedAssistChipColorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 100663296, 255);
                                    } else {
                                        i14 = i4;
                                        chipColors2 = obj;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i15 = i22;
                                        i16 = i9;
                                        i17 = i11;
                                        chipElevation2 = AssistChipDefaults.INSTANCE.m1580elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                        i14 &= -234881025;
                                    } else {
                                        i15 = i22;
                                        i16 = i9;
                                        i17 = i11;
                                        chipElevation2 = chipElevation;
                                    }
                                    ChipBorder chipBorder4 = i16 != 0 ? null : chipBorder;
                                    if (i17 != 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        modifier3 = companion;
                                        chipElevation3 = chipElevation2;
                                        chipBorder2 = chipBorder4;
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        modifier3 = companion;
                                        chipElevation3 = chipElevation2;
                                        chipBorder2 = chipBorder4;
                                    }
                                    chipColors3 = chipColors2;
                                    i4 = i14;
                                    z3 = z5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    function23 = function2;
                                    function24 = function22;
                                    shape2 = shape;
                                    chipElevation3 = chipElevation;
                                    chipBorder2 = chipBorder;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i15 = i22;
                                    chipColors3 = obj;
                                    modifier3 = modifier2;
                                    z3 = z2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i18 = i15;
                                    ComposerKt.traceEventStart(1295844802, i4, i18, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:174)");
                                } else {
                                    i18 = i15;
                                }
                                TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                                int i23 = (i4 >> 9) & 14;
                                long m3301unboximpl = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i23).getValue().m3301unboximpl();
                                float m1581getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM();
                                PaddingValues paddingValues = AssistChipPadding;
                                startRestartGroup.startReplaceableGroup(-227039519);
                                ComposerKt.sourceInformation(startRestartGroup, "200@10083L21");
                                State<BorderStroke> borderStroke$material3_release = chipBorder2 == null ? null : chipBorder2.borderStroke$material3_release(z3, startRestartGroup, i23 | ((i4 >> 24) & 112));
                                startRestartGroup.endReplaceableGroup();
                                int i24 = i4 << 6;
                                ChipBorder chipBorder5 = chipBorder2;
                                ChipColors chipColors5 = chipColors3;
                                boolean z6 = z3;
                                composer2 = startRestartGroup;
                                m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken, m3301unboximpl, function23, function24, shape2, chipColors5, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1581getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i24 & 7168) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                chipElevation4 = chipElevation3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                chipBorder3 = chipBorder5;
                                chipColors4 = chipColors5;
                                z4 = z6;
                                function25 = function23;
                                function26 = function24;
                                shape3 = shape2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ChipKt$ElevatedAssistChip$2(onClick, label, modifier4, z4, function25, function26, shape3, chipColors4, chipElevation4, chipBorder3, mutableInteractionSource3, i, i2, i3));
                            return;
                        }
                        i13 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    }
                    i12 = i13;
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    int i222 = i12;
                    if ((i & 1) != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    chipColors3 = chipColors2;
                    i4 = i14;
                    z3 = z5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                    int i232 = (i4 >> 9) & 14;
                    long m3301unboximpl2 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i232).getValue().m3301unboximpl();
                    float m1581getHeightD9Ej5fM2 = AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM();
                    PaddingValues paddingValues2 = AssistChipPadding;
                    startRestartGroup.startReplaceableGroup(-227039519);
                    ComposerKt.sourceInformation(startRestartGroup, "200@10083L21");
                    if (chipBorder2 == null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (borderStroke$material3_release != null) {
                    }
                    int i242 = i4 << 6;
                    ChipBorder chipBorder52 = chipBorder2;
                    ChipColors chipColors52 = chipColors3;
                    boolean z62 = z3;
                    composer2 = startRestartGroup;
                    m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken2, m3301unboximpl2, function23, function24, shape2, chipColors52, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1581getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i242 & 7168) | (i242 & 3670016) | (i242 & 29360128) | (i242 & 234881024) | (i242 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    chipElevation4 = chipElevation3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    chipBorder3 = chipBorder52;
                    chipColors4 = chipColors52;
                    z4 = z62;
                    function25 = function23;
                    function26 = function24;
                    shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i13;
                if ((i4 & 1533916891) != 306783378) {
                }
                startRestartGroup.startDefaults();
                int i2222 = i12;
                if ((i & 1) != 0) {
                }
                if (i21 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                chipColors3 = chipColors2;
                i4 = i14;
                z3 = z5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                int i2322 = (i4 >> 9) & 14;
                long m3301unboximpl22 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i2322).getValue().m3301unboximpl();
                float m1581getHeightD9Ej5fM22 = AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM();
                PaddingValues paddingValues22 = AssistChipPadding;
                startRestartGroup.startReplaceableGroup(-227039519);
                ComposerKt.sourceInformation(startRestartGroup, "200@10083L21");
                if (chipBorder2 == null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (borderStroke$material3_release != null) {
                }
                int i2422 = i4 << 6;
                ChipBorder chipBorder522 = chipBorder2;
                ChipColors chipColors522 = chipColors3;
                boolean z622 = z3;
                composer2 = startRestartGroup;
                m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken22, m3301unboximpl22, function23, function24, shape2, chipColors522, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1581getHeightD9Ej5fM22, paddingValues22, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i2422 & 7168) | (i2422 & 3670016) | (i2422 & 29360128) | (i2422 & 234881024) | (i2422 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                chipElevation4 = chipElevation3;
                mutableInteractionSource3 = mutableInteractionSource2;
                chipBorder3 = chipBorder522;
                chipColors4 = chipColors522;
                z4 = z622;
                function25 = function23;
                function26 = function24;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i13;
            if ((i4 & 1533916891) != 306783378) {
            }
            startRestartGroup.startDefaults();
            int i22222 = i12;
            if ((i & 1) != 0) {
            }
            if (i21 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            chipColors3 = chipColors2;
            i4 = i14;
            z3 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
            int i23222 = (i4 >> 9) & 14;
            long m3301unboximpl222 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i23222).getValue().m3301unboximpl();
            float m1581getHeightD9Ej5fM222 = AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM();
            PaddingValues paddingValues222 = AssistChipPadding;
            startRestartGroup.startReplaceableGroup(-227039519);
            ComposerKt.sourceInformation(startRestartGroup, "200@10083L21");
            if (chipBorder2 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            int i24222 = i4 << 6;
            ChipBorder chipBorder5222 = chipBorder2;
            ChipColors chipColors5222 = chipColors3;
            boolean z6222 = z3;
            composer2 = startRestartGroup;
            m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken222, m3301unboximpl222, function23, function24, shape2, chipColors5222, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1581getHeightD9Ej5fM222, paddingValues222, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i24222 & 7168) | (i24222 & 3670016) | (i24222 & 29360128) | (i24222 & 234881024) | (i24222 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            chipElevation4 = chipElevation3;
            mutableInteractionSource3 = mutableInteractionSource2;
            chipBorder3 = chipBorder5222;
            chipColors4 = chipColors5222;
            z4 = z6222;
            function25 = function23;
            function26 = function24;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i13;
        if ((i4 & 1533916891) != 306783378) {
        }
        startRestartGroup.startDefaults();
        int i222222 = i12;
        if ((i & 1) != 0) {
        }
        if (i21 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        chipColors3 = chipColors2;
        i4 = i14;
        z3 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken2222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
        int i232222 = (i4 >> 9) & 14;
        long m3301unboximpl2222 = chipColors3.labelColor$material3_release(z3, startRestartGroup, ((i4 >> 18) & 112) | i232222).getValue().m3301unboximpl();
        float m1581getHeightD9Ej5fM2222 = AssistChipDefaults.INSTANCE.m1581getHeightD9Ej5fM();
        PaddingValues paddingValues2222 = AssistChipPadding;
        startRestartGroup.startReplaceableGroup(-227039519);
        ComposerKt.sourceInformation(startRestartGroup, "200@10083L21");
        if (chipBorder2 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        int i242222 = i4 << 6;
        ChipBorder chipBorder52222 = chipBorder2;
        ChipColors chipColors52222 = chipColors3;
        boolean z62222 = z3;
        composer2 = startRestartGroup;
        m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken2222, m3301unboximpl2222, function23, function24, shape2, chipColors52222, chipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1581getHeightD9Ej5fM2222, paddingValues2222, mutableInteractionSource2, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 >> 3) & 896) | (i242222 & 7168) | (i242222 & 3670016) | (i242222 & 29360128) | (i242222 & 234881024) | (i242222 & 1879048192), ((i4 >> 24) & 14) | 3456 | ((i18 << 12) & 57344));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        chipElevation4 = chipElevation3;
        mutableInteractionSource3 = mutableInteractionSource2;
        chipBorder3 = chipBorder52222;
        chipColors4 = chipColors52222;
        z4 = z62222;
        function25 = function23;
        function26 = function24;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        Object obj;
        Object obj2;
        Object obj3;
        int i8;
        int i9;
        int i10;
        Object obj4;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Object obj5;
        Shape shape2;
        int i12;
        SelectableChipColors selectableChipColors2;
        int i13;
        Composer composer2;
        SelectableChipElevation selectableChipElevation2;
        int i14;
        SelectableChipBorder selectableChipBorder2;
        Object obj6;
        Modifier modifier3;
        SelectableChipElevation selectableChipElevation3;
        SelectableChipBorder selectableChipBorder3;
        int i15;
        boolean z3;
        Composer composer3;
        Modifier modifier4;
        SelectableChipElevation selectableChipElevation4;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipBorder selectableChipBorder4;
        SelectableChipColors selectableChipColors3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i16;
        int i17;
        int i18;
        int i19;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(-1878072905);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)263@13479L5,264@13540L18,265@13621L21,266@13699L18,267@13769L39,274@13979L10,268@13813L556:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(label) ? 256 : 128;
        }
        int i20 = i3 & 8;
        if (i20 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    obj = function22;
                } else {
                    obj = function22;
                    if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changedInstance(obj) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        obj2 = shape;
                        if (startRestartGroup.changed(obj2)) {
                            i19 = 8388608;
                            i4 |= i19;
                        }
                    } else {
                        obj2 = shape;
                    }
                    i19 = 4194304;
                    i4 |= i19;
                } else {
                    obj2 = shape;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        obj3 = selectableChipColors;
                        if (startRestartGroup.changed(obj3)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i18;
                        }
                    } else {
                        obj3 = selectableChipColors;
                    }
                    i18 = 33554432;
                    i4 |= i18;
                } else {
                    obj3 = selectableChipColors;
                }
                if ((i & 1879048192) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i17 = 536870912;
                        i4 |= i17;
                    }
                    i17 = 268435456;
                    i4 |= i17;
                }
                if ((i2 & 14) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(selectableChipBorder)) {
                        i16 = 4;
                        i8 = i2 | i16;
                    }
                    i16 = 2;
                    i8 = i2 | i16;
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                    obj4 = mutableInteractionSource;
                } else {
                    i10 = i9;
                    obj4 = mutableInteractionSource;
                    if ((i2 & 112) == 0) {
                        i8 |= startRestartGroup.changed(obj4) ? 32 : 16;
                    }
                    i11 = i8;
                }
                if ((i4 & 1533916891) != 306783378 && (i11 & 91) == 18 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    selectableChipBorder4 = selectableChipBorder;
                    shape3 = obj2;
                    modifier4 = modifier2;
                    mutableInteractionSource2 = obj4;
                    composer3 = startRestartGroup;
                    z4 = z2;
                    selectableChipElevation4 = selectableChipElevation;
                    function25 = obj;
                    selectableChipColors3 = obj3;
                    function24 = function2;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i20 != 0 ? Modifier.Companion : modifier2;
                        boolean z5 = i5 != 0 ? true : z2;
                        function23 = i6 != 0 ? null : function2;
                        obj5 = i7 != 0 ? null : obj;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            shape2 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape2 = obj2;
                        }
                        if ((i3 & 256) != 0) {
                            i12 = i4 & (-234881025);
                            selectableChipColors2 = FilterChipDefaults.INSTANCE.m1802filterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 384, 4095);
                        } else {
                            i12 = i4;
                            selectableChipColors2 = obj3;
                        }
                        if ((i3 & 512) != 0) {
                            i13 = i10;
                            composer2 = startRestartGroup;
                            selectableChipElevation2 = FilterChipDefaults.INSTANCE.m1803filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i14 = i12 & (-1879048193);
                        } else {
                            i13 = i10;
                            composer2 = startRestartGroup;
                            selectableChipElevation2 = selectableChipElevation;
                            i14 = i12;
                        }
                        if ((i3 & 1024) != 0) {
                            selectableChipBorder2 = FilterChipDefaults.INSTANCE.m1801filterChipBordergHcDVlo(0L, 0L, 0L, 0L, 0.0f, 0.0f, composer2, 1572864, 63);
                            i11 &= -15;
                        } else {
                            selectableChipBorder2 = selectableChipBorder;
                        }
                        if (i13 != 0) {
                            startRestartGroup = composer2;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            selectableChipElevation3 = selectableChipElevation2;
                            i4 = i14;
                            selectableChipBorder3 = selectableChipBorder2;
                            obj6 = (MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup = composer2;
                            obj6 = mutableInteractionSource;
                            modifier3 = companion;
                            selectableChipElevation3 = selectableChipElevation2;
                            i4 = i14;
                            selectableChipBorder3 = selectableChipBorder2;
                        }
                        i15 = i11;
                        z3 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        function23 = function2;
                        selectableChipElevation3 = selectableChipElevation;
                        selectableChipBorder3 = selectableChipBorder;
                        obj5 = obj;
                        shape2 = obj2;
                        selectableChipColors2 = obj3;
                        modifier3 = modifier2;
                        obj6 = obj4;
                        i15 = i11;
                        z3 = z2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1878072905, i4, i15, "androidx.compose.material3.FilterChip (Chip.kt:255)");
                    }
                    TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float m1804getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
                    PaddingValues paddingValues = FilterChipPadding;
                    startRestartGroup.startReplaceableGroup(276171431);
                    ComposerKt.sourceInformation(startRestartGroup, "283@14286L31");
                    State<BorderStroke> borderStroke$material3_release = selectableChipBorder3 == null ? null : selectableChipBorder3.borderStroke$material3_release(z3, z, startRestartGroup, ((i4 >> 12) & 14) | ((i4 << 3) & 112) | ((i15 << 6) & 896));
                    startRestartGroup.endReplaceableGroup();
                    int i21 = i4 << 3;
                    int i22 = i4 << 6;
                    int i23 = i4 >> 24;
                    SelectableChipBorder selectableChipBorder5 = selectableChipBorder3;
                    boolean z6 = z3;
                    composer3 = startRestartGroup;
                    m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken, function23, null, obj5, shape2, selectableChipColors2, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1804getHeightD9Ej5fM, paddingValues, obj6, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i21 & 896) | ((i4 >> 3) & 7168) | (i22 & 57344) | (i21 & 3670016) | (234881024 & i22) | (1879048192 & i22), (i23 & 112) | (i23 & 14) | 27648 | ((i15 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    selectableChipElevation4 = selectableChipElevation3;
                    mutableInteractionSource2 = obj6;
                    selectableChipBorder4 = selectableChipBorder5;
                    selectableChipColors3 = selectableChipColors2;
                    z4 = z6;
                    function24 = function23;
                    function25 = obj5;
                    shape3 = shape2;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ChipKt$FilterChip$2(z, onClick, label, modifier4, z4, function24, function25, shape3, selectableChipColors3, selectableChipElevation4, selectableChipBorder4, mutableInteractionSource2, i, i2, i3));
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i2 & 14) == 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i20 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if (i13 != 0) {
            }
            i15 = i11;
            z3 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
            float m1804getHeightD9Ej5fM2 = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues2 = FilterChipPadding;
            startRestartGroup.startReplaceableGroup(276171431);
            ComposerKt.sourceInformation(startRestartGroup, "283@14286L31");
            if (selectableChipBorder3 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            int i212 = i4 << 3;
            int i222 = i4 << 6;
            int i232 = i4 >> 24;
            SelectableChipBorder selectableChipBorder52 = selectableChipBorder3;
            boolean z62 = z3;
            composer3 = startRestartGroup;
            m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken2, function23, null, obj5, shape2, selectableChipColors2, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1804getHeightD9Ej5fM2, paddingValues2, obj6, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i212 & 896) | ((i4 >> 3) & 7168) | (i222 & 57344) | (i212 & 3670016) | (234881024 & i222) | (1879048192 & i222), (i232 & 112) | (i232 & 14) | 27648 | ((i15 << 12) & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            selectableChipElevation4 = selectableChipElevation3;
            mutableInteractionSource2 = obj6;
            selectableChipBorder4 = selectableChipBorder52;
            selectableChipColors3 = selectableChipColors2;
            z4 = z62;
            function24 = function23;
            function25 = obj5;
            shape3 = shape2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) == 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i20 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if (i13 != 0) {
        }
        i15 = i11;
        z3 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
        float m1804getHeightD9Ej5fM22 = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
        PaddingValues paddingValues22 = FilterChipPadding;
        startRestartGroup.startReplaceableGroup(276171431);
        ComposerKt.sourceInformation(startRestartGroup, "283@14286L31");
        if (selectableChipBorder3 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        int i2122 = i4 << 3;
        int i2222 = i4 << 6;
        int i2322 = i4 >> 24;
        SelectableChipBorder selectableChipBorder522 = selectableChipBorder3;
        boolean z622 = z3;
        composer3 = startRestartGroup;
        m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken22, function23, null, obj5, shape2, selectableChipColors2, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, m1804getHeightD9Ej5fM22, paddingValues22, obj6, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i2122 & 896) | ((i4 >> 3) & 7168) | (i2222 & 57344) | (i2122 & 3670016) | (234881024 & i2222) | (1879048192 & i2222), (i2322 & 112) | (i2322 & 14) | 27648 | ((i15 << 12) & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        selectableChipElevation4 = selectableChipElevation3;
        mutableInteractionSource2 = obj6;
        selectableChipBorder4 = selectableChipBorder522;
        selectableChipColors3 = selectableChipColors2;
        z4 = z622;
        function24 = function23;
        function25 = obj5;
        shape3 = shape2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        Object obj;
        Object obj2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Object obj3;
        Shape shape2;
        int i13;
        SelectableChipColors selectableChipColors3;
        int i14;
        int i15;
        Composer composer2;
        int i16;
        SelectableChipElevation selectableChipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        SelectableChipElevation selectableChipElevation3;
        SelectableChipBorder selectableChipBorder2;
        SelectableChipColors selectableChipColors4;
        boolean z3;
        int i17;
        Composer composer3;
        Modifier modifier4;
        SelectableChipColors selectableChipColors5;
        SelectableChipElevation selectableChipElevation4;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipBorder selectableChipBorder3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i18;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(1904578605);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)343@17577L5,344@17638L26,345@17727L29,347@17850L39,354@18060L10,348@17894L556:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(label) ? 256 : 128;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    obj = function22;
                } else {
                    obj = function22;
                    if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changedInstance(obj) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        obj2 = shape;
                        if (startRestartGroup.changed(obj2)) {
                            i20 = 8388608;
                            i4 |= i20;
                        }
                    } else {
                        obj2 = shape;
                    }
                    i20 = 4194304;
                    i4 |= i20;
                } else {
                    obj2 = shape;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i19;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i19 = 33554432;
                    i4 |= i19;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 1879048192) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i18 = 536870912;
                        i4 |= i18;
                    }
                    i18 = 268435456;
                    i4 |= i18;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else {
                    i9 = i8;
                    if ((i2 & 14) == 0) {
                        i10 = i2 | (startRestartGroup.changed(selectableChipBorder) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else {
                    i12 = i11;
                    if ((i2 & 112) == 0) {
                        i10 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    }
                }
                int i22 = i10;
                if ((i4 & 1533916891) != 306783378 && (i22 & 91) == 18 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    selectableChipBorder3 = selectableChipBorder;
                    mutableInteractionSource3 = mutableInteractionSource;
                    shape3 = obj2;
                    selectableChipColors5 = selectableChipColors2;
                    modifier4 = modifier2;
                    composer3 = startRestartGroup;
                    z4 = z2;
                    function24 = function2;
                    selectableChipElevation4 = selectableChipElevation;
                    function25 = obj;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i21 != 0 ? Modifier.Companion : modifier2;
                        boolean z5 = i5 != 0 ? true : z2;
                        function23 = i6 != 0 ? null : function2;
                        obj3 = i7 != 0 ? null : obj;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            shape2 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape2 = obj2;
                        }
                        if ((i3 & 256) != 0) {
                            i13 = i4 & (-234881025);
                            selectableChipColors3 = FilterChipDefaults.INSTANCE.m1799elevatedFilterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 384, 4095);
                        } else {
                            i13 = i4;
                            selectableChipColors3 = selectableChipColors2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 = i12;
                            i15 = i22;
                            i16 = i9;
                            composer2 = startRestartGroup;
                            selectableChipElevation2 = FilterChipDefaults.INSTANCE.m1800elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i13 &= -1879048193;
                        } else {
                            i14 = i12;
                            i15 = i22;
                            composer2 = startRestartGroup;
                            i16 = i9;
                            selectableChipElevation2 = selectableChipElevation;
                        }
                        SelectableChipBorder selectableChipBorder4 = i16 != 0 ? null : selectableChipBorder;
                        if (i14 != 0) {
                            composer2.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = composer2.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            modifier3 = companion;
                            selectableChipElevation3 = selectableChipElevation2;
                            selectableChipBorder2 = selectableChipBorder4;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = companion;
                            selectableChipElevation3 = selectableChipElevation2;
                            selectableChipBorder2 = selectableChipBorder4;
                        }
                        selectableChipColors4 = selectableChipColors3;
                        i4 = i13;
                        z3 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        function23 = function2;
                        selectableChipElevation3 = selectableChipElevation;
                        mutableInteractionSource2 = mutableInteractionSource;
                        obj3 = obj;
                        shape2 = obj2;
                        selectableChipColors4 = selectableChipColors2;
                        modifier3 = modifier2;
                        i15 = i22;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        selectableChipBorder2 = selectableChipBorder;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        i17 = i15;
                        ComposerKt.traceEventStart(1904578605, i4, i17, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:335)");
                    } else {
                        i17 = i15;
                    }
                    TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float m1804getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
                    PaddingValues paddingValues = FilterChipPadding;
                    composer2.startReplaceableGroup(-790769778);
                    ComposerKt.sourceInformation(composer2, "363@18367L31");
                    State<BorderStroke> borderStroke$material3_release = selectableChipBorder2 == null ? null : selectableChipBorder2.borderStroke$material3_release(z3, z, composer2, ((i4 >> 12) & 14) | ((i4 << 3) & 112) | ((i17 << 6) & 896));
                    composer2.endReplaceableGroup();
                    BorderStroke value = borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null;
                    int i23 = i4 << 3;
                    int i24 = i4 << 6;
                    int i25 = i4 >> 24;
                    SelectableChipBorder selectableChipBorder5 = selectableChipBorder2;
                    boolean z6 = z3;
                    composer3 = composer2;
                    m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken, function23, null, obj3, shape2, selectableChipColors4, selectableChipElevation3, value, m1804getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i23 & 896) | ((i4 >> 3) & 7168) | (i24 & 57344) | (i23 & 3670016) | (234881024 & i24) | (1879048192 & i24), (i25 & 112) | (i25 & 14) | 27648 | ((i17 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    selectableChipColors5 = selectableChipColors4;
                    selectableChipElevation4 = selectableChipElevation3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    selectableChipBorder3 = selectableChipBorder5;
                    z4 = z6;
                    function24 = function23;
                    function25 = obj3;
                    shape3 = shape2;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ChipKt$ElevatedFilterChip$2(z, onClick, label, modifier4, z4, function24, function25, shape3, selectableChipColors5, selectableChipElevation4, selectableChipBorder3, mutableInteractionSource3, i, i2, i3));
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i222 = i10;
            if ((i4 & 1533916891) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i21 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            selectableChipColors4 = selectableChipColors3;
            i4 = i13;
            z3 = z5;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
            float m1804getHeightD9Ej5fM2 = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues2 = FilterChipPadding;
            composer2.startReplaceableGroup(-790769778);
            ComposerKt.sourceInformation(composer2, "363@18367L31");
            if (selectableChipBorder2 == null) {
            }
            composer2.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            int i232 = i4 << 3;
            int i242 = i4 << 6;
            int i252 = i4 >> 24;
            SelectableChipBorder selectableChipBorder52 = selectableChipBorder2;
            boolean z62 = z3;
            composer3 = composer2;
            m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken2, function23, null, obj3, shape2, selectableChipColors4, selectableChipElevation3, value, m1804getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i232 & 896) | ((i4 >> 3) & 7168) | (i242 & 57344) | (i232 & 3670016) | (234881024 & i242) | (1879048192 & i242), (i252 & 112) | (i252 & 14) | 27648 | ((i17 << 12) & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            selectableChipColors5 = selectableChipColors4;
            selectableChipElevation4 = selectableChipElevation3;
            mutableInteractionSource3 = mutableInteractionSource2;
            selectableChipBorder3 = selectableChipBorder52;
            z4 = z62;
            function24 = function23;
            function25 = obj3;
            shape3 = shape2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i2222 = i10;
        if ((i4 & 1533916891) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i21 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        selectableChipColors4 = selectableChipColors3;
        i4 = i13;
        z3 = z5;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
        float m1804getHeightD9Ej5fM22 = FilterChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
        PaddingValues paddingValues22 = FilterChipPadding;
        composer2.startReplaceableGroup(-790769778);
        ComposerKt.sourceInformation(composer2, "363@18367L31");
        if (selectableChipBorder2 == null) {
        }
        composer2.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        int i2322 = i4 << 3;
        int i2422 = i4 << 6;
        int i2522 = i4 >> 24;
        SelectableChipBorder selectableChipBorder522 = selectableChipBorder2;
        boolean z622 = z3;
        composer3 = composer2;
        m1620SelectableChipu0RnIRE(z, modifier3, onClick, z3, label, fromToken22, function23, null, obj3, shape2, selectableChipColors4, selectableChipElevation3, value, m1804getHeightD9Ej5fM22, paddingValues22, mutableInteractionSource2, composer3, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i2322 & 896) | ((i4 >> 3) & 7168) | (i2422 & 57344) | (i2322 & 3670016) | (234881024 & i2422) | (1879048192 & i2422), (i2522 & 112) | (i2522 & 14) | 27648 | ((i17 << 12) & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        selectableChipColors5 = selectableChipColors4;
        selectableChipElevation4 = selectableChipElevation3;
        mutableInteractionSource3 = mutableInteractionSource2;
        selectableChipBorder3 = selectableChipBorder522;
        z4 = z622;
        function24 = function23;
        function25 = obj3;
        shape3 = shape2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(boolean z, Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        Object obj2;
        int i9;
        int i10;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        SelectableChipElevation selectableChipElevation2;
        SelectableChipBorder selectableChipBorder2;
        SelectableChipElevation selectableChipElevation3;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        SelectableChipColors selectableChipColors3;
        Shape shape3;
        Object obj3;
        SelectableChipBorder selectableChipBorder3;
        boolean z3;
        boolean z4;
        int i12;
        ComposableLambda composableLambda;
        Composer composer2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        SelectableChipElevation selectableChipElevation4;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        SelectableChipBorder selectableChipBorder4;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(-1599030387);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)428@21836L5,429@21896L17,430@21975L20,431@22051L17,432@22120L39,459@23091L10,453@22901L787:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(label) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i4 |= 1572864;
                obj = function22;
            } else {
                obj = function22;
                if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changedInstance(obj) ? 1048576 : 524288;
                }
            }
            i8 = i3 & 128;
            if (i8 == 0) {
                i4 |= 12582912;
                obj2 = function23;
            } else {
                obj2 = function23;
                if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changedInstance(obj2) ? 8388608 : 4194304;
                }
            }
            if ((i & 234881024) == 0) {
                if ((i3 & 256) == 0 && startRestartGroup.changed(shape)) {
                    i16 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    i4 |= i16;
                }
                i16 = 33554432;
                i4 |= i16;
            }
            if ((i & 1879048192) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipColors)) {
                    i15 = 536870912;
                    i4 |= i15;
                }
                i15 = 268435456;
                i4 |= i15;
            }
            if ((i2 & 14) != 0) {
                if ((i3 & 1024) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                    i14 = 4;
                    i9 = i2 | i14;
                }
                i14 = 2;
                i9 = i2 | i14;
            } else {
                i9 = i2;
            }
            if ((i2 & 112) == 0) {
                if ((i3 & 2048) == 0 && startRestartGroup.changed(selectableChipBorder)) {
                    i13 = 32;
                    i9 |= i13;
                }
                i13 = 16;
                i9 |= i13;
            }
            i10 = i9;
            i11 = i3 & 4096;
            if (i11 == 0) {
                i10 |= 384;
            } else if ((i2 & 896) == 0) {
                i10 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                if ((i4 & 1533916891) == 306783378 || (i10 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i17 != 0 ? Modifier.Companion : modifier;
                        boolean z6 = i5 != 0 ? true : z2;
                        function24 = i6 != 0 ? null : function2;
                        if (i7 != 0) {
                            obj = null;
                        }
                        if (i8 != 0) {
                            obj2 = null;
                        }
                        if ((i3 & 256) != 0) {
                            shape2 = InputChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i4 &= -234881025;
                        } else {
                            shape2 = shape;
                        }
                        if ((i3 & 512) != 0) {
                            selectableChipColors2 = InputChipDefaults.INSTANCE.m1835inputChipColorskwJvTHA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 8191);
                            i4 &= -1879048193;
                        } else {
                            selectableChipColors2 = selectableChipColors;
                        }
                        int i18 = i4;
                        if ((i3 & 1024) != 0) {
                            selectableChipElevation2 = InputChipDefaults.INSTANCE.m1836inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i10 &= -15;
                        } else {
                            selectableChipElevation2 = selectableChipElevation;
                        }
                        SelectableChipElevation selectableChipElevation5 = selectableChipElevation2;
                        if ((i3 & 2048) != 0) {
                            selectableChipBorder2 = InputChipDefaults.INSTANCE.m1834inputChipBordergHcDVlo(0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i10 &= -113;
                        } else {
                            selectableChipBorder2 = selectableChipBorder;
                        }
                        if (i11 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            int i19 = i10;
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            selectableChipElevation3 = selectableChipElevation5;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            modifier2 = companion;
                            selectableChipColors3 = selectableChipColors2;
                            shape3 = shape2;
                            obj3 = obj2;
                            i10 = i19;
                        } else {
                            selectableChipElevation3 = selectableChipElevation5;
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier2 = companion;
                            selectableChipColors3 = selectableChipColors2;
                            shape3 = shape2;
                            obj3 = obj2;
                        }
                        selectableChipBorder3 = selectableChipBorder2;
                        z3 = z6;
                        i4 = i18;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i10 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i10 &= -113;
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        function24 = function2;
                        shape3 = shape;
                        selectableChipColors3 = selectableChipColors;
                        selectableChipElevation3 = selectableChipElevation;
                        selectableChipBorder3 = selectableChipBorder;
                        mutableInteractionSource2 = mutableInteractionSource;
                        obj3 = obj2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1599030387, i4, i10, "androidx.compose.material3.InputChip (Chip.kt:419)");
                    }
                    startRestartGroup.startReplaceableGroup(-1372002056);
                    ComposerKt.sourceInformation(startRestartGroup, "439@22510L9");
                    if (obj != null) {
                        i12 = 6;
                        z4 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -352359235, true, new ChipKt$InputChip$2(z3 ? 1.0f : 0.38f, ShapesKt.toShape(InputChipTokens.INSTANCE.getAvatarShape(), startRestartGroup, 6), obj, i4));
                    } else {
                        z4 = true;
                        i12 = 6;
                        composableLambda = null;
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i12), InputChipTokens.INSTANCE.getLabelTextFont());
                    startRestartGroup.startReplaceableGroup(-1372001052);
                    ComposerKt.sourceInformation(startRestartGroup, "466@23351L31");
                    State<BorderStroke> borderStroke$material3_release = selectableChipBorder3 == null ? null : selectableChipBorder3.borderStroke$material3_release(z3, z, startRestartGroup, ((i4 >> 12) & 14) | ((i4 << 3) & 112) | ((i10 << 3) & 896));
                    startRestartGroup.endReplaceableGroup();
                    int i20 = i4 << 3;
                    SelectableChipBorder selectableChipBorder5 = selectableChipBorder3;
                    Function2<? super Composer, ? super Integer, Unit> function28 = obj;
                    boolean z7 = z3;
                    composer2 = startRestartGroup;
                    m1620SelectableChipu0RnIRE(z, modifier2, onClick, z3, label, fromToken, function24, composableLambda, obj3, shape3, selectableChipColors3, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, InputChipDefaults.INSTANCE.m1832getHeightD9Ej5fM(), inputChipPadding(composableLambda != null ? z4 : false, function24 != null ? z4 : false, obj3 != null ? z4 : false), mutableInteractionSource2, composer2, (i4 & 14) | ((i4 >> 6) & 112) | (i20 & 896) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344) | (3670016 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i4 >> 27) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i10 << 3) & 112) | ((i10 << 9) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function25 = obj3;
                    shape4 = shape3;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation4 = selectableChipElevation3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function26 = function28;
                    selectableChipBorder4 = selectableChipBorder5;
                    z5 = z7;
                    function27 = function24;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z5 = z2;
                    shape4 = shape;
                    selectableChipColors4 = selectableChipColors;
                    selectableChipElevation4 = selectableChipElevation;
                    selectableChipBorder4 = selectableChipBorder;
                    mutableInteractionSource3 = mutableInteractionSource;
                    function26 = obj;
                    composer2 = startRestartGroup;
                    function25 = obj2;
                    function27 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ChipKt$InputChip$3(z, onClick, label, modifier3, z5, function27, function26, function25, shape4, selectableChipColors4, selectableChipElevation4, selectableChipBorder4, mutableInteractionSource3, i, i2, i3));
                return;
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i17 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            int i182 = i4;
            if ((i3 & 1024) != 0) {
            }
            SelectableChipElevation selectableChipElevation52 = selectableChipElevation2;
            if ((i3 & 2048) != 0) {
            }
            if (i11 != 0) {
            }
            selectableChipBorder3 = selectableChipBorder2;
            z3 = z6;
            i4 = i182;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1372002056);
            ComposerKt.sourceInformation(startRestartGroup, "439@22510L9");
            if (obj != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i12), InputChipTokens.INSTANCE.getLabelTextFont());
            startRestartGroup.startReplaceableGroup(-1372001052);
            ComposerKt.sourceInformation(startRestartGroup, "466@23351L31");
            if (selectableChipBorder3 == null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            int i202 = i4 << 3;
            SelectableChipBorder selectableChipBorder52 = selectableChipBorder3;
            Function2<? super Composer, ? super Integer, Unit> function282 = obj;
            boolean z72 = z3;
            composer2 = startRestartGroup;
            m1620SelectableChipu0RnIRE(z, modifier2, onClick, z3, label, fromToken2, function24, composableLambda, obj3, shape3, selectableChipColors3, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, InputChipDefaults.INSTANCE.m1832getHeightD9Ej5fM(), inputChipPadding(composableLambda != null ? z4 : false, function24 != null ? z4 : false, obj3 != null ? z4 : false), mutableInteractionSource2, composer2, (i4 & 14) | ((i4 >> 6) & 112) | (i202 & 896) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344) | (3670016 & i202) | (234881024 & i202) | (i202 & 1879048192), ((i4 >> 27) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i10 << 3) & 112) | ((i10 << 9) & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            function25 = obj3;
            shape4 = shape3;
            selectableChipColors4 = selectableChipColors3;
            selectableChipElevation4 = selectableChipElevation3;
            mutableInteractionSource3 = mutableInteractionSource2;
            function26 = function282;
            selectableChipBorder4 = selectableChipBorder52;
            z5 = z72;
            function27 = function24;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) != 0) {
        }
        if ((i2 & 112) == 0) {
        }
        i10 = i9;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i17 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        int i1822 = i4;
        if ((i3 & 1024) != 0) {
        }
        SelectableChipElevation selectableChipElevation522 = selectableChipElevation2;
        if ((i3 & 2048) != 0) {
        }
        if (i11 != 0) {
        }
        selectableChipBorder3 = selectableChipBorder2;
        z3 = z6;
        i4 = i1822;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1372002056);
        ComposerKt.sourceInformation(startRestartGroup, "439@22510L9");
        if (obj != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i12), InputChipTokens.INSTANCE.getLabelTextFont());
        startRestartGroup.startReplaceableGroup(-1372001052);
        ComposerKt.sourceInformation(startRestartGroup, "466@23351L31");
        if (selectableChipBorder3 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        int i2022 = i4 << 3;
        SelectableChipBorder selectableChipBorder522 = selectableChipBorder3;
        Function2<? super Composer, ? super Integer, Unit> function2822 = obj;
        boolean z722 = z3;
        composer2 = startRestartGroup;
        m1620SelectableChipu0RnIRE(z, modifier2, onClick, z3, label, fromToken22, function24, composableLambda, obj3, shape3, selectableChipColors3, selectableChipElevation3, borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null, InputChipDefaults.INSTANCE.m1832getHeightD9Ej5fM(), inputChipPadding(composableLambda != null ? z4 : false, function24 != null ? z4 : false, obj3 != null ? z4 : false), mutableInteractionSource2, composer2, (i4 & 14) | ((i4 >> 6) & 112) | (i2022 & 896) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344) | (3670016 & i2022) | (234881024 & i2022) | (i2022 & 1879048192), ((i4 >> 27) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i10 << 3) & 112) | ((i10 << 9) & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        function25 = obj3;
        shape4 = shape3;
        selectableChipColors4 = selectableChipColors3;
        selectableChipElevation4 = selectableChipElevation3;
        mutableInteractionSource3 = mutableInteractionSource2;
        function26 = function2822;
        selectableChipBorder4 = selectableChipBorder522;
        z5 = z722;
        function27 = function24;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Object obj;
        Object obj2;
        Object obj3;
        int i6;
        int i7;
        Object obj4;
        Object obj5;
        Shape shape2;
        ChipColors chipColors2;
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        ChipBorder chipBorder2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder3;
        Object obj6;
        ChipColors chipColors3;
        boolean z3;
        Composer composer2;
        Modifier modifier4;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource3;
        ChipBorder chipBorder4;
        ChipColors chipColors4;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(170629701);
        ComposerKt.sourceInformation(startRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)523@26368L5,524@26423L22,525@26502L25,526@26578L22,527@26652L39,533@26828L10,534@26910L19,528@26697L540:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(label) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj = function2;
                    i3 |= startRestartGroup.changedInstance(obj) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj2 = shape;
                            if (startRestartGroup.changed(obj2)) {
                                i14 = 131072;
                                i3 |= i14;
                            }
                        } else {
                            obj2 = shape;
                        }
                        i14 = 65536;
                        i3 |= i14;
                    } else {
                        obj2 = shape;
                    }
                    if ((i & 3670016) == 0) {
                        if ((i2 & 64) == 0 && startRestartGroup.changed(chipColors)) {
                            i13 = 1048576;
                            i3 |= i13;
                        }
                        i13 = 524288;
                        i3 |= i13;
                    }
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            obj3 = chipElevation;
                            if (startRestartGroup.changed(obj3)) {
                                i12 = 8388608;
                                i3 |= i12;
                            }
                        } else {
                            obj3 = chipElevation;
                        }
                        i12 = 4194304;
                        i3 |= i12;
                    } else {
                        obj3 = chipElevation;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(chipBorder)) {
                            i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i3 |= i11;
                        }
                        i11 = 33554432;
                        i3 |= i11;
                    }
                    i6 = i2 & 512;
                    if (i6 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                        i7 = i6;
                        obj4 = mutableInteractionSource;
                    } else {
                        i7 = i6;
                        obj4 = mutableInteractionSource;
                        if ((i & 1879048192) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 536870912 : 268435456;
                        }
                    }
                    if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i15 == 0 ? Modifier.Companion : modifier;
                            boolean z5 = i4 == 0 ? true : z2;
                            obj5 = i5 == 0 ? null : obj;
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                shape2 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape2 = obj2;
                            }
                            if ((i2 & 64) == 0) {
                                i3 &= -3670017;
                                chipColors2 = SuggestionChipDefaults.INSTANCE.m2065suggestionChipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                            } else {
                                chipColors2 = chipColors;
                            }
                            if ((i2 & 128) == 0) {
                                i8 = i3 & (-29360129);
                                obj3 = SuggestionChipDefaults.INSTANCE.m2066suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                i8 = i3;
                            }
                            if ((i2 & 256) == 0) {
                                i9 = i7;
                                modifier2 = companion;
                                i10 = 6;
                                chipBorder2 = SuggestionChipDefaults.INSTANCE.m2064suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                                i8 &= -234881025;
                            } else {
                                i9 = i7;
                                modifier2 = companion;
                                i10 = 6;
                                chipBorder2 = chipBorder;
                            }
                            if (i9 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                modifier3 = modifier2;
                                chipBorder3 = chipBorder2;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                modifier3 = modifier2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                chipBorder3 = chipBorder2;
                            }
                            obj6 = obj3;
                            i3 = i8;
                            chipColors3 = chipColors2;
                            z3 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier3 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            obj5 = obj;
                            shape2 = obj2;
                            i10 = 6;
                            obj6 = obj3;
                            chipColors3 = chipColors;
                            chipBorder3 = chipBorder;
                            z3 = z2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(170629701, i3, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:517)");
                        }
                        TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i10), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                        int i16 = (i3 >> 9) & 14;
                        int i17 = i3 >> 15;
                        long m3301unboximpl = chipColors3.labelColor$material3_release(z3, startRestartGroup, (i17 & 112) | i16).getValue().m3301unboximpl();
                        startRestartGroup.startReplaceableGroup(2118455055);
                        ComposerKt.sourceInformation(startRestartGroup, "540@27074L21");
                        State<BorderStroke> borderStroke$material3_release = chipBorder3 != null ? null : chipBorder3.borderStroke$material3_release(z3, startRestartGroup, i16 | ((i3 >> 21) & 112));
                        startRestartGroup.endReplaceableGroup();
                        BorderStroke value = borderStroke$material3_release != null ? borderStroke$material3_release.getValue() : null;
                        composer2 = startRestartGroup;
                        int i18 = i3 << 6;
                        ChipBorder chipBorder5 = chipBorder3;
                        int i19 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i18 & 7168) | (i18 & 3670016);
                        int i20 = i3 << 9;
                        ChipColors chipColors5 = chipColors3;
                        boolean z6 = z3;
                        m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken, m3301unboximpl, obj5, null, shape2, chipColors5, obj6, value, SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource2, composer2, i19 | (i20 & 234881024) | (i20 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i17 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        chipElevation2 = obj6;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        chipBorder4 = chipBorder5;
                        chipColors4 = chipColors5;
                        z4 = z6;
                        function22 = obj5;
                        shape3 = shape2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z4 = z2;
                        function22 = obj;
                        shape3 = obj2;
                        mutableInteractionSource3 = obj4;
                        chipElevation2 = obj3;
                        composer2 = startRestartGroup;
                        chipColors4 = chipColors;
                        chipBorder4 = chipBorder;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ChipKt$SuggestionChip$2(onClick, label, modifier4, z4, function22, shape3, chipColors4, chipElevation2, chipBorder4, mutableInteractionSource3, i, i2));
                    return;
                }
                obj = function2;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((29360128 & i) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i6 = i2 & 512;
                if (i6 == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if (i9 == 0) {
                }
                obj6 = obj3;
                i3 = i8;
                chipColors3 = chipColors2;
                z3 = z5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i10), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                int i162 = (i3 >> 9) & 14;
                int i172 = i3 >> 15;
                long m3301unboximpl2 = chipColors3.labelColor$material3_release(z3, startRestartGroup, (i172 & 112) | i162).getValue().m3301unboximpl();
                startRestartGroup.startReplaceableGroup(2118455055);
                ComposerKt.sourceInformation(startRestartGroup, "540@27074L21");
                if (chipBorder3 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (borderStroke$material3_release != null) {
                }
                composer2 = startRestartGroup;
                int i182 = i3 << 6;
                ChipBorder chipBorder52 = chipBorder3;
                int i192 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i182 & 7168) | (i182 & 3670016);
                int i202 = i3 << 9;
                ChipColors chipColors52 = chipColors3;
                boolean z62 = z3;
                m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken2, m3301unboximpl2, obj5, null, shape2, chipColors52, obj6, value, SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource2, composer2, i192 | (i202 & 234881024) | (i202 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i172 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                chipElevation2 = obj6;
                mutableInteractionSource3 = mutableInteractionSource2;
                chipBorder4 = chipBorder52;
                chipColors4 = chipColors52;
                z4 = z62;
                function22 = obj5;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = function2;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((29360128 & i) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i6 = i2 & 512;
            if (i6 == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if (i9 == 0) {
            }
            obj6 = obj3;
            i3 = i8;
            chipColors3 = chipColors2;
            z3 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i10), SuggestionChipTokens.INSTANCE.getLabelTextFont());
            int i1622 = (i3 >> 9) & 14;
            int i1722 = i3 >> 15;
            long m3301unboximpl22 = chipColors3.labelColor$material3_release(z3, startRestartGroup, (i1722 & 112) | i1622).getValue().m3301unboximpl();
            startRestartGroup.startReplaceableGroup(2118455055);
            ComposerKt.sourceInformation(startRestartGroup, "540@27074L21");
            if (chipBorder3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release != null) {
            }
            composer2 = startRestartGroup;
            int i1822 = i3 << 6;
            ChipBorder chipBorder522 = chipBorder3;
            int i1922 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i1822 & 7168) | (i1822 & 3670016);
            int i2022 = i3 << 9;
            ChipColors chipColors522 = chipColors3;
            boolean z622 = z3;
            m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken22, m3301unboximpl22, obj5, null, shape2, chipColors522, obj6, value, SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource2, composer2, i1922 | (i2022 & 234881024) | (i2022 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i1722 & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            chipElevation2 = obj6;
            mutableInteractionSource3 = mutableInteractionSource2;
            chipBorder4 = chipBorder522;
            chipColors4 = chipColors522;
            z4 = z622;
            function22 = obj5;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = function2;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if (i9 == 0) {
        }
        obj6 = obj3;
        i3 = i8;
        chipColors3 = chipColors2;
        z3 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i10), SuggestionChipTokens.INSTANCE.getLabelTextFont());
        int i16222 = (i3 >> 9) & 14;
        int i17222 = i3 >> 15;
        long m3301unboximpl222 = chipColors3.labelColor$material3_release(z3, startRestartGroup, (i17222 & 112) | i16222).getValue().m3301unboximpl();
        startRestartGroup.startReplaceableGroup(2118455055);
        ComposerKt.sourceInformation(startRestartGroup, "540@27074L21");
        if (chipBorder3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release != null) {
        }
        composer2 = startRestartGroup;
        int i18222 = i3 << 6;
        ChipBorder chipBorder5222 = chipBorder3;
        int i19222 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i18222 & 7168) | (i18222 & 3670016);
        int i20222 = i3 << 9;
        ChipColors chipColors5222 = chipColors3;
        boolean z6222 = z3;
        m1618ChipnkUnTEs(modifier3, onClick, z3, label, fromToken222, m3301unboximpl222, obj5, null, shape2, chipColors5222, obj6, value, SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource2, composer2, i19222 | (i20222 & 234881024) | (i20222 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i17222 & 57344));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        chipElevation2 = obj6;
        mutableInteractionSource3 = mutableInteractionSource2;
        chipBorder4 = chipBorder5222;
        chipColors4 = chipColors5222;
        z4 = z6222;
        function22 = obj5;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(Function0<Unit> onClick, Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        Object obj2;
        ChipColors chipColors2;
        int i6;
        int i7;
        int i8;
        Object obj3;
        Modifier.Companion companion;
        Object obj4;
        Shape shape2;
        int i9;
        ChipColors chipColors3;
        int i10;
        int i11;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder2;
        ChipElevation chipElevation3;
        boolean z2;
        Composer composer2;
        ChipElevation chipElevation4;
        ChipBorder chipBorder3;
        ChipColors chipColors4;
        Modifier modifier2;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(1668751803);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)591@29894L5,592@29949L30,593@30036L33,595@30153L39,601@30329L10,602@30411L19,596@30198L540:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(label) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj = function2;
                    i3 |= startRestartGroup.changedInstance(obj) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj2 = shape;
                            if (startRestartGroup.changed(obj2)) {
                                i14 = 131072;
                                i3 |= i14;
                            }
                        } else {
                            obj2 = shape;
                        }
                        i14 = 65536;
                        i3 |= i14;
                    } else {
                        obj2 = shape;
                    }
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i13 = 1048576;
                                i3 |= i13;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i13 = 524288;
                        i3 |= i13;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((29360128 & i) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(chipElevation)) {
                            i12 = 8388608;
                            i3 |= i12;
                        }
                        i12 = 4194304;
                        i3 |= i12;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(chipBorder) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i7 = i2 & 512;
                    if (i7 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                        i8 = i7;
                        obj3 = mutableInteractionSource;
                    } else {
                        i8 = i7;
                        obj3 = mutableInteractionSource;
                        if ((i & 1879048192) == 0) {
                            i3 |= startRestartGroup.changed(obj3) ? 536870912 : 268435456;
                        }
                    }
                    if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i15 == 0 ? Modifier.Companion : modifier;
                            boolean z4 = i4 == 0 ? true : z;
                            obj4 = i5 == 0 ? null : obj;
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                shape2 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape2 = obj2;
                            }
                            if ((i2 & 64) == 0) {
                                i9 = i3 & (-3670017);
                                chipColors3 = SuggestionChipDefaults.INSTANCE.m2060elevatedSuggestionChipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                            } else {
                                i9 = i3;
                                chipColors3 = chipColors2;
                            }
                            if ((i2 & 128) == 0) {
                                i10 = i8;
                                i11 = 6;
                                chipElevation2 = SuggestionChipDefaults.INSTANCE.m2061elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i9 &= -29360129;
                            } else {
                                i10 = i8;
                                i11 = 6;
                                chipElevation2 = chipElevation;
                            }
                            ChipBorder chipBorder4 = i6 == 0 ? null : chipBorder;
                            if (i10 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                chipBorder2 = chipBorder4;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                chipBorder2 = chipBorder4;
                                chipElevation3 = chipElevation2;
                            }
                            chipColors2 = chipColors3;
                            i3 = i9;
                            z2 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            companion = modifier;
                            chipElevation3 = chipElevation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            obj4 = obj;
                            shape2 = obj2;
                            i11 = 6;
                            z2 = z;
                            chipBorder2 = chipBorder;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1668751803, i3, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:585)");
                        }
                        TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i11), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                        int i16 = (i3 >> 9) & 14;
                        int i17 = i3 >> 15;
                        long m3301unboximpl = chipColors2.labelColor$material3_release(z2, startRestartGroup, (i17 & 112) | i16).getValue().m3301unboximpl();
                        float m2062getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM();
                        PaddingValues paddingValues = SuggestionChipPadding;
                        startRestartGroup.startReplaceableGroup(-1455593716);
                        ComposerKt.sourceInformation(startRestartGroup, "610@30665L21");
                        State<BorderStroke> borderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, startRestartGroup, i16 | ((i3 >> 21) & 112));
                        startRestartGroup.endReplaceableGroup();
                        BorderStroke value = borderStroke$material3_release == null ? borderStroke$material3_release.getValue() : null;
                        int i18 = i3 << 6;
                        int i19 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i18 & 7168) | (i18 & 3670016);
                        int i20 = i3 << 9;
                        ChipBorder chipBorder5 = chipBorder2;
                        ChipColors chipColors5 = chipColors2;
                        boolean z5 = z2;
                        composer2 = startRestartGroup;
                        m1618ChipnkUnTEs(companion, onClick, z2, label, fromToken, m3301unboximpl, obj4, null, shape2, chipColors5, chipElevation3, value, m2062getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composer2, i19 | (i20 & 234881024) | (i20 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i17 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipElevation4 = chipElevation3;
                        obj3 = mutableInteractionSource2;
                        chipBorder3 = chipBorder5;
                        chipColors4 = chipColors5;
                        modifier2 = companion;
                        z3 = z5;
                        function22 = obj4;
                        shape3 = shape2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z3 = z;
                        function22 = obj;
                        shape3 = obj2;
                        chipColors4 = chipColors2;
                        composer2 = startRestartGroup;
                        chipElevation4 = chipElevation;
                        chipBorder3 = chipBorder;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ChipKt$ElevatedSuggestionChip$2(onClick, label, modifier2, z3, function22, shape3, chipColors4, chipElevation4, chipBorder3, obj3, i, i2));
                    return;
                }
                obj = function2;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((29360128 & i) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i7 = i2 & 512;
                if (i7 == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i6 == 0) {
                }
                if (i10 == 0) {
                }
                chipColors2 = chipColors3;
                i3 = i9;
                z2 = z4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i11), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                int i162 = (i3 >> 9) & 14;
                int i172 = i3 >> 15;
                long m3301unboximpl2 = chipColors2.labelColor$material3_release(z2, startRestartGroup, (i172 & 112) | i162).getValue().m3301unboximpl();
                float m2062getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM();
                PaddingValues paddingValues2 = SuggestionChipPadding;
                startRestartGroup.startReplaceableGroup(-1455593716);
                ComposerKt.sourceInformation(startRestartGroup, "610@30665L21");
                if (chipBorder2 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (borderStroke$material3_release == null) {
                }
                int i182 = i3 << 6;
                int i192 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i182 & 7168) | (i182 & 3670016);
                int i202 = i3 << 9;
                ChipBorder chipBorder52 = chipBorder2;
                ChipColors chipColors52 = chipColors2;
                boolean z52 = z2;
                composer2 = startRestartGroup;
                m1618ChipnkUnTEs(companion, onClick, z2, label, fromToken2, m3301unboximpl2, obj4, null, shape2, chipColors52, chipElevation3, value, m2062getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composer2, i192 | (i202 & 234881024) | (i202 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i172 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                }
                chipElevation4 = chipElevation3;
                obj3 = mutableInteractionSource2;
                chipBorder3 = chipBorder52;
                chipColors4 = chipColors52;
                modifier2 = companion;
                z3 = z52;
                function22 = obj4;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = function2;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((29360128 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i6 == 0) {
            }
            if (i10 == 0) {
            }
            chipColors2 = chipColors3;
            i3 = i9;
            z2 = z4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle fromToken22 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i11), SuggestionChipTokens.INSTANCE.getLabelTextFont());
            int i1622 = (i3 >> 9) & 14;
            int i1722 = i3 >> 15;
            long m3301unboximpl22 = chipColors2.labelColor$material3_release(z2, startRestartGroup, (i1722 & 112) | i1622).getValue().m3301unboximpl();
            float m2062getHeightD9Ej5fM22 = SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM();
            PaddingValues paddingValues22 = SuggestionChipPadding;
            startRestartGroup.startReplaceableGroup(-1455593716);
            ComposerKt.sourceInformation(startRestartGroup, "610@30665L21");
            if (chipBorder2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (borderStroke$material3_release == null) {
            }
            int i1822 = i3 << 6;
            int i1922 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i1822 & 7168) | (i1822 & 3670016);
            int i2022 = i3 << 9;
            ChipBorder chipBorder522 = chipBorder2;
            ChipColors chipColors522 = chipColors2;
            boolean z522 = z2;
            composer2 = startRestartGroup;
            m1618ChipnkUnTEs(companion, onClick, z2, label, fromToken22, m3301unboximpl22, obj4, null, shape2, chipColors522, chipElevation3, value, m2062getHeightD9Ej5fM22, paddingValues22, mutableInteractionSource2, composer2, i1922 | (i2022 & 234881024) | (i2022 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i1722 & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            chipElevation4 = chipElevation3;
            obj3 = mutableInteractionSource2;
            chipBorder3 = chipBorder522;
            chipColors4 = chipColors522;
            modifier2 = companion;
            z3 = z522;
            function22 = obj4;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = function2;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((29360128 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i6 == 0) {
        }
        if (i10 == 0) {
        }
        chipColors2 = chipColors3;
        i3 = i9;
        z2 = z4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle fromToken222 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, i11), SuggestionChipTokens.INSTANCE.getLabelTextFont());
        int i16222 = (i3 >> 9) & 14;
        int i17222 = i3 >> 15;
        long m3301unboximpl222 = chipColors2.labelColor$material3_release(z2, startRestartGroup, (i17222 & 112) | i16222).getValue().m3301unboximpl();
        float m2062getHeightD9Ej5fM222 = SuggestionChipDefaults.INSTANCE.m2062getHeightD9Ej5fM();
        PaddingValues paddingValues222 = SuggestionChipPadding;
        startRestartGroup.startReplaceableGroup(-1455593716);
        ComposerKt.sourceInformation(startRestartGroup, "610@30665L21");
        if (chipBorder2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (borderStroke$material3_release == null) {
        }
        int i18222 = i3 << 6;
        int i19222 = ((i3 >> 6) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i18222 & 7168) | (i18222 & 3670016);
        int i20222 = i3 << 9;
        ChipBorder chipBorder5222 = chipBorder2;
        ChipColors chipColors5222 = chipColors2;
        boolean z5222 = z2;
        composer2 = startRestartGroup;
        m1618ChipnkUnTEs(companion, onClick, z2, label, fromToken222, m3301unboximpl222, obj4, null, shape2, chipColors5222, chipElevation3, value, m2062getHeightD9Ej5fM222, paddingValues222, mutableInteractionSource2, composer2, i19222 | (i20222 & 234881024) | (i20222 & 1879048192), ((i3 >> 21) & 14) | 3456 | (i17222 & 57344));
        if (ComposerKt.isTraceInProgress()) {
        }
        chipElevation4 = chipElevation3;
        obj3 = mutableInteractionSource2;
        chipBorder3 = chipBorder5222;
        chipColors4 = chipColors5222;
        modifier2 = companion;
        z3 = z5222;
        function22 = obj4;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chip-nkUnTEs  reason: not valid java name */
    public static final void m1618ChipnkUnTEs(Modifier modifier, Function0<Unit> function0, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1323@66508L23,1318@66337L961:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(chipElevation) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((i3 & 1533916891) != 306783378 || (46811 & i4) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i3, i4, "androidx.compose.material3.Chip (Chip.kt:1301)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$Chip$1.INSTANCE, 1, null);
            int i5 = (i3 >> 6) & 14;
            long m3301unboximpl = chipColors.containerColor$material3_release(z, startRestartGroup, i5 | ((i3 >> 24) & 112)).getValue().m3301unboximpl();
            startRestartGroup.startReplaceableGroup(64018752);
            ComposerKt.sourceInformation(startRestartGroup, "1324@66575L42");
            State<Dp> state = chipElevation == null ? null : chipElevation.tonalElevation$material3_release(z, mutableInteractionSource, startRestartGroup, i5 | ((i4 >> 9) & 112) | ((i4 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            float m5621unboximpl = state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
            startRestartGroup.startReplaceableGroup(64018848);
            ComposerKt.sourceInformation(startRestartGroup, "1325@66671L43");
            State<Dp> shadowElevation$material3_release = chipElevation == null ? null : chipElevation.shadowElevation$material3_release(z, mutableInteractionSource, startRestartGroup, i5 | ((i4 >> 9) & 112) | ((i4 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            int i6 = i3;
            int i7 = i4;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(function0, semantics$default, z, shape, m3301unboximpl, 0L, m5621unboximpl, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -1985962652, true, new ChipKt$Chip$2(function2, textStyle, j, function22, function23, chipColors, z, i6, f, paddingValues, i7)), composer2, ((i6 >> 3) & 14) | (i6 & 896) | ((i6 >> 15) & 7168) | ((i7 << 21) & 234881024) | ((i7 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChipKt$Chip$3(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SelectableChip-u0RnIRE  reason: not valid java name */
    public static final void m1620SelectableChipu0RnIRE(boolean z, Modifier modifier, Function0<Unit> function0, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)1371@68165L33,1365@67963L1080:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(selectableChipColors) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i3 & 1533916891) != 306783378 || (374491 & i4) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i4, "androidx.compose.material3.SelectableChip (Chip.kt:1346)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$SelectableChip$1.INSTANCE, 1, null);
            int i5 = (i3 >> 9) & 14;
            long m3301unboximpl = selectableChipColors.containerColor$material3_release(z2, z, startRestartGroup, ((i3 << 3) & 112) | i5 | ((i4 << 6) & 896)).getValue().m3301unboximpl();
            startRestartGroup.startReplaceableGroup(1036660941);
            ComposerKt.sourceInformation(startRestartGroup, "1372@68242L42");
            State<Dp> state = selectableChipElevation == null ? null : selectableChipElevation.tonalElevation$material3_release(z2, mutableInteractionSource, startRestartGroup, ((i4 << 3) & 896) | ((i4 >> 12) & 112) | i5);
            startRestartGroup.endReplaceableGroup();
            float m5621unboximpl = state != null ? state.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0);
            startRestartGroup.startReplaceableGroup(1036661049);
            ComposerKt.sourceInformation(startRestartGroup, "1374@68350L43");
            State<Dp> shadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z2, mutableInteractionSource, startRestartGroup, i5 | ((i4 >> 12) & 112) | ((i4 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            int i6 = i3;
            int i7 = i4;
            composer2 = startRestartGroup;
            SurfaceKt.m2068Surfaced85dljk(z, function0, semantics$default, z2, shape, m3301unboximpl, 0L, m5621unboximpl, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5621unboximpl() : Dp.m5607constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(startRestartGroup, -577614814, true, new ChipKt$SelectableChip$2(selectableChipColors, z2, z, i6, i7, function2, textStyle, function22, function23, function24, f, paddingValues)), startRestartGroup, (i6 & 14) | ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i7 << 21) & 1879048192), ((i7 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChipKt$SelectableChip$3(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChipContent-fe0OD_I  reason: not valid java name */
    public static final void m1619ChipContentfe0OD_I(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, long j2, long j3, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)1407@69420L1012:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 = i2 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
        } else {
            i3 = i2;
        }
        if ((234881024 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((i3 & 1533916891) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:1395)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1748799148, true, new ChipKt$ChipContent$1(f, paddingValues, function23, i3, function22, j2, function2, function24, j3)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChipKt$ChipContent$2(function2, textStyle, j, function22, function23, function24, j2, j3, f, paddingValues, i));
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl((z || !z2) ? 4 : 8), 0.0f, Dp.m5607constructorimpl(z3 ? 8 : 4), 0.0f, 10, null);
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(8);
        HorizontalElementsPadding = m5607constructorimpl;
        AssistChipPadding = PaddingKt.m743PaddingValuesYgX7TsA$default(m5607constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m743PaddingValuesYgX7TsA$default(m5607constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m743PaddingValuesYgX7TsA$default(m5607constructorimpl, 0.0f, 2, null);
    }
}
