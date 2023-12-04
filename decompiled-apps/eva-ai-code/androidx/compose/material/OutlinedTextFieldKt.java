package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
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
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010.\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010/\u001aÄ\u0001\u00100\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\t0\r2\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00109\u001a\u00020:H\u0001ø\u0001\u0000¢\u0006\u0002\u0010;\u001a]\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a]\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010F\u001a)\u0010N\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010O\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a|\u0010R\u001a\u00020\t*\u00020S2\u0006\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Y\u001a\u00020W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010\\\u001a\u00020W2\u0006\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010D\u001a\u0002052\u0006\u0010]\u001a\u00020^2\u0006\u00109\u001a\u00020:H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m5607constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m5607constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(String value, Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5) {
        int i6;
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
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z6;
        int i22;
        int i23;
        int i24;
        int i25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        DefaultConstructorMarker defaultConstructorMarker;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i26;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i27;
        Shape shape2;
        TextFieldColors textFieldColors2;
        Modifier modifier2;
        boolean z7;
        int i28;
        boolean z8;
        long m5103getColor0d7_KjU;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        int i29;
        MutableInteractionSource mutableInteractionSource5;
        TextFieldColors textFieldColors3;
        Shape shape3;
        boolean z9;
        TextStyle textStyle3;
        boolean z10;
        Modifier modifier3;
        boolean z11;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z12;
        int i30;
        int i31;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-621914704);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)139@7767L7,151@8373L39,152@8447L6,153@8509L25,173@9280L24,182@9646L20,162@8837L2051:OutlinedTextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i32 = i5 & 4;
        if (i32 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i6 |= ((i5 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i33 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i33 |= 384;
                } else if ((i4 & 896) == 0) {
                    i33 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i33 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i33 |= startRestartGroup.changed(keyboardActions) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i33 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i19 = i18;
                            i33 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                            if ((i4 & 458752) == 0) {
                                i33 |= ((i5 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                            }
                            i20 = i5 & 65536;
                            if (i20 == 0) {
                                i33 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i33 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i21 = i5 & 131072;
                            if (i21 == 0) {
                                i33 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i33 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                            }
                            if ((i4 & 234881024) == 0) {
                                i33 |= ((i5 & 262144) == 0 && startRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 1879048192) == 0) {
                                i33 |= ((i5 & 524288) == 0 && startRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                            }
                            if ((i6 & 1533916891) == 306783378 || (1533916891 & i33) != 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i32 == 0 ? Modifier.Companion : modifier;
                                    boolean z13 = i7 == 0 ? true : z;
                                    z5 = i8 == 0 ? false : z2;
                                    if ((i5 & 32) == 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i6 &= -458753;
                                    } else {
                                        textStyle2 = textStyle;
                                    }
                                    function25 = i9 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i10 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function214 = i11 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i12 == 0 ? null : function24;
                                    boolean z14 = i13 == 0 ? false : z3;
                                    VisualTransformation none = i15 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    KeyboardOptions keyboardOptions4 = i16 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    KeyboardActions keyboardActions4 = i17 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    z6 = i19 == 0 ? false : z4;
                                    if ((32768 & i5) == 0) {
                                        i22 = i33 & (-458753);
                                        i23 = z6 ? 1 : Integer.MAX_VALUE;
                                    } else {
                                        i22 = i33;
                                        i23 = i;
                                    }
                                    i24 = i20 == 0 ? 1 : i2;
                                    if (i21 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        i25 = i6;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        i25 = i6;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((262144 & i5) == 0) {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                        i22 &= -234881025;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = shape;
                                    }
                                    int i34 = i22;
                                    if ((i5 & 524288) == 0) {
                                        Shape shape4 = cornerBasedShape;
                                        defaultConstructorMarker = null;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        function26 = function214;
                                        function27 = function215;
                                        visualTransformation2 = none;
                                        function28 = function213;
                                        i26 = i23;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions2 = keyboardActions4;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m1514outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                        i27 = i25;
                                        shape2 = shape4;
                                        modifier2 = companion;
                                        z7 = z13;
                                        i28 = i34 & (-1879048193);
                                    } else {
                                        Shape shape5 = cornerBasedShape;
                                        defaultConstructorMarker = null;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        function26 = function214;
                                        function27 = function215;
                                        visualTransformation2 = none;
                                        function28 = function213;
                                        i26 = i23;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions2 = keyboardActions4;
                                        i27 = i25;
                                        shape2 = shape5;
                                        textFieldColors2 = textFieldColors;
                                        modifier2 = companion;
                                        z7 = z13;
                                        i28 = i34;
                                    }
                                    z8 = z14;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 32) != 0) {
                                        i31 = -458753;
                                        i6 &= -458753;
                                    } else {
                                        i31 = -458753;
                                    }
                                    if ((32768 & i5) != 0) {
                                        i33 &= i31;
                                    }
                                    if ((262144 & i5) != 0) {
                                        i33 &= -234881025;
                                    }
                                    if ((i5 & 524288) != 0) {
                                        i33 &= -1879048193;
                                    }
                                    modifier2 = modifier;
                                    z5 = z2;
                                    textStyle2 = textStyle;
                                    function25 = function2;
                                    function28 = function22;
                                    function26 = function23;
                                    function27 = function24;
                                    z8 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z4;
                                    i26 = i;
                                    i24 = i2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    i27 = i6;
                                    i28 = i33;
                                    defaultConstructorMarker = null;
                                    z7 = z;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-621914704, i27, i28, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:133)");
                                }
                                startRestartGroup.startReplaceableGroup(1961395213);
                                ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
                                m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                                    m5103getColor0d7_KjU = textFieldColors2.textColor(z7, startRestartGroup, ((i27 >> 9) & 14) | ((i28 >> 24) & 112)).getValue().m3301unboximpl();
                                }
                                startRestartGroup.endReplaceableGroup();
                                TextStyle merge = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                int i35 = (i28 >> 24) & 112;
                                Modifier m779defaultMinSizeVpY3zN4 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i35).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                                SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i35 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
                                int i36 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
                                int i37 = i28 << 12;
                                TextFieldColors textFieldColors4 = textFieldColors2;
                                Shape shape6 = shape2;
                                composer2 = startRestartGroup;
                                boolean z15 = z8;
                                TextStyle textStyle4 = textStyle2;
                                boolean z16 = z7;
                                Modifier modifier4 = modifier2;
                                BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN4, z7, z5, merge, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor, composableLambda, composer2, i36 | (i37 & 3670016) | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function29 = function28;
                                function210 = function26;
                                function211 = function27;
                                visualTransformation3 = visualTransformation2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                i29 = i26;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                textFieldColors3 = textFieldColors4;
                                shape3 = shape6;
                                z9 = z15;
                                textStyle3 = textStyle4;
                                z10 = z16;
                                modifier3 = modifier4;
                                z11 = z5;
                                function212 = function25;
                                z12 = z6;
                                i30 = i24;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z10 = z;
                                z11 = z2;
                                textStyle3 = textStyle;
                                function29 = function22;
                                function210 = function23;
                                function211 = function24;
                                z9 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z12 = z4;
                                i29 = i;
                                i30 = i2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                shape3 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function212 = function2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextField$4(value, onValueChange, modifier3, z10, z11, textStyle3, function212, function29, function210, function211, z9, visualTransformation3, keyboardOptions3, keyboardActions3, z12, i29, i30, mutableInteractionSource5, shape3, textFieldColors3, i3, i4, i5));
                            return;
                        }
                        i19 = i18;
                        if ((i4 & 458752) == 0) {
                        }
                        i20 = i5 & 65536;
                        if (i20 == 0) {
                        }
                        i21 = i5 & 131072;
                        if (i21 == 0) {
                        }
                        if ((i4 & 234881024) == 0) {
                        }
                        if ((i4 & 1879048192) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i5 & 32) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((32768 & i5) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if ((262144 & i5) == 0) {
                        }
                        int i342 = i22;
                        if ((i5 & 524288) == 0) {
                        }
                        z8 = z14;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(1961395213);
                        ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
                        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge2 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        int i352 = (i28 >> 24) & 112;
                        Modifier m779defaultMinSizeVpY3zN42 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i352).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                        SolidColor solidColor2 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i352 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
                        int i362 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
                        int i372 = i28 << 12;
                        TextFieldColors textFieldColors42 = textFieldColors2;
                        Shape shape62 = shape2;
                        composer2 = startRestartGroup;
                        boolean z152 = z8;
                        TextStyle textStyle42 = textStyle2;
                        boolean z162 = z7;
                        Modifier modifier42 = modifier2;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN42, z7, z5, merge2, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor2, composableLambda2, composer2, i362 | (i372 & 3670016) | (29360128 & i372) | (234881024 & i372) | (i372 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function29 = function28;
                        function210 = function26;
                        function211 = function27;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        i29 = i26;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        textFieldColors3 = textFieldColors42;
                        shape3 = shape62;
                        z9 = z152;
                        textStyle3 = textStyle42;
                        z10 = z162;
                        modifier3 = modifier42;
                        z11 = z5;
                        function212 = function25;
                        z12 = z6;
                        i30 = i24;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i4 & 458752) == 0) {
                    }
                    i20 = i5 & 65536;
                    if (i20 == 0) {
                    }
                    i21 = i5 & 131072;
                    if (i21 == 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i5 & 32) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((32768 & i5) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if ((262144 & i5) == 0) {
                    }
                    int i3422 = i22;
                    if ((i5 & 524288) == 0) {
                    }
                    z8 = z14;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(1961395213);
                    ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
                    m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                    if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge22 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    int i3522 = (i28 >> 24) & 112;
                    Modifier m779defaultMinSizeVpY3zN422 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i3522).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                    SolidColor solidColor22 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i3522 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                    ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
                    int i3622 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
                    int i3722 = i28 << 12;
                    TextFieldColors textFieldColors422 = textFieldColors2;
                    Shape shape622 = shape2;
                    composer2 = startRestartGroup;
                    boolean z1522 = z8;
                    TextStyle textStyle422 = textStyle2;
                    boolean z1622 = z7;
                    Modifier modifier422 = modifier2;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN422, z7, z5, merge22, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor22, composableLambda22, composer2, i3622 | (i3722 & 3670016) | (29360128 & i3722) | (234881024 & i3722) | (i3722 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function29 = function28;
                    function210 = function26;
                    function211 = function27;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    i29 = i26;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    textFieldColors3 = textFieldColors422;
                    shape3 = shape622;
                    z9 = z1522;
                    textStyle3 = textStyle422;
                    z10 = z1622;
                    modifier3 = modifier422;
                    z11 = z5;
                    function212 = function25;
                    z12 = z6;
                    i30 = i24;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i4 & 458752) == 0) {
                }
                i20 = i5 & 65536;
                if (i20 == 0) {
                }
                i21 = i5 & 131072;
                if (i21 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i5 & 32) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if ((32768 & i5) == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                int i34222 = i22;
                if ((i5 & 524288) == 0) {
                }
                z8 = z14;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1961395213);
                ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
                m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                int i35222 = (i28 >> 24) & 112;
                Modifier m779defaultMinSizeVpY3zN4222 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i35222).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                SolidColor solidColor222 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i35222 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
                int i36222 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
                int i37222 = i28 << 12;
                TextFieldColors textFieldColors4222 = textFieldColors2;
                Shape shape6222 = shape2;
                composer2 = startRestartGroup;
                boolean z15222 = z8;
                TextStyle textStyle4222 = textStyle2;
                boolean z16222 = z7;
                Modifier modifier4222 = modifier2;
                BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN4222, z7, z5, merge222, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor222, composableLambda222, composer2, i36222 | (i37222 & 3670016) | (29360128 & i37222) | (234881024 & i37222) | (i37222 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
                if (ComposerKt.isTraceInProgress()) {
                }
                function29 = function28;
                function210 = function26;
                function211 = function27;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                i29 = i26;
                mutableInteractionSource5 = mutableInteractionSource4;
                textFieldColors3 = textFieldColors4222;
                shape3 = shape6222;
                z9 = z15222;
                textStyle3 = textStyle4222;
                z10 = z16222;
                modifier3 = modifier4222;
                z11 = z5;
                function212 = function25;
                z12 = z6;
                i30 = i24;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i332 = i14;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i4 & 458752) == 0) {
            }
            i20 = i5 & 65536;
            if (i20 == 0) {
            }
            i21 = i5 & 131072;
            if (i21 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i5 & 32) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if ((32768 & i5) == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            int i342222 = i22;
            if ((i5 & 524288) == 0) {
            }
            z8 = z14;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1961395213);
            ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
            m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            int i352222 = (i28 >> 24) & 112;
            Modifier m779defaultMinSizeVpY3zN42222 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i352222).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
            SolidColor solidColor2222 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i352222 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
            ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
            int i362222 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
            int i372222 = i28 << 12;
            TextFieldColors textFieldColors42222 = textFieldColors2;
            Shape shape62222 = shape2;
            composer2 = startRestartGroup;
            boolean z152222 = z8;
            TextStyle textStyle42222 = textStyle2;
            boolean z162222 = z7;
            Modifier modifier42222 = modifier2;
            BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN42222, z7, z5, merge2222, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor2222, composableLambda2222, composer2, i362222 | (i372222 & 3670016) | (29360128 & i372222) | (234881024 & i372222) | (i372222 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
            if (ComposerKt.isTraceInProgress()) {
            }
            function29 = function28;
            function210 = function26;
            function211 = function27;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            i29 = i26;
            mutableInteractionSource5 = mutableInteractionSource4;
            textFieldColors3 = textFieldColors42222;
            shape3 = shape62222;
            z9 = z152222;
            textStyle3 = textStyle42222;
            z10 = z162222;
            modifier3 = modifier42222;
            z11 = z5;
            function212 = function25;
            z12 = z6;
            i30 = i24;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3322 = i14;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i4 & 458752) == 0) {
        }
        i20 = i5 & 65536;
        if (i20 == 0) {
        }
        i21 = i5 & 131072;
        if (i21 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if ((32768 & i5) == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        int i3422222 = i22;
        if ((i5 & 524288) == 0) {
        }
        z8 = z14;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1961395213);
        ComposerKt.sourceInformation(startRestartGroup, "*157@8686L18");
        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        int i3522222 = (i28 >> 24) & 112;
        Modifier m779defaultMinSizeVpY3zN422222 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$2.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i27 >> 9) & 14) | i3522222).getValue().m3301unboximpl(), shape2), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
        SolidColor solidColor22222 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i3522222 | (i28 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
        ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1710364390, true, new OutlinedTextFieldKt$OutlinedTextField$3(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i27, i28, shape2));
        int i3622222 = (i27 & 14) | (i27 & 112) | (i27 & 7168) | (i27 & 57344);
        int i3722222 = i28 << 12;
        TextFieldColors textFieldColors422222 = textFieldColors2;
        Shape shape622222 = shape2;
        composer2 = startRestartGroup;
        boolean z1522222 = z8;
        TextStyle textStyle422222 = textStyle2;
        boolean z1622222 = z7;
        Modifier modifier422222 = modifier2;
        BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN422222, z7, z5, merge22222, keyboardOptions2, keyboardActions2, z6, i26, i24, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor22222, composableLambda22222, composer2, i3622222 | (i3722222 & 3670016) | (29360128 & i3722222) | (234881024 & i3722222) | (i3722222 & 1879048192), ((i28 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i28 & 112) | ((i28 >> 12) & 7168), 4096);
        if (ComposerKt.isTraceInProgress()) {
        }
        function29 = function28;
        function210 = function26;
        function211 = function27;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        i29 = i26;
        mutableInteractionSource5 = mutableInteractionSource4;
        textFieldColors3 = textFieldColors422222;
        shape3 = shape622222;
        z9 = z1522222;
        textStyle3 = textStyle422222;
        z10 = z1622222;
        modifier3 = modifier422222;
        z11 = z5;
        function212 = function25;
        z12 = z6;
        i30 = i24;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(String value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        int i21;
        Function2 function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        Modifier modifier3;
        boolean z6;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Shape shape2;
        boolean z7;
        TextStyle textStyle3;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        Function2 function27;
        KeyboardActions keyboardActions2;
        Function2 function28;
        boolean z8;
        boolean z9;
        Function2 function29;
        Composer composer2;
        Modifier modifier4;
        boolean z10;
        boolean z11;
        TextStyle textStyle4;
        Function2 function210;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z12;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape3;
        TextFieldColors textFieldColors3;
        int i22;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-2099955827);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)229@11249L7,240@11809L39,241@11883L6,242@11945L25,244@11979L416:OutlinedTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i24 = i13;
                i15 = i4 & 4096;
                if (i15 != 0) {
                    i24 |= 384;
                } else if ((i3 & 896) == 0) {
                    i24 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                    i16 = i4 & 8192;
                    if (i16 == 0) {
                        i24 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i3 & 7168) == 0) {
                        i24 |= startRestartGroup.changed(keyboardActions) ? 2048 : 1024;
                        i17 = i4 & 16384;
                        if (i17 != 0) {
                            i24 |= 24576;
                        } else if ((i3 & 57344) == 0) {
                            i18 = i17;
                            i24 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                            i19 = i4 & 32768;
                            if (i19 == 0) {
                                i24 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i3 & 458752) == 0) {
                                i24 |= startRestartGroup.changed(i) ? 131072 : 65536;
                            }
                            i20 = i4 & 65536;
                            if (i20 == 0) {
                                i24 |= 1572864;
                            } else if ((i3 & 3670016) == 0) {
                                i24 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if ((i3 & 29360128) == 0) {
                                i24 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                            }
                            if ((i3 & 234881024) == 0) {
                                i24 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i5 & 1533916891) == 306783378 || (191739611 & i24) != 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i23 == 0 ? Modifier.Companion : modifier;
                                    boolean z14 = i6 == 0 ? true : z;
                                    boolean z15 = i7 == 0 ? false : z2;
                                    if ((i4 & 32) == 0) {
                                        modifier2 = companion;
                                        z5 = z14;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i5 &= -458753;
                                    } else {
                                        modifier2 = companion;
                                        z5 = z14;
                                        textStyle2 = textStyle;
                                    }
                                    Function2 function214 = i8 == 0 ? null : function2;
                                    Function2 function215 = i9 == 0 ? null : function22;
                                    Function2 function216 = i10 == 0 ? null : function23;
                                    Function2 function217 = i11 == 0 ? function24 : null;
                                    boolean z16 = i12 == 0 ? false : z3;
                                    VisualTransformation none = i14 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                    KeyboardOptions keyboardOptions4 = i15 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                                    KeyboardActions keyboardActions4 = i16 == 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                    boolean z17 = i18 == 0 ? false : z4;
                                    i21 = i19 == 0 ? Integer.MAX_VALUE : i;
                                    int i25 = i5;
                                    if (i20 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function25 = function216;
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        function25 = function216;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((i4 & 131072) == 0) {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                        i24 &= -29360129;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = shape;
                                    }
                                    if ((262144 & i4) == 0) {
                                        i24 &= -234881025;
                                        modifier3 = modifier2;
                                        z6 = z5;
                                        function26 = function25;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape2 = cornerBasedShape;
                                        textFieldColors2 = TextFieldDefaults.INSTANCE.m1514outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                    } else {
                                        modifier3 = modifier2;
                                        z6 = z5;
                                        function26 = function25;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors;
                                        shape2 = cornerBasedShape;
                                    }
                                    z7 = z16;
                                    textStyle3 = textStyle2;
                                    visualTransformation2 = none;
                                    keyboardOptions2 = keyboardOptions4;
                                    function27 = function215;
                                    keyboardActions2 = keyboardActions4;
                                    function28 = function217;
                                    z8 = z15;
                                    z9 = z17;
                                    function29 = function214;
                                    i5 = i25;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    if ((i4 & 131072) != 0) {
                                        i24 &= -29360129;
                                    }
                                    if ((262144 & i4) != 0) {
                                        i24 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    z6 = z;
                                    z8 = z2;
                                    textStyle3 = textStyle;
                                    function29 = function2;
                                    function27 = function22;
                                    function26 = function23;
                                    function28 = function24;
                                    z7 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    z9 = z4;
                                    i21 = i;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2099955827, i5, i24, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:223)");
                                }
                                int i26 = i24 << 3;
                                composer2 = startRestartGroup;
                                OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                z10 = z6;
                                z11 = z8;
                                textStyle4 = textStyle3;
                                function210 = function29;
                                function211 = function27;
                                function212 = function26;
                                function213 = function28;
                                z12 = z7;
                                visualTransformation3 = visualTransformation2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z13 = z9;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape3 = shape2;
                                textFieldColors3 = textFieldColors2;
                                i22 = i21;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                z10 = z;
                                z11 = z2;
                                textStyle4 = textStyle;
                                function210 = function2;
                                function211 = function22;
                                function212 = function23;
                                z12 = z3;
                                visualTransformation3 = visualTransformation;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                z13 = z4;
                                i22 = i;
                                mutableInteractionSource5 = mutableInteractionSource;
                                shape3 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = startRestartGroup;
                                function213 = function24;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextField$6(value, onValueChange, modifier4, z10, z11, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions3, keyboardActions3, z13, i22, mutableInteractionSource5, shape3, textFieldColors3, i2, i3, i4));
                            return;
                        }
                        i18 = i17;
                        i19 = i4 & 32768;
                        if (i19 == 0) {
                        }
                        i20 = i4 & 65536;
                        if (i20 == 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i4 & 32) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        int i252 = i5;
                        if (i20 == 0) {
                        }
                        if ((i4 & 131072) == 0) {
                        }
                        if ((262144 & i4) == 0) {
                        }
                        z7 = z16;
                        textStyle3 = textStyle2;
                        visualTransformation2 = none;
                        keyboardOptions2 = keyboardOptions4;
                        function27 = function215;
                        keyboardActions2 = keyboardActions4;
                        function28 = function217;
                        z8 = z15;
                        z9 = z17;
                        function29 = function214;
                        i5 = i252;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i262 = i24 << 3;
                        composer2 = startRestartGroup;
                        OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i262 & 29360128) | (i262 & 234881024) | (i262 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        z10 = z6;
                        z11 = z8;
                        textStyle4 = textStyle3;
                        function210 = function29;
                        function211 = function27;
                        function212 = function26;
                        function213 = function28;
                        z12 = z7;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z13 = z9;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape3 = shape2;
                        textFieldColors3 = textFieldColors2;
                        i22 = i21;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i4 & 16384;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    i19 = i4 & 32768;
                    if (i19 == 0) {
                    }
                    i20 = i4 & 65536;
                    if (i20 == 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i4 & 32) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    int i2522 = i5;
                    if (i20 == 0) {
                    }
                    if ((i4 & 131072) == 0) {
                    }
                    if ((262144 & i4) == 0) {
                    }
                    z7 = z16;
                    textStyle3 = textStyle2;
                    visualTransformation2 = none;
                    keyboardOptions2 = keyboardOptions4;
                    function27 = function215;
                    keyboardActions2 = keyboardActions4;
                    function28 = function217;
                    z8 = z15;
                    z9 = z17;
                    function29 = function214;
                    i5 = i2522;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i2622 = i24 << 3;
                    composer2 = startRestartGroup;
                    OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i2622 & 29360128) | (i2622 & 234881024) | (i2622 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    z10 = z6;
                    z11 = z8;
                    textStyle4 = textStyle3;
                    function210 = function29;
                    function211 = function27;
                    function212 = function26;
                    function213 = function28;
                    z12 = z7;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z13 = z9;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    textFieldColors3 = textFieldColors2;
                    i22 = i21;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i16 = i4 & 8192;
                if (i16 == 0) {
                }
                i17 = i4 & 16384;
                if (i17 != 0) {
                }
                i18 = i17;
                i19 = i4 & 32768;
                if (i19 == 0) {
                }
                i20 = i4 & 65536;
                if (i20 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i23 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                int i25222 = i5;
                if (i20 == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                if ((262144 & i4) == 0) {
                }
                z7 = z16;
                textStyle3 = textStyle2;
                visualTransformation2 = none;
                keyboardOptions2 = keyboardOptions4;
                function27 = function215;
                keyboardActions2 = keyboardActions4;
                function28 = function217;
                z8 = z15;
                z9 = z17;
                function29 = function214;
                i5 = i25222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i26222 = i24 << 3;
                composer2 = startRestartGroup;
                OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i24 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i26222 & 29360128) | (i26222 & 234881024) | (i26222 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z10 = z6;
                z11 = z8;
                textStyle4 = textStyle3;
                function210 = function29;
                function211 = function27;
                function212 = function26;
                function213 = function28;
                z12 = z7;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z13 = z9;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                textFieldColors3 = textFieldColors2;
                i22 = i21;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            int i242 = i13;
            i15 = i4 & 4096;
            if (i15 != 0) {
            }
            i16 = i4 & 8192;
            if (i16 == 0) {
            }
            i17 = i4 & 16384;
            if (i17 != 0) {
            }
            i18 = i17;
            i19 = i4 & 32768;
            if (i19 == 0) {
            }
            i20 = i4 & 65536;
            if (i20 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i23 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            int i252222 = i5;
            if (i20 == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            if ((262144 & i4) == 0) {
            }
            z7 = z16;
            textStyle3 = textStyle2;
            visualTransformation2 = none;
            keyboardOptions2 = keyboardOptions4;
            function27 = function215;
            keyboardActions2 = keyboardActions4;
            function28 = function217;
            z8 = z15;
            z9 = z17;
            function29 = function214;
            i5 = i252222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i262222 = i242 << 3;
            composer2 = startRestartGroup;
            OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i242 & 14) | (i242 & 112) | (i242 & 896) | (i242 & 7168) | (i242 & 57344) | (i242 & 458752) | (i262222 & 29360128) | (i262222 & 234881024) | (i262222 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            z10 = z6;
            z11 = z8;
            textStyle4 = textStyle3;
            function210 = function29;
            function211 = function27;
            function212 = function26;
            function213 = function28;
            z12 = z7;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z13 = z9;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape3 = shape2;
            textFieldColors3 = textFieldColors2;
            i22 = i21;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        int i2422 = i13;
        i15 = i4 & 4096;
        if (i15 != 0) {
        }
        i16 = i4 & 8192;
        if (i16 == 0) {
        }
        i17 = i4 & 16384;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i4 & 32768;
        if (i19 == 0) {
        }
        i20 = i4 & 65536;
        if (i20 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i23 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        int i2522222 = i5;
        if (i20 == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        if ((262144 & i4) == 0) {
        }
        z7 = z16;
        textStyle3 = textStyle2;
        visualTransformation2 = none;
        keyboardOptions2 = keyboardOptions4;
        function27 = function215;
        keyboardActions2 = keyboardActions4;
        function28 = function217;
        z8 = z15;
        z9 = z17;
        function29 = function214;
        i5 = i2522222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i2622222 = i2422 << 3;
        composer2 = startRestartGroup;
        OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z9, i21, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2422 & 14) | (i2422 & 112) | (i2422 & 896) | (i2422 & 7168) | (i2422 & 57344) | (i2422 & 458752) | (i2622222 & 29360128) | (i2622222 & 234881024) | (i2622222 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        z10 = z6;
        z11 = z8;
        textStyle4 = textStyle3;
        function210 = function29;
        function211 = function27;
        function212 = function26;
        function213 = function28;
        z12 = z7;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z13 = z9;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape3 = shape2;
        textFieldColors3 = textFieldColors2;
        i22 = i21;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b8, code lost:
        if (r7.changed(r85) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(TextFieldValue value, Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5) {
        int i6;
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
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i20;
        KeyboardActions keyboardActions2;
        int i21;
        int i22;
        int i23;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        DefaultConstructorMarker defaultConstructorMarker;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        KeyboardActions keyboardActions3;
        KeyboardOptions keyboardOptions2;
        boolean z6;
        int i24;
        Shape shape3;
        TextFieldColors textFieldColors2;
        Modifier modifier2;
        boolean z7;
        int i25;
        boolean z8;
        long m5103getColor0d7_KjU;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        boolean z9;
        MutableInteractionSource mutableInteractionSource5;
        TextFieldColors textFieldColors3;
        Shape shape4;
        boolean z10;
        TextStyle textStyle3;
        boolean z11;
        Modifier modifier3;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i26;
        int i27;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(237745923);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)340@17319L7,352@17919L39,353@17997L22,354@18069L25,374@18840L24,383@19206L20,363@18397L2056:OutlinedTextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            int i29 = 2048;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 458752) == 0) {
                    i6 |= ((i5 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i13 = i5 & 1024;
                if (i13 != 0) {
                    i14 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i14 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i14 = i4;
                }
                i15 = i5 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i4 & 112) == 0) {
                    i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i30 = i14;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i30 |= 384;
                } else if ((i4 & 896) == 0) {
                    i30 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                    if ((i4 & 7168) == 0) {
                        if ((i5 & 8192) != 0) {
                        }
                        i29 = 1024;
                        i30 |= i29;
                    }
                    i17 = i5 & 16384;
                    if (i17 == 0) {
                        i30 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i30 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    if ((i4 & 458752) == 0) {
                        i30 |= ((i5 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                    }
                    i18 = i5 & 65536;
                    if (i18 == 0) {
                        i30 |= 1572864;
                    } else if ((i4 & 3670016) == 0) {
                        i30 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                    }
                    i19 = i5 & 131072;
                    if (i19 == 0) {
                        i30 |= 12582912;
                    } else if ((i4 & 29360128) == 0) {
                        i30 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i4 & 234881024) == 0) {
                        i30 |= ((i5 & 262144) == 0 && startRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 1879048192) == 0) {
                        i30 |= ((i5 & 524288) == 0 && startRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                    }
                    if ((i6 & 1533916891) == 306783378 || (1533916891 & i30) != 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i28 == 0 ? Modifier.Companion : modifier;
                            boolean z13 = i7 == 0 ? true : z;
                            z5 = i8 == 0 ? false : z2;
                            if ((i5 & 32) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textStyle2 = (TextStyle) consume;
                                i6 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                            function25 = i9 == 0 ? null : function2;
                            Function2<? super Composer, ? super Integer, Unit> function213 = i10 == 0 ? null : function22;
                            Function2<? super Composer, ? super Integer, Unit> function214 = i11 == 0 ? null : function23;
                            Function2<? super Composer, ? super Integer, Unit> function215 = i12 == 0 ? null : function24;
                            boolean z14 = i13 == 0 ? false : z3;
                            VisualTransformation none = i15 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            KeyboardOptions keyboardOptions4 = i16 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                            if ((i5 & 8192) == 0) {
                                i20 = i30 & (-7169);
                                keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            } else {
                                i20 = i30;
                                keyboardActions2 = keyboardActions;
                            }
                            boolean z15 = i17 == 0 ? false : z4;
                            if ((32768 & i5) == 0) {
                                i20 &= -458753;
                                i21 = z15 ? 1 : Integer.MAX_VALUE;
                            } else {
                                i21 = i;
                            }
                            i22 = i18 == 0 ? 1 : i2;
                            if (i19 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                i23 = i6;
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                i23 = i6;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((262144 & i5) == 0) {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                i20 &= -234881025;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = shape;
                            }
                            int i31 = i20;
                            if ((i5 & 524288) == 0) {
                                Shape shape5 = shape2;
                                defaultConstructorMarker = null;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1514outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                i24 = i23;
                                shape3 = shape5;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31 & (-1879048193);
                            } else {
                                Shape shape6 = shape2;
                                defaultConstructorMarker = null;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                i24 = i23;
                                shape3 = shape6;
                                textFieldColors2 = textFieldColors;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31;
                            }
                            z8 = z14;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i5 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i5 & 8192) != 0) {
                                i30 &= -7169;
                            }
                            if ((32768 & i5) != 0) {
                                i30 &= -458753;
                            }
                            if ((262144 & i5) != 0) {
                                i30 &= -234881025;
                            }
                            if ((i5 & 524288) != 0) {
                                i30 &= -1879048193;
                            }
                            modifier2 = modifier;
                            z5 = z2;
                            textStyle2 = textStyle;
                            function25 = function2;
                            function28 = function22;
                            function26 = function23;
                            function27 = function24;
                            z8 = z3;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z6 = z4;
                            i21 = i;
                            i22 = i2;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            i24 = i6;
                            i25 = i30;
                            defaultConstructorMarker = null;
                            z7 = z;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(237745923, i24, i25, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:334)");
                        }
                        startRestartGroup.startReplaceableGroup(1961404773);
                        ComposerKt.sourceInformation(startRestartGroup, "*358@18246L18");
                        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                            m5103getColor0d7_KjU = textFieldColors2.textColor(z7, startRestartGroup, ((i24 >> 9) & 14) | ((i25 >> 24) & 112)).getValue().m3301unboximpl();
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        int i32 = (i25 >> 24) & 112;
                        Modifier m779defaultMinSizeVpY3zN4 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$8.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32).getValue().m3301unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                        SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i32 | (i25 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1001528775, true, new OutlinedTextFieldKt$OutlinedTextField$9(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i24, i25, shape3));
                        int i33 = (i24 & 14) | (i24 & 112) | (i24 & 7168) | (i24 & 57344);
                        int i34 = i25 << 12;
                        TextFieldColors textFieldColors4 = textFieldColors2;
                        Shape shape7 = shape3;
                        composer2 = startRestartGroup;
                        boolean z16 = z8;
                        TextStyle textStyle4 = textStyle2;
                        boolean z17 = z7;
                        Modifier modifier4 = modifier2;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN4, z7, z5, merge, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor, composableLambda, composer2, i33 | (i34 & 3670016) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function29 = function28;
                        function210 = function26;
                        function211 = function27;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions4 = keyboardActions3;
                        z9 = z6;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        textFieldColors3 = textFieldColors4;
                        shape4 = shape7;
                        z10 = z16;
                        textStyle3 = textStyle4;
                        z11 = z17;
                        modifier3 = modifier4;
                        z12 = z5;
                        function212 = function25;
                        i26 = i21;
                        i27 = i22;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z11 = z;
                        z12 = z2;
                        textStyle3 = textStyle;
                        function29 = function22;
                        function210 = function23;
                        function211 = function24;
                        z10 = z3;
                        visualTransformation3 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions4 = keyboardActions;
                        z9 = z4;
                        i26 = i;
                        i27 = i2;
                        mutableInteractionSource5 = mutableInteractionSource;
                        shape4 = shape;
                        textFieldColors3 = textFieldColors;
                        composer2 = startRestartGroup;
                        function212 = function2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextField$10(value, onValueChange, modifier3, z11, z12, textStyle3, function212, function29, function210, function211, z10, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i26, i27, mutableInteractionSource5, shape4, textFieldColors3, i3, i4, i5));
                    return;
                }
                if ((i4 & 7168) == 0) {
                }
                i17 = i5 & 16384;
                if (i17 == 0) {
                }
                if ((i4 & 458752) == 0) {
                }
                i18 = i5 & 65536;
                if (i18 == 0) {
                }
                i19 = i5 & 131072;
                if (i19 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i28 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i5 & 32) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if ((i5 & 8192) == 0) {
                }
                if (i17 == 0) {
                }
                if ((32768 & i5) == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                int i312 = i20;
                if ((i5 & 524288) == 0) {
                }
                z8 = z14;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1961404773);
                ComposerKt.sourceInformation(startRestartGroup, "*358@18246L18");
                m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge2 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                int i322 = (i25 >> 24) & 112;
                Modifier m779defaultMinSizeVpY3zN42 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$8.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i322).getValue().m3301unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
                SolidColor solidColor2 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i322 | (i25 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -1001528775, true, new OutlinedTextFieldKt$OutlinedTextField$9(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i24, i25, shape3));
                int i332 = (i24 & 14) | (i24 & 112) | (i24 & 7168) | (i24 & 57344);
                int i342 = i25 << 12;
                TextFieldColors textFieldColors42 = textFieldColors2;
                Shape shape72 = shape3;
                composer2 = startRestartGroup;
                boolean z162 = z8;
                TextStyle textStyle42 = textStyle2;
                boolean z172 = z7;
                Modifier modifier42 = modifier2;
                BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN42, z7, z5, merge2, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor2, composableLambda2, composer2, i332 | (i342 & 3670016) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
                if (ComposerKt.isTraceInProgress()) {
                }
                function29 = function28;
                function210 = function26;
                function211 = function27;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions4 = keyboardActions3;
                z9 = z6;
                mutableInteractionSource5 = mutableInteractionSource4;
                textFieldColors3 = textFieldColors42;
                shape4 = shape72;
                z10 = z162;
                textStyle3 = textStyle42;
                z11 = z172;
                modifier3 = modifier42;
                z12 = z5;
                function212 = function25;
                i26 = i21;
                i27 = i22;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i15 = i5 & 2048;
            if (i15 != 0) {
            }
            int i302 = i14;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            if ((i4 & 7168) == 0) {
            }
            i17 = i5 & 16384;
            if (i17 == 0) {
            }
            if ((i4 & 458752) == 0) {
            }
            i18 = i5 & 65536;
            if (i18 == 0) {
            }
            i19 = i5 & 131072;
            if (i19 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i28 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i5 & 32) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if ((i5 & 8192) == 0) {
            }
            if (i17 == 0) {
            }
            if ((32768 & i5) == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            int i3122 = i20;
            if ((i5 & 524288) == 0) {
            }
            z8 = z14;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1961404773);
            ComposerKt.sourceInformation(startRestartGroup, "*358@18246L18");
            m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge22 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            int i3222 = (i25 >> 24) & 112;
            Modifier m779defaultMinSizeVpY3zN422 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$8.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i3222).getValue().m3301unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
            SolidColor solidColor22 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i3222 | (i25 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -1001528775, true, new OutlinedTextFieldKt$OutlinedTextField$9(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i24, i25, shape3));
            int i3322 = (i24 & 14) | (i24 & 112) | (i24 & 7168) | (i24 & 57344);
            int i3422 = i25 << 12;
            TextFieldColors textFieldColors422 = textFieldColors2;
            Shape shape722 = shape3;
            composer2 = startRestartGroup;
            boolean z1622 = z8;
            TextStyle textStyle422 = textStyle2;
            boolean z1722 = z7;
            Modifier modifier422 = modifier2;
            BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN422, z7, z5, merge22, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor22, composableLambda22, composer2, i3322 | (i3422 & 3670016) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
            if (ComposerKt.isTraceInProgress()) {
            }
            function29 = function28;
            function210 = function26;
            function211 = function27;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions4 = keyboardActions3;
            z9 = z6;
            mutableInteractionSource5 = mutableInteractionSource4;
            textFieldColors3 = textFieldColors422;
            shape4 = shape722;
            z10 = z1622;
            textStyle3 = textStyle422;
            z11 = z1722;
            modifier3 = modifier422;
            z12 = z5;
            function212 = function25;
            i26 = i21;
            i27 = i22;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        int i292 = 2048;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i15 = i5 & 2048;
        if (i15 != 0) {
        }
        int i3022 = i14;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        if ((i4 & 7168) == 0) {
        }
        i17 = i5 & 16384;
        if (i17 == 0) {
        }
        if ((i4 & 458752) == 0) {
        }
        i18 = i5 & 65536;
        if (i18 == 0) {
        }
        i19 = i5 & 131072;
        if (i19 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i28 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if ((i5 & 8192) == 0) {
        }
        if (i17 == 0) {
        }
        if ((32768 & i5) == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        int i31222 = i20;
        if ((i5 & 524288) == 0) {
        }
        z8 = z14;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1961404773);
        ComposerKt.sourceInformation(startRestartGroup, "*358@18246L18");
        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        int i32222 = (i25 >> 24) & 112;
        Modifier m779defaultMinSizeVpY3zN4222 = SizeKt.m779defaultMinSizeVpY3zN4(BackgroundKt.m420backgroundbw27NRU(function25 == null ? PaddingKt.m752paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, OutlinedTextFieldKt$OutlinedTextField$8.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32222).getValue().m3301unboximpl(), shape3), TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM());
        SolidColor solidColor222 = new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, i32222 | (i25 & 14)).getValue().m3301unboximpl(), defaultConstructorMarker);
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1001528775, true, new OutlinedTextFieldKt$OutlinedTextField$9(value, z7, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i24, i25, shape3));
        int i33222 = (i24 & 14) | (i24 & 112) | (i24 & 7168) | (i24 & 57344);
        int i34222 = i25 << 12;
        TextFieldColors textFieldColors4222 = textFieldColors2;
        Shape shape7222 = shape3;
        composer2 = startRestartGroup;
        boolean z16222 = z8;
        TextStyle textStyle4222 = textStyle2;
        boolean z17222 = z7;
        Modifier modifier4222 = modifier2;
        BasicTextFieldKt.BasicTextField(value, onValueChange, m779defaultMinSizeVpY3zN4222, z7, z5, merge222, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, solidColor222, composableLambda222, composer2, i33222 | (i34222 & 3670016) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
        if (ComposerKt.isTraceInProgress()) {
        }
        function29 = function28;
        function210 = function26;
        function211 = function27;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions4 = keyboardActions3;
        z9 = z6;
        mutableInteractionSource5 = mutableInteractionSource4;
        textFieldColors3 = textFieldColors4222;
        shape4 = shape7222;
        z10 = z16222;
        textStyle3 = textStyle4222;
        z11 = z17222;
        modifier3 = modifier4222;
        z12 = z5;
        function212 = function25;
        i26 = i21;
        i27 = i22;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b6, code lost:
        if (r10.changed(r83) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(TextFieldValue value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        KeyboardActions keyboardActions2;
        int i19;
        Function2 function25;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        Modifier modifier3;
        boolean z6;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColors2;
        Shape shape3;
        boolean z7;
        TextStyle textStyle3;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        Function2 function27;
        KeyboardActions keyboardActions3;
        Function2 function28;
        boolean z8;
        boolean z9;
        Function2 function29;
        Composer composer2;
        Modifier modifier4;
        boolean z10;
        boolean z11;
        TextStyle textStyle4;
        Function2 function210;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z12;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        boolean z13;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        TextFieldColors textFieldColors3;
        int i20;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-288998816);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)430@20830L7,441@21384L39,442@21462L22,443@21534L25,445@21568L416:OutlinedTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i22 = 2048;
            if (i6 == 0) {
                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                int i23 = i13;
                i15 = i4 & 4096;
                if (i15 != 0) {
                    i23 |= 384;
                } else if ((i3 & 896) == 0) {
                    i23 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                    if ((i3 & 7168) == 0) {
                        if ((i4 & 8192) != 0) {
                        }
                        i22 = 1024;
                        i23 |= i22;
                    }
                    i16 = i4 & 16384;
                    if (i16 == 0) {
                        i23 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i23 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i17 = i4 & 32768;
                    if (i17 == 0) {
                        i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & 458752) == 0) {
                        i23 |= startRestartGroup.changed(i) ? 131072 : 65536;
                    }
                    i18 = i4 & 65536;
                    if (i18 == 0) {
                        i23 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i23 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 29360128) == 0) {
                        i23 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                    }
                    if ((i3 & 234881024) == 0) {
                        i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i5 & 1533916891) == 306783378 || (191739611 & i23) != 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i21 == 0 ? Modifier.Companion : modifier;
                            boolean z14 = i6 == 0 ? true : z;
                            boolean z15 = i7 == 0 ? false : z2;
                            if ((i4 & 32) == 0) {
                                modifier2 = companion;
                                z5 = z14;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textStyle2 = (TextStyle) consume;
                                i5 &= -458753;
                            } else {
                                modifier2 = companion;
                                z5 = z14;
                                textStyle2 = textStyle;
                            }
                            Function2 function214 = i8 == 0 ? null : function2;
                            Function2 function215 = i9 == 0 ? null : function22;
                            Function2 function216 = i10 == 0 ? null : function23;
                            Function2 function217 = i11 == 0 ? function24 : null;
                            boolean z16 = i12 == 0 ? false : z3;
                            VisualTransformation none = i14 == 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                            KeyboardOptions keyboardOptions4 = i15 == 0 ? KeyboardOptions.Companion.getDefault() : keyboardOptions;
                            if ((i4 & 8192) == 0) {
                                keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                i23 &= -7169;
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            boolean z17 = i16 == 0 ? false : z4;
                            i19 = i17 == 0 ? Integer.MAX_VALUE : i;
                            int i24 = i5;
                            if (i18 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                function25 = function216;
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                function25 = function216;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i4 & 131072) == 0) {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                i23 = (-29360129) & i23;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = shape;
                            }
                            if ((262144 & i4) == 0) {
                                i23 &= -234881025;
                                modifier3 = modifier2;
                                z6 = z5;
                                function26 = function25;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                shape3 = shape2;
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1514outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            } else {
                                modifier3 = modifier2;
                                z6 = z5;
                                function26 = function25;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                textFieldColors2 = textFieldColors;
                                shape3 = shape2;
                            }
                            z7 = z16;
                            textStyle3 = textStyle2;
                            visualTransformation2 = none;
                            keyboardOptions2 = keyboardOptions4;
                            function27 = function215;
                            keyboardActions3 = keyboardActions2;
                            function28 = function217;
                            z8 = z15;
                            z9 = z17;
                            function29 = function214;
                            i5 = i24;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 8192) != 0) {
                                i23 &= -7169;
                            }
                            if ((i4 & 131072) != 0) {
                                i23 &= -29360129;
                            }
                            if ((262144 & i4) != 0) {
                                i23 &= -234881025;
                            }
                            modifier3 = modifier;
                            z6 = z;
                            z8 = z2;
                            textStyle3 = textStyle;
                            function29 = function2;
                            function27 = function22;
                            function26 = function23;
                            function28 = function24;
                            z7 = z3;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z9 = z4;
                            i19 = i;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-288998816, i5, i23, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:424)");
                        }
                        int i25 = i23 << 3;
                        composer2 = startRestartGroup;
                        OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z10 = z6;
                        z11 = z8;
                        textStyle4 = textStyle3;
                        function210 = function29;
                        function211 = function27;
                        function212 = function26;
                        function213 = function28;
                        z12 = z7;
                        visualTransformation3 = visualTransformation2;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions4 = keyboardActions3;
                        z13 = z9;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        i20 = i19;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z10 = z;
                        z11 = z2;
                        textStyle4 = textStyle;
                        function210 = function2;
                        function211 = function22;
                        function212 = function23;
                        z12 = z3;
                        visualTransformation3 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions4 = keyboardActions;
                        z13 = z4;
                        i20 = i;
                        mutableInteractionSource5 = mutableInteractionSource;
                        shape4 = shape;
                        textFieldColors3 = textFieldColors;
                        composer2 = startRestartGroup;
                        function213 = function24;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextField$12(value, onValueChange, modifier4, z10, z11, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions3, keyboardActions4, z13, i20, mutableInteractionSource5, shape4, textFieldColors3, i2, i3, i4));
                    return;
                }
                if ((i3 & 7168) == 0) {
                }
                i16 = i4 & 16384;
                if (i16 == 0) {
                }
                i17 = i4 & 32768;
                if (i17 == 0) {
                }
                i18 = i4 & 65536;
                if (i18 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i21 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                int i242 = i5;
                if (i18 == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                if ((262144 & i4) == 0) {
                }
                z7 = z16;
                textStyle3 = textStyle2;
                visualTransformation2 = none;
                keyboardOptions2 = keyboardOptions4;
                function27 = function215;
                keyboardActions3 = keyboardActions2;
                function28 = function217;
                z8 = z15;
                z9 = z17;
                function29 = function214;
                i5 = i242;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i252 = i23 << 3;
                composer2 = startRestartGroup;
                OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i252 & 29360128) | (i252 & 234881024) | (i252 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z10 = z6;
                z11 = z8;
                textStyle4 = textStyle3;
                function210 = function29;
                function211 = function27;
                function212 = function26;
                function213 = function28;
                z12 = z7;
                visualTransformation3 = visualTransformation2;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions4 = keyboardActions3;
                z13 = z9;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                textFieldColors3 = textFieldColors2;
                i20 = i19;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            int i232 = i13;
            i15 = i4 & 4096;
            if (i15 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i16 = i4 & 16384;
            if (i16 == 0) {
            }
            i17 = i4 & 32768;
            if (i17 == 0) {
            }
            i18 = i4 & 65536;
            if (i18 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i21 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            int i2422 = i5;
            if (i18 == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            if ((262144 & i4) == 0) {
            }
            z7 = z16;
            textStyle3 = textStyle2;
            visualTransformation2 = none;
            keyboardOptions2 = keyboardOptions4;
            function27 = function215;
            keyboardActions3 = keyboardActions2;
            function28 = function217;
            z8 = z15;
            z9 = z17;
            function29 = function214;
            i5 = i2422;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i2522 = i232 << 3;
            composer2 = startRestartGroup;
            OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & 458752) | (i2522 & 29360128) | (i2522 & 234881024) | (i2522 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            z10 = z6;
            z11 = z8;
            textStyle4 = textStyle3;
            function210 = function29;
            function211 = function27;
            function212 = function26;
            function213 = function28;
            z12 = z7;
            visualTransformation3 = visualTransformation2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions4 = keyboardActions3;
            z13 = z9;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors2;
            i20 = i19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i222 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        int i2322 = i13;
        i15 = i4 & 4096;
        if (i15 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i16 = i4 & 16384;
        if (i16 == 0) {
        }
        i17 = i4 & 32768;
        if (i17 == 0) {
        }
        i18 = i4 & 65536;
        if (i18 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i21 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        int i24222 = i5;
        if (i18 == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        if ((262144 & i4) == 0) {
        }
        z7 = z16;
        textStyle3 = textStyle2;
        visualTransformation2 = none;
        keyboardOptions2 = keyboardOptions4;
        function27 = function215;
        keyboardActions3 = keyboardActions2;
        function28 = function217;
        z8 = z15;
        z9 = z17;
        function29 = function214;
        i5 = i24222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i25222 = i2322 << 3;
        composer2 = startRestartGroup;
        OutlinedTextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & 458752) | (i25222 & 29360128) | (i25222 & 234881024) | (i25222 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        z10 = z6;
        z11 = z8;
        textStyle4 = textStyle3;
        function210 = function29;
        function211 = function27;
        function212 = function26;
        function213 = function28;
        z12 = z7;
        visualTransformation3 = visualTransformation2;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions4 = keyboardActions3;
        z13 = z9;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors2;
        i20 = i19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OutlinedTextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> textField, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, float f, Function1<? super Size, Unit> onLabelMeasured, Function2<? super Composer, ? super Integer, Unit> border, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)489@22705L239,497@22992L7,498@23004L2308:OutlinedTextField.kt#jmzs0o");
        int i4 = (i & 14) == 0 ? (startRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(onLabelMeasured) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(border) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i4 & 1533916891) != 306783378 || (i5 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i4, i5, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:476)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 4; i6 < i7; i7 = 4) {
                z2 |= startRestartGroup.changed(objArr[i6]);
                i6++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i8 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1169918054, "C506@23508L8,545@24956L182:OutlinedTextField.kt#jmzs0o");
            border.invoke(startRestartGroup, Integer.valueOf((i4 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169918076);
            ComposerKt.sourceInformation(startRestartGroup, "509@23569L219");
            if (function22 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905297788, "C513@23761L9:OutlinedTextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169918361);
            ComposerKt.sourceInformation(startRestartGroup, "517@23855L221");
            if (function23 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905297501, "C521@24048L10:OutlinedTextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 15) & 14));
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
            Modifier.Companion companion = Modifier.Companion;
            if (function22 != null) {
                i3 = 0;
                calculateStartPadding = Dp.m5607constructorimpl(RangesKt.coerceAtLeast(Dp.m5607constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5607constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function23 != null) {
                calculateEndPadding = Dp.m5607constructorimpl(RangesKt.coerceAtLeast(Dp.m5607constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5607constructorimpl(i3)));
            }
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1169919372);
            ComposerKt.sourceInformation(startRestartGroup, "542@24869L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(m752paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(m752paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl4.getInserting() || !Intrinsics.areEqual(m2893constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m2893constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m2893constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905296436, "C549@25113L11:OutlinedTextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-614207951);
            ComposerKt.sourceInformation(startRestartGroup, "553@25189L54");
            if (function2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl5 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl5.getInserting() || !Intrinsics.areEqual(m2893constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m2893constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m2893constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905296315, "C553@25234L7:OutlinedTextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
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
        endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, textField, function3, function2, function22, function23, z, f, onLabelMeasured, border, paddingValues, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw  reason: not valid java name */
    public static final int m1419calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        return Math.max(i + Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5)) + i2, Math.max(MathKt.roundToInt((i4 + (Dp.m5607constructorimpl(paddingValues.mo698calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo699calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f2)) * f), Constraints.m5553getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m1418calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int max = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float mo700calculateTopPaddingD9Ej5fM = paddingValues.mo700calculateTopPaddingD9Ej5fM() * f2;
        return Math.max(Constraints.m5552getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(MathHelpersKt.lerp(mo700calculateTopPaddingD9Ej5fM, Math.max(mo700calculateTopPaddingD9Ej5fM, i4 / 2.0f), f) + max + (paddingValues.mo697calculateBottomPaddingD9Ej5fM() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.mo700calculateTopPaddingD9Ej5fM() * f2);
        int roundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + roundToInt2, MathHelpersKt.lerp(z ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt, -(placeable4.getHeight() / 2), f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m4604place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m5735getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM  reason: not valid java name */
    public static final Modifier m1420outlineCutout12SF9DM(Modifier outlineCutout, long j, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new OutlinedTextFieldKt$outlineCutout$1(j, paddingValues));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
