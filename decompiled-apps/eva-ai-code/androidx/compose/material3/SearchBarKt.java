package androidx.compose.material3;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0080\u0002\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u0002092\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b<H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u008a\u0002\u0010?\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u00108\u001a\u0002092\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b<H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001aÆ\u0001\u0010D\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00105\u001a\u00020E2\b\b\u0002\u00108\u001a\u000209H\u0003¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0018\u001a\u00020\u0010X\u0082\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0019\u0010\u001a\"\u0013\u0010\u001b\u001a\u00020\u0010X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013\"\u0013\u0010\u001c\u001a\u00020\u0010X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013\"\u0019\u0010\u001d\u001a\u00020\u0010X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012\"\u0019\u0010\u001f\u001a\u00020\u0010X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "DockedActiveTableMaxHeightScreenRatio", "DockedActiveTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedActiveTableMinHeight", "()F", "F", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "DockedSearchBar", "", SearchIntents.EXTRA_QUERY, "", "onQueryChange", "Lkotlin/Function1;", "onSearch", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "onActiveChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-rpjkMjA", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Id_Pb_0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarInputField", "Landroidx/compose/material3/TextFieldColors;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final float DockedActiveTableMaxHeightScreenRatio = 0.6666667f;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float SearchBarCornerRadius = Dp.m5607constructorimpl(SearchBarDefaults.INSTANCE.m1957getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedActiveTableMinHeight = Dp.m5607constructorimpl((float) PsExtractor.VIDEO_STREAM_MASK);
    private static final float SearchBarMinWidth = Dp.m5607constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m5607constructorimpl(720);
    private static final float SearchBarVerticalPadding = Dp.m5607constructorimpl(8);
    private static final float SearchBarIconOffsetX = Dp.m5607constructorimpl(4);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c5, code lost:
        if (r6.changed(r57) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* renamed from: SearchBar-Id_Pb_0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1961SearchBarId_Pb_0(String query, Function1<? super String, Unit> onQueryChange, Function1<? super String, Unit> onSearch, boolean z, Function1<? super Boolean, Unit> onActiveChange, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        SearchBarColors searchBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        WindowInsets windowInsets2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        SearchBarColors searchBarColors3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        boolean z3;
        Shape shape3;
        float f2;
        MutableInteractionSource mutableInteractionSource2;
        WindowInsets windowInsets3;
        int i8;
        Modifier modifier2;
        State<Float> animateFloatAsState;
        Density density;
        Shape inputFieldShape;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        GenericShape genericShape;
        Object rememberedValue3;
        boolean z4;
        boolean changed2;
        Object rememberedValue4;
        boolean changed3;
        SearchBarKt$SearchBar$2$1 rememberedValue5;
        boolean changed4;
        SearchBarKt$SearchBar$3$1 rememberedValue6;
        WindowInsets windowInsets4;
        Composer composer2;
        boolean changed5;
        SearchBarKt$SearchBar$6$1 rememberedValue7;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        SearchBarColors searchBarColors4;
        float f3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onActiveChange, "onActiveChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(156000634);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)P(11,8,9!1,7,6,3,10,5,14,12!1,13:c#ui.unit.Dp,15,4)170@8704L15,171@8769L8,173@8884L12,174@8948L39,177@9084L160,182@9287L7,183@9326L7,185@9386L15,186@9453L15,187@9499L101,190@9625L578,210@10651L34,211@10707L179,221@10994L38,225@11170L112,229@11354L1074,218@10892L2701,282@13599L306,291@13941L37,291@13911L67:SearchBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(query) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i10 = 16;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onQueryChange) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(onSearch) ? 256 : 128;
        }
        int i11 = 2048;
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changedInstance(onActiveChange) ? 16384 : 8192;
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        int i14 = i3 & 128;
        if (i14 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i16 = i3 & 512;
        if (i16 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                i9 = 4;
                i5 = i2 | i9;
            }
            i9 = 2;
            i5 = i2 | i9;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                i10 = 32;
            }
            i5 |= i10;
        }
        int i17 = i5;
        int i18 = i3 & 4096;
        if (i18 != 0) {
            i17 |= 384;
        } else if ((i2 & 896) == 0) {
            i17 |= startRestartGroup.changed(f) ? 256 : 128;
            if ((i2 & 7168) == 0) {
                if ((i3 & 8192) != 0) {
                }
                i11 = 1024;
                i17 |= i11;
            }
            i6 = i3 & 16384;
            if (i6 == 0) {
                i17 |= 24576;
                obj = mutableInteractionSource;
            } else {
                obj = mutableInteractionSource;
                if ((i2 & 57344) == 0) {
                    i17 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                }
            }
            if ((i3 & 32768) != 0) {
                if ((i2 & 458752) == 0) {
                    i7 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                }
                if ((i4 & 1533916891) == 306783378 || (374491 & i17) != 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i12 != 0 ? Modifier.Companion : modifier;
                        boolean z6 = i13 != 0 ? true : z2;
                        Function2<? super Composer, ? super Integer, Unit> function212 = i14 != 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function213 = i15 != 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function214 = i16 != 0 ? null : function23;
                        if ((i3 & 1024) != 0) {
                            function24 = function213;
                            shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                            i17 &= -15;
                        } else {
                            function24 = function213;
                            shape2 = shape;
                        }
                        if ((i3 & 2048) != 0) {
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m1955colorsKlgxPg(0L, 0L, null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                            i17 &= -113;
                        } else {
                            searchBarColors2 = searchBarColors;
                        }
                        float m1956getElevationD9Ej5fM = i18 != 0 ? SearchBarDefaults.INSTANCE.m1956getElevationD9Ej5fM() : f;
                        SearchBarColors searchBarColors5 = searchBarColors2;
                        if ((i3 & 8192) != 0) {
                            function25 = function214;
                            windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            i17 &= -7169;
                        } else {
                            function25 = function214;
                            windowInsets2 = windowInsets;
                        }
                        if (i6 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.Companion.getEmpty()) {
                                rememberedValue8 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            startRestartGroup.endReplaceableGroup();
                            function26 = function24;
                            searchBarColors3 = searchBarColors5;
                            function27 = function25;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue8;
                            modifier2 = companion;
                            function28 = function212;
                            z3 = z6;
                            shape3 = shape2;
                            f2 = m1956getElevationD9Ej5fM;
                            windowInsets3 = windowInsets2;
                            i8 = i17;
                        } else {
                            function26 = function24;
                            searchBarColors3 = searchBarColors5;
                            function27 = function25;
                            function28 = function212;
                            z3 = z6;
                            shape3 = shape2;
                            f2 = m1956getElevationD9Ej5fM;
                            mutableInteractionSource2 = obj;
                            windowInsets3 = windowInsets2;
                            i8 = i17;
                            modifier2 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 1024) != 0) {
                            i17 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i17 &= -113;
                        }
                        if ((i3 & 8192) != 0) {
                            i17 &= -7169;
                        }
                        z3 = z2;
                        function28 = function2;
                        function26 = function22;
                        function27 = function23;
                        shape3 = shape;
                        searchBarColors3 = searchBarColors;
                        f2 = f;
                        windowInsets3 = windowInsets;
                        i8 = i17;
                        mutableInteractionSource2 = obj;
                        modifier2 = modifier;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(156000634, i4, i8, "androidx.compose.material3.SearchBar (SearchBar.kt:159)");
                    }
                    animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, z ? AnimationEnterFloatSpec : AnimationExitFloatSpec, 0.0f, null, null, startRestartGroup, 64, 28);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager = (FocusManager) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    density = (Density) consume2;
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                    Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    int i19 = i4;
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new SearchBarKt$SearchBar$useFullScreenShape$2$1(animateFloatAsState));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    State state = (State) rememberedValue;
                    Boolean valueOf = Boolean.valueOf(SearchBar_Id_Pb_0$lambda$2(state));
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(shape3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
                            genericShape = SearchBar_Id_Pb_0$lambda$2(state) ? fullScreenShape : shape3;
                        } else {
                            genericShape = new GenericShape(new SearchBarKt$SearchBar$animatedShape$1$1(density, animateFloatAsState));
                        }
                        startRestartGroup.updateRememberedValue(genericShape);
                        rememberedValue2 = genericShape;
                    }
                    startRestartGroup.endReplaceableGroup();
                    Shape shape5 = (Shape) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.Companion.getEmpty()) {
                        z4 = true;
                        rememberedValue3 = new MutableWindowInsets(null, 1, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        z4 = true;
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue3;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(density);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt.derivedStateOf(new SearchBarKt$SearchBar$topPadding$1$1(mutableWindowInsets, density));
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    State state2 = (State) rememberedValue4;
                    long m1953getContainerColor0d7_KjU = searchBarColors3.m1953getContainerColor0d7_KjU();
                    WindowInsets windowInsets5 = windowInsets3;
                    long m1687contentColorForek8zF_U = ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0);
                    Modifier zIndex = ZIndexModifierKt.zIndex(modifier2, 1.0f);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(mutableWindowInsets) | startRestartGroup.changed(windowInsets5);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new SearchBarKt$SearchBar$2$1(mutableWindowInsets, windowInsets5);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex, (Function1) rememberedValue5), mutableWindowInsets);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = startRestartGroup.changed(state2) | startRestartGroup.changed(animateFloatAsState);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                        rememberedValue6 = new SearchBarKt$SearchBar$3$1(state2, animateFloatAsState);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i20 = i8;
                    windowInsets4 = windowInsets5;
                    Shape shape6 = shape3;
                    Modifier modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2067SurfaceT9BRK9s(LayoutModifierKt.layout(consumeWindowInsets, (Function3) rememberedValue6), shape5, m1953getContainerColor0d7_KjU, m1687contentColorForek8zF_U, f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new SearchBarKt$SearchBar$4(query, onQueryChange, onSearch, z, onActiveChange, z3, function28, function26, function27, searchBarColors3, mutableInteractionSource2, i19, i20, animateFloatAsState, state2, content)), composer2, ((i20 << 6) & 57344) | 12582912, 96);
                    int i21 = (i19 >> 9) & 14;
                    EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$SearchBar$5(z, focusManager, null), composer2, i21 | 64);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed5 = composer2.changed(onActiveChange);
                    rememberedValue7 = composer2.rememberedValue();
                    if (!changed5 || rememberedValue7 == Composer.Companion.getEmpty()) {
                        rememberedValue7 = new SearchBarKt$SearchBar$6$1(onActiveChange);
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) rememberedValue7, composer2, i21, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    function29 = function28;
                    function210 = function26;
                    function211 = function27;
                    searchBarColors4 = searchBarColors3;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape4 = shape6;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z5 = z2;
                    function29 = function2;
                    function210 = function22;
                    function211 = function23;
                    shape4 = shape;
                    f3 = f;
                    windowInsets4 = windowInsets;
                    mutableInteractionSource3 = obj;
                    searchBarColors4 = searchBarColors;
                    composer2 = startRestartGroup;
                    modifier3 = modifier;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new SearchBarKt$SearchBar$7(query, onQueryChange, onSearch, z, onActiveChange, modifier3, z5, function29, function210, function211, shape4, searchBarColors4, f3, windowInsets4, mutableInteractionSource3, content, i, i2, i3));
                return;
            }
            i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 |= i7;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if (i18 != 0) {
            }
            SearchBarColors searchBarColors52 = searchBarColors2;
            if ((i3 & 8192) != 0) {
            }
            if (i6 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, z ? AnimationEnterFloatSpec : AnimationExitFloatSpec, 0.0f, null, null, startRestartGroup, 64, 28);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager2 = (FocusManager) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            density = (Density) consume22;
            inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
            Shape fullScreenShape2 = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            int i192 = i4;
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            State state3 = (State) rememberedValue;
            Boolean valueOf2 = Boolean.valueOf(SearchBar_Id_Pb_0$lambda$2(state3));
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(shape3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
            }
            startRestartGroup.updateRememberedValue(genericShape);
            rememberedValue2 = genericShape;
            startRestartGroup.endReplaceableGroup();
            Shape shape52 = (Shape) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableWindowInsets mutableWindowInsets2 = (MutableWindowInsets) rememberedValue3;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(density);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = SnapshotStateKt.derivedStateOf(new SearchBarKt$SearchBar$topPadding$1$1(mutableWindowInsets2, density));
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            State state22 = (State) rememberedValue4;
            long m1953getContainerColor0d7_KjU2 = searchBarColors3.m1953getContainerColor0d7_KjU();
            WindowInsets windowInsets52 = windowInsets3;
            long m1687contentColorForek8zF_U2 = ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0);
            Modifier zIndex2 = ZIndexModifierKt.zIndex(modifier2, 1.0f);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(mutableWindowInsets2) | startRestartGroup.changed(windowInsets52);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new SearchBarKt$SearchBar$2$1(mutableWindowInsets2, windowInsets52);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            Modifier consumeWindowInsets2 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex2, (Function1) rememberedValue5), mutableWindowInsets2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = startRestartGroup.changed(state22) | startRestartGroup.changed(animateFloatAsState);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue6 = new SearchBarKt$SearchBar$3$1(state22, animateFloatAsState);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            int i202 = i8;
            windowInsets4 = windowInsets52;
            Shape shape62 = shape3;
            Modifier modifier42 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m2067SurfaceT9BRK9s(LayoutModifierKt.layout(consumeWindowInsets2, (Function3) rememberedValue6), shape52, m1953getContainerColor0d7_KjU2, m1687contentColorForek8zF_U2, f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new SearchBarKt$SearchBar$4(query, onQueryChange, onSearch, z, onActiveChange, z3, function28, function26, function27, searchBarColors3, mutableInteractionSource2, i192, i202, animateFloatAsState, state22, content)), composer2, ((i202 << 6) & 57344) | 12582912, 96);
            int i212 = (i192 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$SearchBar$5(z, focusManager2, null), composer2, i212 | 64);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed5 = composer2.changed(onActiveChange);
            rememberedValue7 = composer2.rememberedValue();
            if (!changed5) {
            }
            rememberedValue7 = new SearchBarKt$SearchBar$6$1(onActiveChange);
            composer2.updateRememberedValue(rememberedValue7);
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z, (Function0) rememberedValue7, composer2, i212, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z3;
            function29 = function28;
            function210 = function26;
            function211 = function27;
            searchBarColors4 = searchBarColors3;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape4 = shape62;
            modifier3 = modifier42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 7168) == 0) {
        }
        i6 = i3 & 16384;
        if (i6 == 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        i17 |= i7;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if (i18 != 0) {
        }
        SearchBarColors searchBarColors522 = searchBarColors2;
        if ((i3 & 8192) != 0) {
        }
        if (i6 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, z ? AnimationEnterFloatSpec : AnimationExitFloatSpec, 0.0f, null, null, startRestartGroup, 64, 28);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager22 = (FocusManager) consume32;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        density = (Density) consume222;
        inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
        Shape fullScreenShape22 = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        int i1922 = i4;
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        State state32 = (State) rememberedValue;
        Boolean valueOf22 = Boolean.valueOf(SearchBar_Id_Pb_0$lambda$2(state32));
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(shape3);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
        }
        startRestartGroup.updateRememberedValue(genericShape);
        rememberedValue2 = genericShape;
        startRestartGroup.endReplaceableGroup();
        Shape shape522 = (Shape) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableWindowInsets mutableWindowInsets22 = (MutableWindowInsets) rememberedValue3;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(density);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = SnapshotStateKt.derivedStateOf(new SearchBarKt$SearchBar$topPadding$1$1(mutableWindowInsets22, density));
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        State state222 = (State) rememberedValue4;
        long m1953getContainerColor0d7_KjU22 = searchBarColors3.m1953getContainerColor0d7_KjU();
        WindowInsets windowInsets522 = windowInsets3;
        long m1687contentColorForek8zF_U22 = ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0);
        Modifier zIndex22 = ZIndexModifierKt.zIndex(modifier2, 1.0f);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(mutableWindowInsets22) | startRestartGroup.changed(windowInsets522);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new SearchBarKt$SearchBar$2$1(mutableWindowInsets22, windowInsets522);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        Modifier consumeWindowInsets22 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex22, (Function1) rememberedValue5), mutableWindowInsets22);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = startRestartGroup.changed(state222) | startRestartGroup.changed(animateFloatAsState);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue6 = new SearchBarKt$SearchBar$3$1(state222, animateFloatAsState);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        int i2022 = i8;
        windowInsets4 = windowInsets522;
        Shape shape622 = shape3;
        Modifier modifier422 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m2067SurfaceT9BRK9s(LayoutModifierKt.layout(consumeWindowInsets22, (Function3) rememberedValue6), shape522, m1953getContainerColor0d7_KjU22, m1687contentColorForek8zF_U22, f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new SearchBarKt$SearchBar$4(query, onQueryChange, onSearch, z, onActiveChange, z3, function28, function26, function27, searchBarColors3, mutableInteractionSource2, i1922, i2022, animateFloatAsState, state222, content)), composer2, ((i2022 << 6) & 57344) | 12582912, 96);
        int i2122 = (i1922 >> 9) & 14;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$SearchBar$5(z, focusManager22, null), composer2, i2122 | 64);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed5 = composer2.changed(onActiveChange);
        rememberedValue7 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue7 = new SearchBarKt$SearchBar$6$1(onActiveChange);
        composer2.updateRememberedValue(rememberedValue7);
        composer2.endReplaceableGroup();
        BackHandlerKt.BackHandler(z, (Function0) rememberedValue7, composer2, i2122, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z3;
        function29 = function28;
        function210 = function26;
        function211 = function27;
        searchBarColors4 = searchBarColors3;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        shape4 = shape622;
        modifier3 = modifier422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* renamed from: DockedSearchBar-rpjkMjA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1960DockedSearchBarrpjkMjA(String query, Function1<? super String, Unit> onQueryChange, Function1<? super String, Unit> onSearch, boolean z, Function1<? super Boolean, Unit> onActiveChange, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Shape shape2;
        SearchBarColors searchBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z3;
        float f2;
        Shape shape3;
        SearchBarColors searchBarColors3;
        int i7;
        Modifier modifier2;
        Composer composer2;
        boolean changed;
        SearchBarKt$DockedSearchBar$4$1 rememberedValue;
        Modifier modifier3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape4;
        SearchBarColors searchBarColors4;
        float f3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onActiveChange, "onActiveChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-451213062);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,14,12!1,13:c#ui.unit.Dp,4)353@17339L11,354@17400L8,356@17514L39,359@17649L7,364@17756L38,361@17662L1564,406@19232L306,415@19574L37,415@19544L67:SearchBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(query) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i9 = 16;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onQueryChange) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(onSearch) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changedInstance(onActiveChange) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i14 = i3 & 512;
        if (i14 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                i8 = 4;
                i5 = i2 | i8;
            }
            i8 = 2;
            i5 = i2 | i8;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                i9 = 32;
            }
            i5 |= i9;
        }
        int i15 = i5;
        int i16 = i3 & 4096;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i2 & 896) == 0) {
            i15 |= startRestartGroup.changed(f) ? 256 : 128;
            i6 = i3 & 8192;
            if (i6 == 0) {
                i15 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                i15 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                if ((i3 & 16384) != 0) {
                    i15 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i15 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((1533916891 & i4) == 306783378 || (46811 & i15) != 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier;
                        boolean z5 = i11 != 0 ? true : z2;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i12 != 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i13 != 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function212 = i14 != 0 ? null : function23;
                        if ((i3 & 1024) != 0) {
                            shape2 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                            i15 &= -15;
                        } else {
                            shape2 = shape;
                        }
                        if ((i3 & 2048) != 0) {
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m1955colorsKlgxPg(0L, 0L, null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                            i15 &= -113;
                        } else {
                            searchBarColors2 = searchBarColors;
                        }
                        float m1956getElevationD9Ej5fM = i16 != 0 ? SearchBarDefaults.INSTANCE.m1956getElevationD9Ej5fM() : f;
                        if (i6 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            Function2<? super Composer, ? super Integer, Unit> function213 = function211;
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            function24 = function213;
                            function25 = function212;
                            function26 = function210;
                            z3 = z5;
                            f2 = m1956getElevationD9Ej5fM;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                        } else {
                            function24 = function211;
                            mutableInteractionSource2 = mutableInteractionSource;
                            function25 = function212;
                            function26 = function210;
                            z3 = z5;
                            f2 = m1956getElevationD9Ej5fM;
                        }
                        shape3 = shape2;
                        searchBarColors3 = searchBarColors2;
                        i7 = i15;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 1024) != 0) {
                            i15 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i15 &= -113;
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        function26 = function2;
                        function24 = function22;
                        function25 = function23;
                        shape3 = shape;
                        searchBarColors3 = searchBarColors;
                        f2 = f;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i7 = i15;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-451213062, i4, i7, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i17 = i4;
                    Modifier modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    int i18 = i7;
                    SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.m800width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, searchBarColors3.m1953getContainerColor0d7_KjU(), ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0), f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new SearchBarKt$DockedSearchBar$2(query, onQueryChange, onSearch, z, onActiveChange, z3, function26, function24, function25, searchBarColors3, mutableInteractionSource2, i17, i7, content)), composer2, ((i18 << 3) & 112) | 12582912 | ((i18 << 6) & 57344), 96);
                    int i19 = (i17 >> 9) & 14;
                    EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$DockedSearchBar$3(z, (FocusManager) consume, null), composer2, i19 | 64);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = composer2.changed(onActiveChange);
                    rememberedValue = composer2.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new SearchBarKt$DockedSearchBar$4$1(onActiveChange);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) rememberedValue, composer2, i19, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z3;
                    function27 = function26;
                    function28 = function24;
                    function29 = function25;
                    shape4 = shape3;
                    searchBarColors4 = searchBarColors3;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    function27 = function2;
                    function28 = function22;
                    function29 = function23;
                    shape4 = shape;
                    searchBarColors4 = searchBarColors;
                    f3 = f;
                    mutableInteractionSource3 = mutableInteractionSource;
                    composer2 = startRestartGroup;
                    modifier3 = modifier;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new SearchBarKt$DockedSearchBar$5(query, onQueryChange, onSearch, z, onActiveChange, modifier3, z4, function27, function28, function29, shape4, searchBarColors4, f3, mutableInteractionSource3, content, i, i2, i3));
                return;
            }
            if ((i3 & 16384) != 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if (i16 != 0) {
            }
            if (i6 != 0) {
            }
            shape3 = shape2;
            searchBarColors3 = searchBarColors2;
            i7 = i15;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i172 = i4;
            Modifier modifier42 = modifier2;
            composer2 = startRestartGroup;
            int i182 = i7;
            SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.m800width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, searchBarColors3.m1953getContainerColor0d7_KjU(), ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0), f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new SearchBarKt$DockedSearchBar$2(query, onQueryChange, onSearch, z, onActiveChange, z3, function26, function24, function25, searchBarColors3, mutableInteractionSource2, i172, i7, content)), composer2, ((i182 << 3) & 112) | 12582912 | ((i182 << 6) & 57344), 96);
            int i192 = (i172 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$DockedSearchBar$3(z, (FocusManager) consume2, null), composer2, i192 | 64);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = composer2.changed(onActiveChange);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new SearchBarKt$DockedSearchBar$4$1(onActiveChange);
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z, (Function0) rememberedValue, composer2, i192, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
            z4 = z3;
            function27 = function26;
            function28 = function24;
            function29 = function25;
            shape4 = shape3;
            searchBarColors4 = searchBarColors3;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i3 & 8192;
        if (i6 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if (i16 != 0) {
        }
        if (i6 != 0) {
        }
        shape3 = shape2;
        searchBarColors3 = searchBarColors2;
        i7 = i15;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i1722 = i4;
        Modifier modifier422 = modifier2;
        composer2 = startRestartGroup;
        int i1822 = i7;
        SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.m800width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, searchBarColors3.m1953getContainerColor0d7_KjU(), ColorSchemeKt.m1687contentColorForek8zF_U(searchBarColors3.m1953getContainerColor0d7_KjU(), startRestartGroup, 0), f2, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new SearchBarKt$DockedSearchBar$2(query, onQueryChange, onSearch, z, onActiveChange, z3, function26, function24, function25, searchBarColors3, mutableInteractionSource2, i1722, i7, content)), composer2, ((i1822 << 3) & 112) | 12582912 | ((i1822 << 6) & 57344), 96);
        int i1922 = (i1722 >> 9) & 14;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SearchBarKt$DockedSearchBar$3(z, (FocusManager) consume22, null), composer2, i1922 | 64);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = composer2.changed(onActiveChange);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new SearchBarKt$DockedSearchBar$4$1(onActiveChange);
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        BackHandlerKt.BackHandler(z, (Function0) rememberedValue, composer2, i1922, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422;
        z4 = z3;
        function27 = function26;
        function28 = function24;
        function29 = function25;
        shape4 = shape3;
        searchBarColors4 = searchBarColors3;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0375 A[LOOP:0: B:187:0x0373->B:188:0x0375, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBarInputField(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, boolean z, Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        TextFieldColors textFieldColors2;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        TextFieldColors textFieldColors3;
        int i12;
        Modifier modifier2;
        Object rememberedValue;
        boolean changed;
        SearchBarKt$SearchBarInputField$2$1 rememberedValue2;
        int i13;
        int i14;
        boolean z4;
        SearchBarKt$SearchBarInputField$3$1 rememberedValue3;
        boolean changed2;
        SearchBarKt$SearchBarInputField$4$1 rememberedValue4;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors4;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1330051158);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarInputField)P(10,7,8!1,6,5,2,9,4,11)433@20114L18,434@20184L39,436@20254L29,437@20310L34,438@20385L39,450@20838L42,451@20904L304,463@21299L7,464@21384L28,466@21547L19,443@20594L2004:SearchBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i16 = i3 & 32;
        if (i16 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i) == 0) {
            obj = modifier;
            i4 |= startRestartGroup.changed(obj) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i & 1879048192) == 0) {
                i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
            }
            if ((i2 & 14) != 0) {
                if ((i3 & 1024) == 0 && startRestartGroup.changed(textFieldColors)) {
                    i15 = 4;
                    i9 = i2 | i15;
                }
                i15 = 2;
                i9 = i2 | i15;
            } else {
                i9 = i2;
            }
            i10 = i3 & 2048;
            if (i10 == 0) {
                i9 |= 48;
            } else if ((i2 & 112) == 0) {
                i9 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
            }
            i11 = i9;
            if ((i4 & 1533916891) == 306783378 || (i11 & 91) != 18 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i16 == 0 ? Modifier.Companion : modifier;
                    boolean z6 = i5 == 0 ? true : z2;
                    Function2<? super Composer, ? super Integer, Unit> function210 = i6 == 0 ? null : function2;
                    Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function22;
                    Function2<? super Composer, ? super Integer, Unit> function212 = i8 == 0 ? null : function23;
                    if ((i3 & 1024) == 0) {
                        textFieldColors2 = SearchBarDefaults.INSTANCE.m1959inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                        i11 &= -15;
                    } else {
                        textFieldColors2 = textFieldColors;
                    }
                    if (i10 == 0) {
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceableGroup();
                        function24 = function212;
                        function25 = function211;
                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue5;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        function24 = function212;
                        function25 = function211;
                    }
                    z3 = z6;
                    function26 = function210;
                    textFieldColors3 = textFieldColors2;
                    i12 = i11;
                    modifier2 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 1024) != 0) {
                        i11 &= -15;
                    }
                    modifier2 = modifier;
                    z3 = z2;
                    function26 = function2;
                    function25 = function22;
                    function24 = function23;
                    textFieldColors3 = textFieldColors;
                    mutableInteractionSource2 = mutableInteractionSource;
                    i12 = i11;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1330051158, i4, i12, "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                FocusRequester focusRequester = (FocusRequester) rememberedValue;
                String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2039getSearchBarSearchadMyvUU(), startRestartGroup, 6);
                String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2043getSuggestionsAvailableadMyvUU(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(462567106);
                ComposerKt.sourceInformation(startRestartGroup, "*439@20460L7,440@20502L74");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long m5103getColor0d7_KjU = ((TextStyle) consume).m5103getColor0d7_KjU();
                long m3301unboximpl = !((m5103getColor0d7_KjU > Color.Companion.m3327getUnspecified0d7_KjU() ? 1 : (m5103getColor0d7_KjU == Color.Companion.m3327getUnspecified0d7_KjU() ? 0 : -1)) == 0) ? m5103getColor0d7_KjU : textFieldColors3.textColor$material3_release(z3, false, mutableInteractionSource2, startRestartGroup, ((i12 << 9) & 7168) | ((i4 >> 18) & 14) | 48 | ((i12 << 3) & 896)).getValue().m3301unboximpl();
                startRestartGroup.endReplaceableGroup();
                int i17 = i4;
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(SizeKt.m781height3ABfNKs(modifier2, SearchBarDefaults.INSTANCE.m1957getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(function13);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new SearchBarKt$SearchBarInputField$2$1(function13);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (Function1) rememberedValue2);
                Object[] objArr = {m2058getStringNWtq28, Boolean.valueOf(z), m2058getStringNWtq282, focusRequester};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                Modifier modifier4 = modifier2;
                i13 = 0;
                z4 = false;
                for (i14 = 4; i13 < i14; i14 = 4) {
                    z4 |= startRestartGroup.changed(objArr[i13]);
                    i13++;
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new SearchBarKt$SearchBarInputField$3$1(m2058getStringNWtq28, z, m2058getStringNWtq282, focusRequester);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (Function1) rememberedValue3, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(TextKt.getLocalTextStyle());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextStyle merge = ((TextStyle) consume2).merge(new TextStyle(m3301unboximpl, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null));
                SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(false, startRestartGroup, ((i12 << 3) & 112) | 6).getValue().m3301unboximpl(), null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, 0, ImeAction.Companion.m5271getSearcheUduSuo(), 7, null);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(function12) | startRestartGroup.changed(str);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new SearchBarKt$SearchBarInputField$4$1(function12, str);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                int i18 = i12;
                TextFieldColors textFieldColors5 = textFieldColors3;
                composer2 = startRestartGroup;
                BasicTextFieldKt.BasicTextField(str, function1, semantics$default, z3, false, merge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) rememberedValue4, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 584727264, true, new SearchBarKt$SearchBarInputField$5(str, z3, mutableInteractionSource2, function26, function25, function24, textFieldColors5, i17, i18)), composer2, (i17 & 14) | 102236160 | (i17 & 112) | ((i17 >> 9) & 7168), ((i18 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                function27 = function26;
                function28 = function25;
                function29 = function24;
                mutableInteractionSource3 = mutableInteractionSource2;
                textFieldColors4 = textFieldColors5;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                z5 = z2;
                function28 = function22;
                function29 = function23;
                textFieldColors4 = textFieldColors;
                mutableInteractionSource3 = mutableInteractionSource;
                composer2 = startRestartGroup;
                modifier3 = obj;
                function27 = function2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new SearchBarKt$SearchBarInputField$6(str, function1, function12, z, function13, modifier3, z5, function27, function28, function29, textFieldColors4, mutableInteractionSource3, i, i2, i3));
            return;
        }
        obj = modifier;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        if ((i2 & 14) != 0) {
        }
        i10 = i3 & 2048;
        if (i10 == 0) {
        }
        i11 = i9;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if (i10 == 0) {
        }
        z3 = z6;
        function26 = function210;
        textFieldColors3 = textFieldColors2;
        i12 = i11;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester3 = (FocusRequester) rememberedValue;
        String m2058getStringNWtq283 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2039getSearchBarSearchadMyvUU(), startRestartGroup, 6);
        String m2058getStringNWtq2822 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2043getSuggestionsAvailableadMyvUU(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(462567106);
        ComposerKt.sourceInformation(startRestartGroup, "*439@20460L7,440@20502L74");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(TextKt.getLocalTextStyle());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long m5103getColor0d7_KjU2 = ((TextStyle) consume3).m5103getColor0d7_KjU();
        if (!((m5103getColor0d7_KjU2 > Color.Companion.m3327getUnspecified0d7_KjU() ? 1 : (m5103getColor0d7_KjU2 == Color.Companion.m3327getUnspecified0d7_KjU() ? 0 : -1)) == 0)) {
        }
        startRestartGroup.endReplaceableGroup();
        int i172 = i4;
        Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(SizeKt.m781height3ABfNKs(modifier2, SearchBarDefaults.INSTANCE.m1957getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester3);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(function13);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new SearchBarKt$SearchBarInputField$2$1(function13);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        Modifier onFocusChanged2 = FocusChangedModifierKt.onFocusChanged(focusRequester22, (Function1) rememberedValue2);
        Object[] objArr2 = {m2058getStringNWtq283, Boolean.valueOf(z), m2058getStringNWtq2822, focusRequester3};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        Modifier modifier42 = modifier2;
        i13 = 0;
        z4 = false;
        while (i13 < i14) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue3 = new SearchBarKt$SearchBarInputField$3$1(m2058getStringNWtq283, z, m2058getStringNWtq2822, focusRequester3);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(onFocusChanged2, false, (Function1) rememberedValue3, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(TextKt.getLocalTextStyle());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextStyle merge2 = ((TextStyle) consume22).merge(new TextStyle(m3301unboximpl, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null));
        SolidColor solidColor2 = new SolidColor(textFieldColors3.cursorColor$material3_release(false, startRestartGroup, ((i12 << 3) & 112) | 6).getValue().m3301unboximpl(), null);
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, 0, ImeAction.Companion.m5271getSearcheUduSuo(), 7, null);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(function12) | startRestartGroup.changed(str);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new SearchBarKt$SearchBarInputField$4$1(function12, str);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        int i182 = i12;
        TextFieldColors textFieldColors52 = textFieldColors3;
        composer2 = startRestartGroup;
        BasicTextFieldKt.BasicTextField(str, function1, semantics$default2, z3, false, merge2, keyboardOptions2, new KeyboardActions(null, null, null, null, (Function1) rememberedValue4, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 584727264, true, new SearchBarKt$SearchBarInputField$5(str, z3, mutableInteractionSource2, function26, function25, function24, textFieldColors52, i172, i182)), composer2, (i172 & 14) | 102236160 | (i172 & 112) | ((i172 >> 9) & 7168), ((i182 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z3;
        function27 = function26;
        function28 = function25;
        function29 = function24;
        mutableInteractionSource3 = mutableInteractionSource2;
        textFieldColors4 = textFieldColors52;
        modifier3 = modifier42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        TweenSpec tween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    public static final float getDockedActiveTableMinHeight() {
        return DockedActiveTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBar_Id_Pb_0$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
