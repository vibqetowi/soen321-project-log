package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0002\b\u001fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u0010+\u001a%\u0010,\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u00100\u001a\u001d\u00101\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u00104\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a=\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0002\u0010<\u001a)\u0010=\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010>\u001a%\u0010?\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010@\u001a;\u0010A\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020CH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001ae\u0010F\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00190I2\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a=\u0010R\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001aQ\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020:2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010%\u001a\u00020&2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00190I¢\u0006\u0002\b\u001f¢\u0006\u0002\bZH\u0003¢\u0006\u0002\u0010[\u001a\u001d\u0010\\\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010]\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u0010^\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a\u0018\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tH\u0002\u001a(\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002\u001a-\u0010g\u001a\u00020h2\u0006\u0010J\u001a\u00020K2\u0006\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\u0007H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010l\u001a+\u0010m\u001a\u00020$2\b\b\u0002\u0010n\u001a\u00020\u00072\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010i\u001a\u00020*H\u0007¢\u0006\u0002\u0010p\u001a`\u0010q\u001a\u00020\u00192\u0006\u0010J\u001a\u00020K2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020G2\u0006\u0010r\u001a\u00020G2\u0006\u0010s\u001a\u00020\u00072!\u0010t\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00190IH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a$\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0z2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\tH\u0002\u001a\u001c\u0010}\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u001c\u0010~\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0015\u0010\u007f\u001a\u00020h*\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\u0081\u0001\u001a\u00020\u001b*\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020*H\u0003\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\f\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\r\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u000f\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0010\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0016\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0017\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0082\u0001"}, d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "", "", "FullCircle", "", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", "state", "Landroidx/compose/material3/TimePickerState;", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", "value", "(Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/Selection;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", "is24Hour", "number", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "initialHour", "initialMinute", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", "name", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "valuesForAnimation", "Lkotlin/Pair;", "current", "new", "clockDial", "drawSelector", "toLocalString", "minDigits", "visible", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final List<Integer> Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m5607constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m5607constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m5607constructorimpl(36);
    private static final float SupportLabelTop = Dp.m5607constructorimpl(7);
    private static final float MaxDistance = Dp.m5607constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m5607constructorimpl(48);
    private static final List<Integer> Minutes = CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* renamed from: TimePicker-mT9BvqQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2160TimePickermT9BvqQ(TimePickerState state, Modifier modifier, TimePickerColors timePickerColors, int i, Composer composer, int i2, int i3) {
        int i4;
        Object obj;
        Object obj2;
        int i5;
        TimePickerColors timePickerColors2;
        Object obj3;
        Object obj4;
        int m2158layoutTypesDNSZnc;
        Composer composer2;
        Modifier modifier2;
        TimePickerColors timePickerColors3;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-619286452);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePicker)P(3,2!,1:c#material3.TimePickerLayoutType)191@10184L8,192@10252L12,194@10313L23:TimePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    obj2 = timePickerColors;
                    if (startRestartGroup.changed(obj2)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    obj2 = timePickerColors;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                obj2 = timePickerColors;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i7 = 2048;
                        i4 |= i7;
                    }
                } else {
                    i5 = i;
                }
                i7 = 1024;
                i4 |= i7;
            } else {
                i5 = i;
            }
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                    if ((i3 & 4) == 0) {
                        timePickerColors2 = TimePickerDefaults.INSTANCE.m2157colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                        i4 &= -897;
                    } else {
                        timePickerColors2 = obj2;
                    }
                    if ((i3 & 8) == 0) {
                        i4 &= -7169;
                        obj3 = companion;
                        obj4 = timePickerColors2;
                        m2158layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m2158layoutTypesDNSZnc(startRestartGroup, 6);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-619286452, i4, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:188)");
                        }
                        State<Boolean> state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(startRestartGroup, 0);
                        if (!TimePickerLayoutType.m2178equalsimpl0(m2158layoutTypesDNSZnc, TimePickerLayoutType.Companion.m2183getVerticalQJTpgSE())) {
                            startRestartGroup.startReplaceableGroup(1318081657);
                            ComposerKt.sourceInformation(startRestartGroup, "197@10401L184");
                            composer2 = startRestartGroup;
                            VerticalTimePicker(state, obj3, obj4, !TimePicker_mT9BvqQ$lambda$0(state2), startRestartGroup, (i4 & 14) | (i4 & 112) | (i4 & 896), 0);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2 = startRestartGroup;
                            composer2.startReplaceableGroup(1318081863);
                            ComposerKt.sourceInformation(composer2, "204@10607L186");
                            HorizontalTimePicker(state, obj3, obj4, !TimePicker_mT9BvqQ$lambda$0(state2), composer2, (i4 & 14) | (i4 & 112) | (i4 & 896), 0);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj3;
                        timePickerColors3 = obj4;
                        i6 = m2158layoutTypesDNSZnc;
                    } else {
                        obj3 = companion;
                        obj4 = timePickerColors2;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    obj3 = obj;
                    obj4 = obj2;
                }
                m2158layoutTypesDNSZnc = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State<Boolean> state22 = TouchExplorationStateProvider_androidKt.touchExplorationState(startRestartGroup, 0);
                if (!TimePickerLayoutType.m2178equalsimpl0(m2158layoutTypesDNSZnc, TimePickerLayoutType.Companion.m2183getVerticalQJTpgSE())) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj3;
                timePickerColors3 = obj4;
                i6 = m2158layoutTypesDNSZnc;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                timePickerColors3 = obj2;
                i6 = i5;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new TimePickerKt$TimePicker$1(state, modifier2, timePickerColors3, i6, i2, i3));
            return;
        }
        obj = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        if ((i4 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInput(TimePickerState state, Modifier modifier, TimePickerColors timePickerColors, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        TimePickerColors timePickerColors2;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-760850373);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInput)P(2,1)233@11683L8,235@11701L38:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        timePickerColors2 = TimePickerDefaults.INSTANCE.m2157colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                    }
                    obj = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i3, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:230)");
                }
                int i6 = i3 >> 3;
                TimeInputImpl(obj, timePickerColors2, state, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            TimePickerColors timePickerColors3 = timePickerColors2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TimePickerKt$TimeInput$1(state, obj, timePickerColors3, i, i2));
            return;
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        obj = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i62 = i3 >> 3;
        TimeInputImpl(obj, timePickerColors2, state, startRestartGroup, (i62 & 112) | (i62 & 14) | ((i3 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        TimePickerColors timePickerColors32 = timePickerColors2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final TimePickerState rememberTimePickerState(int i, int i2, boolean z, Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1237715277);
        ComposerKt.sourceInformation(composer, "C(rememberTimePickerState)441@21331L14,444@21424L133,442@21368L189:TimePicker.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.Companion.Saver();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Boolean valueOf3 = Boolean.valueOf(z);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(valueOf3);
        TimePickerKt$rememberTimePickerState$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TimePickerKt$rememberTimePickerState$1$1(i, i2, z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m2907rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalTimePicker(TimePickerState state, Modifier modifier, TimePickerColors timePickerColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        TimePickerColors timePickerColors2;
        Modifier.Companion companion;
        TimePickerColors timePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(310683247);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalTimePicker)P(3,2,1)664@28871L8,667@28921L319:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    if (startRestartGroup.changed(timePickerColors2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        timePickerColors2 = TimePickerDefaults.INSTANCE.m2157colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = obj;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(310683247, i3, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:661)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                int i6 = i3 >> 3;
                int i7 = (i6 & 14) | 384;
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                int i8 = i7 >> 3;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, (i8 & 112) | (i8 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i9 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 37436160, "C668@29011L35,669@29055L60,670@29124L44,671@29177L57:TimePicker.kt#uh7d8r");
                int i10 = (i3 & 14) | (i6 & 112);
                VerticalClockDisplay(state, timePickerColors2, startRestartGroup, i10);
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(state, timePickerColors2, z, startRestartGroup, i10 | (i6 & 896));
                SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, ClockFaceBottomMargin), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                timePickerColors3 = timePickerColors2;
                obj = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                timePickerColors3 = timePickerColors2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TimePickerKt$VerticalTimePicker$2(state, obj, timePickerColors3, z, i, i2));
            return;
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
        int i62 = i3 >> 3;
        int i72 = (i62 & 14) | 384;
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
        int i82 = i72 >> 3;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, (i82 & 112) | (i82 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion);
        int i92 = ((((i72 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i92 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 37436160, "C668@29011L35,669@29055L60,670@29124L44,671@29177L57:TimePicker.kt#uh7d8r");
        int i102 = (i3 & 14) | (i62 & 112);
        VerticalClockDisplay(state, timePickerColors2, startRestartGroup, i102);
        SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), startRestartGroup, 6);
        ClockFace(state, timePickerColors2, z, startRestartGroup, i102 | (i62 & 896));
        SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, ClockFaceBottomMargin), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        timePickerColors3 = timePickerColors2;
        obj = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalTimePicker(TimePickerState state, Modifier modifier, TimePickerColors timePickerColors, boolean z, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        Modifier.Companion companion;
        TimePickerColors m2157colorsu3YEpmA;
        TimePickerColors timePickerColors2;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(5079681);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalTimePicker)P(3,2,1)679@29404L8,682@29454L309:TimePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj2 = timePickerColors;
                    if (startRestartGroup.changed(obj2)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    obj2 = timePickerColors;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                obj2 = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 4) != 0) {
                        m2157colorsu3YEpmA = TimePickerDefaults.INSTANCE.m2157colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                        i3 &= -897;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(5079681, i3, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:676)");
                        }
                        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -321635938, "C686@29599L37,687@29645L59,688@29713L44:TimePicker.kt#uh7d8r");
                        int i6 = i3 & 14;
                        int i7 = i3 >> 3;
                        int i8 = i6 | (i7 & 112);
                        HorizontalClockDisplay(state, m2157colorsu3YEpmA, startRestartGroup, i8);
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), startRestartGroup, 6);
                        ClockFace(state, m2157colorsu3YEpmA, z, startRestartGroup, i8 | (i7 & 896));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        timePickerColors2 = m2157colorsu3YEpmA;
                        obj = companion;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = obj;
                }
                m2157colorsu3YEpmA = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -321635938, "C686@29599L37,687@29645L59,688@29713L44:TimePicker.kt#uh7d8r");
                int i62 = i3 & 14;
                int i72 = i3 >> 3;
                int i82 = i62 | (i72 & 112);
                HorizontalClockDisplay(state, m2157colorsu3YEpmA, startRestartGroup, i82);
                SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), startRestartGroup, 6);
                ClockFace(state, m2157colorsu3YEpmA, z, startRestartGroup, i82 | (i72 & 896));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                timePickerColors2 = m2157colorsu3YEpmA;
                obj = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                timePickerColors2 = obj2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new TimePickerKt$HorizontalTimePicker$2(state, obj, timePickerColors2, z, i, i2));
            return;
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        m2157colorsu3YEpmA = obj2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m752paddingqDBjuR0$default22 = PaddingKt.m752paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
        Alignment.Vertical centerVertically22 = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume42;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m752paddingqDBjuR0$default22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m2893constructorimpl22 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl22, rowMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -321635938, "C686@29599L37,687@29645L59,688@29713L44:TimePicker.kt#uh7d8r");
        int i622 = i3 & 14;
        int i722 = i3 >> 3;
        int i822 = i622 | (i722 & 112);
        HorizontalClockDisplay(state, m2157colorsu3YEpmA, startRestartGroup, i822);
        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), startRestartGroup, 6);
        ClockFace(state, m2157colorsu3YEpmA, z, startRestartGroup, i822 | (i722 & 896));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        timePickerColors2 = m2157colorsu3YEpmA;
        obj = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInputImpl(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i) {
        int i2;
        Composer composer2;
        TextStyle m5096copyCXVQc50;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInputImpl)P(1)698@29965L92,698@29913L144,701@30133L84,701@30081L136,705@30223L3592:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:693)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(timePickerState);
            TimePickerKt$TimeInputImpl$hourValue$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$TimeInputImpl$hourValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.Companion.getSaver();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(timePickerState);
            TimePickerKt$TimeInputImpl$minuteValue$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeInputImpl$minuteValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
            composer2 = startRestartGroup;
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Vertical top = Alignment.Companion.getTop();
            composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer2, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1230444741, "C709@30386L10,715@30597L2787:TimePicker.kt#uh7d8r");
            m5096copyCXVQc50 = r19.m5096copyCXVQc50((r46 & 1) != 0 ? r19.spanStyle.m5041getColor0d7_KjU() : timePickerColors.m2156timeSelectorContentColorvNxB06k$material3_release(true), (r46 & 2) != 0 ? r19.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r19.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? r19.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r19.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r19.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? r19.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r19.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r19.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r19.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r19.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? r19.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r19.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? r19.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? r19.paragraphStyle.m4997getTextAlignbuA522U() : TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (r46 & 32768) != 0 ? r19.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r19.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r19.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? r19.platformStyle : null, (r46 & 524288) != 0 ? r19.paragraphStyle.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r19.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont()).paragraphStyle.m4992getHyphensEaSxIns() : null);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(m5096copyCXVQc50)}, ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new TimePickerKt$TimeInputImpl$1$1(rememberSaveable, timePickerState, i3, timePickerColors, rememberSaveable2)), composer2, 56);
            composer2.startReplaceableGroup(565119480);
            ComposerKt.sourceInformation(composer2, "786@33429L370");
            if (!timePickerState.is24hour()) {
                Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(modifier, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = composer2.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1645137119, "C787@33497L288:TimePicker.kt#uh7d8r");
                VerticalPeriodToggle(SizeKt.m797sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m2748getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2747getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i3 >> 3) & 112) | 6 | ((i3 << 3) & 896));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TimePickerKt$TimeInputImpl$2(modifier, timePickerColors, timePickerState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalClockDisplay)P(1)802@33922L554:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:801)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -385990141, "C803@33981L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i2 & 14) | (i2 & 112));
            startRestartGroup.startReplaceableGroup(-552398963);
            ComposerKt.sourceInformation(startRestartGroup, "805@34059L401");
            if (!timePickerState.is24hour()) {
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
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
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 34966463, "C806@34136L310:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m797sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m2759getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2758getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TimePickerKt$HorizontalClockDisplay$2(timePickerState, timePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalClockDisplay)P(1)821@34581L549:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:820)");
            }
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1085478083, "C822@34639L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i2 & 14) | (i2 & 112));
            startRestartGroup.startReplaceableGroup(952907597);
            ComposerKt.sourceInformation(startRestartGroup, "824@34717L397");
            if (!timePickerState.is24hour()) {
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
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
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1130526335, "C825@34796L304:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m797sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m2762getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2761getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TimePickerKt$VerticalClockDisplay$2(timePickerState, timePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockDisplayNumbers(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockDisplayNumbers)P(1)844@35316L10,843@35244L1047:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:839)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -477913269, true, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, timePickerColors, i2)), startRestartGroup, 56);
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
        endRestartGroup.updateScope(new TimePickerKt$ClockDisplayNumbers$2(timePickerState, timePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPeriodToggle)P(1,2)883@36453L904,908@37404L9,910@37439L206:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:878)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i2 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i2 & 112) | (i2 & 896));
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
        endRestartGroup.updateScope(new TimePickerKt$HorizontalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPeriodToggle)P(1,2)926@37805L911,951@38763L9,953@38798L207:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:921)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i2 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i2 & 112) | (i2 & 896));
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
        endRestartGroup.updateScope(new TimePickerKt$VerticalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static final void PeriodToggleImpl(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation(startRestartGroup, "C(PeriodToggleImpl)P(3,5!1,2,4)977@39398L9,978@39457L41,981@39562L111,979@39503L1257:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:964)");
            }
            BorderStroke m448BorderStrokecXLIe8U = BorderStrokeKt.m448BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m2760getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m2151getPeriodSelectorBorderColor0d7_KjU$material3_release());
            Shape shape3 = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape3;
            String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2055getTimePickerPeriodToggleadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2058getStringNWtq28);
            TimePickerKt$PeriodToggleImpl$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$PeriodToggleImpl$1$1(m2058getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null)).then(modifier), m448BorderStrokecXLIe8U, cornerBasedShape);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(border);
            int i3 = ((((i2 >> 3) & 896) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1654470848, "C993@39989L71,990@39863L303,1003@40399L9,998@40179L244,1009@40575L70,1005@40436L308:TimePicker.kt#uh7d8r");
            boolean z = !timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(timePickerState);
            TimePickerKt$PeriodToggleImpl$2$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$PeriodToggleImpl$2$1$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i4 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (Function0) rememberedValue2, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m1722getLambda1$material3_release(), startRestartGroup, ((i2 >> 9) & 112) | 24576 | i4);
            SpacerKt.Spacer(BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), 2.0f), 0.0f, 1, null), ColorSchemeKt.toColor(TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor(), startRestartGroup, 6), null, 2, null), startRestartGroup, 0);
            boolean isAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(timePickerState);
            TimePickerKt$PeriodToggleImpl$2$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$PeriodToggleImpl$2$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            ToggleItem(isAfternoonToggle$material3_release, shape2, rememberedValue3, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m1723getLambda2$material3_release(), startRestartGroup, ((i2 >> 12) & 112) | 24576 | i4);
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
        endRestartGroup.updateScope(new TimePickerKt$PeriodToggleImpl$3(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleItem(boolean z, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleItem)P(!1,4,3)1033@41221L22,1038@41400L112,1029@41086L432:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1019)");
            }
            long m2154periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m2154periodSelectorContentColorvNxB06k$material3_release(z);
            long m2153periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2153periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, z ? 0.0f : 1.0f), 0.0f, 1, null);
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf);
            TimePickerKt$ToggleItem$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$ToggleItem$1$1(z);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1606textButtonColorsro_MJ88(m2153periodSelectorContainerColorvNxB06k$material3_release, m2154periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
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
        endRestartGroup.updateScope(new TimePickerKt$ToggleItem$2(z, shape, function0, timePickerColors, function3, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i) {
        int i2;
        TextStyle m5096copyCXVQc50;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplaySeparator)1048@41655L7,1056@41916L245:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1046)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m5096copyCXVQc50 = r16.m5096copyCXVQc50((r46 & 1) != 0 ? r16.spanStyle.m5041getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r16.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? r16.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r16.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r16.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r16.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? r16.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? r16.paragraphStyle.m4997getTextAlignbuA522U() : TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (r46 & 32768) != 0 ? r16.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r16.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? r16.platformStyle : null, (r46 & 524288) != 0 ? r16.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.Companion.m5446getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m5458getBothEVpEnUU(), null), (r46 & 1048576) != 0 ? r16.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? ((TextStyle) consume).paragraphStyle.m4992getHyphensEaSxIns() : null);
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(m5096copyCXVQc50, false);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, TimePickerKt$DisplaySeparator$1.INSTANCE);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -617594898, "C1062@42109L9,1060@42035L120:TimePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(CertificateUtil.DELIMITER, (Modifier) null, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, copyAndSetFontPadding, composer2, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TimePickerKt$DisplaySeparator$3(modifier, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TimeSelector-uXwN82Y  reason: not valid java name */
    public static final void m2162TimeSelectoruXwN82Y(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, Composer composer, int i3) {
        int i4;
        int m2051getTimePickerMinuteSelectionadMyvUU;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(21099367);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeSelector)P(1,4,3,2:c#material3.Selection)1078@42456L176,1088@42784L24,1091@42898L124,1104@43327L9,1089@42813L1060:TimePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= startRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i4 |= startRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        int i5 = i4;
        if ((46811 & i5) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1070)");
            }
            boolean m1968equalsimpl0 = Selection.m1968equalsimpl0(timePickerState.m2185getSelectionJiIwxys$material3_release(), i2);
            if (Selection.m1968equalsimpl0(i2, Selection.Companion.m1972getHourJiIwxys())) {
                m2051getTimePickerMinuteSelectionadMyvUU = Strings.Companion.m2047getTimePickerHourSelectionadMyvUU();
            } else {
                m2051getTimePickerMinuteSelectionadMyvUU = Strings.Companion.m2051getTimePickerMinuteSelectionadMyvUU();
            }
            String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(m2051getTimePickerMinuteSelectionadMyvUU, startRestartGroup, 0);
            long m2155timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(m1968equalsimpl0);
            long m2156timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m2156timeSelectorContentColorvNxB06k$material3_release(m1968equalsimpl0);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2058getStringNWtq28);
            TimePickerKt$TimeSelector$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeSelector$1$1(m2058getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m2068Surfaced85dljk(m1968equalsimpl0, (Function0<Unit>) new TimePickerKt$TimeSelector$2(i2, timePickerState, coroutineScope), SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2), false, ShapesKt.toShape(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6), m2155timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -1338709103, true, new TimePickerKt$TimeSelector$3(i2, timePickerState, i, i5, m2156timeSelectorContentColorvNxB06k$material3_release)), composer2, 0, 48, 1992);
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
        endRestartGroup.updateScope(new TimePickerKt$TimeSelector$4(modifier, i, timePickerState, i2, timePickerColors, i3));
    }

    public static final void ClockFace(TimePickerState state, TimePickerColors colors, boolean z, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1525091100);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockFace)P(2,1)1130@44011L1899:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(colors) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1125)");
            }
            CrossfadeKt.Crossfade(state.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m795size3ABfNKs(BackgroundKt.m420backgroundbw27NRU(Modifier.Companion, colors.m2149getClockDialColor0d7_KjU$material3_release(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m2753getClockDialContainerSizeD9Ej5fM()), false, TimePickerKt$ClockFace$1.INSTANCE, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1628166511, true, new TimePickerKt$ClockFace$2(state, z, colors, i2)), startRestartGroup, 24584, 8);
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
        endRestartGroup.updateScope(new TimePickerKt$ClockFace$3(state, colors, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier drawSelector(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new TimePickerKt$drawSelector$1(timePickerState, timePickerColors));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText(TimePickerState timePickerState, int i, boolean z, Composer composer, int i2) {
        int i3;
        boolean areEqual;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1317232110);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockText)P(1,2)*1287@49593L10,1291@49736L7,1292@49786L40,1293@49843L24,1295@49905L142,1313@50500L39,1308@50299L758:TimePicker.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317232110, i3, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1286)");
            }
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont()), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(MaxDistance);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            String m2167numberContentDescriptionYKJpE6Y = m2167numberContentDescriptionYKJpE6Y(timePickerState.m2185getSelectionJiIwxys$material3_release(), timePickerState.is24hour(), i, startRestartGroup, (i3 << 3) & 896);
            String localString = toLocalString(i, 1);
            if (Selection.m1968equalsimpl0(timePickerState.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1973getMinuteJiIwxys())) {
                areEqual = Intrinsics.areEqual(toLocalString(timePickerState.getMinute(), 1), localString);
            } else {
                areEqual = Intrinsics.areEqual(toLocalString(timePickerState.getHour(), 1), localString);
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m795size3ABfNKs = SizeKt.m795size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), MinimumInteractiveSize);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            TimePickerKt$ClockText$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$ClockText$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(m795size3ABfNKs, (Function1) rememberedValue3), false, null, 3, null), true, new TimePickerKt$ClockText$2(areEqual, coroutineScope, timePickerState, mo588toPx0680j_4, z, mutableState));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 859623406, "C1324@50912L76,1323@50853L198:TimePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m2167numberContentDescriptionYKJpE6Y);
            TimePickerKt$ClockText$3$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new TimePickerKt$ClockText$3$1$1(m2167numberContentDescriptionYKJpE6Y);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue4);
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(localString, clearAndSetSemantics, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, copyAndSetFontPadding, composer2, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new TimePickerKt$ClockText$4(timePickerState, i, z, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m3007boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-gIWD5Rc  reason: not valid java name */
    public static final void m2168timeInputOnChangegIWD5Rc(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1<? super TextFieldValue, Unit> function1) {
        int parseInt;
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m5321copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m5082getStartimpl(textFieldValue.m5325getSelectiond9O1mEE()) == 1) {
                parseInt = CharsKt.digitToInt(textFieldValue.getText().charAt(0));
            } else {
                parseInt = Integer.parseInt(textFieldValue.getText());
            }
            if (parseInt <= i2) {
                if (Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(parseInt);
                    if (parseInt > 1 && !timePickerState.is24hour()) {
                        timePickerState.m2188setSelectioniHAOin8$material3_release(Selection.Companion.m1973getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(parseInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m5321copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* renamed from: TimePickerTextField-lxUZ_iY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2161TimePickerTextFieldlxUZ_iY(Modifier modifier, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, TimePickerState timePickerState, int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, Composer composer, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        int i7;
        Object rememberedValue;
        Object rememberedValue2;
        boolean m1968equalsimpl0;
        boolean z;
        FocusRequester focusRequester;
        int i8;
        int i9;
        int m2049getTimePickerHourTextFieldadMyvUU;
        boolean changed;
        TimePickerKt$TimePickerTextField$1$1$1$1 rememberedValue3;
        int m2050getTimePickerMinuteadMyvUU;
        Composer composer2;
        boolean changed2;
        TimePickerKt$TimePickerTextField$2$1 rememberedValue4;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-367523658);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimePickerTextField)P(3,7,4,6,5:c#material3.Selection,2,1)1396@52868L39,1397@52933L29,1398@53015L227,1404@53295L3274,1488@56607L103,1488@56575L135:TimePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(timePickerState) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i4 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i2) == 0) {
            obj = keyboardOptions;
            i4 |= startRestartGroup.changed(obj) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                obj2 = keyboardActions;
            } else {
                Object obj3 = keyboardActions;
                obj2 = obj3;
                if ((i2 & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                    obj2 = obj3;
                }
            }
            if ((i3 & 128) != 0) {
                if ((i2 & 29360128) == 0) {
                    i6 = startRestartGroup.changed(timePickerColors) ? 8388608 : 4194304;
                }
                i7 = i4;
                if ((23967451 & i7) == 4793490 || !startRestartGroup.getSkipping()) {
                    KeyboardOptions keyboardOptions3 = i10 != 0 ? KeyboardOptions.Companion.getDefault() : obj;
                    KeyboardActions keyboardActions3 = i5 != 0 ? KeyboardActions.Companion.getDefault() : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-367523658, i7, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1386)");
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    FocusRequester focusRequester2 = (FocusRequester) rememberedValue2;
                    TextFieldColors m1910colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(timePickerColors.m2156timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 2147483598, 4095);
                    m1968equalsimpl0 = Selection.m1968equalsimpl0(i, timePickerState.m2185getSelectionJiIwxys$material3_release());
                    int i11 = i7 & 14;
                    startRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                    int i12 = i11 >> 3;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i12 & 14) | (i12 & 112));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
                    int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 896149831, "C1415@53727L202,1423@53939L2043,1474@56136L206,1481@56409L9,1483@56471L10,1470@55992L571:TimePicker.kt#uh7d8r");
                    startRestartGroup.startReplaceableGroup(896149831);
                    ComposerKt.sourceInformation(startRestartGroup, "1406@53362L320");
                    if (m1968equalsimpl0) {
                        z = m1968equalsimpl0;
                        focusRequester = focusRequester2;
                        i8 = 2023513938;
                        i9 = 1;
                    } else {
                        int i14 = i7 >> 3;
                        z = m1968equalsimpl0;
                        focusRequester = focusRequester2;
                        i8 = 2023513938;
                        i9 = 1;
                        m2162TimeSelectoruXwN82Y(SizeKt.m797sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m2751getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2750getTimeFieldContainerHeightD9Ej5fM()), Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys()) ? timePickerState.getHourForDisplay$material3_release() : timePickerState.getMinute(), timePickerState, i, timePickerColors, startRestartGroup, (i14 & 7168) | (i14 & 896) | 6 | ((i7 >> 9) & 57344));
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (Selection.m1968equalsimpl0(i, Selection.Companion.m1973getMinuteJiIwxys())) {
                        m2049getTimePickerHourTextFieldadMyvUU = Strings.Companion.m2053getTimePickerMinuteTextFieldadMyvUU();
                    } else {
                        m2049getTimePickerHourTextFieldadMyvUU = Strings.Companion.m2049getTimePickerHourTextFieldadMyvUU();
                    }
                    String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(m2049getTimePickerHourTextFieldadMyvUU, startRestartGroup, 0);
                    Modifier visible = visible(Modifier.Companion, z);
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(visible);
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
                    Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1694936332, "C1430@54275L92,1436@54569L7,1442@54838L11,1443@54902L11,1424@53985L1987:TimePicker.kt#uh7d8r");
                    Modifier m797sizeVpY3zN4 = SizeKt.m797sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester), TimeInputTokens.INSTANCE.m2751getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2750getTimeFieldContainerHeightD9Ej5fM());
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m2058getStringNWtq28);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new TimePickerKt$TimePickerTextField$1$1$1$1(m2058getStringNWtq28);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(m797sizeVpY3zN4, false, (Function1) rememberedValue3, i9, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "CC:CompositionLocal.kt#9igjgp");
                    Object consume7 = startRestartGroup.consume(TextKt.getLocalTextStyle());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Brush.Companion companion = Brush.Companion;
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
                    pairArr[i9] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
                    pairArr[2] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
                    pairArr[3] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
                    pairArr[4] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
                    pairArr[5] = TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
                    FocusRequester focusRequester3 = focusRequester;
                    int i15 = i7 >> 3;
                    int i16 = i7 << 3;
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default, true, false, (TextStyle) consume7, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, Brush.Companion.m3249verticalGradient8A3gB4$default(companion, pairArr, 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 2133555260, i9, new TimePickerKt$TimePickerTextField$1$1$2(textFieldValue, mutableInteractionSource, m1910colors0hiis_0)), startRestartGroup, (i15 & 14) | 100666368 | (i15 & 112) | (i16 & 3670016) | (i16 & 29360128), 199680, 7696);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m709offsetVpY3zN4$default(Modifier.Companion, 0.0f, SupportLabelTop, 1, null), TimePickerKt$TimePickerTextField$1$2.INSTANCE);
                    if (Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys())) {
                        m2050getTimePickerMinuteadMyvUU = Strings.Companion.m2046getTimePickerHouradMyvUU();
                    } else {
                        m2050getTimePickerMinuteadMyvUU = Strings.Companion.m2050getTimePickerMinuteadMyvUU();
                    }
                    TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(m2050getTimePickerMinuteadMyvUU, startRestartGroup, 0), clearAndSetSemantics, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont()), startRestartGroup, 0, 0, 65528);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    Selection m1965boximpl = Selection.m1965boximpl(timePickerState.m2185getSelectionJiIwxys$material3_release());
                    Selection m1965boximpl2 = Selection.m1965boximpl(i);
                    composer2 = startRestartGroup;
                    composer2.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    changed2 = composer2.changed(m1965boximpl2) | composer2.changed(timePickerState) | composer2.changed(focusRequester3);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester3, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(m1965boximpl, (Function2) rememberedValue4, composer2, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    keyboardOptions2 = keyboardOptions3;
                    keyboardActions2 = keyboardActions3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    keyboardOptions2 = obj;
                    keyboardActions2 = obj2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new TimePickerKt$TimePickerTextField$3(modifier, textFieldValue, function1, timePickerState, i, keyboardOptions2, keyboardActions2, timePickerColors, i2, i3));
                return;
            }
            i6 = 12582912;
            i4 |= i6;
            i7 = i4;
            if ((23967451 & i7) == 4793490) {
            }
            if (i10 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            FocusRequester focusRequester22 = (FocusRequester) rememberedValue2;
            TextFieldColors m1910colors0hiis_02 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(timePickerColors.m2156timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 2147483598, 4095);
            m1968equalsimpl0 = Selection.m1968equalsimpl0(i, timePickerState.m2185getSelectionJiIwxys$material3_release());
            int i112 = i7 & 14;
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            int i122 = i112 >> 3;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i122 & 14) | (i122 & 112));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume22;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume32;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(modifier);
            int i132 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i132 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 896149831, "C1415@53727L202,1423@53939L2043,1474@56136L206,1481@56409L9,1483@56471L10,1470@55992L571:TimePicker.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(896149831);
            ComposerKt.sourceInformation(startRestartGroup, "1406@53362L320");
            if (m1968equalsimpl0) {
            }
            startRestartGroup.endReplaceableGroup();
            if (Selection.m1968equalsimpl0(i, Selection.Companion.m1973getMinuteJiIwxys())) {
            }
            String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(m2049getTimePickerHourTextFieldadMyvUU, startRestartGroup, 0);
            Modifier visible2 = visible(Modifier.Companion, z);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume42;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
            Object consume52 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume52;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
            Object consume62 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume62;
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(visible2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl22 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl22, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl22, density22, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl22, layoutDirection22, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl22, viewConfiguration22, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1694936332, "C1430@54275L92,1436@54569L7,1442@54838L11,1443@54902L11,1424@53985L1987:TimePicker.kt#uh7d8r");
            Modifier m797sizeVpY3zN42 = SizeKt.m797sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester), TimeInputTokens.INSTANCE.m2751getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2750getTimeFieldContainerHeightD9Ej5fM());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m2058getStringNWtq282);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new TimePickerKt$TimePickerTextField$1$1$1$1(m2058getStringNWtq282);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m797sizeVpY3zN42, false, (Function1) rememberedValue3, i9, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "CC:CompositionLocal.kt#9igjgp");
            Object consume72 = startRestartGroup.consume(TextKt.getLocalTextStyle());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Brush.Companion companion2 = Brush.Companion;
            Pair[] pairArr2 = new Pair[6];
            pairArr2[0] = TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
            pairArr2[i9] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
            pairArr2[2] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
            pairArr2[3] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
            pairArr2[4] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
            pairArr2[5] = TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
            FocusRequester focusRequester32 = focusRequester;
            int i152 = i7 >> 3;
            int i162 = i7 << 3;
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default2, true, false, (TextStyle) consume72, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, Brush.Companion.m3249verticalGradient8A3gB4$default(companion2, pairArr2, 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 2133555260, i9, new TimePickerKt$TimePickerTextField$1$1$2(textFieldValue, mutableInteractionSource2, m1910colors0hiis_02)), startRestartGroup, (i152 & 14) | 100666368 | (i152 & 112) | (i162 & 3670016) | (i162 & 29360128), 199680, 7696);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m709offsetVpY3zN4$default(Modifier.Companion, 0.0f, SupportLabelTop, 1, null), TimePickerKt$TimePickerTextField$1$2.INSTANCE);
            if (Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys())) {
            }
            TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(m2050getTimePickerMinuteadMyvUU, startRestartGroup, 0), clearAndSetSemantics2, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont()), startRestartGroup, 0, 0, 65528);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Selection m1965boximpl3 = Selection.m1965boximpl(timePickerState.m2185getSelectionJiIwxys$material3_release());
            Selection m1965boximpl22 = Selection.m1965boximpl(i);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            changed2 = composer2.changed(m1965boximpl22) | composer2.changed(timePickerState) | composer2.changed(focusRequester32);
            rememberedValue4 = composer2.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester32, null);
            composer2.updateRememberedValue(rememberedValue4);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(m1965boximpl3, (Function2) rememberedValue4, composer2, 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = keyboardOptions;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i6;
        i7 = i4;
        if ((23967451 & i7) == 4793490) {
        }
        if (i10 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester222 = (FocusRequester) rememberedValue2;
        TextFieldColors m1910colors0hiis_022 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(timePickerColors.m2156timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2155timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 2147483598, 4095);
        m1968equalsimpl0 = Selection.m1968equalsimpl0(i, timePickerState.m2185getSelectionJiIwxys$material3_release());
        int i1122 = i7 & 14;
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
        int i1222 = i1122 >> 3;
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, (i1222 & 14) | (i1222 & 112));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume82 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density32 = (Density) consume82;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection32 = (LayoutDirection) consume222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration32 = (ViewConfiguration) consume322;
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf32 = LayoutKt.materializerOf(modifier);
        int i1322 = ((((i1122 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m2893constructorimpl32 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl32, columnMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl32, density32, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl32, layoutDirection32, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl32, viewConfiguration32, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf32.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i1322 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 896149831, "C1415@53727L202,1423@53939L2043,1474@56136L206,1481@56409L9,1483@56471L10,1470@55992L571:TimePicker.kt#uh7d8r");
        startRestartGroup.startReplaceableGroup(896149831);
        ComposerKt.sourceInformation(startRestartGroup, "1406@53362L320");
        if (m1968equalsimpl0) {
        }
        startRestartGroup.endReplaceableGroup();
        if (Selection.m1968equalsimpl0(i, Selection.Companion.m1973getMinuteJiIwxys())) {
        }
        String m2058getStringNWtq2822 = Strings_androidKt.m2058getStringNWtq28(m2049getTimePickerHourTextFieldadMyvUU, startRestartGroup, 0);
        Modifier visible22 = visible(Modifier.Companion, z);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume422;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume522 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume522;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "C:CompositionLocal.kt#9igjgp");
        Object consume622 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume622;
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(visible22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m2893constructorimpl222 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl222, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl222, density222, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl222, layoutDirection222, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl222, viewConfiguration222, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1694936332, "C1430@54275L92,1436@54569L7,1442@54838L11,1443@54902L11,1424@53985L1987:TimePicker.kt#uh7d8r");
        Modifier m797sizeVpY3zN422 = SizeKt.m797sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester), TimeInputTokens.INSTANCE.m2751getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m2750getTimeFieldContainerHeightD9Ej5fM());
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m2058getStringNWtq2822);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new TimePickerKt$TimePickerTextField$1$1$1$1(m2058getStringNWtq2822);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m797sizeVpY3zN422, false, (Function1) rememberedValue3, i9, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i8, "CC:CompositionLocal.kt#9igjgp");
        Object consume722 = startRestartGroup.consume(TextKt.getLocalTextStyle());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Brush.Companion companion22 = Brush.Companion;
        Pair[] pairArr22 = new Pair[6];
        pairArr22[0] = TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
        pairArr22[i9] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
        pairArr22[2] = TuplesKt.to(Float.valueOf(0.1f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
        pairArr22[3] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1646getPrimary0d7_KjU()));
        pairArr22[4] = TuplesKt.to(Float.valueOf(0.9f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
        pairArr22[5] = TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()));
        FocusRequester focusRequester322 = focusRequester;
        int i1522 = i7 >> 3;
        int i1622 = i7 << 3;
        BasicTextFieldKt.BasicTextField(textFieldValue, function1, semantics$default22, true, false, (TextStyle) consume722, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource22, Brush.Companion.m3249verticalGradient8A3gB4$default(companion22, pairArr22, 0.0f, 0.0f, 0, 14, (Object) null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 2133555260, i9, new TimePickerKt$TimePickerTextField$1$1$2(textFieldValue, mutableInteractionSource22, m1910colors0hiis_022)), startRestartGroup, (i1522 & 14) | 100666368 | (i1522 & 112) | (i1622 & 3670016) | (i1622 & 29360128), 199680, 7696);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier clearAndSetSemantics22 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m709offsetVpY3zN4$default(Modifier.Companion, 0.0f, SupportLabelTop, 1, null), TimePickerKt$TimePickerTextField$1$2.INSTANCE);
        if (Selection.m1968equalsimpl0(i, Selection.Companion.m1972getHourJiIwxys())) {
        }
        TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(m2050getTimePickerMinuteadMyvUU, startRestartGroup, 0), clearAndSetSemantics22, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont()), startRestartGroup, 0, 0, 65528);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Selection m1965boximpl32 = Selection.m1965boximpl(timePickerState.m2185getSelectionJiIwxys$material3_release());
        Selection m1965boximpl222 = Selection.m1965boximpl(i);
        composer2 = startRestartGroup;
        composer2.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed2 = composer2.changed(m1965boximpl222) | composer2.changed(timePickerState) | composer2.changed(focusRequester322);
        rememberedValue4 = composer2.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester322, null);
        composer2.updateRememberedValue(rememberedValue4);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m1965boximpl32, (Function2) rememberedValue4, composer2, 64);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardOptions2 = keyboardOptions3;
        keyboardActions2 = keyboardActions3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularLayout-uFdPcIQ  reason: not valid java name */
    public static final void m2159CircularLayoutuFdPcIQ(Modifier modifier, final float f, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1502@56908L1669:TimePicker.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1497)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                    return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Object obj;
                    Object obj2;
                    boolean z;
                    boolean z2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    float f2 = Layout.mo588toPx0680j_4(f);
                    long m5542copyZbe2FdA$default = Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                    List<? extends Measurable> list = measurables;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean z3 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        Measurable measurable = (Measurable) next;
                        if ((LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector || LayoutIdKt.getLayoutId(measurable) == LayoutId.InnerCircle) ? false : false) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList<Measurable> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    for (Measurable measurable2 : arrayList2) {
                        arrayList3.add(measurable2.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
                    }
                    ArrayList arrayList4 = arrayList3;
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (LayoutIdKt.getLayoutId((Measurable) obj) == LayoutId.Selector) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    Measurable measurable3 = (Measurable) obj;
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (LayoutIdKt.getLayoutId((Measurable) obj2) == LayoutId.InnerCircle) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    Measurable measurable4 = (Measurable) obj2;
                    return MeasureScope.CC.layout$default(Layout, Constraints.m5553getMinWidthimpl(j), Constraints.m5552getMinHeightimpl(j), null, new TimePickerKt$CircularLayout$1$measure$1(measurable3 != null ? measurable3.mo4545measureBRTryo0(m5542copyZbe2FdA$default) : null, arrayList4, measurable4 != null ? measurable4.mo4545measureBRTryo0(m5542copyZbe2FdA$default) : null, j, f2, 6.2831855f / arrayList4.size()), 4, null);
                }
            };
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TimePickerKt$CircularLayout$2(modifier2, f, function2, i, i2));
    }

    /* renamed from: numberContentDescription-YKJpE6Y  reason: not valid java name */
    public static final String m2167numberContentDescriptionYKJpE6Y(int i, boolean z, int i2, Composer composer, int i3) {
        int m2048getTimePickerHourSuffixadMyvUU;
        ComposerKt.sourceInformationMarkerStart(composer, 1826155772, "C(numberContentDescription)P(2:c#material3.Selection)1555@58952L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1542)");
        }
        if (Selection.m1968equalsimpl0(i, Selection.Companion.m1973getMinuteJiIwxys())) {
            m2048getTimePickerHourSuffixadMyvUU = Strings.Companion.m2052getTimePickerMinuteSuffixadMyvUU();
        } else if (z) {
            m2048getTimePickerHourSuffixadMyvUU = Strings.Companion.m2044getTimePicker24HourSuffixadMyvUU();
        } else {
            m2048getTimePickerHourSuffixadMyvUU = Strings.Companion.m2048getTimePickerHourSuffixadMyvUU();
        }
        String m2059getStringiSCLEhQ = Strings_androidKt.m2059getStringiSCLEhQ(m2048getTimePickerHourSuffixadMyvUU, new Object[]{Integer.valueOf(i2)}, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2059getStringiSCLEhQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Float, Float> valuesForAnimation(float f, float f2) {
        if (Math.abs(f - f2) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = f;
        if (d > 3.141592653589793d && f2 < 3.141592653589793d) {
            f2 += FullCircle;
        } else if (d < 3.141592653589793d && f2 > 3.141592653589793d) {
            f += FullCircle;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    private static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLocalString(int i, int i2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i2);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier clockDial(Modifier modifier, TimePickerState timePickerState, boolean z) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$clockDial$$inlined$debugInspectorInfo$1(timePickerState) : InspectableValueKt.getNoInspectorInfo(), new TimePickerKt$clockDial$2(timePickerState, z));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f = 24;
        ClockFaceBottomMargin = Dp.m5607constructorimpl(f);
        DisplaySeparatorWidth = Dp.m5607constructorimpl(f);
        TimeInputBottomPadding = Dp.m5607constructorimpl(f);
        List<Integer> listOf = CollectionsKt.listOf((Object[]) new Integer[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        Hours = listOf;
        List<Integer> list = listOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Number number : list) {
            arrayList.add(Integer.valueOf((number.intValue() % 12) + 12));
        }
        ExtraHours = arrayList;
        PeriodToggleMargin = Dp.m5607constructorimpl(12);
    }
}
