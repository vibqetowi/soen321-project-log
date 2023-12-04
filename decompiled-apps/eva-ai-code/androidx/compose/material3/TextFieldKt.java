package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010-\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010/\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001aì\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001au\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aU\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020$2\u0006\u0010F\u001a\u00020GH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020\f*\u00020\f2\u0006\u0010V\u001a\u00020WH\u0000\u001a\u009a\u0001\u0010X\u001a\u00020\u0006*\u00020Y2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010_\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010]2\b\u0010a\u001a\u0004\u0018\u00010]2\b\u0010b\u001a\u0004\u0018\u00010]2\b\u0010c\u001a\u0004\u0018\u00010]2\u0006\u0010d\u001a\u00020]2\b\u0010e\u001a\u0004\u0018\u00010]2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020$2\u0006\u0010g\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010H\u001a\u000206H\u0002\u001a\u0080\u0001\u0010h\u001a\u00020\u0006*\u00020Y2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$2\u0006\u0010i\u001a\u00020]2\b\u0010_\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010]2\b\u0010a\u001a\u0004\u0018\u00010]2\b\u0010b\u001a\u0004\u0018\u00010]2\b\u0010c\u001a\u0004\u0018\u00010]2\u0006\u0010d\u001a\u00020]2\b\u0010e\u001a\u0004\u0018\u00010]2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", TtmlNode.RUBY_CONTAINER, "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelFocused", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m5607constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(String value, Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z5;
        Modifier modifier2;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i27;
        int i28;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function28;
        MutableInteractionSource mutableInteractionSource2;
        InteractionSource interactionSource;
        Shape shape2;
        Modifier modifier3;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function29;
        InteractionSource interactionSource2;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        int i30;
        boolean z9;
        int i31;
        Function2<? super Composer, ? super Integer, Unit> function214;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function215;
        int i32;
        int i33;
        TextFieldColors textFieldColors2;
        TextStyle textStyle3;
        long m5103getColor0d7_KjU;
        Composer composer2;
        Modifier modifier4;
        boolean z10;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        boolean z11;
        VisualTransformation visualTransformation3;
        int i34;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        TextFieldColors textFieldColors3;
        TextStyle textStyle4;
        boolean z12;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z13;
        int i35;
        ScopeUpdateScope endRestartGroup;
        int i36;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-676242365);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)171@8945L7,186@9697L39,187@9775L5,188@9830L8,196@10192L15,196@10126L1825:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i7 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i37 = i6 & 4;
        if (i37 != 0) {
            i7 |= 384;
        } else if ((i3 & 896) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i4 & 112) == 0) {
                    i15 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                int i38 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i38 |= 384;
                } else if ((i4 & 896) == 0) {
                    i38 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                    i18 = i6 & 8192;
                    if (i18 == 0) {
                        i38 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i38 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                        i19 = i6 & 16384;
                        if (i19 != 0) {
                            i38 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i20 = i19;
                            i38 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                            i21 = i6 & 32768;
                            if (i21 == 0) {
                                i38 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & 458752) == 0) {
                                i38 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                            }
                            i22 = i6 & 65536;
                            if (i22 == 0) {
                                i38 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i38 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                                i38 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i38 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                            }
                            if ((i4 & 234881024) == 0) {
                                i38 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i24 = i6 & 524288;
                            if (i24 == 0) {
                                i38 |= C.ENCODING_PCM_32BIT;
                            } else if ((i4 & 1879048192) == 0) {
                                i38 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                            }
                            i25 = i6 & 1048576;
                            if (i25 == 0) {
                                i26 = i5 | 6;
                            } else if ((i5 & 14) == 0) {
                                i26 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                            } else {
                                i26 = i5;
                            }
                            if ((i5 & 112) == 0) {
                                i26 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            if ((i5 & 896) == 0) {
                                if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i36 = 256;
                                    i26 |= i36;
                                }
                                i36 = 128;
                                i26 |= i36;
                            }
                            int i39 = i26;
                            if ((i7 & 1533916891) == 306783378 || (1533916891 & i38) != 306783378 || (i39 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i37 == 0 ? Modifier.Companion : modifier;
                                    boolean z14 = i8 == 0 ? true : z;
                                    z5 = i9 == 0 ? false : z2;
                                    if ((i6 & 32) == 0) {
                                        modifier2 = companion;
                                        z6 = z14;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i7 &= -458753;
                                    } else {
                                        modifier2 = companion;
                                        z6 = z14;
                                        textStyle2 = textStyle;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function223 = i10 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function224 = i11 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function225 = i12 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i13 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i14 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i16 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i17 == 0 ? function27 : null;
                                    boolean z15 = i18 == 0 ? false : z3;
                                    VisualTransformation none = i20 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    keyboardOptions2 = i21 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    keyboardActions2 = i22 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    z7 = i23 == 0 ? false : z4;
                                    if ((i6 & 262144) == 0) {
                                        i27 = i38 & (-234881025);
                                        i28 = z7 ? 1 : Integer.MAX_VALUE;
                                    } else {
                                        i27 = i38;
                                        i28 = i;
                                    }
                                    i29 = i24 == 0 ? 1 : i2;
                                    int i40 = i7;
                                    if (i25 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function28 = function225;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        function28 = function225;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((2097152 & i6) == 0) {
                                        interactionSource = mutableInteractionSource2;
                                        shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        i39 &= -113;
                                    } else {
                                        interactionSource = mutableInteractionSource2;
                                        shape2 = shape;
                                    }
                                    if ((i6 & 4194304) == 0) {
                                        modifier3 = modifier2;
                                        z8 = z6;
                                        function29 = function28;
                                        interactionSource2 = interactionSource;
                                        shape3 = shape2;
                                        function210 = function226;
                                        function211 = function227;
                                        function212 = function228;
                                        function213 = function224;
                                        i30 = i28;
                                        z9 = z15;
                                        i31 = i39 & (-897);
                                        function214 = function229;
                                        visualTransformation2 = none;
                                        function215 = function223;
                                        i32 = i27;
                                        i33 = i40;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                    } else {
                                        modifier3 = modifier2;
                                        z8 = z6;
                                        function29 = function28;
                                        interactionSource2 = interactionSource;
                                        shape3 = shape2;
                                        function210 = function226;
                                        function211 = function227;
                                        function212 = function228;
                                        function213 = function224;
                                        i30 = i28;
                                        z9 = z15;
                                        i31 = i39;
                                        function214 = function229;
                                        visualTransformation2 = none;
                                        function215 = function223;
                                        i32 = i27;
                                        i33 = i40;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    textStyle3 = textStyle2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((262144 & i6) != 0) {
                                        i38 &= -234881025;
                                    }
                                    if ((2097152 & i6) != 0) {
                                        i39 &= -113;
                                    }
                                    if ((i6 & 4194304) != 0) {
                                        modifier3 = modifier;
                                        z8 = z;
                                        z5 = z2;
                                        textStyle3 = textStyle;
                                        function215 = function2;
                                        function213 = function22;
                                        function29 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function214 = function27;
                                        z9 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i30 = i;
                                        i29 = i2;
                                        interactionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        textFieldColors2 = textFieldColors;
                                        i33 = i7;
                                        i31 = i39 & (-897);
                                        i32 = i38;
                                    } else {
                                        modifier3 = modifier;
                                        z8 = z;
                                        z5 = z2;
                                        textStyle3 = textStyle;
                                        function215 = function2;
                                        function213 = function22;
                                        function29 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function214 = function27;
                                        z9 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i30 = i;
                                        i29 = i2;
                                        interactionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        textFieldColors2 = textFieldColors;
                                        i33 = i7;
                                        i32 = i38;
                                        i31 = i39;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-676242365, i33, i32, "androidx.compose.material3.TextField (TextField.kt:165)");
                                }
                                startRestartGroup.startReplaceableGroup(-1263331616);
                                ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
                                m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                                if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                                    m5103getColor0d7_KjU = textFieldColors2.textColor$material3_release(z8, z9, interactionSource2, startRestartGroup, ((i33 >> 9) & 14) | ((i32 >> 6) & 112) | ((i31 << 6) & 896) | ((i31 << 3) & 7168)).getValue().m3301unboximpl();
                                }
                                startRestartGroup.endReplaceableGroup();
                                TextFieldColors textFieldColors4 = textFieldColors2;
                                TextStyle textStyle5 = textStyle3;
                                composer2 = startRestartGroup;
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                z10 = z8;
                                function216 = function215;
                                function217 = function213;
                                function218 = function29;
                                function219 = function210;
                                function220 = function211;
                                function221 = function212;
                                function222 = function214;
                                z11 = z9;
                                visualTransformation3 = visualTransformation2;
                                i34 = i30;
                                mutableInteractionSource3 = interactionSource2;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors4;
                                textStyle4 = textStyle5;
                                z12 = z5;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z13 = z7;
                                i35 = i29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                z10 = z;
                                z12 = z2;
                                textStyle4 = textStyle;
                                function216 = function2;
                                function218 = function23;
                                function219 = function24;
                                function220 = function25;
                                function221 = function26;
                                function222 = function27;
                                z11 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z13 = z4;
                                i34 = i;
                                i35 = i2;
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function217 = function22;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldKt$TextField$3(value, onValueChange, modifier4, z10, z12, textStyle4, function216, function217, function218, function219, function220, function221, function222, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z13, i34, i35, mutableInteractionSource3, shape4, textFieldColors3, i3, i4, i5, i6));
                            return;
                        }
                        i20 = i19;
                        i21 = i6 & 32768;
                        if (i21 == 0) {
                        }
                        i22 = i6 & 65536;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        if ((i4 & 234881024) == 0) {
                        }
                        i24 = i6 & 524288;
                        if (i24 == 0) {
                        }
                        i25 = i6 & 1048576;
                        if (i25 == 0) {
                        }
                        if ((i5 & 112) == 0) {
                        }
                        if ((i5 & 896) == 0) {
                        }
                        int i392 = i26;
                        if ((i7 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i37 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i24 == 0) {
                        }
                        int i402 = i7;
                        if (i25 == 0) {
                        }
                        if ((2097152 & i6) == 0) {
                        }
                        if ((i6 & 4194304) == 0) {
                        }
                        textStyle3 = textStyle2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1263331616);
                        ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
                        m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextFieldColors textFieldColors42 = textFieldColors2;
                        TextStyle textStyle52 = textStyle3;
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        z10 = z8;
                        function216 = function215;
                        function217 = function213;
                        function218 = function29;
                        function219 = function210;
                        function220 = function211;
                        function221 = function212;
                        function222 = function214;
                        z11 = z9;
                        visualTransformation3 = visualTransformation2;
                        i34 = i30;
                        mutableInteractionSource3 = interactionSource2;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors42;
                        textStyle4 = textStyle52;
                        z12 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z13 = z7;
                        i35 = i29;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i6 & 16384;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i6 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i6 & 65536;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    i24 = i6 & 524288;
                    if (i24 == 0) {
                    }
                    i25 = i6 & 1048576;
                    if (i25 == 0) {
                    }
                    if ((i5 & 112) == 0) {
                    }
                    if ((i5 & 896) == 0) {
                    }
                    int i3922 = i26;
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i37 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i24 == 0) {
                    }
                    int i4022 = i7;
                    if (i25 == 0) {
                    }
                    if ((2097152 & i6) == 0) {
                    }
                    if ((i6 & 4194304) == 0) {
                    }
                    textStyle3 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1263331616);
                    ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
                    m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                    if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldColors textFieldColors422 = textFieldColors2;
                    TextStyle textStyle522 = textStyle3;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    z10 = z8;
                    function216 = function215;
                    function217 = function213;
                    function218 = function29;
                    function219 = function210;
                    function220 = function211;
                    function221 = function212;
                    function222 = function214;
                    z11 = z9;
                    visualTransformation3 = visualTransformation2;
                    i34 = i30;
                    mutableInteractionSource3 = interactionSource2;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors422;
                    textStyle4 = textStyle522;
                    z12 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z13 = z7;
                    i35 = i29;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i18 = i6 & 8192;
                if (i18 == 0) {
                }
                i19 = i6 & 16384;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i6 & 32768;
                if (i21 == 0) {
                }
                i22 = i6 & 65536;
                if (i22 == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                i24 = i6 & 524288;
                if (i24 == 0) {
                }
                i25 = i6 & 1048576;
                if (i25 == 0) {
                }
                if ((i5 & 112) == 0) {
                }
                if ((i5 & 896) == 0) {
                }
                int i39222 = i26;
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i37 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i24 == 0) {
                }
                int i40222 = i7;
                if (i25 == 0) {
                }
                if ((2097152 & i6) == 0) {
                }
                if ((i6 & 4194304) == 0) {
                }
                textStyle3 = textStyle2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1263331616);
                ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
                m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextFieldColors textFieldColors4222 = textFieldColors2;
                TextStyle textStyle5222 = textStyle3;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z10 = z8;
                function216 = function215;
                function217 = function213;
                function218 = function29;
                function219 = function210;
                function220 = function211;
                function221 = function212;
                function222 = function214;
                z11 = z9;
                visualTransformation3 = visualTransformation2;
                i34 = i30;
                mutableInteractionSource3 = interactionSource2;
                shape4 = shape3;
                textFieldColors3 = textFieldColors4222;
                textStyle4 = textStyle5222;
                z12 = z5;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z13 = z7;
                i35 = i29;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i382 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i18 = i6 & 8192;
            if (i18 == 0) {
            }
            i19 = i6 & 16384;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i6 & 32768;
            if (i21 == 0) {
            }
            i22 = i6 & 65536;
            if (i22 == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            i24 = i6 & 524288;
            if (i24 == 0) {
            }
            i25 = i6 & 1048576;
            if (i25 == 0) {
            }
            if ((i5 & 112) == 0) {
            }
            if ((i5 & 896) == 0) {
            }
            int i392222 = i26;
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i37 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i24 == 0) {
            }
            int i402222 = i7;
            if (i25 == 0) {
            }
            if ((2097152 & i6) == 0) {
            }
            if ((i6 & 4194304) == 0) {
            }
            textStyle3 = textStyle2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1263331616);
            ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
            m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldColors textFieldColors42222 = textFieldColors2;
            TextStyle textStyle52222 = textStyle3;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            z10 = z8;
            function216 = function215;
            function217 = function213;
            function218 = function29;
            function219 = function210;
            function220 = function211;
            function221 = function212;
            function222 = function214;
            z11 = z9;
            visualTransformation3 = visualTransformation2;
            i34 = i30;
            mutableInteractionSource3 = interactionSource2;
            shape4 = shape3;
            textFieldColors3 = textFieldColors42222;
            textStyle4 = textStyle52222;
            z12 = z5;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z13 = z7;
            i35 = i29;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3822 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i18 = i6 & 8192;
        if (i18 == 0) {
        }
        i19 = i6 & 16384;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i6 & 32768;
        if (i21 == 0) {
        }
        i22 = i6 & 65536;
        if (i22 == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        i24 = i6 & 524288;
        if (i24 == 0) {
        }
        i25 = i6 & 1048576;
        if (i25 == 0) {
        }
        if ((i5 & 112) == 0) {
        }
        if ((i5 & 896) == 0) {
        }
        int i3922222 = i26;
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i37 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i24 == 0) {
        }
        int i4022222 = i7;
        if (i25 == 0) {
        }
        if ((2097152 & i6) == 0) {
        }
        if ((i6 & 4194304) == 0) {
        }
        textStyle3 = textStyle2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1263331616);
        ComposerKt.sourceInformation(startRestartGroup, "*192@9990L46");
        m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldColors textFieldColors422222 = textFieldColors2;
        TextStyle textStyle522222 = textStyle3;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, 1859145987, true, new TextFieldKt$TextField$2(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        z10 = z8;
        function216 = function215;
        function217 = function213;
        function218 = function29;
        function219 = function210;
        function220 = function211;
        function221 = function212;
        function222 = function214;
        z11 = z9;
        visualTransformation3 = visualTransformation2;
        i34 = i30;
        mutableInteractionSource3 = interactionSource2;
        shape4 = shape3;
        textFieldColors3 = textFieldColors422222;
        textStyle4 = textStyle522222;
        z12 = z5;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z13 = z7;
        i35 = i29;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(TextFieldValue value, Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z5;
        Modifier modifier2;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i27;
        int i28;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function28;
        MutableInteractionSource mutableInteractionSource2;
        InteractionSource interactionSource;
        Shape shape2;
        Modifier modifier3;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function29;
        InteractionSource interactionSource2;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        int i30;
        boolean z9;
        int i31;
        Function2<? super Composer, ? super Integer, Unit> function214;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function215;
        int i32;
        int i33;
        TextFieldColors textFieldColors2;
        TextStyle textStyle3;
        long m5103getColor0d7_KjU;
        Composer composer2;
        Modifier modifier4;
        boolean z10;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        boolean z11;
        VisualTransformation visualTransformation3;
        int i34;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        TextFieldColors textFieldColors3;
        TextStyle textStyle4;
        boolean z12;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z13;
        int i35;
        ScopeUpdateScope endRestartGroup;
        int i36;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1268528240);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)316@17035L7,331@17787L39,332@17865L5,333@17920L8,341@18282L15,341@18216L1830:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i7 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i37 = i6 & 4;
        if (i37 != 0) {
            i7 |= 384;
        } else if ((i3 & 896) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i4 & 112) == 0) {
                    i15 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                int i38 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i38 |= 384;
                } else if ((i4 & 896) == 0) {
                    i38 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                    i18 = i6 & 8192;
                    if (i18 == 0) {
                        i38 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i38 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                        i19 = i6 & 16384;
                        if (i19 != 0) {
                            i38 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i20 = i19;
                            i38 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                            i21 = i6 & 32768;
                            if (i21 == 0) {
                                i38 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & 458752) == 0) {
                                i38 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                            }
                            i22 = i6 & 65536;
                            if (i22 == 0) {
                                i38 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i38 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                                i38 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i38 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                            }
                            if ((i4 & 234881024) == 0) {
                                i38 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i24 = i6 & 524288;
                            if (i24 == 0) {
                                i38 |= C.ENCODING_PCM_32BIT;
                            } else if ((i4 & 1879048192) == 0) {
                                i38 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                            }
                            i25 = i6 & 1048576;
                            if (i25 == 0) {
                                i26 = i5 | 6;
                            } else if ((i5 & 14) == 0) {
                                i26 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                            } else {
                                i26 = i5;
                            }
                            if ((i5 & 112) == 0) {
                                i26 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            if ((i5 & 896) == 0) {
                                if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i36 = 256;
                                    i26 |= i36;
                                }
                                i36 = 128;
                                i26 |= i36;
                            }
                            int i39 = i26;
                            if ((i7 & 1533916891) == 306783378 || (1533916891 & i38) != 306783378 || (i39 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i37 == 0 ? Modifier.Companion : modifier;
                                    boolean z14 = i8 == 0 ? true : z;
                                    z5 = i9 == 0 ? false : z2;
                                    if ((i6 & 32) == 0) {
                                        modifier2 = companion;
                                        z6 = z14;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i7 &= -458753;
                                    } else {
                                        modifier2 = companion;
                                        z6 = z14;
                                        textStyle2 = textStyle;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function223 = i10 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function224 = i11 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function225 = i12 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i13 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i14 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i16 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i17 == 0 ? function27 : null;
                                    boolean z15 = i18 == 0 ? false : z3;
                                    VisualTransformation none = i20 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    keyboardOptions2 = i21 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    keyboardActions2 = i22 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    z7 = i23 == 0 ? false : z4;
                                    if ((i6 & 262144) == 0) {
                                        i27 = i38 & (-234881025);
                                        i28 = z7 ? 1 : Integer.MAX_VALUE;
                                    } else {
                                        i27 = i38;
                                        i28 = i;
                                    }
                                    i29 = i24 == 0 ? 1 : i2;
                                    int i40 = i7;
                                    if (i25 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function28 = function225;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        function28 = function225;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((2097152 & i6) == 0) {
                                        interactionSource = mutableInteractionSource2;
                                        shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        i39 &= -113;
                                    } else {
                                        interactionSource = mutableInteractionSource2;
                                        shape2 = shape;
                                    }
                                    if ((i6 & 4194304) == 0) {
                                        modifier3 = modifier2;
                                        z8 = z6;
                                        function29 = function28;
                                        interactionSource2 = interactionSource;
                                        shape3 = shape2;
                                        function210 = function226;
                                        function211 = function227;
                                        function212 = function228;
                                        function213 = function224;
                                        i30 = i28;
                                        z9 = z15;
                                        i31 = i39 & (-897);
                                        function214 = function229;
                                        visualTransformation2 = none;
                                        function215 = function223;
                                        i32 = i27;
                                        i33 = i40;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                    } else {
                                        modifier3 = modifier2;
                                        z8 = z6;
                                        function29 = function28;
                                        interactionSource2 = interactionSource;
                                        shape3 = shape2;
                                        function210 = function226;
                                        function211 = function227;
                                        function212 = function228;
                                        function213 = function224;
                                        i30 = i28;
                                        z9 = z15;
                                        i31 = i39;
                                        function214 = function229;
                                        visualTransformation2 = none;
                                        function215 = function223;
                                        i32 = i27;
                                        i33 = i40;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    textStyle3 = textStyle2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((262144 & i6) != 0) {
                                        i38 &= -234881025;
                                    }
                                    if ((2097152 & i6) != 0) {
                                        i39 &= -113;
                                    }
                                    if ((i6 & 4194304) != 0) {
                                        modifier3 = modifier;
                                        z8 = z;
                                        z5 = z2;
                                        textStyle3 = textStyle;
                                        function215 = function2;
                                        function213 = function22;
                                        function29 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function214 = function27;
                                        z9 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i30 = i;
                                        i29 = i2;
                                        interactionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        textFieldColors2 = textFieldColors;
                                        i33 = i7;
                                        i31 = i39 & (-897);
                                        i32 = i38;
                                    } else {
                                        modifier3 = modifier;
                                        z8 = z;
                                        z5 = z2;
                                        textStyle3 = textStyle;
                                        function215 = function2;
                                        function213 = function22;
                                        function29 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function214 = function27;
                                        z9 = z3;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i30 = i;
                                        i29 = i2;
                                        interactionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        textFieldColors2 = textFieldColors;
                                        i33 = i7;
                                        i32 = i38;
                                        i31 = i39;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1268528240, i33, i32, "androidx.compose.material3.TextField (TextField.kt:310)");
                                }
                                startRestartGroup.startReplaceableGroup(-1263323526);
                                ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
                                m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                                if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                                    m5103getColor0d7_KjU = textFieldColors2.textColor$material3_release(z8, z9, interactionSource2, startRestartGroup, ((i33 >> 9) & 14) | ((i32 >> 6) & 112) | ((i31 << 6) & 896) | ((i31 << 3) & 7168)).getValue().m3301unboximpl();
                                }
                                startRestartGroup.endReplaceableGroup();
                                TextFieldColors textFieldColors4 = textFieldColors2;
                                TextStyle textStyle5 = textStyle3;
                                composer2 = startRestartGroup;
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                z10 = z8;
                                function216 = function215;
                                function217 = function213;
                                function218 = function29;
                                function219 = function210;
                                function220 = function211;
                                function221 = function212;
                                function222 = function214;
                                z11 = z9;
                                visualTransformation3 = visualTransformation2;
                                i34 = i30;
                                mutableInteractionSource3 = interactionSource2;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors4;
                                textStyle4 = textStyle5;
                                z12 = z5;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z13 = z7;
                                i35 = i29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                z10 = z;
                                z12 = z2;
                                textStyle4 = textStyle;
                                function216 = function2;
                                function218 = function23;
                                function219 = function24;
                                function220 = function25;
                                function221 = function26;
                                function222 = function27;
                                z11 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z13 = z4;
                                i34 = i;
                                i35 = i2;
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function217 = function22;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldKt$TextField$6(value, onValueChange, modifier4, z10, z12, textStyle4, function216, function217, function218, function219, function220, function221, function222, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z13, i34, i35, mutableInteractionSource3, shape4, textFieldColors3, i3, i4, i5, i6));
                            return;
                        }
                        i20 = i19;
                        i21 = i6 & 32768;
                        if (i21 == 0) {
                        }
                        i22 = i6 & 65536;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        if ((i4 & 234881024) == 0) {
                        }
                        i24 = i6 & 524288;
                        if (i24 == 0) {
                        }
                        i25 = i6 & 1048576;
                        if (i25 == 0) {
                        }
                        if ((i5 & 112) == 0) {
                        }
                        if ((i5 & 896) == 0) {
                        }
                        int i392 = i26;
                        if ((i7 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i37 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i24 == 0) {
                        }
                        int i402 = i7;
                        if (i25 == 0) {
                        }
                        if ((2097152 & i6) == 0) {
                        }
                        if ((i6 & 4194304) == 0) {
                        }
                        textStyle3 = textStyle2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1263323526);
                        ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
                        m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextFieldColors textFieldColors42 = textFieldColors2;
                        TextStyle textStyle52 = textStyle3;
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        z10 = z8;
                        function216 = function215;
                        function217 = function213;
                        function218 = function29;
                        function219 = function210;
                        function220 = function211;
                        function221 = function212;
                        function222 = function214;
                        z11 = z9;
                        visualTransformation3 = visualTransformation2;
                        i34 = i30;
                        mutableInteractionSource3 = interactionSource2;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors42;
                        textStyle4 = textStyle52;
                        z12 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z13 = z7;
                        i35 = i29;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i6 & 16384;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i6 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i6 & 65536;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    i24 = i6 & 524288;
                    if (i24 == 0) {
                    }
                    i25 = i6 & 1048576;
                    if (i25 == 0) {
                    }
                    if ((i5 & 112) == 0) {
                    }
                    if ((i5 & 896) == 0) {
                    }
                    int i3922 = i26;
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i37 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i24 == 0) {
                    }
                    int i4022 = i7;
                    if (i25 == 0) {
                    }
                    if ((2097152 & i6) == 0) {
                    }
                    if ((i6 & 4194304) == 0) {
                    }
                    textStyle3 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1263323526);
                    ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
                    m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                    if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldColors textFieldColors422 = textFieldColors2;
                    TextStyle textStyle522 = textStyle3;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    z10 = z8;
                    function216 = function215;
                    function217 = function213;
                    function218 = function29;
                    function219 = function210;
                    function220 = function211;
                    function221 = function212;
                    function222 = function214;
                    z11 = z9;
                    visualTransformation3 = visualTransformation2;
                    i34 = i30;
                    mutableInteractionSource3 = interactionSource2;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors422;
                    textStyle4 = textStyle522;
                    z12 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z13 = z7;
                    i35 = i29;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i18 = i6 & 8192;
                if (i18 == 0) {
                }
                i19 = i6 & 16384;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i6 & 32768;
                if (i21 == 0) {
                }
                i22 = i6 & 65536;
                if (i22 == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                i24 = i6 & 524288;
                if (i24 == 0) {
                }
                i25 = i6 & 1048576;
                if (i25 == 0) {
                }
                if ((i5 & 112) == 0) {
                }
                if ((i5 & 896) == 0) {
                }
                int i39222 = i26;
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i37 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i24 == 0) {
                }
                int i40222 = i7;
                if (i25 == 0) {
                }
                if ((2097152 & i6) == 0) {
                }
                if ((i6 & 4194304) == 0) {
                }
                textStyle3 = textStyle2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1263323526);
                ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
                m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextFieldColors textFieldColors4222 = textFieldColors2;
                TextStyle textStyle5222 = textStyle3;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z10 = z8;
                function216 = function215;
                function217 = function213;
                function218 = function29;
                function219 = function210;
                function220 = function211;
                function221 = function212;
                function222 = function214;
                z11 = z9;
                visualTransformation3 = visualTransformation2;
                i34 = i30;
                mutableInteractionSource3 = interactionSource2;
                shape4 = shape3;
                textFieldColors3 = textFieldColors4222;
                textStyle4 = textStyle5222;
                z12 = z5;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z13 = z7;
                i35 = i29;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i382 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i18 = i6 & 8192;
            if (i18 == 0) {
            }
            i19 = i6 & 16384;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i6 & 32768;
            if (i21 == 0) {
            }
            i22 = i6 & 65536;
            if (i22 == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            i24 = i6 & 524288;
            if (i24 == 0) {
            }
            i25 = i6 & 1048576;
            if (i25 == 0) {
            }
            if ((i5 & 112) == 0) {
            }
            if ((i5 & 896) == 0) {
            }
            int i392222 = i26;
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i37 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i24 == 0) {
            }
            int i402222 = i7;
            if (i25 == 0) {
            }
            if ((2097152 & i6) == 0) {
            }
            if ((i6 & 4194304) == 0) {
            }
            textStyle3 = textStyle2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1263323526);
            ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
            m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldColors textFieldColors42222 = textFieldColors2;
            TextStyle textStyle52222 = textStyle3;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            z10 = z8;
            function216 = function215;
            function217 = function213;
            function218 = function29;
            function219 = function210;
            function220 = function211;
            function221 = function212;
            function222 = function214;
            z11 = z9;
            visualTransformation3 = visualTransformation2;
            i34 = i30;
            mutableInteractionSource3 = interactionSource2;
            shape4 = shape3;
            textFieldColors3 = textFieldColors42222;
            textStyle4 = textStyle52222;
            z12 = z5;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z13 = z7;
            i35 = i29;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3822 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i18 = i6 & 8192;
        if (i18 == 0) {
        }
        i19 = i6 & 16384;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i6 & 32768;
        if (i21 == 0) {
        }
        i22 = i6 & 65536;
        if (i22 == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        i24 = i6 & 524288;
        if (i24 == 0) {
        }
        i25 = i6 & 1048576;
        if (i25 == 0) {
        }
        if ((i5 & 112) == 0) {
        }
        if ((i5 & 896) == 0) {
        }
        int i3922222 = i26;
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i37 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i24 == 0) {
        }
        int i4022222 = i7;
        if (i25 == 0) {
        }
        if ((2097152 & i6) == 0) {
        }
        if ((i6 & 4194304) == 0) {
        }
        textStyle3 = textStyle2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1263323526);
        ComposerKt.sourceInformation(startRestartGroup, "*337@18080L46");
        m5103getColor0d7_KjU = textStyle3.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldColors textFieldColors422222 = textFieldColors2;
        TextStyle textStyle522222 = textStyle3;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getSelectionColors(startRestartGroup, (i31 >> 6) & 14))}, ComposableLambdaKt.composableLambda(composer2, -1163788208, true, new TextFieldKt$TextField$5(modifier3, textFieldColors2, z9, i32, i31, value, onValueChange, z8, z5, textStyle3.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null)), keyboardOptions2, keyboardActions2, z7, i30, i29, visualTransformation2, interactionSource2, i33, function215, function213, function29, function210, function211, function212, function214, shape3)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        z10 = z8;
        function216 = function215;
        function217 = function213;
        function218 = function29;
        function219 = function210;
        function220 = function211;
        function221 = function212;
        function222 = function214;
        z11 = z9;
        visualTransformation3 = visualTransformation2;
        i34 = i30;
        mutableInteractionSource3 = interactionSource2;
        shape4 = shape3;
        textFieldColors3 = textFieldColors422222;
        textStyle4 = textStyle522222;
        z12 = z5;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z13 = z7;
        i35 = i29;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(String value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        boolean z6;
        int i25;
        int i26;
        int i27;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        int i28;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Shape shape3;
        Function2 function28;
        TextStyle textStyle3;
        boolean z7;
        VisualTransformation visualTransformation2;
        int i29;
        Function2 function29;
        KeyboardOptions keyboardOptions2;
        boolean z8;
        Function2 function210;
        KeyboardActions keyboardActions2;
        Function2 function211;
        Composer composer2;
        boolean z9;
        TextStyle textStyle4;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        boolean z10;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        int i30;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        TextFieldColors textFieldColors3;
        boolean z11;
        Modifier modifier3;
        boolean z12;
        int i31;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1500728277);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)395@20391L7,408@21051L39,409@21129L5,410@21184L8,412@21201L763:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i7 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i32 = i6 & 4;
        if (i32 != 0) {
            i7 |= 384;
        } else if ((i3 & 896) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i4 & 112) == 0) {
                    i15 |= startRestartGroup.changed(z3) ? 32 : 16;
                }
                int i33 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i33 |= 384;
                } else if ((i4 & 896) == 0) {
                    i33 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
                    i18 = i6 & 8192;
                    if (i18 == 0) {
                        i33 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i33 |= startRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                        i19 = i6 & 16384;
                        if (i19 != 0) {
                            i33 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i20 = i19;
                            i33 |= startRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                            i21 = i6 & 32768;
                            if (i21 == 0) {
                                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & 458752) == 0) {
                                i33 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                            }
                            if ((i4 & 3670016) == 0) {
                                i33 |= ((i6 & 65536) == 0 && startRestartGroup.changed(i)) ? 1048576 : 524288;
                            }
                            i22 = i6 & 131072;
                            if (i22 == 0) {
                                i33 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i33 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
                            }
                            i23 = i6 & 262144;
                            if (i23 == 0) {
                                i33 |= 100663296;
                            } else if ((i4 & 234881024) == 0) {
                                i33 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 1879048192) == 0) {
                                i33 |= ((i6 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                            }
                            if ((i5 & 14) != 0) {
                                i24 = i5 | (((i6 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                            } else {
                                i24 = i5;
                            }
                            if ((i7 & 1533916891) == 306783378 || (1533916891 & i33) != 306783378 || (i24 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i32 == 0 ? Modifier.Companion : modifier;
                                    boolean z13 = i8 == 0 ? true : z;
                                    z5 = i9 == 0 ? false : z2;
                                    if ((i6 & 32) == 0) {
                                        modifier2 = companion;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i7 &= -458753;
                                    } else {
                                        modifier2 = companion;
                                        textStyle2 = textStyle;
                                    }
                                    Function2 function217 = i10 == 0 ? null : function2;
                                    Function2 function218 = i11 == 0 ? null : function22;
                                    Function2 function219 = i12 == 0 ? null : function23;
                                    Function2 function220 = i13 == 0 ? null : function24;
                                    Function2 function221 = i14 == 0 ? function25 : null;
                                    boolean z14 = i16 == 0 ? false : z3;
                                    VisualTransformation none = i17 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    KeyboardOptions keyboardOptions4 = i18 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    KeyboardActions keyboardActions4 = i20 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    z6 = i21 == 0 ? false : z4;
                                    if ((i6 & 65536) == 0) {
                                        i25 = i33 & (-3670017);
                                        i26 = z6 ? 1 : Integer.MAX_VALUE;
                                    } else {
                                        i25 = i33;
                                        i26 = i;
                                    }
                                    i27 = i22 == 0 ? 1 : i2;
                                    int i34 = i7;
                                    if (i23 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function26 = function219;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        function26 = function219;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((i6 & 524288) == 0) {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        i28 = i25 & (-1879048193);
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape2 = shape;
                                        i28 = i25;
                                    }
                                    if ((i6 & 1048576) == 0) {
                                        i24 &= -15;
                                        function27 = function26;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = shape2;
                                        function28 = function220;
                                        textStyle3 = textStyle2;
                                        z7 = z14;
                                        visualTransformation2 = none;
                                        i29 = i26;
                                        function29 = function218;
                                        keyboardOptions2 = keyboardOptions4;
                                        z8 = z13;
                                        function210 = function221;
                                        keyboardActions2 = keyboardActions4;
                                        function211 = function217;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                    } else {
                                        function27 = function26;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors;
                                        shape3 = shape2;
                                        function28 = function220;
                                        textStyle3 = textStyle2;
                                        z7 = z14;
                                        visualTransformation2 = none;
                                        i29 = i26;
                                        function29 = function218;
                                        keyboardOptions2 = keyboardOptions4;
                                        z8 = z13;
                                        function210 = function221;
                                        keyboardActions2 = keyboardActions4;
                                        function211 = function217;
                                    }
                                    i33 = i28;
                                    i7 = i34;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((i6 & 65536) != 0) {
                                        i33 &= -3670017;
                                    }
                                    if ((i6 & 524288) != 0) {
                                        i33 &= -1879048193;
                                    }
                                    if ((i6 & 1048576) != 0) {
                                        i24 &= -15;
                                    }
                                    modifier2 = modifier;
                                    z8 = z;
                                    z5 = z2;
                                    textStyle3 = textStyle;
                                    function211 = function2;
                                    function29 = function22;
                                    function27 = function23;
                                    function28 = function24;
                                    function210 = function25;
                                    z7 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z4;
                                    i29 = i;
                                    i27 = i2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1500728277, i7, i33, "androidx.compose.material3.TextField (TextField.kt:389)");
                                }
                                int i35 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                                int i36 = i33 << 6;
                                int i37 = (i36 & 896) | 54 | (i36 & 7168) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192);
                                int i38 = i33 >> 24;
                                composer2 = startRestartGroup;
                                TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i35, i37, (i38 & 112) | (i38 & 14) | ((i24 << 6) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z9 = z8;
                                textStyle4 = textStyle3;
                                function212 = function211;
                                function213 = function29;
                                function214 = function27;
                                function215 = function28;
                                function216 = function210;
                                z10 = z7;
                                visualTransformation3 = visualTransformation2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                i30 = i29;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                                z11 = z5;
                                modifier3 = modifier2;
                                z12 = z6;
                                i31 = i27;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z9 = z;
                                z11 = z2;
                                textStyle4 = textStyle;
                                function212 = function2;
                                function214 = function23;
                                function215 = function24;
                                function216 = function25;
                                z10 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z12 = z4;
                                i30 = i;
                                i31 = i2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function213 = function22;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldKt$TextField$8(value, onValueChange, modifier3, z9, z11, textStyle4, function212, function213, function214, function215, function216, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z12, i30, i31, mutableInteractionSource5, shape4, textFieldColors3, i3, i4, i5, i6));
                            return;
                        }
                        i20 = i19;
                        i21 = i6 & 32768;
                        if (i21 == 0) {
                        }
                        if ((i4 & 3670016) == 0) {
                        }
                        i22 = i6 & 131072;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 262144;
                        if (i23 == 0) {
                        }
                        if ((i4 & 1879048192) == 0) {
                        }
                        if ((i5 & 14) != 0) {
                        }
                        if ((i7 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((i6 & 65536) == 0) {
                        }
                        if (i22 == 0) {
                        }
                        int i342 = i7;
                        if (i23 == 0) {
                        }
                        if ((i6 & 524288) == 0) {
                        }
                        if ((i6 & 1048576) == 0) {
                        }
                        i33 = i28;
                        i7 = i342;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i352 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                        int i362 = i33 << 6;
                        int i372 = (i362 & 896) | 54 | (i362 & 7168) | (i362 & 57344) | (i362 & 458752) | (i362 & 3670016) | (i362 & 29360128) | (i362 & 234881024) | (i362 & 1879048192);
                        int i382 = i33 >> 24;
                        composer2 = startRestartGroup;
                        TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i352, i372, (i382 & 112) | (i382 & 14) | ((i24 << 6) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z9 = z8;
                        textStyle4 = textStyle3;
                        function212 = function211;
                        function213 = function29;
                        function214 = function27;
                        function215 = function28;
                        function216 = function210;
                        z10 = z7;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        i30 = i29;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        z11 = z5;
                        modifier3 = modifier2;
                        z12 = z6;
                        i31 = i27;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i6 & 16384;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i6 & 32768;
                    if (i21 == 0) {
                    }
                    if ((i4 & 3670016) == 0) {
                    }
                    i22 = i6 & 131072;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 262144;
                    if (i23 == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    if ((i5 & 14) != 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i6 & 65536) == 0) {
                    }
                    if (i22 == 0) {
                    }
                    int i3422 = i7;
                    if (i23 == 0) {
                    }
                    if ((i6 & 524288) == 0) {
                    }
                    if ((i6 & 1048576) == 0) {
                    }
                    i33 = i28;
                    i7 = i3422;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3522 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                    int i3622 = i33 << 6;
                    int i3722 = (i3622 & 896) | 54 | (i3622 & 7168) | (i3622 & 57344) | (i3622 & 458752) | (i3622 & 3670016) | (i3622 & 29360128) | (i3622 & 234881024) | (i3622 & 1879048192);
                    int i3822 = i33 >> 24;
                    composer2 = startRestartGroup;
                    TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i3522, i3722, (i3822 & 112) | (i3822 & 14) | ((i24 << 6) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z9 = z8;
                    textStyle4 = textStyle3;
                    function212 = function211;
                    function213 = function29;
                    function214 = function27;
                    function215 = function28;
                    function216 = function210;
                    z10 = z7;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    i30 = i29;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors2;
                    z11 = z5;
                    modifier3 = modifier2;
                    z12 = z6;
                    i31 = i27;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i18 = i6 & 8192;
                if (i18 == 0) {
                }
                i19 = i6 & 16384;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i6 & 32768;
                if (i21 == 0) {
                }
                if ((i4 & 3670016) == 0) {
                }
                i22 = i6 & 131072;
                if (i22 == 0) {
                }
                i23 = i6 & 262144;
                if (i23 == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i5 & 14) != 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if (i22 == 0) {
                }
                int i34222 = i7;
                if (i23 == 0) {
                }
                if ((i6 & 524288) == 0) {
                }
                if ((i6 & 1048576) == 0) {
                }
                i33 = i28;
                i7 = i34222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i35222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                int i36222 = i33 << 6;
                int i37222 = (i36222 & 896) | 54 | (i36222 & 7168) | (i36222 & 57344) | (i36222 & 458752) | (i36222 & 3670016) | (i36222 & 29360128) | (i36222 & 234881024) | (i36222 & 1879048192);
                int i38222 = i33 >> 24;
                composer2 = startRestartGroup;
                TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i35222, i37222, (i38222 & 112) | (i38222 & 14) | ((i24 << 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z9 = z8;
                textStyle4 = textStyle3;
                function212 = function211;
                function213 = function29;
                function214 = function27;
                function215 = function28;
                function216 = function210;
                z10 = z7;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                i30 = i29;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                textFieldColors3 = textFieldColors2;
                z11 = z5;
                modifier3 = modifier2;
                z12 = z6;
                i31 = i27;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i332 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i18 = i6 & 8192;
            if (i18 == 0) {
            }
            i19 = i6 & 16384;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i6 & 32768;
            if (i21 == 0) {
            }
            if ((i4 & 3670016) == 0) {
            }
            i22 = i6 & 131072;
            if (i22 == 0) {
            }
            i23 = i6 & 262144;
            if (i23 == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i5 & 14) != 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if (i22 == 0) {
            }
            int i342222 = i7;
            if (i23 == 0) {
            }
            if ((i6 & 524288) == 0) {
            }
            if ((i6 & 1048576) == 0) {
            }
            i332 = i28;
            i7 = i342222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i352222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
            int i362222 = i332 << 6;
            int i372222 = (i362222 & 896) | 54 | (i362222 & 7168) | (i362222 & 57344) | (i362222 & 458752) | (i362222 & 3670016) | (i362222 & 29360128) | (i362222 & 234881024) | (i362222 & 1879048192);
            int i382222 = i332 >> 24;
            composer2 = startRestartGroup;
            TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i352222, i372222, (i382222 & 112) | (i382222 & 14) | ((i24 << 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z9 = z8;
            textStyle4 = textStyle3;
            function212 = function211;
            function213 = function29;
            function214 = function27;
            function215 = function28;
            function216 = function210;
            z10 = z7;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            i30 = i29;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors2;
            z11 = z5;
            modifier3 = modifier2;
            z12 = z6;
            i31 = i27;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3322 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i18 = i6 & 8192;
        if (i18 == 0) {
        }
        i19 = i6 & 16384;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i6 & 32768;
        if (i21 == 0) {
        }
        if ((i4 & 3670016) == 0) {
        }
        i22 = i6 & 131072;
        if (i22 == 0) {
        }
        i23 = i6 & 262144;
        if (i23 == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i5 & 14) != 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if (i22 == 0) {
        }
        int i3422222 = i7;
        if (i23 == 0) {
        }
        if ((i6 & 524288) == 0) {
        }
        if ((i6 & 1048576) == 0) {
        }
        i3322 = i28;
        i7 = i3422222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3522222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
        int i3622222 = i3322 << 6;
        int i3722222 = (i3622222 & 896) | 54 | (i3622222 & 7168) | (i3622222 & 57344) | (i3622222 & 458752) | (i3622222 & 3670016) | (i3622222 & 29360128) | (i3622222 & 234881024) | (i3622222 & 1879048192);
        int i3822222 = i3322 >> 24;
        composer2 = startRestartGroup;
        TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i3522222, i3722222, (i3822222 & 112) | (i3822222 & 14) | ((i24 << 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z9 = z8;
        textStyle4 = textStyle3;
        function212 = function211;
        function213 = function29;
        function214 = function27;
        function215 = function28;
        function216 = function210;
        z10 = z7;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        i30 = i29;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors2;
        z11 = z5;
        modifier3 = modifier2;
        z12 = z6;
        i31 = i27;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(TextFieldValue value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        boolean z6;
        int i25;
        int i26;
        int i27;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        int i28;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Shape shape3;
        Function2 function28;
        TextStyle textStyle3;
        boolean z7;
        VisualTransformation visualTransformation2;
        int i29;
        Function2 function29;
        KeyboardOptions keyboardOptions2;
        boolean z8;
        Function2 function210;
        KeyboardActions keyboardActions2;
        Function2 function211;
        Composer composer2;
        boolean z9;
        TextStyle textStyle4;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        boolean z10;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        int i30;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        TextFieldColors textFieldColors3;
        boolean z11;
        Modifier modifier3;
        boolean z12;
        int i31;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(1523846136);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)448@22325L7,461@22985L39,462@23063L5,463@23118L8,465@23135L763:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i7 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i32 = i6 & 4;
        if (i32 != 0) {
            i7 |= 384;
        } else if ((i3 & 896) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                    i7 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i4 & 112) == 0) {
                    i15 |= startRestartGroup.changed(z3) ? 32 : 16;
                }
                int i33 = i15;
                i17 = i6 & 4096;
                if (i17 != 0) {
                    i33 |= 384;
                } else if ((i4 & 896) == 0) {
                    i33 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
                    i18 = i6 & 8192;
                    if (i18 == 0) {
                        i33 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i33 |= startRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                        i19 = i6 & 16384;
                        if (i19 != 0) {
                            i33 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i20 = i19;
                            i33 |= startRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                            i21 = i6 & 32768;
                            if (i21 == 0) {
                                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & 458752) == 0) {
                                i33 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                            }
                            if ((i4 & 3670016) == 0) {
                                i33 |= ((i6 & 65536) == 0 && startRestartGroup.changed(i)) ? 1048576 : 524288;
                            }
                            i22 = i6 & 131072;
                            if (i22 == 0) {
                                i33 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i33 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
                            }
                            i23 = i6 & 262144;
                            if (i23 == 0) {
                                i33 |= 100663296;
                            } else if ((i4 & 234881024) == 0) {
                                i33 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 1879048192) == 0) {
                                i33 |= ((i6 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                            }
                            if ((i5 & 14) != 0) {
                                i24 = i5 | (((i6 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                            } else {
                                i24 = i5;
                            }
                            if ((i7 & 1533916891) == 306783378 || (1533916891 & i33) != 306783378 || (i24 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i32 == 0 ? Modifier.Companion : modifier;
                                    boolean z13 = i8 == 0 ? true : z;
                                    z5 = i9 == 0 ? false : z2;
                                    if ((i6 & 32) == 0) {
                                        modifier2 = companion;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i7 &= -458753;
                                    } else {
                                        modifier2 = companion;
                                        textStyle2 = textStyle;
                                    }
                                    Function2 function217 = i10 == 0 ? null : function2;
                                    Function2 function218 = i11 == 0 ? null : function22;
                                    Function2 function219 = i12 == 0 ? null : function23;
                                    Function2 function220 = i13 == 0 ? null : function24;
                                    Function2 function221 = i14 == 0 ? function25 : null;
                                    boolean z14 = i16 == 0 ? false : z3;
                                    VisualTransformation none = i17 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    KeyboardOptions keyboardOptions4 = i18 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    KeyboardActions keyboardActions4 = i20 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    z6 = i21 == 0 ? false : z4;
                                    if ((i6 & 65536) == 0) {
                                        i25 = i33 & (-3670017);
                                        i26 = z6 ? 1 : Integer.MAX_VALUE;
                                    } else {
                                        i25 = i33;
                                        i26 = i;
                                    }
                                    i27 = i22 == 0 ? 1 : i2;
                                    int i34 = i7;
                                    if (i23 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function26 = function219;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        function26 = function219;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((i6 & 524288) == 0) {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        i28 = i25 & (-1879048193);
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape2 = shape;
                                        i28 = i25;
                                    }
                                    if ((i6 & 1048576) == 0) {
                                        i24 &= -15;
                                        function27 = function26;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = shape2;
                                        function28 = function220;
                                        textStyle3 = textStyle2;
                                        z7 = z14;
                                        visualTransformation2 = none;
                                        i29 = i26;
                                        function29 = function218;
                                        keyboardOptions2 = keyboardOptions4;
                                        z8 = z13;
                                        function210 = function221;
                                        keyboardActions2 = keyboardActions4;
                                        function211 = function217;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                    } else {
                                        function27 = function26;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors;
                                        shape3 = shape2;
                                        function28 = function220;
                                        textStyle3 = textStyle2;
                                        z7 = z14;
                                        visualTransformation2 = none;
                                        i29 = i26;
                                        function29 = function218;
                                        keyboardOptions2 = keyboardOptions4;
                                        z8 = z13;
                                        function210 = function221;
                                        keyboardActions2 = keyboardActions4;
                                        function211 = function217;
                                    }
                                    i33 = i28;
                                    i7 = i34;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((i6 & 65536) != 0) {
                                        i33 &= -3670017;
                                    }
                                    if ((i6 & 524288) != 0) {
                                        i33 &= -1879048193;
                                    }
                                    if ((i6 & 1048576) != 0) {
                                        i24 &= -15;
                                    }
                                    modifier2 = modifier;
                                    z8 = z;
                                    z5 = z2;
                                    textStyle3 = textStyle;
                                    function211 = function2;
                                    function29 = function22;
                                    function27 = function23;
                                    function28 = function24;
                                    function210 = function25;
                                    z7 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z4;
                                    i29 = i;
                                    i27 = i2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1523846136, i7, i33, "androidx.compose.material3.TextField (TextField.kt:442)");
                                }
                                int i35 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                                int i36 = i33 << 6;
                                int i37 = (i36 & 896) | 54 | (i36 & 7168) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192);
                                int i38 = i33 >> 24;
                                composer2 = startRestartGroup;
                                TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i35, i37, (i38 & 112) | (i38 & 14) | ((i24 << 6) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z9 = z8;
                                textStyle4 = textStyle3;
                                function212 = function211;
                                function213 = function29;
                                function214 = function27;
                                function215 = function28;
                                function216 = function210;
                                z10 = z7;
                                visualTransformation3 = visualTransformation2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                i30 = i29;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                                z11 = z5;
                                modifier3 = modifier2;
                                z12 = z6;
                                i31 = i27;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z9 = z;
                                z11 = z2;
                                textStyle4 = textStyle;
                                function212 = function2;
                                function214 = function23;
                                function215 = function24;
                                function216 = function25;
                                z10 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z12 = z4;
                                i30 = i;
                                i31 = i2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function213 = function22;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldKt$TextField$10(value, onValueChange, modifier3, z9, z11, textStyle4, function212, function213, function214, function215, function216, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z12, i30, i31, mutableInteractionSource5, shape4, textFieldColors3, i3, i4, i5, i6));
                            return;
                        }
                        i20 = i19;
                        i21 = i6 & 32768;
                        if (i21 == 0) {
                        }
                        if ((i4 & 3670016) == 0) {
                        }
                        i22 = i6 & 131072;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 262144;
                        if (i23 == 0) {
                        }
                        if ((i4 & 1879048192) == 0) {
                        }
                        if ((i5 & 14) != 0) {
                        }
                        if ((i7 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((i6 & 65536) == 0) {
                        }
                        if (i22 == 0) {
                        }
                        int i342 = i7;
                        if (i23 == 0) {
                        }
                        if ((i6 & 524288) == 0) {
                        }
                        if ((i6 & 1048576) == 0) {
                        }
                        i33 = i28;
                        i7 = i342;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i352 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                        int i362 = i33 << 6;
                        int i372 = (i362 & 896) | 54 | (i362 & 7168) | (i362 & 57344) | (i362 & 458752) | (i362 & 3670016) | (i362 & 29360128) | (i362 & 234881024) | (i362 & 1879048192);
                        int i382 = i33 >> 24;
                        composer2 = startRestartGroup;
                        TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i352, i372, (i382 & 112) | (i382 & 14) | ((i24 << 6) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z9 = z8;
                        textStyle4 = textStyle3;
                        function212 = function211;
                        function213 = function29;
                        function214 = function27;
                        function215 = function28;
                        function216 = function210;
                        z10 = z7;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        i30 = i29;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        z11 = z5;
                        modifier3 = modifier2;
                        z12 = z6;
                        i31 = i27;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i6 & 16384;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i6 & 32768;
                    if (i21 == 0) {
                    }
                    if ((i4 & 3670016) == 0) {
                    }
                    i22 = i6 & 131072;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 262144;
                    if (i23 == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    if ((i5 & 14) != 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((i6 & 65536) == 0) {
                    }
                    if (i22 == 0) {
                    }
                    int i3422 = i7;
                    if (i23 == 0) {
                    }
                    if ((i6 & 524288) == 0) {
                    }
                    if ((i6 & 1048576) == 0) {
                    }
                    i33 = i28;
                    i7 = i3422;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3522 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                    int i3622 = i33 << 6;
                    int i3722 = (i3622 & 896) | 54 | (i3622 & 7168) | (i3622 & 57344) | (i3622 & 458752) | (i3622 & 3670016) | (i3622 & 29360128) | (i3622 & 234881024) | (i3622 & 1879048192);
                    int i3822 = i33 >> 24;
                    composer2 = startRestartGroup;
                    TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i3522, i3722, (i3822 & 112) | (i3822 & 14) | ((i24 << 6) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z9 = z8;
                    textStyle4 = textStyle3;
                    function212 = function211;
                    function213 = function29;
                    function214 = function27;
                    function215 = function28;
                    function216 = function210;
                    z10 = z7;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    i30 = i29;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors2;
                    z11 = z5;
                    modifier3 = modifier2;
                    z12 = z6;
                    i31 = i27;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i18 = i6 & 8192;
                if (i18 == 0) {
                }
                i19 = i6 & 16384;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i6 & 32768;
                if (i21 == 0) {
                }
                if ((i4 & 3670016) == 0) {
                }
                i22 = i6 & 131072;
                if (i22 == 0) {
                }
                i23 = i6 & 262144;
                if (i23 == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i5 & 14) != 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if (i22 == 0) {
                }
                int i34222 = i7;
                if (i23 == 0) {
                }
                if ((i6 & 524288) == 0) {
                }
                if ((i6 & 1048576) == 0) {
                }
                i33 = i28;
                i7 = i34222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i35222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
                int i36222 = i33 << 6;
                int i37222 = (i36222 & 896) | 54 | (i36222 & 7168) | (i36222 & 57344) | (i36222 & 458752) | (i36222 & 3670016) | (i36222 & 29360128) | (i36222 & 234881024) | (i36222 & 1879048192);
                int i38222 = i33 >> 24;
                composer2 = startRestartGroup;
                TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i35222, i37222, (i38222 & 112) | (i38222 & 14) | ((i24 << 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z9 = z8;
                textStyle4 = textStyle3;
                function212 = function211;
                function213 = function29;
                function214 = function27;
                function215 = function28;
                function216 = function210;
                z10 = z7;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                i30 = i29;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                textFieldColors3 = textFieldColors2;
                z11 = z5;
                modifier3 = modifier2;
                z12 = z6;
                i31 = i27;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i332 = i15;
            i17 = i6 & 4096;
            if (i17 != 0) {
            }
            i18 = i6 & 8192;
            if (i18 == 0) {
            }
            i19 = i6 & 16384;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i6 & 32768;
            if (i21 == 0) {
            }
            if ((i4 & 3670016) == 0) {
            }
            i22 = i6 & 131072;
            if (i22 == 0) {
            }
            i23 = i6 & 262144;
            if (i23 == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i5 & 14) != 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if (i22 == 0) {
            }
            int i342222 = i7;
            if (i23 == 0) {
            }
            if ((i6 & 524288) == 0) {
            }
            if ((i6 & 1048576) == 0) {
            }
            i332 = i28;
            i7 = i342222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i352222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
            int i362222 = i332 << 6;
            int i372222 = (i362222 & 896) | 54 | (i362222 & 7168) | (i362222 & 57344) | (i362222 & 458752) | (i362222 & 3670016) | (i362222 & 29360128) | (i362222 & 234881024) | (i362222 & 1879048192);
            int i382222 = i332 >> 24;
            composer2 = startRestartGroup;
            TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i352222, i372222, (i382222 & 112) | (i382222 & 14) | ((i24 << 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z9 = z8;
            textStyle4 = textStyle3;
            function212 = function211;
            function213 = function29;
            function214 = function27;
            function215 = function28;
            function216 = function210;
            z10 = z7;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            i30 = i29;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors2;
            z11 = z5;
            modifier3 = modifier2;
            z12 = z6;
            i31 = i27;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3322 = i15;
        i17 = i6 & 4096;
        if (i17 != 0) {
        }
        i18 = i6 & 8192;
        if (i18 == 0) {
        }
        i19 = i6 & 16384;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i6 & 32768;
        if (i21 == 0) {
        }
        if ((i4 & 3670016) == 0) {
        }
        i22 = i6 & 131072;
        if (i22 == 0) {
        }
        i23 = i6 & 262144;
        if (i23 == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i5 & 14) != 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if (i22 == 0) {
        }
        int i3422222 = i7;
        if (i23 == 0) {
        }
        if ((i6 & 524288) == 0) {
        }
        if ((i6 & 1048576) == 0) {
        }
        i3322 = i28;
        i7 = i3422222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3522222 = (i7 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
        int i3622222 = i3322 << 6;
        int i3722222 = (i3622222 & 896) | 54 | (i3622222 & 7168) | (i3622222 & 57344) | (i3622222 & 458752) | (i3622222 & 3670016) | (i3622222 & 29360128) | (i3622222 & 234881024) | (i3622222 & 1879048192);
        int i3822222 = i3322 >> 24;
        composer2 = startRestartGroup;
        TextField(value, onValueChange, modifier2, z8, z5, textStyle3, function211, function29, function27, function28, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z6, i29, i27, mutableInteractionSource4, shape3, textFieldColors2, composer2, i3522222, i3722222, (i3822222 & 112) | (i3822222 & 14) | ((i24 << 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z9 = z8;
        textStyle4 = textStyle3;
        function212 = function211;
        function213 = function29;
        function214 = function27;
        function215 = function28;
        function216 = function210;
        z10 = z7;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        i30 = i29;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors2;
        z11 = z5;
        modifier3 = modifier2;
        z12 = z6;
        i31 = i27;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> textField, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z, float f, Function2<? super Composer, ? super Integer, Unit> container, Function2<? super Composer, ? super Integer, Unit> function26, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)512@24588L139,515@24775L7,516@24787L3994:TextField.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(container) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & 1533916891) != 306783378 || (i4 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i3, i4, "androidx.compose.material3.TextFieldLayout (TextField.kt:497)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i7 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, textFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i7 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -95272033, "C522@25106L11,605@28102L229:TextField.kt#uh7d8r");
            container.invoke(startRestartGroup, Integer.valueOf(i4 & 14));
            startRestartGroup.startReplaceableGroup(-95272008);
            ComposerKt.sourceInformation(startRestartGroup, "525@25170L269");
            if (function22 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume6;
                i5 = i4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124082, "C531@25412L9:TextField.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                i5 = i4;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95271673);
            ComposerKt.sourceInformation(startRestartGroup, "535@25506L271");
            if (function23 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume8;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume9;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl3, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124419, "C541@25749L10:TextField.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            if (function22 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m5607constructorimpl(RangesKt.coerceAtLeast(Dp.m5607constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5607constructorimpl(0)));
            } else {
                i6 = 0;
            }
            if (function23 != null) {
                calculateEndPadding = Dp.m5607constructorimpl(RangesKt.coerceAtLeast(Dp.m5607constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5607constructorimpl(i6)));
            }
            startRestartGroup.startReplaceableGroup(-95270733);
            ComposerKt.sourceInformation(startRestartGroup, "560@26444L334");
            if (function24 != null) {
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m783heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume11;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection5 = (LayoutDirection) consume12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume13 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume13;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl4, layoutDirection5, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219125422, "C567@26752L8:TextField.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95270334);
            ComposerKt.sourceInformation(startRestartGroup, "571@26843L332");
            if (function25 != null) {
                Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m783heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume14 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density5 = (Density) consume14;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume15 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection6 = (LayoutDirection) consume15;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume16 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) consume16;
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(m752paddingqDBjuR0$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl5 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl5, density5, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl5, layoutDirection6, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl5, viewConfiguration5, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf5.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219125819, "C578@27149L8:TextField.kt#uh7d8r");
                function25.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95269936);
            ComposerKt.sourceInformation(startRestartGroup, "583@27240L347");
            if (function2 != null) {
                f3 = calculateStartPadding;
                Modifier m752paddingqDBjuR0$default3 = PaddingKt.m752paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m783heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Label"), DpKt.m5650lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), f3, 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume17 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density6 = (Density) consume17;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume18 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection7 = (LayoutDirection) consume18;
                f2 = calculateEndPadding;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume19 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) consume19;
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf6 = LayoutKt.materializerOf(m752paddingqDBjuR0$default3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl6 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl6, rememberBoxMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl6, density6, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl6, layoutDirection7, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl6, viewConfiguration6, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf6.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126248, "C589@27578L7:TextField.kt#uh7d8r");
                function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f2 = calculateEndPadding;
                f3 = calculateStartPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m752paddingqDBjuR0$default4 = PaddingKt.m752paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m783heightInVpY3zN4$default(Modifier.Companion, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), function24 == null ? f3 : Dp.m5607constructorimpl(0), 0.0f, function25 == null ? f2 : Dp.m5607constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-95269212);
            ComposerKt.sourceInformation(startRestartGroup, "601@27970L105");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(m752paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(m752paddingqDBjuR0$default4);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume20 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density7 = (Density) consume20;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume21 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection8 = (LayoutDirection) consume21;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) consume22;
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf7 = LayoutKt.materializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl7 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl7, rememberBoxMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl7, density7, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl7, layoutDirection8, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl7, viewConfiguration7, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf7.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126976, "C611@28306L11:TextField.kt#uh7d8r");
            textField.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(243142693);
            ComposerKt.sourceInformation(startRestartGroup, "616@28443L269");
            if (function26 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m783heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2111supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume23 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density8 = (Density) consume23;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume24 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection9 = (LayoutDirection) consume24;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume25 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) consume25;
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf8 = LayoutKt.materializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl8 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl8, rememberBoxMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl8, density8, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl8, layoutDirection9, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl8, viewConfiguration8, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf8.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219127368, "C621@28698L12:TextField.kt#uh7d8r");
                function26.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, textField, function2, function3, function22, function23, function24, function25, z, f, container, function26, paddingValues, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y  reason: not valid java name */
    public static final int m2142calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m5553getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc  reason: not valid java name */
    public static final int m2141calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, long j, float f, PaddingValues paddingValues) {
        float m5607constructorimpl;
        int max;
        boolean z2 = i2 > 0;
        if (!z2 || z) {
            m5607constructorimpl = Dp.m5607constructorimpl(paddingValues.mo700calculateTopPaddingD9Ej5fM() + paddingValues.mo697calculateBottomPaddingD9Ej5fM());
        } else {
            m5607constructorimpl = Dp.m5607constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2);
        }
        float f2 = f * m5607constructorimpl;
        if (z2 && z) {
            f2 += i2;
            max = Math.max(i, i7);
        } else {
            max = Math.max(i2, Math.max(i, i7));
        }
        return Math.max(Constraints.m5552getMinHeightimpl(j), ComparisonsKt.maxOf(i3, i4, i5, i6, MathKt.roundToInt(f2 + max)) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        Placeable.PlacementScope.m4604place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m5735getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, i4, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m4604place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m5735getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable8);
        int roundToInt = MathKt.roundToInt(paddingValues.mo700calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable6), 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(indicatorBorder.m447getWidthD9Ej5fM(), indicatorBorder));
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
