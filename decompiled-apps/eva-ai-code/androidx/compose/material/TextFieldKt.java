package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
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
import androidx.compose.ui.unit.LayoutDirection;
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
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00101\u001a\u009a\u0001\u00102\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001a]\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aE\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u0014\u0010O\u001a\u00020\u0010*\u00020\u00102\u0006\u0010P\u001a\u00020QH\u0000\u001at\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020%2\u0006\u0010]\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u000207H\u0002\u001aZ\u0010^\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010_\u001a\u00020W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m5607constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m5607constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m5607constructorimpl(4);

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
    /* JADX WARN: Removed duplicated region for block: B:297:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(String value, Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5) {
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
        CornerBasedShape cornerBasedShape;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        KeyboardActions keyboardActions3;
        KeyboardOptions keyboardOptions2;
        boolean z6;
        int i24;
        Shape shape2;
        Modifier modifier2;
        boolean z7;
        int i25;
        boolean z8;
        TextFieldColors textFieldColors2;
        long m5103getColor0d7_KjU;
        Modifier m1513indicatorLinegv0btCI;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        boolean z9;
        MutableInteractionSource mutableInteractionSource5;
        Modifier modifier3;
        TextFieldColors textFieldColors3;
        Shape shape3;
        boolean z10;
        TextStyle textStyle3;
        boolean z11;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i26;
        int i27;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1504264404);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)164@8542L7,176@9142L39,178@9224L6,179@9349L17,191@9767L24,201@10205L20,188@9669L1571:TextField.kt#jmzs0o");
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
                                cornerBasedShape = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                i20 &= -234881025;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                cornerBasedShape = shape;
                            }
                            int i31 = i20;
                            if ((i5 & 524288) == 0) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                i24 = i23;
                                shape2 = cornerBasedShape;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31 & (-1879048193);
                                z8 = z14;
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1516textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                i24 = i23;
                                shape2 = cornerBasedShape;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31;
                                z8 = z14;
                                textFieldColors2 = textFieldColors;
                            }
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
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            i24 = i6;
                            i25 = i30;
                            z7 = z;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1504264404, i24, i25, "androidx.compose.material.TextField (TextField.kt:158)");
                        }
                        startRestartGroup.startReplaceableGroup(-833027253);
                        ComposerKt.sourceInformation(startRestartGroup, "*183@9518L18");
                        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                            m5103getColor0d7_KjU = textFieldColors2.textColor(z7, startRestartGroup, ((i24 >> 9) & 14) | ((i25 >> 24) & 112)).getValue().m3301unboximpl();
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        int i32 = (i25 >> 24) & 112;
                        int i33 = i24;
                        boolean z16 = z7;
                        m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32).getValue().m3301unboximpl(), shape2), z16, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                        Modifier modifier4 = modifier2;
                        int i34 = i25 << 12;
                        TextFieldColors textFieldColors4 = textFieldColors2;
                        Shape shape4 = shape2;
                        composer2 = startRestartGroup;
                        boolean z17 = z8;
                        TextStyle textStyle4 = textStyle2;
                        boolean z18 = z7;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i32).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 989834338, true, new TextFieldKt$TextField$2(value, z16, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i33, i25)), composer2, (i33 & 14) | (i33 & 112) | (i33 & 7168) | (i33 & 57344) | (i34 & 3670016) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
                        modifier3 = modifier4;
                        textFieldColors3 = textFieldColors4;
                        shape3 = shape4;
                        z10 = z17;
                        textStyle3 = textStyle4;
                        z11 = z18;
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
                        shape3 = shape;
                        textFieldColors3 = textFieldColors;
                        composer2 = startRestartGroup;
                        function212 = function2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TextFieldKt$TextField$3(value, onValueChange, modifier3, z11, z12, textStyle3, function212, function29, function210, function211, z10, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i26, i27, mutableInteractionSource5, shape3, textFieldColors3, i3, i4, i5));
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
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-833027253);
                ComposerKt.sourceInformation(startRestartGroup, "*183@9518L18");
                m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge2 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                int i322 = (i25 >> 24) & 112;
                int i332 = i24;
                boolean z162 = z7;
                m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i322).getValue().m3301unboximpl(), shape2), z162, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                Modifier modifier42 = modifier2;
                int i342 = i25 << 12;
                TextFieldColors textFieldColors42 = textFieldColors2;
                Shape shape42 = shape2;
                composer2 = startRestartGroup;
                boolean z172 = z8;
                TextStyle textStyle42 = textStyle2;
                boolean z182 = z7;
                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge2, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i322).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 989834338, true, new TextFieldKt$TextField$2(value, z162, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i332, i25)), composer2, (i332 & 14) | (i332 & 112) | (i332 & 7168) | (i332 & 57344) | (i342 & 3670016) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
                modifier3 = modifier42;
                textFieldColors3 = textFieldColors42;
                shape3 = shape42;
                z10 = z172;
                textStyle3 = textStyle42;
                z11 = z182;
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
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-833027253);
            ComposerKt.sourceInformation(startRestartGroup, "*183@9518L18");
            m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge22 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            int i3222 = (i25 >> 24) & 112;
            int i3322 = i24;
            boolean z1622 = z7;
            m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i3222).getValue().m3301unboximpl(), shape2), z1622, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            Modifier modifier422 = modifier2;
            int i3422 = i25 << 12;
            TextFieldColors textFieldColors422 = textFieldColors2;
            Shape shape422 = shape2;
            composer2 = startRestartGroup;
            boolean z1722 = z8;
            TextStyle textStyle422 = textStyle2;
            boolean z1822 = z7;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge22, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i3222).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 989834338, true, new TextFieldKt$TextField$2(value, z1622, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i3322, i25)), composer2, (i3322 & 14) | (i3322 & 112) | (i3322 & 7168) | (i3322 & 57344) | (i3422 & 3670016) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
            modifier3 = modifier422;
            textFieldColors3 = textFieldColors422;
            shape3 = shape422;
            z10 = z1722;
            textStyle3 = textStyle422;
            z11 = z1822;
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
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-833027253);
        ComposerKt.sourceInformation(startRestartGroup, "*183@9518L18");
        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        int i32222 = (i25 >> 24) & 112;
        int i33222 = i24;
        boolean z16222 = z7;
        m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32222).getValue().m3301unboximpl(), shape2), z16222, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        Modifier modifier4222 = modifier2;
        int i34222 = i25 << 12;
        TextFieldColors textFieldColors4222 = textFieldColors2;
        Shape shape4222 = shape2;
        composer2 = startRestartGroup;
        boolean z17222 = z8;
        TextStyle textStyle4222 = textStyle2;
        boolean z18222 = z7;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge222, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i32222).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 989834338, true, new TextFieldKt$TextField$2(value, z16222, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i33222, i25)), composer2, (i33222 & 14) | (i33222 & 112) | (i33222 & 7168) | (i33222 & 57344) | (i34222 & 3670016) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
        modifier3 = modifier4222;
        textFieldColors3 = textFieldColors4222;
        shape3 = shape4222;
        z10 = z17222;
        textStyle3 = textStyle4222;
        z11 = z18222;
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
    /* JADX WARN: Removed duplicated region for block: B:279:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0535  */
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
    public static final /* synthetic */ void TextField(String value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
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
        Shape shape3;
        TextFieldColors textFieldColors3;
        int i20;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)240@11593L7,251@12147L39,253@12229L6,254@12354L17,256@12380L408:TextField.kt#jmzs0o");
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
                                cornerBasedShape = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                i23 = (-29360129) & i23;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                cornerBasedShape = shape;
                            }
                            if ((262144 & i4) == 0) {
                                i23 &= -234881025;
                                modifier3 = modifier2;
                                z6 = z5;
                                function26 = function25;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                shape2 = cornerBasedShape;
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1516textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
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
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1690895095, i5, i23, "androidx.compose.material.TextField (TextField.kt:234)");
                        }
                        int i25 = i23 << 3;
                        composer2 = startRestartGroup;
                        TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), 0);
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
                        shape3 = shape2;
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
                        shape3 = shape;
                        textFieldColors3 = textFieldColors;
                        composer2 = startRestartGroup;
                        function213 = function24;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TextFieldKt$TextField$5(value, onValueChange, modifier4, z10, z11, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions3, keyboardActions4, z13, i20, mutableInteractionSource5, shape3, textFieldColors3, i2, i3, i4));
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
                TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i252 & 29360128) | (i252 & 234881024) | (i252 & 1879048192), 0);
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
                shape3 = shape2;
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
            TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & 458752) | (i2522 & 29360128) | (i2522 & 234881024) | (i2522 & 1879048192), 0);
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
            shape3 = shape2;
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
        TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape2, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & 458752) | (i25222 & 29360128) | (i25222 & 234881024) | (i25222 & 1879048192), 0);
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
        shape3 = shape2;
        textFieldColors3 = textFieldColors2;
        i20 = i19;
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
    /* JADX WARN: Removed duplicated region for block: B:301:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
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
    public static final void TextField(TextFieldValue value, Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5) {
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
        Modifier modifier2;
        boolean z7;
        int i25;
        boolean z8;
        TextFieldColors textFieldColors2;
        long m5103getColor0d7_KjU;
        Modifier m1513indicatorLinegv0btCI;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        boolean z9;
        MutableInteractionSource mutableInteractionSource5;
        Modifier modifier3;
        TextFieldColors textFieldColors3;
        Shape shape4;
        boolean z10;
        TextStyle textStyle3;
        boolean z11;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i26;
        int i27;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-359119489);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)353@17674L7,365@18274L39,366@18352L14,367@18416L17,379@18834L24,389@19272L20,376@18736L1576:TextField.kt#jmzs0o");
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
                                shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
                                i20 &= -234881025;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = shape;
                            }
                            int i31 = i20;
                            if ((i5 & 524288) == 0) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                i24 = i23;
                                shape3 = shape2;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31 & (-1879048193);
                                z8 = z14;
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1516textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function26 = function214;
                                function27 = function215;
                                visualTransformation2 = none;
                                function28 = function213;
                                keyboardActions3 = keyboardActions2;
                                keyboardOptions2 = keyboardOptions4;
                                z6 = z15;
                                i24 = i23;
                                shape3 = shape2;
                                modifier2 = companion;
                                z7 = z13;
                                i25 = i31;
                                z8 = z14;
                                textFieldColors2 = textFieldColors;
                            }
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
                            z7 = z;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-359119489, i24, i25, "androidx.compose.material.TextField (TextField.kt:347)");
                        }
                        startRestartGroup.startReplaceableGroup(-833018186);
                        ComposerKt.sourceInformation(startRestartGroup, "*371@18585L18");
                        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                            m5103getColor0d7_KjU = textFieldColors2.textColor(z7, startRestartGroup, ((i24 >> 9) & 14) | ((i25 >> 24) & 112)).getValue().m3301unboximpl();
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        int i32 = (i25 >> 24) & 112;
                        int i33 = i24;
                        boolean z16 = z7;
                        m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32).getValue().m3301unboximpl(), shape3), z16, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                        Modifier modifier4 = modifier2;
                        int i34 = i25 << 12;
                        TextFieldColors textFieldColors4 = textFieldColors2;
                        Shape shape5 = shape3;
                        composer2 = startRestartGroup;
                        boolean z17 = z8;
                        TextStyle textStyle4 = textStyle2;
                        boolean z18 = z7;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i32).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -126640971, true, new TextFieldKt$TextField$7(value, z16, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i33, i25)), composer2, (i33 & 14) | (i33 & 112) | (i33 & 7168) | (i33 & 57344) | (i34 & 3670016) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
                        modifier3 = modifier4;
                        textFieldColors3 = textFieldColors4;
                        shape4 = shape5;
                        z10 = z17;
                        textStyle3 = textStyle4;
                        z11 = z18;
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
                    endRestartGroup.updateScope(new TextFieldKt$TextField$8(value, onValueChange, modifier3, z11, z12, textStyle3, function212, function29, function210, function211, z10, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i26, i27, mutableInteractionSource5, shape4, textFieldColors3, i3, i4, i5));
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
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-833018186);
                ComposerKt.sourceInformation(startRestartGroup, "*371@18585L18");
                m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
                if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge2 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                int i322 = (i25 >> 24) & 112;
                int i332 = i24;
                boolean z162 = z7;
                m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i322).getValue().m3301unboximpl(), shape3), z162, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
                Modifier modifier42 = modifier2;
                int i342 = i25 << 12;
                TextFieldColors textFieldColors42 = textFieldColors2;
                Shape shape52 = shape3;
                composer2 = startRestartGroup;
                boolean z172 = z8;
                TextStyle textStyle42 = textStyle2;
                boolean z182 = z7;
                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge2, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i322).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -126640971, true, new TextFieldKt$TextField$7(value, z162, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i332, i25)), composer2, (i332 & 14) | (i332 & 112) | (i332 & 7168) | (i332 & 57344) | (i342 & 3670016) | (29360128 & i342) | (234881024 & i342) | (i342 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
                modifier3 = modifier42;
                textFieldColors3 = textFieldColors42;
                shape4 = shape52;
                z10 = z172;
                textStyle3 = textStyle42;
                z11 = z182;
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
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-833018186);
            ComposerKt.sourceInformation(startRestartGroup, "*371@18585L18");
            m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
            if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge22 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            int i3222 = (i25 >> 24) & 112;
            int i3322 = i24;
            boolean z1622 = z7;
            m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i3222).getValue().m3301unboximpl(), shape3), z1622, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
            Modifier modifier422 = modifier2;
            int i3422 = i25 << 12;
            TextFieldColors textFieldColors422 = textFieldColors2;
            Shape shape522 = shape3;
            composer2 = startRestartGroup;
            boolean z1722 = z8;
            TextStyle textStyle422 = textStyle2;
            boolean z1822 = z7;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge22, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i3222).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -126640971, true, new TextFieldKt$TextField$7(value, z1622, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i3322, i25)), composer2, (i3322 & 14) | (i3322 & 112) | (i3322 & 7168) | (i3322 & 57344) | (i3422 & 3670016) | (29360128 & i3422) | (234881024 & i3422) | (i3422 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
            modifier3 = modifier422;
            textFieldColors3 = textFieldColors422;
            shape4 = shape522;
            z10 = z1722;
            textStyle3 = textStyle422;
            z11 = z1822;
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
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-833018186);
        ComposerKt.sourceInformation(startRestartGroup, "*371@18585L18");
        m5103getColor0d7_KjU = textStyle2.m5103getColor0d7_KjU();
        if (!(m5103getColor0d7_KjU != Color.Companion.m3327getUnspecified0d7_KjU())) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge222 = textStyle2.merge(new TextStyle(m5103getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        int i32222 = (i25 >> 24) & 112;
        int i33222 = i24;
        boolean z16222 = z7;
        m1513indicatorLinegv0btCI = TextFieldDefaults.INSTANCE.m1513indicatorLinegv0btCI(BackgroundKt.m420backgroundbw27NRU(modifier2, textFieldColors2.backgroundColor(z7, startRestartGroup, ((i24 >> 9) & 14) | i32222).getValue().m3301unboximpl(), shape3), z16222, z8, mutableInteractionSource4, textFieldColors2, (r17 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (r17 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f);
        Modifier modifier4222 = modifier2;
        int i34222 = i25 << 12;
        TextFieldColors textFieldColors4222 = textFieldColors2;
        Shape shape5222 = shape3;
        composer2 = startRestartGroup;
        boolean z17222 = z8;
        TextStyle textStyle4222 = textStyle2;
        boolean z18222 = z7;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m779defaultMinSizeVpY3zN4(m1513indicatorLinegv0btCI, TextFieldDefaults.INSTANCE.m1511getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1510getMinHeightD9Ej5fM()), z7, z5, merge222, keyboardOptions2, keyboardActions3, z6, i21, i22, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors2.cursorColor(z8, startRestartGroup, (i25 & 14) | i32222).getValue().m3301unboximpl(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -126640971, true, new TextFieldKt$TextField$7(value, z16222, z6, visualTransformation2, mutableInteractionSource4, z8, function25, function28, function26, function27, textFieldColors2, i33222, i25)), composer2, (i33222 & 14) | (i33222 & 112) | (i33222 & 7168) | (i33222 & 57344) | (i34222 & 3670016) | (29360128 & i34222) | (234881024 & i34222) | (i34222 & 1879048192), ((i25 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i25 & 112) | ((i25 >> 12) & 7168), 4096);
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
        modifier3 = modifier4222;
        textFieldColors3 = textFieldColors4222;
        shape4 = shape5222;
        z10 = z17222;
        textStyle3 = textStyle4222;
        z11 = z18222;
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
    public static final /* synthetic */ void TextField(TextFieldValue value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
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
        Composer startRestartGroup = composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)428@20681L7,439@21235L39,440@21313L14,441@21377L17,443@21403L408:TextField.kt#jmzs0o");
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
                                shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
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
                                textFieldColors2 = TextFieldDefaults.INSTANCE.m1516textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
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
                            ComposerKt.traceEventStart(-1576622884, i5, i23, "androidx.compose.material.TextField (TextField.kt:422)");
                        }
                        int i25 = i23 << 3;
                        composer2 = startRestartGroup;
                        TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), 0);
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
                    endRestartGroup.updateScope(new TextFieldKt$TextField$10(value, onValueChange, modifier4, z10, z11, textStyle4, function210, function211, function212, function213, z12, visualTransformation3, keyboardOptions3, keyboardActions4, z13, i20, mutableInteractionSource5, shape4, textFieldColors3, i2, i3, i4));
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
                TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i23 & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i252 & 29360128) | (i252 & 234881024) | (i252 & 1879048192), 0);
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
            TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i232 & 14) | (i232 & 112) | (i232 & 896) | (i232 & 7168) | (i232 & 57344) | (i232 & 458752) | (i2522 & 29360128) | (i2522 & 234881024) | (i2522 & 1879048192), 0);
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
        TextField(value, onValueChange, modifier3, z6, z8, textStyle3, function29, function27, function26, function28, z7, visualTransformation2, keyboardOptions2, keyboardActions3, z9, i19, 1, mutableInteractionSource4, shape3, textFieldColors2, composer2, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (3670016 & i5) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 1572864 | (i2322 & 14) | (i2322 & 112) | (i2322 & 896) | (i2322 & 7168) | (i2322 & 57344) | (i2322 & 458752) | (i25222 & 29360128) | (i25222 & 234881024) | (i25222 & 1879048192), 0);
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

    public static final void TextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> textField, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(3,7,1,5,2,8,6)483@22341L139,486@22528L7,487@22540L1853:TextField.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
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
            int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 254819681, "C529@24155L183:TextField.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(254819681);
            ComposerKt.sourceInformation(startRestartGroup, "491@22648L219");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1767364503, "C495@22840L9:TextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254819966);
            ComposerKt.sourceInformation(startRestartGroup, "499@22934L221");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1767364216, "C503@23127L10:TextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 15) & 14));
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
            startRestartGroup.startReplaceableGroup(254820977);
            ComposerKt.sourceInformation(startRestartGroup, "524@23948L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(m752paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i2 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254821106);
            ComposerKt.sourceInformation(startRestartGroup, "527@24071L57");
            if (function2 != null) {
                Modifier then3 = LayoutIdKt.layoutId(Modifier.Companion, "Label").then(m752paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1767363224, "C527@24119L7:TextField.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(m752paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(then4);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1767363030, "C533@24313L11:TextField.kt#jmzs0o");
            textField.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, textField, function2, function3, function22, function23, z, f, paddingValues, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m1528calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m5553getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m1527calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float mo700calculateTopPaddingD9Ej5fM = paddingValues.mo700calculateTopPaddingD9Ej5fM() * f;
        float mo697calculateBottomPaddingD9Ej5fM = paddingValues.mo697calculateBottomPaddingD9Ej5fM() * f;
        int max = Math.max(i, i5);
        return Math.max(MathKt.roundToInt(z ? i2 + f2 + max + mo697calculateBottomPaddingD9Ej5fM : mo700calculateTopPaddingD9Ej5fM + max + mo697calculateBottomPaddingD9Ej5fM), Math.max(Math.max(i3, i4), Constraints.m5552getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.mo700calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2) : roundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), roundToInt, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(indicatorBorder.m447getWidthD9Ej5fM(), indicatorBorder));
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
